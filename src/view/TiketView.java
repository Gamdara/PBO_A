/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.BandaraControl;
import control.MenuControl;
import control.PesananControl;
import control.PesawatControl;
import exception.BandaraSamaException;
import exception.InputKosongException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Bandara;
import model.Pesawat;
import model.Menu;
import model.Pesanan;
import table.TabelPesawat;


/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class TiketView extends javax.swing.JFrame {

    /**
     * Creates new form PesananView
     */
    private PesawatControl pesawatControl;
    private BandaraControl bandaraControl;
    private MenuControl menuControl;
    private PesananControl pesananControl;
    
    String action = null;
    List<Pesawat> listPesawat;
    List<Bandara> listBandara;
    List<Menu> listMenu;
    int total = 0;
    
    int selected = 0;
    public TiketView() {
        pesananControl = new PesananControl();
        menuControl = new MenuControl();
        bandaraControl = new BandaraControl();
        pesawatControl = new PesawatControl();
        
        initComponents();
        setAsalDd();
        setTujuanDd();
        setMenuDd();
        clearText();
        setComponent(true);
        setPassengerComponent(false);
        setSaveCancel(false);
        setTotalLabel();
        cbMenu.setEditable(false);
    }

    protected String generateId(int length) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < length) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
    
    public void setTotalLabel(){
        labelTotal.setText("Rp. "+total);
    }
    
    public void countTotal(){
        listPesawat = pesawatControl.showListPesawat();
        System.out.println("sel"+selected);
        Pesawat pesawat =  null;
        for (Pesawat pesawat1 : listPesawat) {
            if(pesawat1.getId() == selected)
                pesawat = pesawat1;
        }
        total = 0;
        if(penumpangInput.getText().length() > 0)
        total += Integer.parseInt( penumpangInput.getText().toString()) * pesawat.getHarga();
        if(bagasiInput.getText().length() > 0)
        total += Integer.parseInt( bagasiInput.getText().toString()) * 20000;
    }
    
    public void setAsalDd(){
        listBandara = bandaraControl.showListBandara();
        System.out.println(listBandara.size());
        for (int i = 0; i < listBandara.size(); i++) {
            
            cbAsal.addItem(listBandara.get(i));
        }
    }
    
    public void setTujuanDd(){
        listBandara = bandaraControl.showListBandara();
        for (int i = 0; i < listBandara.size(); i++) {
            cbTujuan.addItem(listBandara.get(i));
        }
    }
    
    public void setMenuDd(){
        listMenu = menuControl.showListMenu();
        for (int i = 0; i < listMenu.size(); i++) {
            cbMenu.addItem(listMenu.get(i));
        }
    }
    
    public void setComponent(boolean value){
        namaInput.setEnabled(value);
        
        cbAsal.setEnabled(value);
        cbTujuan.setEnabled(value);
        cbKelas.setEnabled(value);
        cbMenu.setEnabled(value);
        
        
    }
    
    public void setPassengerComponent(boolean value){
        penumpangInput.setEnabled(value);
        bagasiInput.setEnabled(value);
        tanggalInput.setEnabled(value);
    }
    
    public void setSaveCancel(boolean value){
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);
    }
    
    
    public void clearText(){
        namaInput.setText("");
        penumpangInput.setText("0");
        bagasiInput.setText("0");
        tanggalInput.setText("");
        
    }
    
    public void showPesawat(){
        List<Pesawat> ban = pesawatControl.showListPesawat("");
        tablePesawat.setModel(new TabelPesawat(ban));
    }
    
    public void InputKosongException() throws InputKosongException{
        if(namaInput.getText().isEmpty() || tanggalInput.getText().isEmpty() || penumpangInput.getText().isEmpty() || bagasiInput.getText().isEmpty()){
            throw new InputKosongException();
        }
    }
    
    public void BandaraSamaException() throws BandaraSamaException{
        if(cbAsal.getSelectedItem().toString().equalsIgnoreCase(cbTujuan.getSelectedItem().toString())){
            throw new BandaraSamaException();
        }
    }
    
    public void NumberException() throws NumberFormatException{
        if(penumpangInput.getText().length() > 0)
        Integer.parseInt(penumpangInput.getText().toString());
        if(bagasiInput.getText().length() > 0)
        Integer.parseInt(bagasiInput.getText().toString());
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
        contentPanel = new javax.swing.JPanel();
        namaInput = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePesawat = new javax.swing.JTable();
        matakuliahLabel1 = new javax.swing.JLabel();
        penumpangInput = new javax.swing.JTextField();
        matakuliahLabel2 = new javax.swing.JLabel();
        matakuliahLabel3 = new javax.swing.JLabel();
        matakuliahLabel4 = new javax.swing.JLabel();
        matakuliahLabel5 = new javax.swing.JLabel();
        cbKelas = new javax.swing.JComboBox<>();
        cbAsal = new javax.swing.JComboBox<>();
        cbTujuan = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        matakuliahLabel6 = new javax.swing.JLabel();
        tanggalInput = new javax.swing.JTextField();
        matakuliahLabel7 = new javax.swing.JLabel();
        cbMenu = new javax.swing.JComboBox<>();
        bagasiInput = new javax.swing.JTextField();
        matakuliahLabel8 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();

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
        titleContent.setText("Pesan Tiket");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleContent)
                .addContainerGap(763, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleContent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

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

        tablePesawat.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePesawat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePesawatMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePesawat);

        matakuliahLabel1.setText("Nama Pemesan");

        penumpangInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penumpangInputActionPerformed(evt);
            }
        });
        penumpangInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                penumpangInputKeyReleased(evt);
            }
        });

        matakuliahLabel2.setText("Jumlah Penumpang");

        matakuliahLabel3.setText("Kelas");

        matakuliahLabel4.setText("Asal");

        matakuliahLabel5.setText("Tujuan");

        cbKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ekonomi", "bisnis" }));
        cbKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKelasActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(22, 52, 122));
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Cari Pesawat");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        matakuliahLabel6.setText("Tanggal");

        matakuliahLabel7.setText("Menu");

        bagasiInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bagasiInputKeyReleased(evt);
            }
        });

        matakuliahLabel8.setText("Bagasi");

        labelTotal.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 32)); // NOI18N
        labelTotal.setText("Rp. 0");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(namaInput, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(matakuliahLabel1)
                                .addComponent(matakuliahLabel4)
                                .addComponent(matakuliahLabel5)
                                .addComponent(cbAsal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbTujuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(matakuliahLabel3)
                            .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(penumpangInput, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(matakuliahLabel2)
                                .addComponent(tanggalInput, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(matakuliahLabel6))
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bagasiInput, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(matakuliahLabel8))
                            .addComponent(labelTotal))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matakuliahLabel7)
                            .addComponent(cbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(matakuliahLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(cbAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(matakuliahLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matakuliahLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matakuliahLabel3)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(matakuliahLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(matakuliahLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(penumpangInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matakuliahLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanggalInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(matakuliahLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bagasiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(saveBtn)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
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

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        
        try{
            BandaraSamaException();
            TabelPesawat pesawat = new TabelPesawat(pesawatControl.showListPesawat(cbAsal.getSelectedItem().toString(),cbTujuan.getSelectedItem().toString(),cbKelas.getSelectedItem().toString()));
            if(pesawat.getRowCount() == 0){
                clearText();
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan",
                    "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            } else {
                tablePesawat.setModel(pesawat);
            }
            clearText();
        }
        catch(BandaraSamaException e){
            JOptionPane.showConfirmDialog(null, e.message(),
                    "Error", JOptionPane.DEFAULT_OPTION);
        }
        catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        setComponent(false);
        setPassengerComponent(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        try {
            InputKosongException();
            
            new SimpleDateFormat("yyy-mm-DD").parse(tanggalInput.getText().toString());
            
            Menu menu = null;
            
            listPesawat = pesawatControl.showListPesawat();
            Pesawat pesawat =  null;
            for (Pesawat pesawat1 : listPesawat) {
                if(pesawat1.getId() == selected)
                    pesawat = pesawat1;
            }
            if(cbKelas.getSelectedItem().toString().equalsIgnoreCase("bisnis"))
                menu = listMenu.get(cbMenu.getSelectedIndex());            
                
            Pesanan mk = new Pesanan(0,
                pesawat,
                menu,
                namaInput.getText().toString(),
                Integer.parseInt(penumpangInput.getText()),
                total,
                tanggalInput.getText().toString(),    
                generateId(6),
                Integer.parseInt(bagasiInput.getText())
            );
            pesananControl.insertDataPesanan(mk);
            pesawat.setKapasitas(pesawat.getKapasitas() - mk.getJumlah_penumpang());
            pesawatControl.updateDataPesawat(pesawat, pesawat.getId());
            
            JOptionPane.showMessageDialog(this, "Berhasil Memesan tiket, silahkan cek data pesanan");
            
            clearText();
            showPesawat();
            setComponent(false);

        } catch (InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
        catch (ParseException e){
            JOptionPane.showMessageDialog(this, "Tanggal harus berformat YYYY-MM-DD");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void tablePesawatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePesawatMouseClicked
        // TODO add your handling code here:
        int indexPesawat = -1;

        setPassengerComponent(true);
        setSaveCancel(true);

        int clickedRow = tablePesawat.getSelectedRow();
        TableModel tableModel = tablePesawat.getModel();
        System.out.println(clickedRow);
        selected = Integer.parseInt(tableModel.getValueAt(clickedRow, 7).toString());

    }//GEN-LAST:event_tablePesawatMouseClicked

    private void penumpangInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penumpangInputActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_penumpangInputActionPerformed

    private void penumpangInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penumpangInputKeyReleased
        // TODO add your handling code here:
        NumberException();
        countTotal();
        setTotalLabel();
    }//GEN-LAST:event_penumpangInputKeyReleased

    private void bagasiInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bagasiInputKeyReleased
        // TODO add your handling code here:
        NumberException();
        countTotal();
        setTotalLabel();
    }//GEN-LAST:event_bagasiInputKeyReleased

    private void cbKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKelasActionPerformed
        // TODO add your handling code here:
        if(cbKelas.getSelectedItem().toString().equals("bisnis"))
            cbMenu.setEnabled(true);
        else
            cbMenu.setEnabled(false);
    }//GEN-LAST:event_cbKelasActionPerformed

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
            java.util.logging.Logger.getLogger(TiketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiketView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BandaraPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel PesananPanel;
    private javax.swing.JPanel PesawatPanel;
    private javax.swing.JPanel TiketPanel;
    private javax.swing.JTextField bagasiInput;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<Bandara> cbAsal;
    private javax.swing.JComboBox<String> cbKelas;
    private javax.swing.JComboBox<Menu> cbMenu;
    private javax.swing.JComboBox<Bandara> cbTujuan;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel courseIcon;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel lecturerIcon;
    private javax.swing.JLabel lecturerIcon1;
    private javax.swing.JLabel lecturerIcon2;
    private javax.swing.JLabel lecturerIcon3;
    private javax.swing.JLabel lecturerLabel;
    private javax.swing.JLabel lecturerLabel1;
    private javax.swing.JLabel lecturerLabel2;
    private javax.swing.JLabel lecturerLabel3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel matakuliahLabel1;
    private javax.swing.JLabel matakuliahLabel2;
    private javax.swing.JLabel matakuliahLabel3;
    private javax.swing.JLabel matakuliahLabel4;
    private javax.swing.JLabel matakuliahLabel5;
    private javax.swing.JLabel matakuliahLabel6;
    private javax.swing.JLabel matakuliahLabel7;
    private javax.swing.JLabel matakuliahLabel8;
    private javax.swing.JTextField namaInput;
    private javax.swing.JTextField penumpangInput;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTable tablePesawat;
    private javax.swing.JTextField tanggalInput;
    private javax.swing.JLabel titleContent;
    // End of variables declaration//GEN-END:variables
}
