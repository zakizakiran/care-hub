package main.java.com.careHubApps.controller;

import main.java.com.careHubApps.model.AntrianModel;
import main.java.com.careHubApps.DatabaseConnection;

import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AntrianController {

    private final DatabaseConnection dbConnection;
    private static final Set<String> usedIds = new HashSet<>();
    private static final SecureRandom random = new SecureRandom();

    public AntrianController() {
        dbConnection = new DatabaseConnection();
    }

    public void tambahAntrian(AntrianModel antrian) {
        Connection connection = dbConnection.getConnection();
        String query = "INSERT INTO antrian (id_antrian, id_pasien, nama, waktu, dokter, ruang) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // Generate unique ID based on the doctor type
            String uniqueId = generateUniqueId(antrian.getDokter());
            preparedStatement.setString(1, uniqueId);
            preparedStatement.setString(2, antrian.getId_pasien());
            preparedStatement.setString(3, antrian.getNama());

            // Mendapatkan waktu saat ini
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedNow = now.format(formatter);

            preparedStatement.setString(4, formattedNow);
            preparedStatement.setString(5, antrian.getDokter());

             // Determine room based on doctor type
            String room = determineRoom(antrian.getDokter());
            preparedStatement.setString(6, room);
            
            preparedStatement.executeUpdate();
            System.out.println("Data antrian berhasil ditambahkan dengan ID: " + uniqueId);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal menambahkan data antrian.");
        }
    }

    public static String generateUniqueId(String dokter) {
        String prefix;
        switch (dokter.toLowerCase()) {
            case "dokter gigi":
                prefix = "DG-";
                break;
            case "dokter umum":
                prefix = "DU-";
                break;
            case "tht":
                prefix = "THT-";
                break;
            case "mata":
                prefix = "MT-";
                break;
            default:
                throw new IllegalArgumentException("Jenis dokter tidak valid: " + dokter);
        }

        String uniqueId;
        do {
            // Generate a random number and ensure it's zero-padded to 5 digits
            String randomNumber = IntStream.range(0, 5)
                    .mapToObj(i -> Integer.toString(random.nextInt(10)))
                    .collect(Collectors.joining(""));
            uniqueId = prefix + randomNumber;
        } while (usedIds.contains(uniqueId));

        usedIds.add(uniqueId);
        return uniqueId;
    }
    
    public String determineRoom(String dokter) {
        switch (dokter.toLowerCase()) {
            case "dokter gigi":
                return "R-02";
            case "dokter umum":
                return "R-03";
            case "tht":
                return "R-04";
            case "mata":
                return "R-05";
            default:
                throw new IllegalArgumentException("Jenis dokter tidak valid: " + dokter);
        }
    }
    
    public List<AntrianModel> getAllAntrian() {
        List<AntrianModel> antrianList = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        String query = "SELECT id_antrian, id_pasien, nama, waktu, dokter, ruang FROM antrian ORDER BY waktu ASC";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                AntrianModel antrian = new AntrianModel();
                antrian.setId(resultSet.getString("id_antrian"));
                antrian.setId_pasien(resultSet.getString("id_pasien"));
                antrian.setNama(resultSet.getString("nama"));
                antrian.setWaktu(resultSet.getString("waktu"));
                antrian.setDokter(resultSet.getString("dokter"));
                antrian.setRuang(resultSet.getString("ruang"));

                antrianList.add(antrian);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return antrianList;
    }
    
    public boolean panggilAntrian(String antrianId) {
        Connection connection = dbConnection.getConnection();
        boolean isDeleted = false;

        String sql = "DELETE FROM antrian WHERE id_antrian = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, antrianId);
            isDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isDeleted;
    }
}
