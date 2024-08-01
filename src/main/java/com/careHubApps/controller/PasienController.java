package main.java.com.careHubApps.controller;

import main.java.com.careHubApps.DatabaseConnection;
import main.java.com.careHubApps.model.PasienModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class PasienController {
    private final DatabaseConnection dbConnection;

    public PasienController() {
        dbConnection = new DatabaseConnection();
    }

    public boolean tambahPasien(PasienModel patient) {
        Connection connection = dbConnection.getConnection();
        boolean isAdded = false;

        String sql = "INSERT INTO pasien (id_pasien, nama, tgl_lahir, no_telpon, email, jenis_kelamin, gol_darah, dokter) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            patient.setId(generateUniqueId(connection));
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, patient.getId());
            preparedStatement.setString(2, patient.getNama());
            preparedStatement.setString(3, patient.getTglLahir());
            preparedStatement.setString(4, patient.getNoTelpon());
            preparedStatement.setString(5, patient.getEmail());
            preparedStatement.setString(6, patient.getJenisKelamin());
            preparedStatement.setString(7, patient.getGolDarah());
            preparedStatement.setString(8, patient.getDokter());

            isAdded = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isAdded;
    }

    public String generateUniqueId(Connection connection) {
        String id;
        Random random = new Random();
        boolean unique = false;

        try {
            while (!unique) {
                int randomNum = 1000 + random.nextInt(9000);
                id = "PS-" + randomNum;
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM pasien WHERE id_pasien = ?");
                preparedStatement.setString(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next() && resultSet.getInt(1) == 0) {
                    unique = true;
                    return id;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
