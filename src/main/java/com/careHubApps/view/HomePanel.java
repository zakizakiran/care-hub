/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.careHubApps.view;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.table.DefaultTableCellRenderer;
import main.java.com.careHubApps.controller.NavigationController;
import resources.components.ShadowPanel;
import resources.components.RoundedPanel;

/**
 *
 * @author ASUS
 */
public class HomePanel extends javax.swing.JPanel {
    
    NavigationController navigationController;
    MainView mainView;

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
        
        initComponents();
        
        navigationController = new NavigationController();
        
        try {
         File poppinsRegular = new File("src/resources/assets/fonts/Poppins-Regular.ttf");
         File poppinsSemiBold = new File("src/resources/assets/fonts/Poppins-SemiBold.ttf");
         File poppinsBold = new File("src/resources/assets/fonts/Poppins-Bold.ttf");

         Font greetTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(16f);
         Font dashboardTitleTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsRegular).deriveFont(20f);
         
         Font cardTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(14f);
         Font cardNumberTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsRegular).deriveFont(32f);

         labelGreetings.setFont(greetTxtStyle);
         labelDashboard.setFont(dashboardTitleTxtStyle);
         
         labelCardDokter.setFont(cardTxtStyle);
         labelNumberDokter.setFont(cardNumberTxtStyle);
         
         labelCardPasien.setFont(cardTxtStyle);
         mainPanel.setFont(cardNumberTxtStyle);
         
         labelCardAntrian.setFont(cardTxtStyle);
         labelTitleAntrian.setFont(dashboardTitleTxtStyle);
         
               
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.decode("#508D4E"));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setFont(cardTxtStyle);

        for (int i = 0; i < tabelAntrian.getColumnModel().getColumnCount(); i++) {
            tabelAntrian.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }

        // Validate and repaint the header
        tabelAntrian.getTableHeader().revalidate();
        tabelAntrian.getTableHeader().repaint();


     } catch (Exception e) {
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
        headerPanel = new ShadowPanel(4, Color.decode("#DFDFDF"));
        labelGreetings = new javax.swing.JLabel();
        cardDashboard = new ShadowPanel(4, Color.decode("#DFDFDF"));
        labelDashboard = new javax.swing.JLabel();
        pasienCard = new RoundedPanel(12, Color.decode("#D6EFD8"));
        pasienIcon = new javax.swing.JLabel();
        labelCardPasien = new javax.swing.JLabel();
        labelNumberPasien = new javax.swing.JLabel();
        antrianCard = new RoundedPanel(12, Color.decode("#D6EFD8"));
        antrianIcon = new javax.swing.JLabel();
        labelCardAntrian = new javax.swing.JLabel();
        labelNumberAntrian = new javax.swing.JLabel();
        doterCard = new RoundedPanel(12, Color.decode("#D6EFD8"));
        dokterIcon = new javax.swing.JLabel();
        labelCardDokter = new javax.swing.JLabel();
        labelNumberDokter = new javax.swing.JLabel();
        cardDashboardAntrian = new ShadowPanel(4, Color.decode("#DFDFDF"));
        labelTitleAntrian = new javax.swing.JLabel();
        panelTabelAntrian = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAntrian = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1040, 1080));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        labelGreetings.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelGreetings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/waving.png"))); // NOI18N
        labelGreetings.setText("Halo, CareMin!");
        labelGreetings.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelGreetings)
                .addContainerGap(838, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGreetings)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 990, 50));

        cardDashboard.setBackground(new java.awt.Color(255, 255, 255));

        labelDashboard.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelDashboard.setText("Dashboard Hari Ini");

        pasienCard.setPreferredSize(new java.awt.Dimension(250, 120));
        pasienCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pasienIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/pasien_icon_circle.png"))); // NOI18N
        pasienCard.add(pasienIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        labelCardPasien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelCardPasien.setForeground(Color.decode("#80AF81"));
        labelCardPasien.setText("Jumlah Pasien");
        pasienCard.add(labelCardPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        labelNumberPasien.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        labelNumberPasien.setForeground(Color.decode("#80AF81"));
        labelNumberPasien.setText("20");
        pasienCard.add(labelNumberPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        antrianCard.setPreferredSize(new java.awt.Dimension(250, 120));
        antrianCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        antrianIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/antrian_icon_circle.png"))); // NOI18N
        antrianCard.add(antrianIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        labelCardAntrian.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelCardAntrian.setForeground(Color.decode("#80AF81"));
        labelCardAntrian.setText("Jumlah Antrian");
        antrianCard.add(labelCardAntrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        labelNumberAntrian.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        labelNumberAntrian.setForeground(Color.decode("#80AF81"));
        labelNumberAntrian.setText("20");
        antrianCard.add(labelNumberAntrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        doterCard.setPreferredSize(new java.awt.Dimension(250, 120));
        doterCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dokterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/dokter_icon_circle.png"))); // NOI18N
        doterCard.add(dokterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        labelCardDokter.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelCardDokter.setForeground(Color.decode("#80AF81"));
        labelCardDokter.setText("Jumlah Dokter");
        doterCard.add(labelCardDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        labelNumberDokter.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        labelNumberDokter.setForeground(Color.decode("#80AF81"));
        labelNumberDokter.setText("20");
        doterCard.add(labelNumberDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        javax.swing.GroupLayout cardDashboardLayout = new javax.swing.GroupLayout(cardDashboard);
        cardDashboard.setLayout(cardDashboardLayout);
        cardDashboardLayout.setHorizontalGroup(
            cardDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDashboardLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(cardDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardDashboardLayout.createSequentialGroup()
                        .addComponent(labelDashboard)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cardDashboardLayout.createSequentialGroup()
                        .addComponent(doterCard, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(pasienCard, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(antrianCard, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        cardDashboardLayout.setVerticalGroup(
            cardDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDashboard)
                .addGap(31, 31, 31)
                .addGroup(cardDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pasienCard, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(antrianCard, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(doterCard, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        mainPanel.add(cardDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 990, 210));

        cardDashboardAntrian.setBackground(new java.awt.Color(255, 255, 255));
        cardDashboardAntrian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitleAntrian.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelTitleAntrian.setText("Antrian Pasien");
        cardDashboardAntrian.add(labelTitleAntrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        panelTabelAntrian.setLayout(new java.awt.CardLayout());

        tabelAntrian.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelAntrian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Kode ", "Waktu", "Nama", "Ruang"
            }
        ));
        tabelAntrian.setFocusable(false);
        tabelAntrian.setGridColor(new java.awt.Color(255, 255, 255));
        tabelAntrian.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabelAntrian.setRowHeight(24);
        tabelAntrian.setSelectionBackground(Color.decode("#D6EFD8")
        );
        tabelAntrian.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelAntrian.setShowVerticalLines(false);
        tabelAntrian.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelAntrian);

        panelTabelAntrian.add(jScrollPane1, "card2");

        cardDashboardAntrian.add(panelTabelAntrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 940, 240));

        mainPanel.add(cardDashboardAntrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 990, 320));

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel antrianCard;
    private javax.swing.JLabel antrianIcon;
    private javax.swing.JPanel cardDashboard;
    private javax.swing.JPanel cardDashboardAntrian;
    private javax.swing.JLabel dokterIcon;
    private javax.swing.JPanel doterCard;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCardAntrian;
    private javax.swing.JLabel labelCardDokter;
    private javax.swing.JLabel labelCardPasien;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelGreetings;
    private javax.swing.JLabel labelNumberAntrian;
    private javax.swing.JLabel labelNumberDokter;
    private javax.swing.JLabel labelNumberPasien;
    private javax.swing.JLabel labelTitleAntrian;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelTabelAntrian;
    private javax.swing.JPanel pasienCard;
    private javax.swing.JLabel pasienIcon;
    private javax.swing.JTable tabelAntrian;
    // End of variables declaration//GEN-END:variables
}
