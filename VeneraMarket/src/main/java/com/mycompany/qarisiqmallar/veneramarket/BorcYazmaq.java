/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qarisiqmallar.veneramarket;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samil
 */
public class BorcYazmaq extends javax.swing.JFrame {

    /**
     * Creates new form BorcYazmaq
     */
    public void connect() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection("jdbc:mysql://localhost/mehsullar", "root", "dxdiag92");

    }

    public BorcYazmaq() throws SQLException, Exception {
        initComponents();
        connect();
        tableBorclar();
        checkBox.doClick();
        txtQismenOdenis.disable();

    }

    Connection con;
    PreparedStatement pres;
    Statement stmt;
    DefaultTableModel df;

    public void sebetinSilinmesi() {

        try {
            String query2 = "delete from sebet";
            stmt = con.createStatement();
            stmt.execute(query2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void load() {

        int a;
        try {
            pres = con.prepareCall("select * from sebet");

            ResultSet rs = pres.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblBorcSiyahisi.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                    v2.add(rs.getString("Borc_alanin_adi"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getDouble("Miqdari"));
                    v2.add(rs.getDouble("Satis_qiymeti"));
                    v2.add(rs.getDouble("Umumi_Mebleg"));
                    v2.add(rs.getDouble("Qismen_Odenis"));
                    Double s = rs.getDouble("Qaliq_borc");
                    v2.add(s);
                    v2.add(rs.getString("Tarix"));

                }
                df.addRow(v2);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void borcGostericileri() {

        double umumi, umumiOdenis, umumiBorc, cemAlinan = 0, cemOdenis = 0, borc = 0;

        int a;
        try {
            pres = con.prepareCall("select * from sebet");

            ResultSet rs = pres.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();

            while (rs.next()) {

                umumi = rs.getDouble("Umumi_Mebleg");
                cemAlinan += umumi;

                umumiOdenis = rs.getDouble("Qismen_Odenis");
                cemOdenis += umumiOdenis;

                umumiBorc = rs.getDouble("Qaliq_borc");
                borc += umumiBorc;

            }

            txtBorc1.setText(Double.toString(cemAlinan));
            txtOdenis.setText(Double.toString(cemOdenis));
            txtUmumiBorc.setText(Double.toString(borc));

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void tableBorclar() throws SQLException {

        int a;

        String query222 = "SELECT s.id, s.Malin_adi, s.Miqdari, s.Satis_qiymeti, s.Umumi_Mebleg, s.Borc_alanin_adi, s.Qismen_Odenis, s.Qaliq_borc, s.Tarix from sebet s";
        stmt = con.createStatement();
        stmt.execute(query222);
        ResultSet rs = stmt.getResultSet();
        ResultSetMetaData rd = rs.getMetaData();
        a = rd.getColumnCount();
        df = (DefaultTableModel) tblBorcSiyahisi.getModel();
        df.setRowCount(0);

        while (rs.next()) {

            Vector v2 = new Vector();
            for (int i = 0; i < a; i++) {
                v2.add(rs.getString("Borc_alanin_adi"));
                v2.add(rs.getString("Malin_adi"));
                v2.add(rs.getInt("id"));
                v2.add(rs.getDouble("Miqdari"));
                v2.add(rs.getDouble("Satis_qiymeti"));
                v2.add(rs.getDouble("Umumi_Mebleg"));
                v2.add(rs.getDouble("Qismen_Odenis"));
                v2.add(rs.getDouble("Qaliq_borc"));

                Date s = rs.getDate("Tarix");
                v2.add(s);

            }
            df.addRow(v2);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBorcAlaninAdi = new javax.swing.JTextField();
        txtQismenOdenis = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBorcSiyahisi = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtUmumiBorc = new javax.swing.JTextField();
        txtOdenis = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        checkBox = new javax.swing.JCheckBox();
        txtBorc1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2147483647, 1147483647));

        jPanel2.setBackground(new java.awt.Color(255, 51, 204));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Borc alanin adi");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Qismen odenis");

        txtBorcAlaninAdi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtQismenOdenis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtQismenOdenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQismenOdenisActionPerformed(evt);
            }
        });
        txtQismenOdenis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQismenOdenisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQismenOdenisKeyTyped(evt);
            }
        });

        tblBorcSiyahisi.setBackground(new java.awt.Color(255, 102, 255));
        tblBorcSiyahisi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblBorcSiyahisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Borc alanin adi", "Mehsul", "ID", "Miqdari", "Qiymeti", "Umumi mebleg", "Qismen odenis", "Qaliq borc", "Borc alma tarixi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBorcSiyahisi.setRowHeight(28);
        tblBorcSiyahisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBorcSiyahisiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBorcSiyahisi);
        if (tblBorcSiyahisi.getColumnModel().getColumnCount() > 0) {
            tblBorcSiyahisi.getColumnModel().getColumn(0).setMinWidth(200);
            tblBorcSiyahisi.getColumnModel().getColumn(0).setPreferredWidth(220);
            tblBorcSiyahisi.getColumnModel().getColumn(0).setMaxWidth(500);
            tblBorcSiyahisi.getColumnModel().getColumn(1).setMinWidth(200);
            tblBorcSiyahisi.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblBorcSiyahisi.getColumnModel().getColumn(1).setMaxWidth(350);
            tblBorcSiyahisi.getColumnModel().getColumn(2).setMinWidth(50);
            tblBorcSiyahisi.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblBorcSiyahisi.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        jButton4.setBackground(new java.awt.Color(51, 255, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Bağla");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Borcu qeyd et");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Yenile");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        txtUmumiBorc.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtUmumiBorc.setForeground(new java.awt.Color(255, 0, 0));
        txtUmumiBorc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOdenis.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtOdenis.setForeground(new java.awt.Color(255, 0, 0));
        txtOdenis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOdenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOdenisActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sıfır Ödeniş");

        checkBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxMouseClicked(evt);
            }
        });

        txtBorc1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtBorc1.setForeground(new java.awt.Color(255, 0, 0));
        txtBorc1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBorc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBorc1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(255, 51, 0));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Ümumi");

        jTextField2.setBackground(new java.awt.Color(255, 51, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Ödeniş");

        jTextField3.setBackground(new java.awt.Color(255, 51, 0));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Borc");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQismenOdenis, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBorcAlaninAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBorc1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(txtOdenis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUmumiBorc)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBorcAlaninAdi)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQismenOdenis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBorc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOdenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUmumiBorc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblBorcSiyahisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBorcSiyahisiMouseClicked
        txtQismenOdenis.setText("");
//        txtQaliqBorc.setText("");

        df = (DefaultTableModel) tblBorcSiyahisi.getModel();

        int selected = tblBorcSiyahisi.getSelectedRow();

//        txtMehsul.setText(df.getValueAt(selected, 1).toString());
//        txtID.setText(df.getValueAt(selected, 2).toString());
//        txtMiqdari.setText(df.getValueAt(selected, 3).toString());
//        txtQiymeti.setText(df.getValueAt(selected, 4).toString());
//        txtUmumiMebleg.setText(df.getValueAt(selected, 5).toString());

    }//GEN-LAST:event_tblBorcSiyahisiMouseClicked

    private void txtQismenOdenisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQismenOdenisKeyReleased


    }//GEN-LAST:event_txtQismenOdenisKeyReleased

    private void txtQismenOdenisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQismenOdenisKeyTyped

    }//GEN-LAST:event_txtQismenOdenisKeyTyped

    private void txtQismenOdenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQismenOdenisActionPerformed

    }//GEN-LAST:event_txtQismenOdenisActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // bura
        try {
            if (txtBorcAlaninAdi.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Zəhmət olmasa bütün məlumatları doldurun");
                return;
            } else {

                boolean check = checkBox.isSelected();

                if (check == true) {

                    String query222 = "SELECT s.id, s.Malin_adi, s.Miqdari, s.Satis_qiymeti, s.Umumi_Mebleg, s.Borc_alanin_adi, s.Qismen_Odenis, s.Qaliq_borc, s.Tarix from sebet s";
                    stmt = con.createStatement();
                    stmt.execute(query222);
                    ResultSet rs = stmt.getResultSet();

                    while (rs.next()) {

                        double qismenOdenis = 0;
                        String BorcAlaninAdi = txtBorcAlaninAdi.getText();
                        int ID = rs.getInt("id");
                        double Miqdari = rs.getDouble("Miqdari");
                        double satisQiymeti = rs.getDouble("Satis_qiymeti");

                        pres = con.prepareStatement("update sebet set id = ?, Borc_alanin_adi=?, Qismen_Odenis=?, Qaliq_borc =? where id = ?");

                        pres.setInt(1, ID);
                        pres.setString(2, BorcAlaninAdi);
                        pres.setDouble(3, qismenOdenis);
                        pres.setDouble(4, satisQiymeti * Miqdari);
                        pres.setInt(5, ID);
                        pres.executeUpdate();

                    }

                }

                boolean check2 = checkBox.isSelected();

                if (check2 == false) {

                    String query222 = "SELECT s.id, s.Malin_adi, s.Miqdari, s.Satis_qiymeti, s.Umumi_Mebleg, s.Borc_alanin_adi, s.Qismen_Odenis, s.Qaliq_borc, s.Tarix from sebet s";
                    stmt = con.createStatement();
                    stmt.execute(query222);
                    ResultSet rs = stmt.getResultSet();

                    while (rs.next()) {

                        double qaliqBorc = 0.0;
                        String BorcAlaninAdi = txtBorcAlaninAdi.getText();
                        double qismenOdenis = Double.parseDouble(txtQismenOdenis.getText());
                        int ID = rs.getInt("id");
                        double Miqdari = rs.getDouble("Miqdari");
                        double satisQiymeti = rs.getDouble("Satis_qiymeti");

                        if (qismenOdenis > 0) {

                            if (satisQiymeti * Miqdari >= qismenOdenis) {

                                qaliqBorc = (satisQiymeti * Miqdari) - qismenOdenis;

                                pres = con.prepareStatement("update sebet set id = ?, Borc_alanin_adi=?, Qismen_Odenis=?, Qaliq_borc =? where id = ?");

                                pres.setInt(1, ID);
                                pres.setString(2, BorcAlaninAdi);
                                pres.setDouble(3, qismenOdenis);
                                pres.setDouble(4, qaliqBorc);
                                pres.setInt(5, ID);
                                pres.executeUpdate();

                                txtQismenOdenis.setText("0");
                            }

                        } else {

                            double qismenOdenis2 = 0;
                            String BorcAlaninAdi2 = txtBorcAlaninAdi.getText();
                            int ID2 = rs.getInt("id");
                            double Miqdari2 = rs.getDouble("Miqdari");
                            double satisQiymeti2 = rs.getDouble("Satis_qiymeti");

                            pres = con.prepareStatement("update sebet set id = ?, Borc_alanin_adi=?, Qismen_Odenis=?, Qaliq_borc =? where id = ?");

                            pres.setInt(1, ID2);
                            pres.setString(2, BorcAlaninAdi2);
                            pres.setDouble(3, qismenOdenis2);
                            pres.setDouble(4, satisQiymeti2 * Miqdari2);
                            pres.setInt(5, ID2);
                            pres.executeUpdate();
                        }

                    }

                }

            }

            load();
            borcGostericileri();
            JOptionPane.showMessageDialog(this, "Borc qeyd olundu");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        df = (DefaultTableModel) tblBorcSiyahisi.getModel();
        if (df.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Səbət boşdur!");
        } else {

            int ID;
            double Qiymeti, UmumiMebleg, QismenOdenis, QaliqBorc, Miqdari;
            String BorcAlaninAdi, Mehsul, Tarix;

            try {

                for (int i = 0; i < df.getRowCount(); i++) {

                    BorcAlaninAdi = df.getValueAt(i, 0).toString();
                    Mehsul = df.getValueAt(i, 1).toString();
                    ID = Integer.parseInt(df.getValueAt(i, 2).toString());
                    Miqdari = Double.parseDouble(df.getValueAt(i, 3).toString());
                    Qiymeti = Double.parseDouble(df.getValueAt(i, 4).toString());
                    UmumiMebleg = Double.parseDouble(df.getValueAt(i, 5).toString());
                    QismenOdenis = Double.parseDouble(df.getValueAt(i, 6).toString());
                    QaliqBorc = Double.parseDouble(df.getValueAt(i, 7).toString());
                    Tarix = df.getValueAt(i, 8).toString();

                    String query = "insert into borclar_siyahisi( Borc_alanin_adi, Borca_goturduyu_mehsul, Mehsul_ID, Miqdari, Qiymeti, Umumi_mebleg, Qismen_odenis, Qaliq_borc, Borc_alma_tarixi ) values(?,?,?,?,?,?,?,?,?)";

                    pres = con.prepareStatement(query);
                    pres.setString(1, BorcAlaninAdi);
                    pres.setString(2, Mehsul);
                    pres.setInt(3, ID);
                    pres.setDouble(4, Miqdari);
                    pres.setDouble(5, Qiymeti);
                    pres.setDouble(6, UmumiMebleg);
                    pres.setDouble(7, QismenOdenis);
                    pres.setDouble(8, QaliqBorc);
                    pres.setString(9, Tarix);
                    pres.execute();

                    if (QaliqBorc != UmumiMebleg) {

                        String query2 = "insert into satilan_mallar ( id, Malin_adi, Miqdari, Satis_qiymeti, Umumi_Mebleg, Satis_Tarixi, Borc_Alanin_Adi,OdenisinNovu, QiemenOdenis, Borcdan_Gelen) values(?,?,?,?,?,?,?,?,?,?)";

                        pres = con.prepareStatement(query2);
                        pres.setInt(1, 0);
                        pres.setString(2, "Borcdan-" + Mehsul);
                        pres.setDouble(3, Miqdari);
                        pres.setDouble(4, Qiymeti);
                        pres.setDouble(5, UmumiMebleg);
                        pres.setString(6, Tarix);
                        pres.setString(7, BorcAlaninAdi);
                        pres.setString(8, "Borcdan gələn");
                        pres.setDouble(9, QismenOdenis);
                        pres.setDouble(10, UmumiMebleg);

                        pres.execute();

                    }
                }

                String query222 = "SELECT s.id, s.Malin_adi, s.Miqdari, s.Satis_qiymeti, s.Umumi_Mebleg, s.Borc_alanin_adi, s.Qismen_Odenis, s.Qaliq_borc, s.Tarix from sebet s";
                stmt = con.createStatement();
                stmt.execute(query222);
                ResultSet rs = stmt.getResultSet();

                while (rs.next()) {

                    int ID2 = rs.getInt("id");
                    int Miqdari2 = rs.getInt("Miqdari");

                    pres = con.prepareStatement("update mehsullar set Satis_miqdari = Satis_miqdari + ?  where id = ?;");
                    pres.setDouble(1, Miqdari2);
                    pres.setInt(2, ID2);
                    pres.executeUpdate();

                    pres = con.prepareStatement("update mehsullar set Qaliq_say = Miqdari - Satis_miqdari  where id = ?;");
                    pres.setInt(1, ID2);
                    pres.executeUpdate();

                }

                sebetinSilinmesi();

                JOptionPane.showMessageDialog(this, "Borc qeyd olundu!");

                df.setRowCount(0);

            } catch (Exception ex) {

                System.out.println(ex);

            }

        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        this.setVisible(false);

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtOdenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOdenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOdenisActionPerformed

    private void txtBorc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBorc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBorc1ActionPerformed

    private void checkBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxMouseClicked

        boolean check = txtQismenOdenis.isEnabled();

        if (check == false) {

            txtQismenOdenis.enable();
        } else {

            txtQismenOdenis.disable();
        }
    }//GEN-LAST:event_checkBoxMouseClicked

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
            java.util.logging.Logger.getLogger(BorcYazmaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorcYazmaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorcYazmaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorcYazmaq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BorcYazmaq().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BorcYazmaq.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(BorcYazmaq.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblBorcSiyahisi;
    private javax.swing.JTextField txtBorc1;
    private javax.swing.JTextField txtBorcAlaninAdi;
    private javax.swing.JTextField txtOdenis;
    private javax.swing.JTextField txtQismenOdenis;
    private javax.swing.JTextField txtUmumiBorc;
    // End of variables declaration//GEN-END:variables
}
