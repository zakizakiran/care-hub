/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.careHubApps.view.pasien;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import main.java.com.careHubApps.controller.AntrianController;
import main.java.com.careHubApps.controller.PasienController;
import main.java.com.careHubApps.model.AntrianModel;
import resources.components.ShadowPanel;
import resources.components.RoundedPanel;
import resources.components.CustomTextField;
import main.java.com.careHubApps.model.PasienModel;
import resources.components.ScrollBarCustom;

/**
 *
 * @author ASUS
 */
public final class PasienPanel extends javax.swing.JPanel{

    PasienModel pasienModel;
    List <PasienModel> pasienList;
    PasienController pasienController;
    AntrianController antrianController;
    AntrianModel antrianModel;
    
    EditPasienView editPasienView;

    
    
    /**
     * Creates new form HomePanel
     */
    public PasienPanel() {
        initComponents();
        
        pasienController = new PasienController();
        antrianModel = new AntrianModel();
        antrianController = new AntrianController();

        ScrollBarCustom sb = new ScrollBarCustom();
        jScrollPane2.setVerticalScrollBar(sb);
        
        setupHoverEffect(searchButton, Color.decode("#508D4E"), Color.BLACK);
        setupHoverEffect(refreshButton, Color.decode("#D9D9D9"), Color.BLACK);
        
        try {
            File poppinsRegular = new File("src/resources/assets/fonts/Poppins-Regular.ttf");
            File poppinsSemiBold = new File("src/resources/assets/fonts/Poppins-SemiBold.ttf");
            File poppinsBold = new File("src/resources/assets/fonts/Poppins-Bold.ttf");
            
            Font titleTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(20f);
            Font searchTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsRegular).deriveFont(12f);
            Font labelTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsBold).deriveFont(12f);
            Font numberTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsBold).deriveFont(14f);

            titleDatPasien.setFont(titleTxtStyle);
            searchTxtField.setFont(searchTxtStyle);
            
            labelGigi.setFont(labelTxtStyle);
            labelNumberGigi.setFont(numberTxtStyle);

            labelUmum.setFont(labelTxtStyle);
            labelNumberUmum.setFont(numberTxtStyle);

            labelTHT.setFont(labelTxtStyle);
            labelNumberTHT.setFont(numberTxtStyle);

            labelMata.setFont(labelTxtStyle);
            labelNumberMata.setFont(numberTxtStyle);
            
        } catch (Exception e){
            e.printStackTrace();
        } 
        
        loadDataPasien();
        updateJumlahPasienPerDokter();
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
        titleDatPasien = new javax.swing.JLabel();
        searchTxtField = new CustomTextField(15, 15, 15, Color.decode("#80AF81"), "Search here", 8);
        searchButton = new RoundedPanel(12, Color.decode("#1A5319"));
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        refreshButton = new RoundedPanel(12, Color.decode("#1A5319"));
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bodyPanel = new RoundedPanel(12, Color.white);
        panelGigi = new ShadowPanel(8, Color.decode("#DFDFDF"));
        labelGigi = new javax.swing.JLabel();
        labelNumberGigi = new javax.swing.JLabel();
        panelUmum = new ShadowPanel(8, Color.decode("#DFDFDF"));
        labelUmum = new javax.swing.JLabel();
        labelNumberUmum = new javax.swing.JLabel();
        panelTHT = new ShadowPanel(8, Color.decode("#DFDFDF"));
        labelTHT = new javax.swing.JLabel();
        labelNumberTHT = new javax.swing.JLabel();
        panelMata = new ShadowPanel(8, Color.decode("#DFDFDF"));
        labelMata = new javax.swing.JLabel();
        labelNumberMata = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1040, 720));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        titleDatPasien.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        titleDatPasien.setText("Data Pasien");

        searchTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchTxtFieldKeyTyped(evt);
            }
        });

        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/search_icon.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(30, 30));
        searchButton.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/heart_icon.png"))); // NOI18N

        refreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });
        refreshButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/refresh_icon.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setPreferredSize(new java.awt.Dimension(30, 30));
        refreshButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(titleDatPasien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addComponent(titleDatPasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1000, 70));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane2.setViewportView(bodyPanel);

        mainPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 162, 1010, 480));

        panelGigi.setBackground(new java.awt.Color(255, 255, 255));

        labelGigi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/tooth_icon.png"))); // NOI18N
        labelGigi.setText("Pasien Gigi");
        labelGigi.setIconTextGap(10);

        labelNumberGigi.setForeground(Color.decode("#508D4E")
        );
        labelNumberGigi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumberGigi.setText("0");

        javax.swing.GroupLayout panelGigiLayout = new javax.swing.GroupLayout(panelGigi);
        panelGigi.setLayout(panelGigiLayout);
        panelGigiLayout.setHorizontalGroup(
            panelGigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGigiLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelGigi, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNumberGigi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelGigiLayout.setVerticalGroup(
            panelGigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGigiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelGigi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelNumberGigi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(panelGigi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 170, 50));

        panelUmum.setBackground(new java.awt.Color(255, 255, 255));

        labelUmum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/stetoscope_icon.png"))); // NOI18N
        labelUmum.setText("Pasien Umum");
        labelUmum.setIconTextGap(10);

        labelNumberUmum.setForeground(Color.decode("#508D4E")
        );
        labelNumberUmum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumberUmum.setText("0");

        javax.swing.GroupLayout panelUmumLayout = new javax.swing.GroupLayout(panelUmum);
        panelUmum.setLayout(panelUmumLayout);
        panelUmumLayout.setHorizontalGroup(
            panelUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUmumLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(labelUmum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNumberUmum, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelUmumLayout.setVerticalGroup(
            panelUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUmumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelUmum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelNumberUmum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(panelUmum, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 210, 50));

        panelTHT.setBackground(new java.awt.Color(255, 255, 255));

        labelTHT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/tht_icon.png"))); // NOI18N
        labelTHT.setText("Pasien THT");
        labelTHT.setIconTextGap(10);

        labelNumberTHT.setForeground(Color.decode("#508D4E")
        );
        labelNumberTHT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumberTHT.setText("0");

        javax.swing.GroupLayout panelTHTLayout = new javax.swing.GroupLayout(panelTHT);
        panelTHT.setLayout(panelTHTLayout);
        panelTHTLayout.setHorizontalGroup(
            panelTHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTHTLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(labelTHT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNumberTHT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTHTLayout.setVerticalGroup(
            panelTHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTHTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelTHT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelNumberTHT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(panelTHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 180, 50));

        panelMata.setBackground(new java.awt.Color(255, 255, 255));

        labelMata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/eyes_icon.png"))); // NOI18N
        labelMata.setText("Pasien Mata");
        labelMata.setIconTextGap(10);

        labelNumberMata.setForeground(Color.decode("#508D4E")
        );
        labelNumberMata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumberMata.setText("0");

        javax.swing.GroupLayout panelMataLayout = new javax.swing.GroupLayout(panelMata);
        panelMata.setLayout(panelMataLayout);
        panelMataLayout.setHorizontalGroup(
            panelMataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMataLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelMata, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNumberMata, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMataLayout.setVerticalGroup(
            panelMataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelMata, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelNumberMata, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(panelMata, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 190, 50));

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // TODO add your handling code here:
        performSearch();
    }//GEN-LAST:event_searchButtonMouseClicked

    private void searchTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtFieldKeyTyped
        // TODO add your handling code here:
        performSearch();
    }//GEN-LAST:event_searchTxtFieldKeyTyped

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        // TODO add your handling code here:
        loadDataPasien();
        updateJumlahPasienPerDokter();
    }//GEN-LAST:event_refreshButtonMouseClicked

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
    
    private void performSearch() {
        String searchText = searchTxtField.getText().trim().toLowerCase();
        
        if (searchText.isEmpty()) {
            loadDataPasien();
            displayPatients(pasienList);
        } else {
            List<PasienModel> filteredPatients = pasienList.stream()
                .filter(p -> p.getNama().toLowerCase().contains(searchText) ||
                             p.getNoTelpon().toLowerCase().contains(searchText) ||
                             p.getJenisKelamin().toLowerCase().contains(searchText) ||
                             p.getDokter().toLowerCase().contains(searchText) ||
                             p.getId().toLowerCase().contains(searchText))
                .collect(Collectors.toList());
            
            if (filteredPatients.isEmpty()) {
                displayNoDataFound();
            } else {
                displayPatients(filteredPatients);
            }
        }   
    }
    
    private void displayNoDataFound() {
        bodyPanel.removeAll();

        JLabel noDataLabel = new JLabel("Maaf, " + "`" + searchTxtField.getText().trim() + "`" + " tidak ditemukan.");
        JLabel noDataImage = new JLabel();

        noDataImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/not_found.png")));

        try {
            File poppinsSemiBold = new File("src/resources/assets/fonts/Poppins-SemiBold.ttf");
            Font labelTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(16f);
            noDataLabel.setFont(labelTxtStyle);
            noDataLabel.setForeground(Color.decode("#508D4E"));
        } catch (Exception e){
            e.printStackTrace();
        }

        noDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noDataImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bodyPanel.setLayout(null);  // Set layout to null for AbsoluteLayout
        bodyPanel.setBounds(0, 0, 1040, 400);


        int imageWidth = 128;  // Adjust this to the actual width of your image
        int imageHeight = 128; // Adjust this to the actual height of your image
        int labelHeight = 30;  // Height of the label
        int panelWidth = bodyPanel.getWidth();
        int panelHeight = bodyPanel.getHeight();

        int imageX = (panelWidth - imageWidth) / 2;
        int imageY = (panelHeight - imageHeight - labelHeight) / 2;
        int labelX = (panelWidth - noDataLabel.getPreferredSize().width) / 2;
        int labelY = imageY + imageHeight + 10;

        noDataImage.setBounds(imageX, imageY, imageWidth, imageHeight);
        noDataLabel.setBounds(labelX, labelY, noDataLabel.getPreferredSize().width, labelHeight);

        bodyPanel.add(noDataImage);
        bodyPanel.add(noDataLabel);

        bodyPanel.revalidate();
        bodyPanel.repaint();
    }
    
    private void emptyDataDisplay(){
        bodyPanel.removeAll();
        
        JLabel noDataLabel = new JLabel("Tidak Ada Pasien");
        JLabel noDataImage = new JLabel();

        noDataImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/assets/images/thinking.png")));

        try {
            File poppinsSemiBold = new File("src/resources/assets/fonts/Poppins-SemiBold.ttf");
            Font labelTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(16f);
            noDataLabel.setFont(labelTxtStyle);
            noDataLabel.setForeground(Color.decode("#508D4E"));
        } catch (Exception e){
            e.printStackTrace();
        }

        noDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noDataImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bodyPanel.setLayout(null);  // Set layout to null for AbsoluteLayout
        bodyPanel.setBounds(0, 0, 1040, 400);
        
        int imageWidth = 128;  // Adjust this to the actual width of your image
        int imageHeight = 128; // Adjust this to the actual height of your image
        int labelHeight = 30;  // Height of the label
        int panelWidth = bodyPanel.getWidth();
        int panelHeight = bodyPanel.getHeight();

        int imageX = (panelWidth - imageWidth) / 2 ;
        int imageY = (panelHeight - imageHeight - labelHeight) / 2;
        int labelX = (panelWidth - noDataLabel.getPreferredSize().width) / 2;
        int labelY = imageY + imageHeight + 10;

        noDataImage.setBounds(imageX, imageY, imageWidth, imageHeight);
        noDataLabel.setBounds(labelX, labelY, noDataLabel.getPreferredSize().width, labelHeight);

        bodyPanel.add(noDataImage);
        bodyPanel.add(noDataLabel);

        bodyPanel.revalidate();
        bodyPanel.repaint();
    }
    
    public void loadDataPasien() {
        this.pasienList = pasienController.getAllPatients(); 
        if (pasienList == null || pasienList.isEmpty()) {
            emptyDataDisplay();
        } else {
            displayPatients(pasienList);
        }
    }
   
   private void displayPatients(List<PasienModel> patients) {
    bodyPanel.removeAll(); // Clear existing components
    bodyPanel.repaint();
    bodyPanel.revalidate();

    if (patients == null || patients.isEmpty()) {
        emptyDataDisplay();
    } else {
        bodyPanel.setLayout(null); // Use absolute layout

        int x = 20, y = 20;
        int cardWidth = 440, cardHeight = 420;
        int padding = 20;
        int cardsPerRow = 2; // Number of cards per row

        for (int i = 0; i < patients.size(); i++) {
            PasienModel pasien = patients.get(i);
            ShadowPanel cardPasien = new ShadowPanel(8, Color.decode("#DFDFDF"));
            cardPasien.setBackground(Color.WHITE);
            cardPasien.setBounds(x, y, cardWidth, cardHeight); // Set position and size

            JLabel labelId = new JLabel("ID: " + pasien.getId());
            JLabel titleNama = new JLabel("Nama Pasien");
            JLabel labelNama = new JLabel(pasien.getNama());
            JLabel titleTelpon = new JLabel("No Telpon");
            JLabel labelTelpon = new JLabel(pasien.getNoTelpon());
            JLabel titleJenKel = new JLabel("Jenis Kelamin");
            JLabel labelJenKel = new JLabel(pasien.getJenisKelamin());
            JLabel titleDokter = new JLabel("Layanan");
            JLabel labelDokter = new JLabel(pasien.getDokter());

            RoundedPanel buttonAntrian = new RoundedPanel(12, Color.decode("#508D4E"));
            JLabel buttonLabel = new JLabel("Tambah ke Antrian");
            buttonLabel.setForeground(Color.WHITE); // Set text color
            buttonAntrian.add(buttonLabel);
            buttonAntrian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

            RoundedPanel buttonEdit = new RoundedPanel(12, Color.white);
            JLabel editLabel = new JLabel("Edit Pasien");
            editLabel.setForeground(Color.decode("#508D4E")); // Set text color
            buttonEdit.add(editLabel);
            buttonEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

            RoundedPanel buttonHapus = new RoundedPanel(12, Color.white);
            JLabel hapusLabel = new JLabel("Hapus Pasien");
            hapusLabel.setForeground(Color.RED); // Set text color
            buttonHapus.add(hapusLabel);
            buttonHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

            setupHoverEffect(buttonAntrian, Color.decode("#508D4E"), Color.BLACK);
            setupHoverEffect(buttonEdit, Color.WHITE, Color.BLACK);
            setupHoverEffect(buttonHapus, Color.WHITE, Color.RED);

            buttonAntrian.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    antrianModel.setId_pasien(pasien.getId());
                    antrianModel.setNama(pasien.getNama());
                    antrianModel.setDokter(pasien.getDokter());

                    antrianController.tambahAntrian(antrianModel);
                    JOptionPane.showMessageDialog(mainPanel, "Berhasil Menambahkan ke Antrian", "SUKSES", 1);
                }
            });

            buttonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    editLabel.setForeground(Color.WHITE);
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    editLabel.setForeground(Color.decode("#508D4E"));
                }

                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    editPasienView = new EditPasienView(pasien);
                    editPasienView.setVisible(true);
                }
            });

            buttonHapus.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    hapusLabel.setForeground(Color.WHITE);
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    hapusLabel.setForeground(Color.RED);
                }

                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    int response = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus pasien " + pasien.getNama(), "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (response == JOptionPane.YES_OPTION) {
                        pasienController.hapusPasien(pasien.getId());

                        loadDataPasien();
                        updateJumlahPasienPerDokter();
                    }
                }
            });

            try {
                File poppinsSemiBold = new File("src/resources/assets/fonts/Poppins-SemiBold.ttf");
                File poppinsBold = new File("src/resources/assets/fonts/Poppins-Bold.ttf");

                Font cardTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsSemiBold).deriveFont(14f);
                Font titleTxtStyle = Font.createFont(Font.TRUETYPE_FONT, poppinsBold).deriveFont(12f);

                titleNama.setFont(titleTxtStyle);
                titleNama.setForeground(Color.decode("#508D4E"));
                titleTelpon.setFont(titleTxtStyle);
                titleTelpon.setForeground(Color.decode("#508D4E"));
                titleJenKel.setFont(titleTxtStyle);
                titleJenKel.setForeground(Color.decode("#508D4E"));
                titleDokter.setFont(titleTxtStyle);
                titleDokter.setForeground(Color.decode("#508D4E"));

                labelId.setForeground(Color.decode("#508D4E"));
                labelId.setFont(titleTxtStyle);
                labelNama.setFont(cardTxtStyle);
                labelTelpon.setFont(cardTxtStyle);
                labelJenKel.setFont(cardTxtStyle);
                labelDokter.setFont(cardTxtStyle);
                buttonLabel.setFont(cardTxtStyle);
                hapusLabel.setFont(cardTxtStyle);
                editLabel.setFont(cardTxtStyle);

            } catch (Exception e) {
                e.printStackTrace();
            }

            buttonAntrian.setPreferredSize(new java.awt.Dimension(400, 36));
            buttonHapus.setPreferredSize(new java.awt.Dimension(400, 36));
            buttonEdit.setPreferredSize(new java.awt.Dimension(400, 36));

            cardPasien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            cardPasien.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
            cardPasien.add(titleNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
            cardPasien.add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
            cardPasien.add(titleTelpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
            cardPasien.add(labelTelpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
            cardPasien.add(titleJenKel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
            cardPasien.add(labelJenKel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
            cardPasien.add(titleDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
            cardPasien.add(labelDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
            cardPasien.add(buttonAntrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
            cardPasien.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
            cardPasien.add(buttonHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

            bodyPanel.add(cardPasien);

            if ((i + 1) % cardsPerRow == 0) {
                x = 20;
                y += cardHeight + padding;
            } else {
                x += cardWidth + padding;
            }
        }

        bodyPanel.setPreferredSize(new Dimension(bodyPanel.getWidth(), y + cardHeight + padding));
        bodyPanel.revalidate();
        bodyPanel.repaint();
    }
}

   
     private void updateJumlahPasienPerDokter() {
        Map<String, Integer> jumlahPasienPerDokter = pasienController.getJumlahPasienPerDokter();

        labelNumberGigi.setText(String.valueOf(jumlahPasienPerDokter.getOrDefault("Dokter Gigi", 0)));
        labelNumberUmum.setText(String.valueOf(jumlahPasienPerDokter.getOrDefault("Dokter Umum", 0)));
        labelNumberTHT.setText(String.valueOf(jumlahPasienPerDokter.getOrDefault("THT", 0)));
        labelNumberMata.setText(String.valueOf(jumlahPasienPerDokter.getOrDefault("Mata", 0)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelGigi;
    private javax.swing.JLabel labelMata;
    private javax.swing.JLabel labelNumberGigi;
    private javax.swing.JLabel labelNumberMata;
    private javax.swing.JLabel labelNumberTHT;
    private javax.swing.JLabel labelNumberUmum;
    private javax.swing.JLabel labelTHT;
    private javax.swing.JLabel labelUmum;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelGigi;
    private javax.swing.JPanel panelMata;
    private javax.swing.JPanel panelTHT;
    private javax.swing.JPanel panelUmum;
    private javax.swing.JPanel refreshButton;
    private javax.swing.JPanel searchButton;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JLabel titleDatPasien;
    // End of variables declaration//GEN-END:variables
}
