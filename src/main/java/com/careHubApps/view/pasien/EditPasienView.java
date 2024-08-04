/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.careHubApps.view.pasien;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import main.java.com.careHubApps.controller.PasienController;
import main.java.com.careHubApps.model.PasienModel;
import resources.components.ComboBox;
import resources.components.CustomTextField;
import resources.components.RoundedPanel;
import resources.components.ShadowPanel;

/**
 *
 * @author ASUS
 */
public class EditPasienView extends javax.swing.JFrame {

    private PasienModel pasienModel;
    private PasienPanel pasienPanel;
    private PasienController pasienController;

    // Inisialisasi variabel warna
    String primaryColor = "#1A5319";
    String hoverColor = "#00000";

    /**
     * Creates new form EditPasienView
     */
    public EditPasienView(PasienModel pasienModel) {

        pasienController = new PasienController();
        pasienPanel = new PasienPanel();
        this.pasienModel = pasienModel;

        initComponents();

        comboGolDarah.setSelectedIndex(-1);
        comboJenKel.setSelectedIndex(-1);
        comboDokter.setSelectedIndex(-1);

        loadData(pasienModel);

        try {
            File poppinsRegular = new File("src/resources/assets/fonts/Poppins-Regular.ttf");
            File poppinsSemiBold = new File("src/resources/assets/fonts/Poppins-SemiBold.ttf");
            File poppinsBold = new File("src/resources/assets/fonts/Poppins-Bold.ttf");

            Font titleTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(20f);
            Font labelInputTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(14f);
            Font labelButtonStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(14f);
            Font txtFieldStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsRegular).deriveFont(14f);

            titleDaftarPanel.setFont(titleTxtStyle);

            labelInputNama.setFont(labelInputTxtStyle);
            labelInputEmail.setFont(labelInputTxtStyle);
            labelInputHP.setFont(labelInputTxtStyle);
            labelInputTgl.setFont(labelInputTxtStyle);

            labelButtonSimpan.setFont(labelButtonStyle);

            comboJenKel.setFont(labelButtonStyle);
            comboGolDarah.setFont(labelButtonStyle);
            comboDokter.setFont(labelButtonStyle);

            txtFieldNama.setFont(txtFieldStyle);
            txtFieldTglLahir.setFont(txtFieldStyle);
            txtFieldEmail.setFont(txtFieldStyle);
            txtFieldHp.setFont(txtFieldStyle);

        } catch (Exception e) {
            e.printStackTrace();
        }

        setupHoverEffect(simpanPerubahanButton, Color.decode(primaryColor), Color.decode(hoverColor));
        setIconImage();
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
        cardHeader = new ShadowPanel(6, Color.decode("#DFDFDF"));
        titleDaftarPanel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bodyPanel = new ShadowPanel(8, Color.decode("#DFDFDF"));
        txtFieldNama = new CustomTextField(15, 15, 15, Color.decode("#80AF81"), "Your Name", 8);
        labelInputNama = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelInputTgl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFieldTglLahir = new CustomTextField(15, 15, 15, Color.decode("#80AF81"), "DD/MM/YYYY", 8);
        jLabel5 = new javax.swing.JLabel();
        labelInputHP = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldHp = new CustomTextField(15, 15, 15, Color.decode("#80AF81"), "081234567890", 8);
        txtFieldEmail = new CustomTextField(15, 15, 15, Color.decode("#80AF81"), "yourmail@example", 8);
        labelInputEmail = new javax.swing.JLabel();
        simpanPerubahanButton = new RoundedPanel(12, Color.decode("#508D4E"));
        labelButtonSimpan = new javax.swing.JLabel();
        comboGolDarah = new ComboBox("Golongan Darah");
        comboJenKel = new ComboBox("Jenis Kelamin");
        comboDokter = new ComboBox("Pilih Layanan");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Data Pasien");
        setMinimumSize(new java.awt.Dimension(1020, 700));
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1020, 700));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardHeader.setBackground(new java.awt.Color(255, 255, 255));

        titleDaftarPanel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        titleDaftarPanel.setText("Edit Data Pasien");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/form_icon.png"))); // NOI18N

        javax.swing.GroupLayout cardHeaderLayout = new javax.swing.GroupLayout(cardHeader);
        cardHeader.setLayout(cardHeaderLayout);
        cardHeaderLayout.setHorizontalGroup(
            cardHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardHeaderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(titleDaftarPanel)
                .addContainerGap(779, Short.MAX_VALUE))
        );
        cardHeaderLayout.setVerticalGroup(
            cardHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardHeaderLayout.createSequentialGroup()
                .addGroup(cardHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(titleDaftarPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(cardHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1000, 60));

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFieldNama.setMargin(new java.awt.Insets(4, 4, 4, 4));
        bodyPanel.add(txtFieldNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 430, 40));

        labelInputNama.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelInputNama.setText("Nama Lengkap");
        bodyPanel.add(labelInputNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("*");
        bodyPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 10, -1));

        labelInputTgl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelInputTgl.setText("Tanggal Lahir");
        bodyPanel.add(labelInputTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("*");
        bodyPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 10));

        txtFieldTglLahir.setMargin(new java.awt.Insets(4, 4, 4, 4));
        bodyPanel.add(txtFieldTglLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 430, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/doctor_2_illustration.png"))); // NOI18N
        bodyPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 330, 450));

        labelInputHP.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelInputHP.setText("Nomor HP");
        bodyPanel.add(labelInputHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("*");
        bodyPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, 10));

        txtFieldHp.setMargin(new java.awt.Insets(4, 4, 4, 4));
        bodyPanel.add(txtFieldHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 40));

        txtFieldEmail.setMargin(new java.awt.Insets(4, 4, 4, 4));
        bodyPanel.add(txtFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 200, 40));

        labelInputEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelInputEmail.setText("Email");
        bodyPanel.add(labelInputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, 20));

        simpanPerubahanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpanPerubahanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanPerubahanButtonMouseClicked(evt);
            }
        });

        labelButtonSimpan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelButtonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonSimpan.setText("Simpan Perubahan");

        javax.swing.GroupLayout simpanPerubahanButtonLayout = new javax.swing.GroupLayout(simpanPerubahanButton);
        simpanPerubahanButton.setLayout(simpanPerubahanButtonLayout);
        simpanPerubahanButtonLayout.setHorizontalGroup(
            simpanPerubahanButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simpanPerubahanButtonLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(labelButtonSimpan)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        simpanPerubahanButtonLayout.setVerticalGroup(
            simpanPerubahanButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelButtonSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bodyPanel.add(simpanPerubahanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 420, 40));

        comboGolDarah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O", "Tidak Tahu" }));
        bodyPanel.add(comboGolDarah, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 210, 40));

        comboJenKel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        bodyPanel.add(comboJenKel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 180, 40));

        comboDokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Umum", "Gigi", "THT", "Mata" }));
        bodyPanel.add(comboDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, 40));

        mainPanel.add(bodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1000, 590));

        getContentPane().add(mainPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanPerubahanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanPerubahanButtonMouseClicked
        // TODO add your handling code here:
        String nama = txtFieldNama.getText();
        String tglLahir = txtFieldTglLahir.getText();
        String noTelpon = txtFieldHp.getText();
        String email = txtFieldEmail.getText();
        String jenisKelamin = comboJenKel.getSelectedItem().toString();
        String golDarah = comboGolDarah.getSelectedItem().toString();
        String dokter = comboDokter.getSelectedItem().toString();

        // Validasi data
        if (nama.isEmpty() || tglLahir.isEmpty() || noTelpon.isEmpty() || jenisKelamin.isEmpty() || golDarah.isEmpty() || dokter.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon lengkapi semua field!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buat objek PasienModel dengan data yang telah diambil
        PasienModel pasien = new PasienModel(pasienModel.getId(), nama, tglLahir, noTelpon, email, jenisKelamin, golDarah, dokter);

        // Panggil controller untuk mengupdate data pasien
        PasienController controller = new PasienController();
        boolean isUpdated = controller.updatePasien(pasien);

        if (isUpdated) {
            JOptionPane.showMessageDialog(this, "Data pasien berhasil diupdate!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal mengupdate data pasien!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_simpanPerubahanButtonMouseClicked

    private void loadData(PasienModel pasien) {
        txtFieldNama.setText(pasien.getNama());
        txtFieldTglLahir.setText(pasien.getTglLahir());
        txtFieldHp.setText(pasien.getNoTelpon());
        txtFieldEmail.setText(pasien.getEmail());
        comboJenKel.setSelectedItem(pasien.getJenisKelamin());
        comboGolDarah.setSelectedItem(pasien.getGolDarah());
        comboDokter.setSelectedItem(pasien.getLayanan());
    }

    private void setIconImage() {
        try {
            Image icon = ImageIO.read(new File("src/resources/assets/images/logo_main.png"));
            setIconImage(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel cardHeader;
    private javax.swing.JComboBox<String> comboDokter;
    private javax.swing.JComboBox<String> comboGolDarah;
    private javax.swing.JComboBox<String> comboJenKel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelButtonSimpan;
    private javax.swing.JLabel labelInputEmail;
    private javax.swing.JLabel labelInputHP;
    private javax.swing.JLabel labelInputNama;
    private javax.swing.JLabel labelInputTgl;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel simpanPerubahanButton;
    private javax.swing.JLabel titleDaftarPanel;
    private javax.swing.JTextField txtFieldEmail;
    private javax.swing.JTextField txtFieldHp;
    private javax.swing.JTextField txtFieldNama;
    private javax.swing.JTextField txtFieldTglLahir;
    // End of variables declaration//GEN-END:variables
}
