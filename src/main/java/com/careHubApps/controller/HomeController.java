package main.java.com.careHubApps.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import main.java.com.careHubApps.DatabaseConnection;
import main.java.com.careHubApps.helper.SessionManager;
import main.java.com.careHubApps.model.UserModel;

public class HomeController {
    
    private final DatabaseConnection dbConnection;
    private static UserModel currentUser;


    public HomeController() {
        dbConnection = new DatabaseConnection();
    }

    public static void setUser(UserModel user) {
        currentUser = user;
//        SessionManager.saveSession(user);
    }

    public static void clearUser() {
        currentUser = null;
//        SessionManager.clearSession();
    }

    public static UserModel getCurrentUser() {
        return currentUser;
    }
    
    public int hitungPasien() {
        int jumlahPasien = 0;
        try {
            Connection conn = dbConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS total FROM pasien");
            
            if (rs.next()) {
                jumlahPasien = rs.getInt("total");
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jumlahPasien;
    }
    
    
}
