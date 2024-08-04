package main.java.com.careHubApps.controller;

import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import main.java.com.careHubApps.DatabaseConnection;
import main.java.com.careHubApps.model.DokterModel;

public class DokterController {

    private final DatabaseConnection dbConnection;
     private static final Set<String> usedIds = new HashSet<>();
    private static final SecureRandom random = new SecureRandom();

    public DokterController() {
        dbConnection = new DatabaseConnection();
    }
    
    
    public boolean tambahDokter(DokterModel dokter) {
        Connection connection = dbConnection.getConnection();
        boolean isAdded = false;

        String sql = "INSERT INTO dokter (id_dokter, nama, spesialis, no_telpon, alamat) VALUES (?, ?, ?, ?, ?)";
        try {
            dokter.setId(generateUniqueId(dokter.getSpesialis()));
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dokter.getId());
            preparedStatement.setString(2, dokter.getNama());
            preparedStatement.setString(3, dokter.getSpesialis());
            preparedStatement.setString(4, dokter.getNoTelpon());
            preparedStatement.setString(5, dokter.getAlamat());

            isAdded = preparedStatement.executeUpdate() > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isAdded;
    }
    
    public List<DokterModel> getAllDokter() {
        List<DokterModel> dokter = new ArrayList<>();
        Connection connection = dbConnection.getConnection();

        String sql = "SELECT * FROM dokter";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id_dokter");
                String nama = resultSet.getString("nama");
                String spesialis = resultSet.getString("spesialis");
                String no_telpon = resultSet.getString("no_telpon");
                String alamat = resultSet.getString("alamat");

                dokter.add(new DokterModel(id, nama, spesialis, no_telpon, alamat));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dokter;
    }

     public boolean updateDokter(DokterModel dokter) {
        Connection connection = dbConnection.getConnection();
        boolean isUpdated = false;

        String sql = "UPDATE dokter SET nama = ?, spesialis = ?, no_telpon = ?, alamat = ? WHERE id_dokter = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dokter.getNama());
            preparedStatement.setString(2, dokter.getSpesialis());
            preparedStatement.setString(3, dokter.getNoTelpon());
            preparedStatement.setString(4, dokter.getAlamat());
            preparedStatement.setString(5, dokter.getId());

            isUpdated = preparedStatement.executeUpdate() > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isUpdated;
    }
    
    public boolean hapusDokter(String dokterId) {
        Connection connection = dbConnection.getConnection();
        boolean isDeleted = false;

        String sql = "DELETE FROM dokter WHERE id_dokter = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dokterId);
            isDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isDeleted;
    }
    
    public static String generateUniqueId(String dokter) {
        String prefix;
        switch (dokter.toLowerCase()) {
            case "gigi":
                prefix = "G-";
                break;
            case "umum":
                prefix = "U-";
                break;
            case "tht":
                prefix = "T-";
                break;
            case "mata":
                prefix = "M-";
                break;
            default:
                throw new IllegalArgumentException("Spesialis dokter tidak valid: " + dokter);
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
    
}
