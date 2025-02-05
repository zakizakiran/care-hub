package main.java.com.careHubApps.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import resources.components.ShadowPanel;

/**
 *
 * @author ASUS
 */
public class AboutPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomePanel
     */
    public AboutPanel() {
        initComponents();
        
         try {
            File poppinsRegular = new File("src/resources/assets/fonts/Poppins-Regular.ttf");
            File poppinsSemiBold = new File("src/resources/assets/fonts/Poppins-SemiBold.ttf");
            
            Font titleTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(20f);
            Font nameTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(12f);
            Font nimTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsRegular).deriveFont(12f);
            
            
            titleAbout.setFont(titleTxtStyle);
            
            labelNamaZaki.setFont(nameTxtStyle);
            labelNamaArdi.setFont(nameTxtStyle);
            labelNamaDimas.setFont(nameTxtStyle);
            labelNamaFariq.setFont(nameTxtStyle);
            labelNamaTopik.setFont(nameTxtStyle);
            
            nimZaki.setFont(nimTxtStyle);
            nimDimas.setFont(nimTxtStyle);
            nimArdi.setFont(nimTxtStyle);
            nimFariq.setFont(nimTxtStyle);
            nimTopik.setFont(nimTxtStyle);
            
            labelKonJaki.setFont(nimTxtStyle);
            labelKonArdi.setFont(nimTxtStyle);
            labelKonFariq.setFont(nimTxtStyle);
            labelKonTopik.setFont(nimTxtStyle);
            labelKonDms.setFont(nimTxtStyle);
            
            
         } catch (FontFormatException | IOException e){
             
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
        headerPanel = new ShadowPanel(8, Color.decode("#DFDFDF"));
        titleAbout = new javax.swing.JLabel();
        cardDimas = new ShadowPanel(6, Color.decode("#DFDFDF"));
        jLabel1 = new javax.swing.JLabel();
        nimDimas = new javax.swing.JLabel();
        labelNamaDimas = new javax.swing.JLabel();
        labelKonDms = new javax.swing.JLabel();
        cardTopik = new ShadowPanel(6, Color.decode("#DFDFDF"));
        jLabel2 = new javax.swing.JLabel();
        nimTopik = new javax.swing.JLabel();
        labelNamaTopik = new javax.swing.JLabel();
        labelKonTopik = new javax.swing.JLabel();
        cardZaki = new ShadowPanel(6, Color.decode("#DFDFDF"));
        jLabel3 = new javax.swing.JLabel();
        nimZaki = new javax.swing.JLabel();
        labelNamaZaki = new javax.swing.JLabel();
        labelKonJaki = new javax.swing.JLabel();
        cardFariq = new ShadowPanel(6, Color.decode("#DFDFDF"));
        jLabel10 = new javax.swing.JLabel();
        nimFariq = new javax.swing.JLabel();
        labelNamaFariq = new javax.swing.JLabel();
        labelKonFariq = new javax.swing.JLabel();
        cardArdi = new ShadowPanel(6, Color.decode("#DFDFDF"));
        jLabel13 = new javax.swing.JLabel();
        nimArdi = new javax.swing.JLabel();
        labelNamaArdi = new javax.swing.JLabel();
        labelKonArdi = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1040, 1080));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        titleAbout.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        titleAbout.setText("Meet Our Team");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titleAbout)
                .addContainerGap(825, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(titleAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1000, 70));

        cardDimas.setBackground(new java.awt.Color(255, 255, 255));
        cardDimas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/dimas.png"))); // NOI18N
        cardDimas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 190, 180));

        nimDimas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nimDimas.setText("10123211");
        cardDimas.add(nimDimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 20));

        labelNamaDimas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaDimas.setText("Muhammad Dimas H P");
        cardDimas.add(labelNamaDimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 30));

        labelKonDms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKonDms.setText("Kontribusi : 100%");
        cardDimas.add(labelKonDms, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 20));

        mainPanel.add(cardDimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 250, 260));

        cardTopik.setBackground(new java.awt.Color(255, 255, 255));
        cardTopik.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/topik.png"))); // NOI18N
        cardTopik.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 180));

        nimTopik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nimTopik.setText("10123197");
        cardTopik.add(nimTopik, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, 20));

        labelNamaTopik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaTopik.setText("Topik Nur Rahman");
        cardTopik.add(labelNamaTopik, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 190, 30));

        labelKonTopik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKonTopik.setText("Kontribusi : 100%");
        cardTopik.add(labelKonTopik, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 20));

        mainPanel.add(cardTopik, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 250, 260));

        cardZaki.setBackground(new java.awt.Color(255, 255, 255));
        cardZaki.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/zaki.png"))); // NOI18N
        cardZaki.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 190, 180));

        nimZaki.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nimZaki.setText("10123206");
        cardZaki.add(nimZaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 20));

        labelNamaZaki.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaZaki.setText("Mohamad Zaki Zakiran");
        cardZaki.add(labelNamaZaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 30));

        labelKonJaki.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKonJaki.setText("Kontribusi : 100%");
        cardZaki.add(labelKonJaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 20));

        mainPanel.add(cardZaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, 260));

        cardFariq.setBackground(new java.awt.Color(255, 255, 255));
        cardFariq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/fariq.png"))); // NOI18N
        cardFariq.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 190, 180));

        nimFariq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nimFariq.setText("10123204");
        cardFariq.add(nimFariq, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 20));

        labelNamaFariq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaFariq.setText("Fariq Daffa");
        cardFariq.add(labelNamaFariq, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 30));

        labelKonFariq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKonFariq.setText("Kontribusi : 100%");
        cardFariq.add(labelKonFariq, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 20));

        mainPanel.add(cardFariq, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 250, 260));

        cardArdi.setBackground(new java.awt.Color(255, 255, 255));
        cardArdi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/ardi.png"))); // NOI18N
        cardArdi.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 190, 180));

        nimArdi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nimArdi.setText("10123195");
        cardArdi.add(nimArdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 20));

        labelNamaArdi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaArdi.setText("Ardi Saputra");
        cardArdi.add(labelNamaArdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 30));

        labelKonArdi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKonArdi.setText("Kontribusi : 100%");
        cardArdi.add(labelKonArdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 20));

        mainPanel.add(cardArdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 250, 260));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/team.png"))); // NOI18N
        mainPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardArdi;
    private javax.swing.JPanel cardDimas;
    private javax.swing.JPanel cardFariq;
    private javax.swing.JPanel cardTopik;
    private javax.swing.JPanel cardZaki;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelKonArdi;
    private javax.swing.JLabel labelKonDms;
    private javax.swing.JLabel labelKonFariq;
    private javax.swing.JLabel labelKonJaki;
    private javax.swing.JLabel labelKonTopik;
    private javax.swing.JLabel labelNamaArdi;
    private javax.swing.JLabel labelNamaDimas;
    private javax.swing.JLabel labelNamaFariq;
    private javax.swing.JLabel labelNamaTopik;
    private javax.swing.JLabel labelNamaZaki;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nimArdi;
    private javax.swing.JLabel nimDimas;
    private javax.swing.JLabel nimFariq;
    private javax.swing.JLabel nimTopik;
    private javax.swing.JLabel nimZaki;
    private javax.swing.JLabel titleAbout;
    // End of variables declaration//GEN-END:variables
}
