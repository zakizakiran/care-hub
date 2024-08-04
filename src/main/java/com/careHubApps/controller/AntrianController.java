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
        String query = "INSERT INTO antrian (id_antrian, id_pasien, nama, waktu, id_dokter, dokter, layanan, ruang) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            // Select a doctor based on the service type
            String[] dokterDetails = pilihDokter(antrian.getLayanan());
            String dokterId = dokterDetails[0];
            String dokterNama = dokterDetails[1];

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Generate unique ID based on the service type
            String uniqueId = generateUniqueId(antrian.getLayanan());
            preparedStatement.setString(1, uniqueId);
            preparedStatement.setString(2, antrian.getId_pasien());
            preparedStatement.setString(3, antrian.getNama());

            // Get the current time
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedNow = now.format(formatter);

            preparedStatement.setString(4, formattedNow);

            // Set the doctor's ID and name
            preparedStatement.setString(5, dokterId);  // Add id_dokter
            preparedStatement.setString(6, dokterNama);
            preparedStatement.setString(7, antrian.getLayanan());

            // Determine room based on service type
            String room = determineRoom(antrian.getLayanan());
            preparedStatement.setString(8, room);

            preparedStatement.executeUpdate();
            System.out.println("Data antrian berhasil ditambahkan dengan ID: " + uniqueId);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal menambahkan data antrian.");
        }
    }

    public static String generateUniqueId(String layanan) {
        String prefix;
        switch (layanan.toLowerCase()) {
            case "gigi":
                prefix = "DG-";
                break;
            case "umum":
                prefix = "DU-";
                break;
            case "tht":
                prefix = "THT-";
                break;
            case "mata":
                prefix = "MT-";
                break;
            default:
                throw new IllegalArgumentException("Jenis dokter tidak valid: " + layanan);
        }

        String uniqueId;
        do {
            String randomNumber = IntStream.range(0, 5)
                    .mapToObj(i -> Integer.toString(random.nextInt(10)))
                    .collect(Collectors.joining(""));
            uniqueId = prefix + randomNumber;
        } while (usedIds.contains(uniqueId));

        usedIds.add(uniqueId);
        return uniqueId;
    }

    public String determineRoom(String layanan) {
        switch (layanan.toLowerCase()) {
            case "gigi":
                return "R-02";
            case "umum":
                return "R-03";
            case "tht":
                return "R-04";
            case "mata":
                return "R-05";
            default:
                throw new IllegalArgumentException("Jenis dokter tidak valid: " + layanan);
        }
    }

    public List<AntrianModel> getAllAntrian() {
        List<AntrianModel> antrianList = new ArrayList<>();
        Connection connection = dbConnection.getConnection();
        String query = "SELECT id_antrian, id_pasien, nama, waktu, dokter, layanan, ruang FROM antrian ORDER BY waktu ASC";

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
                antrian.setLayanan(resultSet.getString("layanan"));
                antrian.setRuang(resultSet.getString("ruang"));

                antrianList.add(antrian);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return antrianList;
    }

    public String[] pilihDokter(String layanan) {
        Connection connection = dbConnection.getConnection();
        String query = "SELECT id_dokter, nama FROM dokter WHERE spesialis = ? ORDER BY RAND() LIMIT 1";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, layanan);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new String[]{resultSet.getString("id_dokter"), resultSet.getString("nama")};
            } else {
                throw new IllegalArgumentException("Tidak ada dokter yang tersedia untuk layanan: " + layanan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Gagal memilih dokter.");
        }
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
