/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qarisiqmallar.veneramarket;

import com.mycompany.DaoInter.MehsullarDaoInter;
import com.mycompany.entity.Mehsullar;
import com.mycompany.main.Contex;
import java.sql.Connection;
// import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samil
 */
public class Kassa extends javax.swing.JFrame {

    public MehsullarDaoInter mehDao = Contex.instanceOfMehsullarDao();

    public Kassa() throws Exception {
        initComponents();
        connect();
        buttonGroup1.add(rbBugun);
        buttonGroup1.add(dunen);
        buttonGroup1.add(sonUcGun);
        buttonGroup1.add(sonBirHefte);
        buttonGroup1.add(sonBirAy);
        
    }
    Date date = new Date();

    Connection con;
    PreparedStatement pres;
    DefaultTableModel df;
    Statement stmt;

    public void connect() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection("jdbc:mysql://localhost/mehsullar", "root", "dxdiag92");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbBugun = new javax.swing.JRadioButton();
        sonUcGun = new javax.swing.JRadioButton();
        sonBirHefte = new javax.swing.JRadioButton();
        sonBirAy = new javax.swing.JRadioButton();
        txtKassa = new javax.swing.JTextField();
        btnHesabla = new javax.swing.JButton();
        UmumiSatis = new javax.swing.JTextField();
        dunen = new javax.swing.JRadioButton();
        ilkTarix = new com.toedter.calendar.JDateChooser();
        sonTarix = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGelirCedveli = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 153));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        rbBugun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbBugun.setForeground(new java.awt.Color(255, 255, 255));
        rbBugun.setText("Bugun");
        rbBugun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBugunActionPerformed(evt);
            }
        });
        rbBugun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbBugunKeyPressed(evt);
            }
        });

        sonUcGun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sonUcGun.setForeground(new java.awt.Color(255, 255, 255));
        sonUcGun.setText("Son 3 gun");
        sonUcGun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonUcGunActionPerformed(evt);
            }
        });

        sonBirHefte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sonBirHefte.setForeground(new java.awt.Color(255, 255, 255));
        sonBirHefte.setText("Son 1hefte");
        sonBirHefte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonBirHefteActionPerformed(evt);
            }
        });

        sonBirAy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sonBirAy.setForeground(new java.awt.Color(255, 255, 255));
        sonBirAy.setText("Son 1 ay");
        sonBirAy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonBirAyActionPerformed(evt);
            }
        });

        txtKassa.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtKassa.setForeground(new java.awt.Color(0, 0, 0));
        txtKassa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnHesabla.setText("Hesabla");
        btnHesabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHesablaMouseClicked(evt);
            }
        });
        btnHesabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHesablaActionPerformed(evt);
            }
        });

        UmumiSatis.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        UmumiSatis.setForeground(new java.awt.Color(0, 0, 0));
        UmumiSatis.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dunen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dunen.setForeground(new java.awt.Color(255, 255, 255));
        dunen.setText("Dunen");
        dunen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dunenActionPerformed(evt);
            }
        });

        ilkTarix.setDateFormatString("yyyy-MM-dd");

        sonTarix.setDateFormatString("yyyy-MM-dd");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("-Tarixdən");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-Qədər");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tarix seç..");

        jButton6.setText("Təmizlə");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ümumi");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setMaximumSize(new java.awt.Dimension(179, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Geri Qaytarma");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gəlir");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kassa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbBugun, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dunen))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sonUcGun)
                                    .addComponent(sonBirHefte))
                                .addGap(18, 18, 18)
                                .addComponent(sonBirAy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UmumiSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(65, 65, 65)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKassa, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel7)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ilkTarix, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sonTarix, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHesabla)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(145, 145, 145)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbBugun)
                            .addComponent(sonUcGun)
                            .addComponent(sonBirAy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sonBirHefte)
                            .addComponent(dunen)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtKassa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(UmumiSatis))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ilkTarix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(sonTarix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHesabla)
                            .addComponent(jButton6))))
                .addGap(53, 53, 53))
        );

        jButton1.setText("Update");

        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Duzelis et");

        jButton4.setText("Ləğv et");

        jButton5.setText("Bagla");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(607, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 51, 51));

        tblGelirCedveli.setBackground(new java.awt.Color(153, 255, 255));
        tblGelirCedveli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblGelirCedveli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblGelirCedveli.setForeground(new java.awt.Color(51, 51, 51));
        tblGelirCedveli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Malin Adi", "Satis Miqdari", "Satis Meblegi Cem", "Alis Qiymeti", "Satis Qiymeti", "Umumi Satis Miqdari", "Satis Tarixi", "Gelir", "Umumi Xeyir", "Qismen_Odenis", "Qaytarilan_Mehsulun_Meblegi", "Musteriye_Geri_Odenis", "Borc alanin adi", "Yeni goturulen mehsul", "Borcdan-Gelen_Mebleg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGelirCedveli);
        if (tblGelirCedveli.getColumnModel().getColumnCount() > 0) {
            tblGelirCedveli.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblGelirCedveli.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblGelirCedveli.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblGelirCedveli.getColumnModel().getColumn(3).setPreferredWidth(110);
            tblGelirCedveli.getColumnModel().getColumn(6).setPreferredWidth(120);
            tblGelirCedveli.getColumnModel().getColumn(8).setPreferredWidth(40);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sonUcGunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonUcGunActionPerformed
        
        txtKassa.removeAll();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar();
        String ss = sdf.format(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, -2);

        String sss = sdf.format(cal.getTime());

        //  System.out.println(ss);
        // System.out.println(sss);
        int a;
        try {

            pres = con.prepareCall("SELECT\n"
                    + "	s.id,\n"
                    + "	s.Malin_adi,\n"
                    + "	s.Miqdari,\n"
                    + "	s.Umumi_Mebleg AS Satis_Meblegi_Cem,\n"
                    + "	s.QiemenOdenis,\n"
                    + "	s.Qaytarilan_Mehsul_Miqdari,\n"
                    + "	s.Musteriye_Geri_Odenis,\n"
                    + "	s.Borc_Alanin_Adi,\n"
                    + "	s.Yeni_goturulen_Mebleg,\n"
                    + "	s.Borcdan_Gelen,\n"
                    + " m.Satis_miqdari, \n"
                    + "	m.Alis_qiymeti,\n"
                    + " m.Satisin_toplam_deyeri, \n"
                    + "	s.Satis_qiymeti,\n"
                    + "	m.Satis_miqdari AS Umumi_Satis_Miqdari,\n"
                    + "	s.Satis_Tarixi,\n"
                    + "	( s.Miqdari * s.Satis_qiymeti - s.Miqdari * m.Alis_qiymeti ) AS Xeyir, (m.Satisin_toplam_deyeri - m.Alis_qiymeti* m.Satis_miqdari) as Umumi_Xeyir \n"
                    + "FROM\n"
                    + "	satilan_mallar s\n"
                    + "	LEFT JOIN mehsullar m ON m.id = s.id \n"
                    + "WHERE\n"
                    + "	s.Satis_Tarixi BETWEEN" + "'" + sss + "'" + "and CURRENT_DATE");

            ResultSet rs = pres.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblGelirCedveli.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                   v2.add(rs.getInt("id"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getInt("Miqdari"));
                    v2.add(rs.getDouble("Satis_Meblegi_Cem"));
                    v2.add(rs.getDouble("Alis_qiymeti"));
                    v2.add(rs.getDouble("Satis_qiymeti"));
                    v2.add(rs.getInt("Umumi_Satis_Miqdari"));
                    v2.add(rs.getString("Satis_Tarixi"));
                    v2.add(rs.getDouble("Xeyir"));
                    v2.add(rs.getDouble("Umumi_Xeyir"));
                    v2.add(rs.getDouble("QiemenOdenis"));
                    v2.add(rs.getDouble("Qaytarilan_Mehsul_Miqdari"));
                    v2.add(rs.getDouble("Musteriye_Geri_Odenis"));
                    v2.add(rs.getString("Borc_Alanin_Adi"));
                    v2.add(rs.getDouble("Yeni_goturulen_Mebleg"));
                    v2.add(rs.getDouble("Borcdan_Gelen"));
                }
                df.addRow(v2);

            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }


    }//GEN-LAST:event_sonUcGunActionPerformed

    private void rbBugunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBugunActionPerformed

        int a;
        try {

            pres = con.prepareCall("SELECT\n"
                    + "	s.id,\n"
                    + "	s.Malin_adi,\n"
                    + "	s.Miqdari,\n"
                    + "	s.Umumi_Mebleg AS Satis_Meblegi_Cem,\n"
                    + "	s.QiemenOdenis,\n"
                    + "	s.Qaytarilan_Mehsul_Miqdari,\n"
                    + "	s.Musteriye_Geri_Odenis,\n"
                    + "	s.Borc_Alanin_Adi,\n"
                    + "	s.Yeni_goturulen_Mebleg,\n"
                    + "	s.Borcdan_Gelen,\n"
                    + " m.Satis_miqdari, \n"
                    + "	m.Alis_qiymeti,\n"
                    + " m.Satisin_toplam_deyeri, \n"
                    + "	s.Satis_qiymeti,\n"
                    + "	m.Satis_miqdari AS Umumi_Satis_Miqdari,\n"
                    + "	s.Satis_Tarixi,\n"
                    + "	( s.Miqdari * s.Satis_qiymeti - s.Miqdari * m.Alis_qiymeti ) AS Xeyir, (m.Satisin_toplam_deyeri - m.Alis_qiymeti* m.Satis_miqdari) as Umumi_Xeyir \n"
                    + "FROM\n"
                    + "	satilan_mallar s\n"
                    + "	LEFT JOIN mehsullar m ON m.id = s.id \n"
                    + "WHERE Date (s.Satis_Tarixi) = CURRENT_DATE");

            ResultSet rs = pres.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblGelirCedveli.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getInt("Miqdari"));
                    v2.add(rs.getDouble("Satis_Meblegi_Cem"));
                    v2.add(rs.getDouble("Alis_qiymeti"));
                    v2.add(rs.getDouble("Satis_qiymeti"));
                    v2.add(rs.getInt("Umumi_Satis_Miqdari"));
                    v2.add(rs.getString("Satis_Tarixi"));
                    v2.add(rs.getDouble("Xeyir"));
                    v2.add(rs.getDouble("Umumi_Xeyir"));
                    v2.add(rs.getDouble("QiemenOdenis"));
                    v2.add(rs.getDouble("Qaytarilan_Mehsul_Miqdari"));
                    v2.add(rs.getDouble("Musteriye_Geri_Odenis"));
                    v2.add(rs.getString("Borc_Alanin_Adi"));
                    v2.add(rs.getDouble("Yeni_goturulen_Mebleg"));
                    v2.add(rs.getDouble("Borcdan_Gelen"));
                   

                }
                df.addRow(v2);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }


    }//GEN-LAST:event_rbBugunActionPerformed

    private void sonBirHefteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonBirHefteActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_MONTH, -6);
        String sss = sdf.format(cal.getTime());

        // txtKassa.removeAll();
        // System.out.println(sss);
        int a;
        try {

            pres = con.prepareCall("SELECT\n"
                    + "	s.id,\n"
                    + "	s.Malin_adi,\n"
                    + "	s.Miqdari,\n"
                    + "	s.Umumi_Mebleg AS Satis_Meblegi_Cem,\n"
                    + "	s.QiemenOdenis,\n"
                    + "	s.Qaytarilan_Mehsul_Miqdari,\n"
                    + "	s.Musteriye_Geri_Odenis,\n"
                    + "	s.Borc_Alanin_Adi,\n"
                    + "	s.Yeni_goturulen_Mebleg,\n"
                    + "	s.Borcdan_Gelen,\n"
                    + " m.Satis_miqdari, \n"
                    + "	m.Alis_qiymeti,\n"
                    + " m.Satisin_toplam_deyeri, \n"
                    + "	s.Satis_qiymeti,\n"
                    + "	m.Satis_miqdari AS Umumi_Satis_Miqdari,\n"
                    + "	s.Satis_Tarixi,\n"
                    + "	( s.Miqdari * s.Satis_qiymeti - s.Miqdari * m.Alis_qiymeti ) AS Xeyir, (m.Satisin_toplam_deyeri - m.Alis_qiymeti* m.Satis_miqdari) as Umumi_Xeyir \n"
                    + "FROM\n"
                    + "	satilan_mallar s\n"
                    + "	LEFT JOIN mehsullar m ON m.id = s.id \n"
                    + "WHERE\n"
                    + "	s.Satis_Tarixi BETWEEN" + "'" + sss + "'" + "and CURRENT_DATE");

            ResultSet rs = pres.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblGelirCedveli.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getInt("Miqdari"));
                    v2.add(rs.getDouble("Satis_Meblegi_Cem"));
                    v2.add(rs.getDouble("Alis_qiymeti"));
                    v2.add(rs.getDouble("Satis_qiymeti"));
                    v2.add(rs.getInt("Umumi_Satis_Miqdari"));
                    v2.add(rs.getString("Satis_Tarixi"));
                    v2.add(rs.getDouble("Xeyir"));
                    v2.add(rs.getDouble("Umumi_Xeyir"));
                    v2.add(rs.getDouble("QiemenOdenis"));
                    v2.add(rs.getDouble("Qaytarilan_Mehsul_Miqdari"));
                    v2.add(rs.getDouble("Musteriye_Geri_Odenis"));
                    v2.add(rs.getString("Borc_Alanin_Adi"));
                    v2.add(rs.getDouble("Yeni_goturulen_Mebleg"));
                    v2.add(rs.getDouble("Borcdan_Gelen"));

                }
                df.addRow(v2);

            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }//GEN-LAST:event_sonBirHefteActionPerformed

    private void sonBirAyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonBirAyActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_MONTH, -30);
        String sss = sdf.format(cal.getTime());

        txtKassa.removeAll();
        // System.out.println(sss);
        int a;
        try {

            pres = con.prepareCall("SELECT\n"
                    + "	s.id,\n"
                    + "	s.Malin_adi,\n"
                    + "	s.Miqdari,\n"
                    + "	s.Umumi_Mebleg AS Satis_Meblegi_Cem,\n"
                    + "	s.QiemenOdenis,\n"
                    + "	s.Qaytarilan_Mehsul_Miqdari,\n"
                    + "	s.Musteriye_Geri_Odenis,\n"
                    + "	s.Borc_Alanin_Adi,\n"
                    + "	s.Yeni_goturulen_Mebleg,\n"
                    + "	s.Borcdan_Gelen,\n"
                    + " m.Satis_miqdari, \n"
                    + "	m.Alis_qiymeti,\n"
                    + " m.Satisin_toplam_deyeri, \n"
                    + "	s.Satis_qiymeti,\n"
                    + "	m.Satis_miqdari AS Umumi_Satis_Miqdari,\n"
                    + "	s.Satis_Tarixi,\n"
                    + "	( s.Miqdari * s.Satis_qiymeti - s.Miqdari * m.Alis_qiymeti ) AS Xeyir, (m.Satisin_toplam_deyeri - m.Alis_qiymeti* m.Satis_miqdari) as Umumi_Xeyir \n"
                    + "FROM\n"
                    + "	satilan_mallar s\n"
                    + "	LEFT JOIN mehsullar m ON m.id = s.id \n"
                    + "WHERE\n"
                    + "	s.Satis_Tarixi BETWEEN" + "'" + sss + "'" + "and CURRENT_DATE");

            ResultSet rs = pres.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblGelirCedveli.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getInt("Miqdari"));
                    v2.add(rs.getDouble("Satis_Meblegi_Cem"));
                    v2.add(rs.getDouble("Alis_qiymeti"));
                    v2.add(rs.getDouble("Satis_qiymeti"));
                    v2.add(rs.getInt("Umumi_Satis_Miqdari"));
                    v2.add(rs.getString("Satis_Tarixi"));
                    v2.add(rs.getDouble("Xeyir"));
                    v2.add(rs.getDouble("Umumi_Xeyir"));
                    v2.add(rs.getDouble("QiemenOdenis"));
                    v2.add(rs.getDouble("Qaytarilan_Mehsul_Miqdari"));
                    v2.add(rs.getDouble("Musteriye_Geri_Odenis"));
                    v2.add(rs.getString("Borc_Alanin_Adi"));
                    v2.add(rs.getDouble("Yeni_goturulen_Mebleg"));
                    v2.add(rs.getDouble("Borcdan_Gelen"));

                }
                df.addRow(v2);

            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }//GEN-LAST:event_sonBirAyActionPerformed

    
    public void secilenTarixler(){
        
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Calendar cal = new GregorianCalendar();
//        cal.add(Calendar.DAY_OF_MONTH, -30);
//        String sss = sdf.format(cal.getTime());

        
        Date  birinciTarix = ilkTarix.getDate();
        Date ikinciTarix =sonTarix.getDate();
        String sss = sdf.format(ilkTarix.getDate());
        String sss2 = sdf.format(sonTarix.getDate());
        
        System.out.println(sss);
        System.out.println(sss2);

        txtKassa.removeAll();
        // System.out.println(sss);
        int a;
        try {

            pres = con.prepareCall("SELECT\n"
                    + "	s.id,\n"
                    + "	s.Malin_adi,\n"
                    + "	s.Miqdari,\n"
                    + "	s.Umumi_Mebleg AS Satis_Meblegi_Cem,\n"
                    + "	s.QiemenOdenis,\n"
                    + "	s.Qaytarilan_Mehsul_Miqdari,\n"
                    + "	s.Musteriye_Geri_Odenis,\n"
                    + "	s.Borc_Alanin_Adi,\n"
                    + "	s.Yeni_goturulen_Mebleg,\n"
                    + "	s.Borcdan_Gelen,\n"
                    + " m.Satis_miqdari, \n"
                    + "	m.Alis_qiymeti,\n"
                    + " m.Satisin_toplam_deyeri, \n"
                    + "	s.Satis_qiymeti,\n"
                    + "	m.Satis_miqdari AS Umumi_Satis_Miqdari,\n"
                    + "	s.Satis_Tarixi,\n"
                    + "	( s.Miqdari * s.Satis_qiymeti - s.Miqdari * m.Alis_qiymeti ) AS Xeyir, (m.Satisin_toplam_deyeri - m.Alis_qiymeti* m.Satis_miqdari) as Umumi_Xeyir \n"
                    + "FROM\n"
                    + "	satilan_mallar s\n"
                    + "	LEFT JOIN mehsullar m ON m.id = s.id \n"
                    + "WHERE\n"
                    + "	s.Satis_Tarixi BETWEEN" + "'"+sss+"'" + "and" + "'"+sss2+"'");

            ResultSet rs = pres.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblGelirCedveli.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getInt("Miqdari"));
                    v2.add(rs.getDouble("Satis_Meblegi_Cem"));
                    v2.add(rs.getDouble("Alis_qiymeti"));
                    v2.add(rs.getDouble("Satis_qiymeti"));
                    v2.add(rs.getInt("Umumi_Satis_Miqdari"));
                    v2.add(rs.getString("Satis_Tarixi"));
                    v2.add(rs.getDouble("Xeyir"));
                    v2.add(rs.getDouble("Umumi_Xeyir"));
                    v2.add(rs.getDouble("QiemenOdenis"));
                    v2.add(rs.getDouble("Qaytarilan_Mehsul_Miqdari"));
                    v2.add(rs.getDouble("Musteriye_Geri_Odenis"));
                    v2.add(rs.getString("Borc_Alanin_Adi"));
                    v2.add(rs.getDouble("Yeni_goturulen_Mebleg"));
                    v2.add(rs.getDouble("Borcdan_Gelen"));
                }
                df.addRow(v2);

            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
    
    private void btnHesablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHesablaMouseClicked
        txtKassa.setText("");
        DecimalFormat dformater =  new DecimalFormat("#.##");
        
        df = (DefaultTableModel) tblGelirCedveli.getModel();

        Double SatisQiymeti, borcdanGelen, Gelir, Miqdari, musteriyeGeriQaytarilanMebleg, qismenOdenis, GeriQaytarilanMehsulunMebleg;

        for (int i = 0; i < df.getRowCount(); i++) {

            Gelir = Double.parseDouble(df.getValueAt(i, 8).toString());
            
            String formattedGelir = dformater.format(Gelir);

            boolean yoxla = txtKassa.getText().isEmpty();

            if (yoxla != false) {
                txtKassa.setText(formattedGelir);
            } else {

                double kohneMebleg = Double.parseDouble(txtKassa.getText());
                
                String formattedKohneMebleg = dformater.format(kohneMebleg);
                
                double netice = kohneMebleg + Gelir ;
                
                 String formatterNetice = dformater.format(netice);

                txtKassa.setText(formatterNetice);
            }

        }
        UmumiSatis.setText("");
        for (int i = 0; i < df.getRowCount(); i++) {

            SatisQiymeti = Double.parseDouble(df.getValueAt(i, 5).toString());
            Miqdari = Double.parseDouble(df.getValueAt(i, 2).toString());
            musteriyeGeriQaytarilanMebleg = Double.parseDouble(df.getValueAt(i, 12).toString());
            GeriQaytarilanMehsulunMebleg = Double.parseDouble(df.getValueAt(i, 14).toString());
            qismenOdenis = Double.parseDouble(df.getValueAt(i, 10).toString());
            borcdanGelen = Double.parseDouble(df.getValueAt(i, 15).toString());

            boolean yoxla1 = UmumiSatis.getText().isEmpty();

            if (yoxla1 != false) {
              
                double umumiSatis = SatisQiymeti * Miqdari - musteriyeGeriQaytarilanMebleg  + qismenOdenis - borcdanGelen;
                
                String formatted = dformater.format(umumiSatis);
                
                UmumiSatis.setText(formatted);

            } else {

                double kohneMebleg = Double.parseDouble(UmumiSatis.getText());
                double umumiSatis = SatisQiymeti * Miqdari;
                
                if (umumiSatis == qismenOdenis) {
                  double sonNetice = kohneMebleg + umumiSatis - GeriQaytarilanMehsulunMebleg -borcdanGelen + qismenOdenis;  
                   String formatted = dformater.format(sonNetice); 
                   UmumiSatis.setText(formatted);
                  
                }else {
                    
                    double sonNetice = kohneMebleg + umumiSatis - GeriQaytarilanMehsulunMebleg + qismenOdenis -borcdanGelen;
                    String formatted = dformater.format(sonNetice); 
                    UmumiSatis.setText(formatted);
                }
                
                
                

                
            }

        }
       

    }//GEN-LAST:event_btnHesablaMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void dunenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dunenActionPerformed

        txtKassa.removeAll();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar();
        String ss = sdf.format(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, -1);

        String sss = sdf.format(cal.getTime());

        //  System.out.println(ss);
        // System.out.println(sss);
        int a;
        try {

            pres = con.prepareCall("SELECT\n"
                    + "	s.id,\n"
                    + "	s.Malin_adi,\n"
                    + "	s.Miqdari,\n"
                    + "	s.Umumi_Mebleg AS Satis_Meblegi_Cem,\n"
                    + "	s.QiemenOdenis,\n"
                    + "	s.Qaytarilan_Mehsul_Miqdari,\n"
                    + "	s.Musteriye_Geri_Odenis,\n"
                    + "	s.Borc_Alanin_Adi,\n"
                    + "	s.Yeni_goturulen_Mebleg,\n"
                    + "	s.Borcdan_Gelen,\n"
                    + " m.Satis_miqdari, \n"
                    + "	m.Alis_qiymeti,\n"
                    + " m.Satisin_toplam_deyeri, \n"
                    + "	s.Satis_qiymeti,\n"
                    + "	m.Satis_miqdari AS Umumi_Satis_Miqdari,\n"
                    + "	s.Satis_Tarixi,\n"
                    + "	( s.Miqdari * s.Satis_qiymeti - s.Miqdari * m.Alis_qiymeti ) AS Xeyir, (m.Satisin_toplam_deyeri - m.Alis_qiymeti* m.Satis_miqdari) as Umumi_Xeyir \n"
                    + "FROM\n"
                    + "	satilan_mallar s\n"
                    + "	LEFT JOIN mehsullar m ON m.id = s.id \n"
                    + "WHERE Date (s.Satis_Tarixi) = " + "'"+sss+"'");

            ResultSet rs = pres.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblGelirCedveli.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getInt("Miqdari"));
                    v2.add(rs.getDouble("Satis_Meblegi_Cem"));
                    v2.add(rs.getDouble("Alis_qiymeti"));
                    v2.add(rs.getDouble("Satis_qiymeti"));
                    v2.add(rs.getInt("Umumi_Satis_Miqdari"));
                    v2.add(rs.getString("Satis_Tarixi"));
                    v2.add(rs.getDouble("Xeyir"));
                    v2.add(rs.getDouble("Umumi_Xeyir"));
                    v2.add(rs.getDouble("QiemenOdenis"));
                    v2.add(rs.getDouble("Qaytarilan_Mehsul_Miqdari"));
                    v2.add(rs.getDouble("Musteriye_Geri_Odenis"));
                    v2.add(rs.getString("Borc_Alanin_Adi"));
                    v2.add(rs.getDouble("Yeni_goturulen_Mebleg"));
                    v2.add(rs.getDouble("Borcdan_Gelen"));
                }
                df.addRow(v2);

            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }//GEN-LAST:event_dunenActionPerformed

    private void btnHesablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHesablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHesablaActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
        secilenTarixler();
        
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
            df = (DefaultTableModel) tblGelirCedveli.getModel();

            int selected = tblGelirCedveli.getSelectedRow();

            int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
            
            Mehsullar mehsul =mehDao.getMehsulById(id);
           
            String mehsulunAdi = mehsul.getName();
            
            int cavab = JOptionPane.showConfirmDialog(this, "Silinən məhsulu geri qaytarmaq mümkün olmayacaq! \n"+mehsulunAdi+"-adli mehsulu silmək istədiyinizdən əminsiniz?", "Diqqət!", JOptionPane.YES_NO_CANCEL_OPTION);
            
            if (cavab == 0) {
            
            try {
                pres = con.prepareStatement("delete from satilan_mallar where id = ? ");

                pres.setInt(1, id);

                pres.executeUpdate();

                // load();

                JOptionPane.showMessageDialog(this,  " "+mehsulunAdi+"-adli mehsul silindi");


            } catch (SQLException ex) {
                Logger.getLogger(Satici_Elave_Etmek.class.getName()).log(Level.SEVERE, null, ex);
            }

        }if (cavab ==1) {
            
        }if (cavab ==2) {
            
        }else{
            
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        txtKassa.setText("");
        UmumiSatis.setText("");
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void rbBugunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbBugunKeyPressed
        
        
        
        
        
    }//GEN-LAST:event_rbBugunKeyPressed

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
            java.util.logging.Logger.getLogger(Kassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Kassa().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Kassa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UmumiSatis;
    private javax.swing.JButton btnHesabla;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dunen;
    private com.toedter.calendar.JDateChooser ilkTarix;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton rbBugun;
    private javax.swing.JRadioButton sonBirAy;
    private javax.swing.JRadioButton sonBirHefte;
    private com.toedter.calendar.JDateChooser sonTarix;
    private javax.swing.JRadioButton sonUcGun;
    private javax.swing.JTable tblGelirCedveli;
    private javax.swing.JTextField txtKassa;
    // End of variables declaration//GEN-END:variables
}
