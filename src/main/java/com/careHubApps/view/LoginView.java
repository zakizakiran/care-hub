/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.careHubApps.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import main.java.com.careHubApps.model.UserModel;
import main.java.com.careHubApps.controller.AuthController;
import main.java.com.careHubApps.controller.HomeController;
import resources.components.ShadowPanel;
import resources.components.RoundedPanel;
import resources.components.CustomTextField;
import resources.components.CustomPasswordField;

/**
 *
 * @author ASUS
 */
public class LoginView extends javax.swing.JFrame {

    MainView mainView;
    AuthController authController;

    // Inisialisasi variabel warna
    String primaryColor = "#1A5319";
    String hoverColor = "#00000";

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();

        mainView = new MainView();
        authController = new AuthController();

        try {
            File poppinsRegular = new File("src/resources/assets/fonts/Poppins-Regular.ttf");
            File poppinsSemiBold = new File("src/resources/assets/fonts/Poppins-SemiBold.ttf");
            File poppinsBold = new File("src/resources/assets/fonts/Poppins-Bold.ttf");

            Font titleTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(20f);
            Font labelButtonStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(16f);
            Font inputTextStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsRegular).deriveFont(14f);

            titleCardLogin.setFont(titleTxtStyle);
            labelButtonLogin.setFont(labelButtonStyle);

            txtFieldUsername.setFont(inputTextStyle);
            txtFieldPassword.setFont(inputTextStyle);

        } catch (Exception e) {
            e.printStackTrace();
        }

        setupHoverEffect(buttonLogin, Color.decode(primaryColor), Color.decode(hoverColor));

        setIconImage();
        this.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        cardLogin = new ShadowPanel(8, Color.decode("#DFDFDF"));
        buttonLogin = new RoundedPanel(12, Color.decode("#508D4E"));
        labelButtonLogin = new javax.swing.JLabel();
        titleCardLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFieldUsername = new CustomTextField(15, 15, 15, Color.decode("#80AF81"), "Username", 40);
        txtFieldPassword = new CustomPasswordField(15, 15, 15, Color.decode("#80AF81"), "Password", 40);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login CareHub");
        setPreferredSize(new java.awt.Dimension(1336, 720));
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardLogin.setBackground(new java.awt.Color(255, 255, 255));
        cardLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLoginMouseClicked(evt);
            }
        });

        labelButtonLogin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonLogin.setText("Login");

        javax.swing.GroupLayout buttonLoginLayout = new javax.swing.GroupLayout(buttonLogin);
        buttonLogin.setLayout(buttonLoginLayout);
        buttonLoginLayout.setHorizontalGroup(
            buttonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonLoginLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(labelButtonLogin)
                .addGap(118, 118, 118))
        );
        buttonLoginLayout.setVerticalGroup(
            buttonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelButtonLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardLogin.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 280, 40));

        titleCardLogin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        titleCardLogin.setText("LOGIN");
        cardLogin.add(titleCardLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/lock_icon.png"))); // NOI18N
        cardLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 40, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/person_icon.png"))); // NOI18N
        cardLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, 40));

        txtFieldUsername.setMargin(new java.awt.Insets(4, 40, 4, 4));
        txtFieldUsername.setPreferredSize(new java.awt.Dimension(250, 29));
        cardLogin.add(txtFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 89, 270, 40));

        txtFieldPassword.setMargin(new java.awt.Insets(4, 40, 4, 4));
        txtFieldPassword.setPreferredSize(new java.awt.Dimension(6, 28));
        txtFieldPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    buttonLoginMouseClicked(null);
                }
            }
        });
        cardLogin.add(txtFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 40));

        mainPanel.add(cardLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 340, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/logo_login.png"))); // NOI18N
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/wowan_doctor.png"))); // NOI18N
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        getContentPane().add(mainPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setIconImage() {
        try {
            Image icon = ImageIO.read(new File("src/resources/assets/images/logo_main.png"));
            setIconImage(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void buttonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseClicked
        // Ambil input username dan password
        String username = txtFieldUsername.getText().trim();
        String password = new String(txtFieldPassword.getPassword()).trim();

        // Validasi input tidak boleh kosong
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username dan Password tidak boleh kosong", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buat model user dengan input yang dimasukkan
        UserModel user = new UserModel(username, password);

        // Coba autentikasi user
        UserModel authenticatedUser = authController.authenticate(user);

        // Cek apakah user berhasil diautentikasi
        if (authenticatedUser != null) {
            HomeController.setUser(authenticatedUser);
            mainView.setVisible(true);
            this.dispose();  // Tutup jendela login
        } else {
            // Tampilkan pesan kesalahan jika login gagal
            JOptionPane.showMessageDialog(this, "Login gagal. Username atau Password salah.", "Login Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonLoginMouseClicked

    public JTextField getTxtFieldUsername() {
        return txtFieldUsername;
    }

    public JPasswordField getTxFieldtPassword() {
        return txtFieldPassword;
    }

    private void setupHoverEffect(JPanel button, Color defaultColor, Color hoverColor) {
        button.setBackground(defaultColor);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(defaultColor);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonLogin;
    private javax.swing.JPanel cardLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelButtonLogin;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel titleCardLogin;
    private javax.swing.JPasswordField txtFieldPassword;
    private javax.swing.JTextField txtFieldUsername;
    // End of variables declaration//GEN-END:variables
}
