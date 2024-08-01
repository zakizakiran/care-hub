package main.java.com.careHubApps.helper;

import java.io.*;
import main.java.com.careHubApps.model.UserModel;

public class SessionManager {

    private static final String SESSION_FILE = "session.dat";

    public static void saveSession(UserModel user) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SESSION_FILE))) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static UserModel loadSession() {
        UserModel user = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SESSION_FILE))) {
            user = (UserModel) ois.readObject();
        } catch (FileNotFoundException e) {
            // File not found, no session saved
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }

    public static void clearSession() {
        File sessionFile = new File(SESSION_FILE);
        if (sessionFile.exists()) {
            sessionFile.delete();
        }
    }
}

