/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.DosenControl;
import control.MataKuliahControl;
import exception.InputKosongException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Dosen;
import model.MataKuliah;
import table.TableMataKuliah;

/**
 *
 * @author Gde Rama Vedanta Yudhistira \n 200710735
 */
public class MataKuliahView extends javax.swing.JFrame {

    /**
     * Creates new form MataKuliahView
     */
    private DosenControl dosenControl;
    private MataKuliahControl mataKuliahControl;
    String action = null;
    List<Dosen> listDosen;
    int selected = 0;
    
    public MataKuliahView() {
        initComponents();
        setComponent(false);
        setRadioKelas(false);
        setEditDeleteButton(false);
        dosenControl = new DosenControl();
        mataKuliahControl = new MataKuliahControl();
        showMataKuliah();
        setActionCommandRadio();
        setDosenToDropdown();
    }

    public void setDosenToDropdown(){
        listDosen = dosenControl.showListDosen();
        for (int i = 0; i < listDosen.size(); i++) {
            dosenDropdown.addItem(listDosen.get(i));
        }
    }
    
    public void setComponent(boolean value){
        matakuliahInput.setEnabled(value);
        deskripsiInput.setEnabled(value);
        dosenDropdown.setEnabled(value);
        onlineCheckBox.setEnabled(value);
        offlineCheckBox.setEnabled(value);
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);
    }
    
    public void setRadioKelas(Boolean value){
        radio3315.setEnabled(value);
        radio3318.setEnabled(value);
        radio3421.setEnabled(value);
        radio3422.setEnabled(value);
    }
    
    public void setEditDeleteButton(boolean value){
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }
    
    public void clearText(){
        matakuliahInput.setText("");
        deskripsiInput.setText("");
        dosenDropdown.setSelectedItem(ABORT);
        onlineCheckBox.setSelected(false);
        offlineCheckBox.setSelected(false);
        
        ruangKelasGroup.clearSelection();
        inputSearch.setText("");
    }
    
    public void setActionCommandRadio(){
        radio3315.setActionCommand("3315");
        radio3318.setActionCommand("3318");
        radio3421.setActionCommand("3421");
        radio3422.setActionCommand("3422");
    }
    
    public void showMataKuliah(){
        tableMataKuliah.setModel(mataKuliahControl.showDataMataKuliah(""));
    }
    
    public void InputKosongException() throws InputKosongException{
        if(matakuliahInput.getText().isEmpty() || deskripsiInput.getText().isEmpty() || dosenDropdown.getSelectedIndex() == -1){
            throw new InputKosongException();
        }
        if(!onlineCheckBox.isSelected() && !offlineCheckBox.isSelected()){
            throw new InputKosongException();
        }
        if(offlineCheckBox.isSelected() && ruangKelasGroup.getSelection() == null){
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

        ruangKelasGroup = new javax.swing.ButtonGroup();
        sidebarPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lecturerPanel = new javax.swing.JPanel();
        lecturerIcon = new javax.swing.JLabel();
        lecturerLabel = new javax.swing.JLabel();
        coursePanel = new javax.swing.JPanel();
        courseIcon = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
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
        matakuliahInput = new javax.swing.JTextField();
        deskripsiLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deskripsiInput = new javax.swing.JTextArea();
        deskripsiLabel1 = new javax.swing.JLabel();
        dosenDropdown = new javax.swing.JComboBox<Dosen>();
        metodeLabel = new javax.swing.JLabel();
        onlineCheckBox = new javax.swing.JCheckBox();
        offlineCheckBox = new javax.swing.JCheckBox();
        kelasLabel = new javax.swing.JLabel();
        radio3315 = new javax.swing.JRadioButton();
        radio3318 = new javax.swing.JRadioButton();
        radio3422 = new javax.swing.JRadioButton();
        radio3421 = new javax.swing.JRadioButton();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMataKuliah = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebarPanel.setBackground(new java.awt.Color(22, 52, 122));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        lecturerPanel.setBackground(new java.awt.Color(22, 52, 122));

        lecturerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/lecturer.png"))); // NOI18N

        lecturerLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        lecturerLabel.setForeground(new java.awt.Color(255, 255, 255));
        lecturerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lecturerLabel.setText("Dosen");

        javax.swing.GroupLayout lecturerPanelLayout = new javax.swing.GroupLayout(lecturerPanel);
        lecturerPanel.setLayout(lecturerPanelLayout);
        lecturerPanelLayout.setHorizontalGroup(
            lecturerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lecturerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lecturerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lecturerIcon)
                    .addComponent(lecturerLabel))
                .addGap(23, 23, 23))
        );
        lecturerPanelLayout.setVerticalGroup(
            lecturerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecturerPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lecturerIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lecturerLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        coursePanel.setBackground(new java.awt.Color(7, 24, 89));

        courseIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/book.png"))); // NOI18N

        courseLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        courseLabel.setForeground(new java.awt.Color(255, 255, 255));
        courseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courseLabel.setText("Mata Kuiah");

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursePanelLayout.createSequentialGroup()
                        .addComponent(courseIcon)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursePanelLayout.createSequentialGroup()
                        .addComponent(courseLabel)
                        .addContainerGap())))
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(courseIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lecturerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(coursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(lecturerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );

        containerPanel.setBackground(new java.awt.Color(243, 243, 243));

        headerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        titleContent.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 32)); // NOI18N
        titleContent.setText("Mata Kuliah");

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

        matakuliahLabel.setText("Nama Mata Kuliah");

        deskripsiLabel.setText("Deskripsi");

        deskripsiInput.setColumns(20);
        deskripsiInput.setRows(5);
        jScrollPane1.setViewportView(deskripsiInput);

        deskripsiLabel1.setText("Dosen");

        metodeLabel.setText("Metode Pembelajaran");

        onlineCheckBox.setText("online");

        offlineCheckBox.setText("offline");
        offlineCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offlineCheckBoxActionPerformed(evt);
            }
        });

        kelasLabel.setText("Ruang Kelas");

        ruangKelasGroup.add(radio3315);
        radio3315.setText("3315");

        ruangKelasGroup.add(radio3318);
        radio3318.setText("3318");

        ruangKelasGroup.add(radio3422);
        radio3422.setText("3422");

        ruangKelasGroup.add(radio3421);
        radio3421.setText("3421");

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

        tableMataKuliah.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMataKuliah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMataKuliahMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableMataKuliah);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(matakuliahLabel)
                            .addComponent(matakuliahInput)
                            .addComponent(deskripsiLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(deskripsiLabel1)
                            .addComponent(dosenDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(metodeLabel)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(onlineCheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(offlineCheckBox))
                                    .addComponent(kelasLabel)
                                    .addComponent(radio3315)
                                    .addComponent(radio3318)
                                    .addComponent(radio3421)
                                    .addComponent(radio3422))
                                .addContainerGap(320, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveBtn)
                                .addGap(18, 18, 18)
                                .addComponent(cancelBtn)
                                .addGap(20, 20, 20))))))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matakuliahLabel)
                    .addComponent(metodeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matakuliahInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onlineCheckBox)
                    .addComponent(offlineCheckBox))
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsiLabel)
                    .addComponent(kelasLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(radio3315)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio3318)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio3421)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio3422)))
                .addGap(18, 18, 18)
                .addComponent(deskripsiLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosenDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn)
                    .addComponent(saveBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        setComponent(true);
        setRadioKelas(false);
        ruangKelasGroup.clearSelection();
        
        clearText();
        inputSearch.setText("");
        action = "Tambah";
        dosenDropdown.setSelectedIndex(0);
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        setComponent(true);
        action = "Ubah";
        Boolean value = false;
        if (offlineCheckBox.isSelected()){
            value = true;
        }
        setRadioKelas(value);
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int getAnswer = JOptionPane.showConfirmDialog(rootPane,
              "Apakah yakin ingin menghapus data ?", "Konfirmasi",
              JOptionPane.YES_NO_OPTION);
        switch(getAnswer){
            case 0:
                try{
                    mataKuliahControl.deleteDataMataKuliah(selected);
                    clearText();
                    showMataKuliah();
                    setComponent(false);
                    setRadioKelas(false);
                    setEditDeleteButton(false);
                    ruangKelasGroup.clearSelection();
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
           TableMataKuliah matakuliah = mataKuliahControl.showDataMataKuliah(inputSearch.getText());
           if(matakuliah.getRowCount() == 0){
               
               clearText();
               setEditDeleteButton(false);
               JOptionPane.showConfirmDialog(null, "Data tidak ditemukan",
                       "Konfirmasi", JOptionPane.DEFAULT_OPTION);
           } else {
               tableMataKuliah.setModel(matakuliah);
           }
           clearText();
       }catch (Exception e){
           System.out.println("Error : " + e.getMessage());
       }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void offlineCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offlineCheckBoxActionPerformed
        // TODO add your handling code here:
        Boolean value = false;
        if (offlineCheckBox.isSelected()){
            value = true;
        }
        setRadioKelas(value);
        ruangKelasGroup.clearSelection();
    }//GEN-LAST:event_offlineCheckBoxActionPerformed

    private void tableMataKuliahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMataKuliahMouseClicked
        // TODO add your handling code here:
        int indexDosen = -1;
        setEditDeleteButton(true);
        
        setComponent(false);
        setRadioKelas(false);
        ruangKelasGroup.clearSelection();
        
        int clickedRow = tableMataKuliah.getSelectedRow();
        TableModel tableModel = tableMataKuliah.getModel();
        
        selected = Integer.parseInt(tableModel.getValueAt(clickedRow, 5).toString());
        matakuliahInput.setText(tableModel.getValueAt(clickedRow, 0).toString());
        deskripsiInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        
        String metodePembelajaran = tableModel.getValueAt(clickedRow, 3).toString();
        switch (metodePembelajaran){
            case "Hybrid":
                onlineCheckBox.setSelected(true);
                offlineCheckBox.setSelected(true);
                break;
            
            case "Online":
                onlineCheckBox.setSelected(true);
                offlineCheckBox.setSelected(false);
                break;
                
            case "Offline":
                onlineCheckBox.setSelected(false);
                offlineCheckBox.setSelected(true);
                break;
        }
        
        String ruangKelas = tableModel.getValueAt(clickedRow, 4).toString();
        switch(ruangKelas){
            case "3315":
                radio3315.setSelected(true);
                break;
            case "3318":
                radio3318.setSelected(true);
                break;
            case "3421":
                radio3421.setSelected(true);
                break;
            case "3422":
                radio3422.setSelected(true);
                break;
        }
        
        deskripsiInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        
        String nomor_induk_dosen = tableModel.getValueAt(clickedRow, 6).toString();
        for (Dosen dosen : listDosen){
            if(dosen.getNomorIndukDosen().equals(nomor_induk_dosen)){
                indexDosen = listDosen.indexOf(dosen);
            }
        }
        dosenDropdown.setSelectedIndex(indexDosen);
    }//GEN-LAST:event_tableMataKuliahMouseClicked

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        try {
           InputKosongException();
           String metodePembelajaran = "";
           String kelas = "";
           int selectedIndex = dosenDropdown.getSelectedIndex();
           Dosen selectedDosen = listDosen.get(selectedIndex);
           
           if (onlineCheckBox.isSelected() && offlineCheckBox.isSelected()){
               metodePembelajaran = "Hybrid";
               kelas = ruangKelasGroup.getSelection().getActionCommand();
           }else if(onlineCheckBox.isSelected()){
               metodePembelajaran = "Online";
               kelas = "Online";
           } else {
               metodePembelajaran = "Online";
               kelas = ruangKelasGroup.getSelection().getActionCommand();
           }
           
           if (action.equals("Tambah")){
               MataKuliah mk = new MataKuliah(matakuliahInput.getText(),
               deskripsiInput.getText(), metodePembelajaran, kelas, selectedDosen);
               mataKuliahControl.insertDataMataKuliah(mk);
           }
           else{
               MataKuliah mk = new MataKuliah(selected,matakuliahInput.getText(),
               deskripsiInput.getText(), metodePembelajaran, kelas, selectedDosen);
               mataKuliahControl.updateDataMataKuliah(mk);
           }
           clearText();
           showMataKuliah();
           setComponent(false);
           setRadioKelas(false);
           ruangKelasGroup.clearSelection();
           
           setEditDeleteButton(false);
        } catch (InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        setComponent(false);
        setEditDeleteButton(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MataKuliahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MataKuliahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MataKuliahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MataKuliahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MataKuliahView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel courseIcon;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextArea deskripsiInput;
    private javax.swing.JLabel deskripsiLabel;
    private javax.swing.JLabel deskripsiLabel1;
    private javax.swing.JComboBox<Dosen> dosenDropdown;
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel kelasLabel;
    private javax.swing.JLabel lecturerIcon;
    private javax.swing.JLabel lecturerLabel;
    private javax.swing.JPanel lecturerPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField matakuliahInput;
    private javax.swing.JLabel matakuliahLabel;
    private javax.swing.JLabel metodeLabel;
    private javax.swing.JCheckBox offlineCheckBox;
    private javax.swing.JCheckBox onlineCheckBox;
    private javax.swing.JRadioButton radio3315;
    private javax.swing.JRadioButton radio3318;
    private javax.swing.JRadioButton radio3421;
    private javax.swing.JRadioButton radio3422;
    private javax.swing.ButtonGroup ruangKelasGroup;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTable tableMataKuliah;
    private javax.swing.JLabel titleContent;
    // End of variables declaration//GEN-END:variables
}
