package main.java.com.careHubApps.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import main.java.com.careHubApps.DatabaseConnection;
import main.java.com.careHubApps.model.AntrianModel;
import main.java.com.careHubApps.model.ObatModel;
import main.java.com.careHubApps.model.PasienModel;

public class ObatController {
    
    private final DatabaseConnection dbConnection;

    public ObatController() {
        dbConnection = new DatabaseConnection();
    }
    
    
    public boolean tambahObat(ObatModel obat) {
        Connection connection = dbConnection.getConnection();
        boolean isAdded = false;

        String sql = "INSERT INTO obat (id_obat, nama, kategori, exp_date, harga, stok) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            obat.setId(generateUniqueId(connection));
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, obat.getId());
            preparedStatement.setString(2, obat.getNama());
            preparedStatement.setString(3, obat.getKategori());
            preparedStatement.setString(4, obat.getExp());
            preparedStatement.setInt(5, obat.getHarga());
            preparedStatement.setInt(6, obat.getStok());

            isAdded = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isAdded;
    }
    
     public List<ObatModel> getAllObat() {
        List<ObatModel> obat = new ArrayList<>();
        Connection connection = dbConnection.getConnection();

        String sql = "SELECT * FROM obat";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id_obat");
                String nama = resultSet.getString("nama");
                String kategori = resultSet.getString("kategori");
                String tglExp = resultSet.getString("exp_date");
                int harga = resultSet.getInt("harga");
                int stok = resultSet.getInt("stok");
                
                obat.add(new ObatModel(id, nama, kategori, tglExp, harga, stok));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return obat;
    }
     
    public boolean updateObat(ObatModel obat) {
        Connection connection = dbConnection.getConnection();
        boolean isUpdated = false;

        String sql = "UPDATE obat SET nama = ?, kategori = ?, exp_date = ?, harga = ?, stok = ? WHERE id_obat = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, obat.getNama());
            preparedStatement.setString(2, obat.getKategori());
            preparedStatement.setString(3, obat.getExp());
            preparedStatement.setInt(4, obat.getHarga());
            preparedStatement.setInt(5, obat.getStok());
            preparedStatement.setString(6, obat.getId());
            

            isUpdated = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isUpdated;
    }
     
    public boolean hapusObat(String obatId) {
        Connection connection = dbConnection.getConnection();
        boolean isDeleted = false;

        String sql = "DELETE FROM obat WHERE id_obat = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, obatId);
            isDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isDeleted;
    } 
    
    public String generateUniqueId(Connection connection) {
        String id;
        Random random = new Random();
        boolean unique = false;

        try {
            while (!unique) {
                int randomNum = 1000 + random.nextInt(9000);
                id = "OB-" + randomNum;
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM obat WHERE id_obat = ?");
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
