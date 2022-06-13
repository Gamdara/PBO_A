package view;

import control.BandaraControl;
import exception.InputKosongException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Bandara;
import table.TabelBandara;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class BandaraView extends javax.swing.JFrame {

    /**
     * Creates new form BandaraView
     */
    private BandaraControl bandaraControl;
    String action = null;
    List<Bandara> listBandara;
    int selected = 0;
    
    public BandaraView() {
        initComponents();
        setComponent(false);
        setEditDeleteButton(false);
        bandaraControl = new BandaraControl();
        showBandara();
    }

    
    public void setComponent(boolean value){
        namaInput.setEnabled(value);
        kotaInput.setEnabled(value);
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);
    }
    
    public void setEditDeleteButton(boolean value){
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }
    
    public void clearText(){
        namaInput.setText("");
        kotaInput.setText("");
        inputSearch.setText("");
    }
    
    public void showBandara(){
        List<Bandara> ban = bandaraControl.showListBandara("");
        System.out.println("yaha"+ban.size());
        tableBandara.setModel(new TabelBandara(ban));
    }
    
    public void InputKosongException() throws InputKosongException{
        if(namaInput.getText().isEmpty() || kotaInput.getText().isEmpty()){
            throw new InputKosongException();
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

        sidebarPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        BandaraPanel = new javax.swing.JPanel();
        lecturerIcon = new javax.swing.JLabel();
        lecturerLabel = new javax.swing.JLabel();
        MenuPanel = new javax.swing.JPanel();
        courseIcon = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        TiketPanel = new javax.swing.JPanel();
        lecturerIcon1 = new javax.swing.JLabel();
        lecturerLabel1 = new javax.swing.JLabel();
        PesawatPanel = new javax.swing.JPanel();
        lecturerIcon3 = new javax.swing.JLabel();
        lecturerLabel3 = new javax.swing.JLabel();
        PesananPanel = new javax.swing.JPanel();
        lecturerIcon2 = new javax.swing.JLabel();
        lecturerLabel2 = new javax.swing.JLabel();
        containerPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        titleContent = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        inputSearch = new javax.swing.JTextField();
        contentPanel = new javax.swing.JPanel();
        matakuliahLabel = new javax.swing.JLabel();
        namaInput = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBandara = new javax.swing.JTable();
        kotaInput = new javax.swing.JTextField();
        matakuliahLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebarPanel.setBackground(new java.awt.Color(22, 52, 122));
        sidebarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        sidebarPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        BandaraPanel.setBackground(new java.awt.Color(22, 52, 122));
        BandaraPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BandaraPanelMouseClicked(evt);
            }
        });

        lecturerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/bandara.png"))); // NOI18N

        lecturerLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        lecturerLabel.setForeground(new java.awt.Color(255, 255, 255));
        lecturerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerLabel.setText("Data Bandara");

        javax.swing.GroupLayout BandaraPanelLayout = new javax.swing.GroupLayout(BandaraPanel);
        BandaraPanel.setLayout(BandaraPanelLayout);
        BandaraPanelLayout.setHorizontalGroup(
            BandaraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BandaraPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BandaraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lecturerLabel)
                    .addComponent(lecturerIcon))
                .addContainerGap())
        );
        BandaraPanelLayout.setVerticalGroup(
            BandaraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BandaraPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lecturerIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lecturerLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        sidebarPanel.add(BandaraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 283, -1, -1));

        MenuPanel.setBackground(new java.awt.Color(7, 24, 89));
        MenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuPanelMouseClicked(evt);
            }
        });

        courseIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/menu.png"))); // NOI18N

        courseLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        courseLabel.setForeground(new java.awt.Color(255, 255, 255));
        courseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courseLabel.setText("Data Menu");

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(courseIcon)
                    .addComponent(courseLabel))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(courseIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        sidebarPanel.add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 190, 110, -1));

        TiketPanel.setBackground(new java.awt.Color(22, 52, 122));
        TiketPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TiketPanelMouseClicked(evt);
            }
        });

        lecturerIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/tiket.png"))); // NOI18N

        lecturerLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        lecturerLabel1.setForeground(new java.awt.Color(255, 255, 255));
        lecturerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerLabel1.setText("Pesan Tiket");

        javax.swing.GroupLayout TiketPanelLayout = new javax.swing.GroupLayout(TiketPanel);
        TiketPanel.setLayout(TiketPanelLayout);
        TiketPanelLayout.setHorizontalGroup(
            TiketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TiketPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TiketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lecturerIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lecturerLabel1))
                .addContainerGap())
        );
        TiketPanelLayout.setVerticalGroup(
            TiketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TiketPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lecturerIcon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lecturerLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidebarPanel.add(TiketPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 100, 100, -1));

        PesawatPanel.setBackground(new java.awt.Color(22, 52, 122));
        PesawatPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesawatPanelMouseClicked(evt);
            }
        });

        lecturerIcon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/pesawat.png"))); // NOI18N

        lecturerLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        lecturerLabel3.setForeground(new java.awt.Color(255, 255, 255));
        lecturerLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerLabel3.setText("Data Pesawat");

        javax.swing.GroupLayout PesawatPanelLayout = new javax.swing.GroupLayout(PesawatPanel);
        PesawatPanel.setLayout(PesawatPanelLayout);
        PesawatPanelLayout.setHorizontalGroup(
            PesawatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesawatPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PesawatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lecturerLabel3)
                    .addComponent(lecturerIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PesawatPanelLayout.setVerticalGroup(
            PesawatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesawatPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lecturerIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lecturerLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        sidebarPanel.add(PesawatPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 379, -1, -1));

        PesananPanel.setBackground(new java.awt.Color(22, 52, 122));
        PesananPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesananPanelMouseClicked(evt);
            }
        });

        lecturerIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/pesanan.png"))); // NOI18N

        lecturerLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        lecturerLabel2.setForeground(new java.awt.Color(255, 255, 255));
        lecturerLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerLabel2.setText("Data Pesanan");

        javax.swing.GroupLayout PesananPanelLayout = new javax.swing.GroupLayout(PesananPanel);
        PesananPanel.setLayout(PesananPanelLayout);
        PesananPanelLayout.setHorizontalGroup(
            PesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesananPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lecturerIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecturerLabel2))
                .addContainerGap())
        );
        PesananPanelLayout.setVerticalGroup(
            PesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesananPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lecturerIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lecturerLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        sidebarPanel.add(PesananPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 475, -1, -1));

        containerPanel.setBackground(new java.awt.Color(243, 243, 243));

        headerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        titleContent.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 32)); // NOI18N
        titleContent.setText("Bandara");

        addBtn.setBackground(new java.awt.Color(0, 153, 0));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Tambah");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(236, 168, 30));
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Ubah");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(153, 0, 0));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Hapus");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(22, 52, 122));
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Cari");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(titleContent)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn)
                        .addGap(18, 18, 18))))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn)
                    .addComponent(searchBtn)
                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        contentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        matakuliahLabel.setText("Kota");

        cancelBtn.setBackground(new java.awt.Color(153, 0, 0));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Batal");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(22, 52, 122));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        tableBandara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableBandara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBandaraMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableBandara);

        matakuliahLabel1.setText("Nama Bandara");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kotaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matakuliahLabel)
                            .addComponent(matakuliahLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addGap(18, 18, 18)
                .addComponent(cancelBtn)
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(matakuliahLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(matakuliahLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kotaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(saveBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        setComponent(true);

        clearText();
        inputSearch.setText("");
        action = "Tambah";
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        setComponent(true);
        action = "Ubah";

    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int getAnswer = JOptionPane.showConfirmDialog(rootPane,
            "Apakah yakin ingin menghapus data ?", "Konfirmasi",
            JOptionPane.YES_NO_OPTION);
        switch(getAnswer){
            case 0:
            try{
                bandaraControl.deleteDataBandara(selected);
                clearText();
                showBandara();
                setComponent(false);
                setEditDeleteButton(false);
            } catch (Exception e){
                System.out.println("Error : " + e.getMessage());
            }
            break;
            case 1:

            break;
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        setEditDeleteButton(true);

        setComponent(false);

        try{
            TabelBandara matakuliah = new TabelBandara(bandaraControl.showListBandara(inputSearch.getText()));
            if(matakuliah.getRowCount() == 0){
                clearText();
                setEditDeleteButton(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan",
                    "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            } else {
                tableBandara.setModel(matakuliah);
            }
            clearText();
        }catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        setComponent(false);
        setEditDeleteButton(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        try {
            InputKosongException();
            String metodePembelajaran = "";
            String kelas = "";

            if (action.equals("Tambah")){
                Bandara mk = new Bandara(0,namaInput.getText(),kotaInput.getText());
                bandaraControl.insertDataBandara(mk);
            }
            else{
                Bandara mk = new Bandara(selected,namaInput.getText(),kotaInput.getText());
                bandaraControl.updateDataBandara(mk, selected);
            }
            clearText();
            showBandara();
            setComponent(false);

            setEditDeleteButton(false);
        } catch (InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void tableBandaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBandaraMouseClicked
        // TODO add your handling code here:
        int indexDosen = -1;
        setEditDeleteButton(true);

        setComponent(false);

        int clickedRow = tableBandara.getSelectedRow();
        TableModel tableModel = tableBandara.getModel();

        selected = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        namaInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        kotaInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
        
    }//GEN-LAST:event_tableBandaraMouseClicked

    private void BandaraPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BandaraPanelMouseClicked
        // TODO add your handling code here:
        BandaraView view = new BandaraView();
        this.dispose();
        view.setVisible(true);
    }//GEN-LAST:event_BandaraPanelMouseClicked

    private void MenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPanelMouseClicked
        // TODO add your handling code here:
        MenuView view = new MenuView();
        this.dispose();
        view.setVisible(true);
    }//GEN-LAST:event_MenuPanelMouseClicked

    private void TiketPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TiketPanelMouseClicked
        // TODO add your handling code here:
        PesananView view = new PesananView();
        this.dispose();
        view.setVisible(true);
    }//GEN-LAST:event_TiketPanelMouseClicked

    private void PesawatPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesawatPanelMouseClicked
        // TODO add your handling code here:
        PesawatView view = new PesawatView();
        this.dispose();
        view.setVisible(true);
    }//GEN-LAST:event_PesawatPanelMouseClicked

    private void PesananPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesananPanelMouseClicked
        // TODO add your handling code here:
        TiketView view = new TiketView();
        this.dispose();
        view.setVisible(true);
    }//GEN-LAST:event_PesananPanelMouseClicked

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
            java.util.logging.Logger.getLogger(BandaraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BandaraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BandaraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BandaraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BandaraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BandaraPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel PesananPanel;
    private javax.swing.JPanel PesawatPanel;
    private javax.swing.JPanel TiketPanel;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel courseIcon;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField kotaInput;
    private javax.swing.JLabel lecturerIcon;
    private javax.swing.JLabel lecturerIcon1;
    private javax.swing.JLabel lecturerIcon2;
    private javax.swing.JLabel lecturerIcon3;
    private javax.swing.JLabel lecturerLabel;
    private javax.swing.JLabel lecturerLabel1;
    private javax.swing.JLabel lecturerLabel2;
    private javax.swing.JLabel lecturerLabel3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel matakuliahLabel;
    private javax.swing.JLabel matakuliahLabel1;
    private javax.swing.JTextField namaInput;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTable tableBandara;
    private javax.swing.JLabel titleContent;
    // End of variables declaration//GEN-END:variables
}
