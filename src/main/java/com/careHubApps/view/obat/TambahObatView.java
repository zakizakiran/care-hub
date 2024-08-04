/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.careHubApps.view.obat;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.java.com.careHubApps.DatabaseConnection;
import main.java.com.careHubApps.controller.ObatController;
import main.java.com.careHubApps.model.ObatModel;
import resources.components.ComboBox;
import resources.components.CustomTextField;
import resources.components.RoundedPanel;
import resources.components.ShadowPanel;

/**
 *
 * @author ASUS
 */
public class TambahObatView extends javax.swing.JFrame {

    ObatController obatController;
    DatabaseConnection dbConnection;

    /**
     * Creates new form TambahObatView
     */
    public TambahObatView() {
        initComponents();

        obatController = new ObatController();
        dbConnection = new DatabaseConnection();
        comboKategori.setSelectedIndex(-1);

        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);

        try {
            File poppinsRegular = new File("src/resources/assets/fonts/Poppins-Regular.ttf");
            File poppinsSemiBold = new File("src/resources/assets/fonts/Poppins-SemiBold.ttf");

            Font titleTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(20f);
            Font labelInputTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(14f);
            Font labelButtonStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(14f);
            Font txtFieldStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsRegular).deriveFont(14f);

            titleDataObat.setFont(titleTxtStyle);

            labelInputNama.setFont(labelInputTxtStyle);
            labelInputStok.setFont(labelInputTxtStyle);
            labelInputHarga.setFont(labelInputTxtStyle);
            labelInputTgl.setFont(labelInputTxtStyle);

            txtFieldNamaObat.setFont(txtFieldStyle);
            txtFieldStok.setFont(txtFieldStyle);
            txtFieldTglExp.setFont(txtFieldStyle);
            txtFieldHarga.setFont(txtFieldStyle);

            comboKategori.setFont(labelInputTxtStyle);

            labelButtonSimpan.setFont(labelButtonStyle);

        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

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
        bodyPanel = new ShadowPanel(8, Color.decode("#DFDFDF"));
        txtFieldNamaObat = new CustomTextField(15, 15, 15, Color.decode("#80AF81"), "Nama Obat", 8);
        labelInputNama = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelInputTgl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFieldTglExp = new CustomTextField(15, 15, 15, Color.decode("#80AF81"), "DD/MM/YYYY", 8);
        labelInputHarga = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldHarga = new CustomTextField(15, 15, 15, Color.decode("#80AF81"), "contoh: 20000", 8);
        txtFieldStok = new CustomTextField(15, 15, 15, Color.decode("#80AF81"), "contoh: 10", 8);
        labelInputStok = new javax.swing.JLabel();
        simpanButton = new RoundedPanel(12, Color.decode("#508D4E"));
        labelButtonSimpan = new javax.swing.JLabel();
        comboKategori = new ComboBox("Kategori Obat");
        jLabel7 = new javax.swing.JLabel();
        headerPanel = new ShadowPanel(8, Color.decode("#DFDFDF"));
        titleDataObat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 660));
        setPreferredSize(new java.awt.Dimension(570, 720));
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFieldNamaObat.setMargin(new java.awt.Insets(4, 4, 4, 4));
        bodyPanel.add(txtFieldNamaObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 430, 40));

        labelInputNama.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelInputNama.setText("Nama Obat");
        bodyPanel.add(labelInputNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("*");
        bodyPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 10, -1));

        labelInputTgl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelInputTgl.setText("Expired");
        bodyPanel.add(labelInputTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("*");
        bodyPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 10));

        txtFieldTglExp.setMargin(new java.awt.Insets(4, 4, 4, 4));
        bodyPanel.add(txtFieldTglExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 430, 40));

        labelInputHarga.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelInputHarga.setText("Harga");
        bodyPanel.add(labelInputHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("*");
        bodyPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, 10));

        txtFieldHarga.setMargin(new java.awt.Insets(4, 4, 4, 4));
        bodyPanel.add(txtFieldHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 40));

        txtFieldStok.setMargin(new java.awt.Insets(4, 4, 4, 4));
        bodyPanel.add(txtFieldStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 200, 40));

        labelInputStok.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelInputStok.setText("Jumlah Stok");
        bodyPanel.add(labelInputStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, 20));

        simpanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanButtonMouseClicked(evt);
            }
        });

        labelButtonSimpan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelButtonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonSimpan.setText("Simpan Data");

        javax.swing.GroupLayout simpanButtonLayout = new javax.swing.GroupLayout(simpanButton);
        simpanButton.setLayout(simpanButtonLayout);
        simpanButtonLayout.setHorizontalGroup(
            simpanButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simpanButtonLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(labelButtonSimpan)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        simpanButtonLayout.setVerticalGroup(
            simpanButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simpanButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelButtonSimpan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bodyPanel.add(simpanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 430, 40));

        comboKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analgesik", "Antibiotik", "Antihistamin", "Antipiretik", "Antihipertensi", "Antidepresan", "Antidiabetik", "Bronkodilator", "Antiemetik", "Antifungal" }));
        comboKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKategoriActionPerformed(evt);
            }
        });
        bodyPanel.add(comboKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 420, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("*");
        bodyPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 10));

        mainPanel.add(bodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 500, 540));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        titleDataObat.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        titleDataObat.setText("Tambah Data Obat");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/medicine_icon.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(105, 105, 105)
                .addComponent(titleDataObat)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(titleDataObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 500, 70));

        getContentPane().add(mainPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanButtonMouseClicked
        String id = obatController.generateUniqueId(dbConnection.getConnection());
        String namaObat = txtFieldNamaObat.getText().trim();
        Object kategoriObj = comboKategori.getSelectedItem(); // Menggunakan Object untuk validasi
        String exp = txtFieldTglExp.getText().trim();
        String hargaText = txtFieldHarga.getText().trim();
        String stokText = txtFieldStok.getText().trim();

        // Validasi data
        if (namaObat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama obat tidak boleh kosong", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (kategoriObj == null || kategoriObj.toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kategori harus dipilih", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (exp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tanggal kadaluarsa tidak boleh kosong", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (hargaText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harga tidak boleh kosong", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (stokText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Stok tidak boleh kosong", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int harga;
        int stok;
        try {
            harga = Integer.parseInt(hargaText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga harus berupa angka", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            stok = Integer.parseInt(stokText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Stok harus berupa angka", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String kategori = kategoriObj.toString().trim();

        // Buat model obat
        ObatModel obatModel = new ObatModel(id, namaObat, kategori, exp, harga, stok);

        // Tambah obat ke database
        if (obatController.tambahObat(obatModel)) {
            JOptionPane.showMessageDialog(this, "Data obat berhasil disimpan dengan ID: " + id);
            clearInput();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data obat", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_simpanButtonMouseClicked

    private void comboKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboKategoriActionPerformed

    private void clearInput() {
        txtFieldNamaObat.setText("");
        txtFieldHarga.setText("");
        txtFieldStok.setText("");
        txtFieldTglExp.setText("");
        comboKategori.setSelectedIndex(-1);
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
            java.util.logging.Logger.getLogger(TambahObatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahObatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahObatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahObatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahObatView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JComboBox<String> comboKategori;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelButtonSimpan;
    private javax.swing.JLabel labelInputHarga;
    private javax.swing.JLabel labelInputNama;
    private javax.swing.JLabel labelInputStok;
    private javax.swing.JLabel labelInputTgl;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel simpanButton;
    private javax.swing.JLabel titleDataObat;
    private javax.swing.JTextField txtFieldHarga;
    private javax.swing.JTextField txtFieldNamaObat;
    private javax.swing.JTextField txtFieldStok;
    private javax.swing.JTextField txtFieldTglExp;
    // End of variables declaration//GEN-END:variables
}
