/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.careHubApps.view;

import main.java.com.careHubApps.view.obat.ObatPanel;
import main.java.com.careHubApps.view.pasien.PasienPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import main.java.com.careHubApps.controller.AuthController;
import main.java.com.careHubApps.controller.NavigationController;
import main.java.com.careHubApps.model.UserModel;
import resources.components.RoundedPanel;

/**
 *
 * @author ASUS
 */
public class MainView extends javax.swing.JFrame {
    
    NavigationController navigationController;
    AuthController authController;
    UserModel userModel;
    
    
    // Inisialisasi variabel warna
    String primaryColor = "#1A5319";
    String secondaryColor = "#80AF81";
    String dangerColor = "#F53F3F";
    String altColor = "#ABABAB";
    
    private boolean isHomeActive = false;
    private boolean isDaftarActive = false;
    private boolean isPasienActive = false;
    private boolean isDokterActive = false;
    private boolean isObatActive = false;
    private boolean isAboutActive = false;
    private boolean isLogoutActive = false;

    
    /**
     * Creates new form HomeView
     */
    public MainView() {
        initComponents();
        
        navigationController = new NavigationController();
        authController = new AuthController();
        
        setupHoverEffect(daftarButton, Color.decode(secondaryColor), Color.decode(primaryColor));
        setupHoverEffect(homeButton, Color.decode(secondaryColor), Color.decode(primaryColor));
        setupHoverEffect(pasienButton, Color.decode(secondaryColor), Color.decode(primaryColor));
        setupHoverEffect(dokterButton, Color.decode(secondaryColor), Color.decode(primaryColor));
        setupHoverEffect(obatButton, Color.decode(secondaryColor), Color.decode(primaryColor));
        setupHoverEffect(aboutButton, Color.decode(secondaryColor), Color.decode(primaryColor));
        setupHoverEffect(logoutButton, Color.decode(altColor), Color.decode(dangerColor));
        
        try {
            File poppinsRegular = new File("src/resources/assets/fonts/Poppins-Regular.ttf");
            File poppinsSemiBold = new File("src/resources/assets/fonts/Poppins-SemiBold.ttf");
            File poppinsBold = new File("src/resources/assets/fonts/Poppins-Bold.ttf");
            
            Font menuButtonStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsBold).deriveFont(14f);
            
            labelHome.setFont(menuButtonStyle);
            labelDaftar.setFont(menuButtonStyle);
            labelPasien.setFont(menuButtonStyle);
            labelDokter.setFont(menuButtonStyle);
            labelObat.setFont(menuButtonStyle);
            labelAboutUs.setFont(menuButtonStyle);
            labelLogout.setFont(menuButtonStyle);
            
            
        } catch (Exception e) {
            e.printStackTrace();
    
        }
        
        setIconImage();
        setActiveButton(homeButton);
        
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
        sideBarPanel = new javax.swing.JPanel();
        sideBarLogo = new javax.swing.JLabel();
        daftarButton = new RoundedPanel(8, Color.decode("#80AF81"));
        labelDaftar = new javax.swing.JLabel();
        homeButton = new RoundedPanel(8, Color.decode("#80AF81"));
        labelHome = new javax.swing.JLabel();
        pasienButton = new RoundedPanel(8, Color.decode("#80AF81"));
        labelPasien = new javax.swing.JLabel();
        dokterButton = new RoundedPanel(8, Color.decode("#80AF81"));
        labelDokter = new javax.swing.JLabel();
        obatButton = new RoundedPanel(8, Color.decode("#80AF81"));
        labelObat = new javax.swing.JLabel();
        aboutButton = new RoundedPanel(8, Color.decode("#80AF81"));
        labelAboutUs = new javax.swing.JLabel();
        logoutButton = new RoundedPanel(8, Color.decode("#F53F3F"));
        labelLogout = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CareHub");
        setPreferredSize(new java.awt.Dimension(1336, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1336, 1080));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarPanel.setBackground(Color.decode("#508D4E")
        );
        sideBarPanel.setPreferredSize(new java.awt.Dimension(240, 720));
        sideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/logo_sidebar.png"))); // NOI18N
        sideBarPanel.add(sideBarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        daftarButton.setBackground(Color.decode("#508D4E")
        );
        daftarButton.setForeground(Color.decode("#508D4E"));
        daftarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        daftarButton.setPreferredSize(new java.awt.Dimension(190, 52));
        daftarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarButtonMouseClicked(evt);
            }
        });
        daftarButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDaftar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDaftar.setForeground(new java.awt.Color(255, 255, 255));
        labelDaftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/daftar_icon.png"))); // NOI18N
        labelDaftar.setText("Daftar");
        labelDaftar.setIconTextGap(28);
        daftarButton.add(labelDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 50));

        sideBarPanel.add(daftarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, -1));

        homeButton.setBackground(Color.decode("#508D4E")
        );
        homeButton.setForeground(Color.decode("#508D4E"));
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setPreferredSize(new java.awt.Dimension(190, 52));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        homeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHome.setForeground(new java.awt.Color(255, 255, 255));
        labelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/home_icon.png"))); // NOI18N
        labelHome.setText("Home");
        labelHome.setIconTextGap(28);
        homeButton.add(labelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 50));

        sideBarPanel.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, -1));

        pasienButton.setBackground(Color.decode("#508D4E")
        );
        pasienButton.setForeground(Color.decode("#508D4E"));
        pasienButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pasienButton.setPreferredSize(new java.awt.Dimension(190, 52));
        pasienButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasienButtonMouseClicked(evt);
            }
        });
        pasienButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPasien.setForeground(new java.awt.Color(255, 255, 255));
        labelPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/pasien_icon.png"))); // NOI18N
        labelPasien.setText("Data Pasien");
        labelPasien.setIconTextGap(28);
        pasienButton.add(labelPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 50));

        sideBarPanel.add(pasienButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, -1));

        dokterButton.setBackground(Color.decode("#508D4E")
        );
        dokterButton.setForeground(Color.decode("#508D4E"));
        dokterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dokterButton.setPreferredSize(new java.awt.Dimension(190, 52));
        dokterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dokterButtonMouseClicked(evt);
            }
        });
        dokterButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDokter.setForeground(new java.awt.Color(255, 255, 255));
        labelDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/dokter_icon.png"))); // NOI18N
        labelDokter.setText("Data Dokter");
        labelDokter.setIconTextGap(28);
        dokterButton.add(labelDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 50));

        sideBarPanel.add(dokterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, -1));

        obatButton.setBackground(Color.decode("#508D4E")
        );
        obatButton.setForeground(Color.decode("#508D4E"));
        obatButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        obatButton.setPreferredSize(new java.awt.Dimension(190, 52));
        obatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obatButtonMouseClicked(evt);
            }
        });
        obatButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelObat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelObat.setForeground(new java.awt.Color(255, 255, 255));
        labelObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/obat_icon.png"))); // NOI18N
        labelObat.setText("Data Obat");
        labelObat.setIconTextGap(28);
        obatButton.add(labelObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 50));

        sideBarPanel.add(obatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, -1));

        aboutButton.setBackground(Color.decode("#508D4E")
        );
        aboutButton.setForeground(Color.decode("#508D4E"));
        aboutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutButton.setPreferredSize(new java.awt.Dimension(190, 52));
        aboutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutButtonMouseClicked(evt);
            }
        });
        aboutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAboutUs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAboutUs.setForeground(new java.awt.Color(255, 255, 255));
        labelAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/info_icon.png"))); // NOI18N
        labelAboutUs.setText("About Us");
        labelAboutUs.setIconTextGap(28);
        aboutButton.add(labelAboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 50));

        sideBarPanel.add(aboutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 190, -1));

        logoutButton.setBackground(Color.decode("#508D4E")
        );
        logoutButton.setForeground(Color.decode("#508D4E"));
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.setPreferredSize(new java.awt.Dimension(190, 52));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        logoutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLogout.setForeground(new java.awt.Color(255, 255, 255));
        labelLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/logout_icon.png"))); // NOI18N
        labelLogout.setText("Logout");
        labelLogout.setIconTextGap(28);
        logoutButton.add(labelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 50));

        sideBarPanel.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 190, -1));

        mainPanel.add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bodyPanel.setPreferredSize(new java.awt.Dimension(1040, 1080));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentPanel.setPreferredSize(new java.awt.Dimension(1040, 720));
        contentPanel.setLayout(new java.awt.BorderLayout());
        bodyPanel.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        mainPanel.add(bodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1100, -1));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getContentPanel() {
        return contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }
    
    private void setIconImage() {
        try {
            Image icon = ImageIO.read(new File("src/resources/assets/images/logo_main.png"));
            setIconImage(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void setActiveButton(JPanel activeButton) {
        isHomeActive = activeButton == homeButton;
        isDaftarActive = activeButton == daftarButton;
        isPasienActive = activeButton == pasienButton;
        isDokterActive = activeButton == dokterButton;
        isObatActive = activeButton == obatButton;
        isAboutActive = activeButton == aboutButton;

        JPanel[] buttons = {homeButton, daftarButton, pasienButton, dokterButton, obatButton, aboutButton};
        Color defaultColor = Color.decode("#80AF81");
        Color activeColor = Color.decode("#1A5319");

        for (JPanel button : buttons) {
            if (button == activeButton) {
                button.setBackground(activeColor);
            } else {
                button.setBackground(defaultColor);
            }
        }
    }

    
    private void setupHoverEffect(JPanel button, Color defaultColor, Color hoverColor) {
        button.setBackground(defaultColor);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if ((button == homeButton && !isHomeActive) ||
                    (button == daftarButton && !isDaftarActive) ||
                    (button == pasienButton && !isPasienActive) ||
                    (button == dokterButton && !isDokterActive)||
                    (button == obatButton && !isObatActive) ||
                    (button == aboutButton && !isAboutActive)||
                    (button == logoutButton && !isLogoutActive)) {
                        button.setBackground(hoverColor);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if ((button == homeButton && !isHomeActive) ||
                    (button == daftarButton && !isDaftarActive) ||
                    (button == pasienButton && !isPasienActive) ||
                    (button == dokterButton && !isDokterActive) ||
                    (button == obatButton && !isObatActive) ||
                    (button == aboutButton && !isAboutActive) ||
                    (button == logoutButton && !isLogoutActive)){
                        button.setBackground(defaultColor);
                }
            }
        });
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        contentPanel.add(new HomePanel());
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void daftarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarButtonMouseClicked
        // TODO add your handling code here:
        navigationController.goTo(this, new DaftarPanel());
        setActiveButton(daftarButton);
    }//GEN-LAST:event_daftarButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
        navigationController.goTo(this, new HomePanel());
        setActiveButton(homeButton);
    }//GEN-LAST:event_homeButtonMouseClicked

    private void pasienButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasienButtonMouseClicked
        // TODO add your handling code here:
        navigationController.goTo(this, new PasienPanel());
        setActiveButton(pasienButton);
    }//GEN-LAST:event_pasienButtonMouseClicked

    private void dokterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dokterButtonMouseClicked
        // TODO add your handling code here:
        navigationController.goTo(this, new DokterPanel());
        setActiveButton(dokterButton);
    }//GEN-LAST:event_dokterButtonMouseClicked

    private void obatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obatButtonMouseClicked
        // TODO add your handling code here:
        navigationController.goTo(this, new ObatPanel());
        setActiveButton(obatButton);
    }//GEN-LAST:event_obatButtonMouseClicked

    private void aboutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutButtonMouseClicked
        // TODO add your handling code here:
        navigationController.goTo(this, new AboutPanel());
        setActiveButton(aboutButton);
    }//GEN-LAST:event_aboutButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        authController.logout(userModel, this);
    }//GEN-LAST:event_logoutButtonMouseClicked

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel daftarButton;
    private javax.swing.JPanel dokterButton;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel labelAboutUs;
    private javax.swing.JLabel labelDaftar;
    private javax.swing.JLabel labelDokter;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelLogout;
    private javax.swing.JLabel labelObat;
    private javax.swing.JLabel labelPasien;
    private javax.swing.JPanel logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel obatButton;
    private javax.swing.JPanel pasienButton;
    private javax.swing.JLabel sideBarLogo;
    private javax.swing.JPanel sideBarPanel;
    // End of variables declaration//GEN-END:variables
}
