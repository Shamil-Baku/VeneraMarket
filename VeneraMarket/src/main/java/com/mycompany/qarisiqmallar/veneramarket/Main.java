/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qarisiqmallar.veneramarket;

//import com.google.zxing.BinaryBitmap;
//import com.google.zxing.LuminanceSource;
//import com.google.zxing.MultiFormatReader;
//import com.google.zxing.Reader;
//import com.google.zxing.Result;
//import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
//import com.google.zxing.common.HybridBinarizer;
//import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.aspose.pdf.internal.html.drawing.Length;
import com.google.protobuf.ByteString;
import com.mycompany.DaoInter.AltKateqoriyalarDaoInter;
import com.mycompany.DaoInter.MehsullarDaoInter;
import com.mycompany.DaoInter.QiymetlerDaoInter;

import com.mycompany.entity.AltKateqoriyalar;
import com.mycompany.entity.Mehsullar;
import com.mycompany.entity.Qiymetler;

import java.awt.event.KeyEvent;
import com.mycompany.main.Contex;
import com.mysql.cj.xdevapi.Result;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
// import java.sql.Date;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samil
 */
public class Main extends javax.swing.JFrame implements KeyListener {
    
    public MehsullarDaoInter mehDao = Contex.instanceOfMehsullarDao();
    public QiymetlerDaoInter QiymetDao = Contex.instanceOfQiymetlerDao();
    public AltKateqoriyalarDaoInter mehDao2 = Contex.instanceOfAltKateqoriyalarDao();
    
    Date date = new Date();
    Calendar calendar;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm:ss");
    String date2 = sdf.format(date);
    String date3 = sdf2.format(date);
    String date4 = sdf3.format(date);
    
    int say = 1;
    String time;

    // Calculator
    double birinciReqem = 0.0;
    String operation = null;
    
    public Main() throws Exception {
        
        this.addKeyListener(this);
        initComponents();
        connect();
        addMenu();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        txtSatisTarixi.setText(date2);
        // txtDate.setText(date3);
        txtBarcode_reader.requestFocus();

        // Image icon = new ImageIcon(this.getClass().getResource("icon
        // file.jpg")).getImage();
        // this.setIconImage(icon);
        // setTime();
    }

    // public Main(Image icon) throws Exception {
    //
    // logo = new ImageIcon("C:\\Users\\samil\\OneDrive\\Изображения\\Camera
    // Roll\\Icon file.jpg");
    //
    // Main m = new Main();
    // m.setIcon(logo);
    // m.setLayout(null);
    //
    // }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Detallar = new javax.swing.JMenuItem();
        Sil = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbYaz = new javax.swing.JCheckBox();
        cbYay = new javax.swing.JCheckBox();
        cbPayiz = new javax.swing.JCheckBox();
        cbQis = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbKisi = new javax.swing.JCheckBox();
        cbUsaq = new javax.swing.JCheckBox();
        cbQadin = new javax.swing.JCheckBox();
        cbQarisiq = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        cbAltKateqoriyalar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbMehsullar_2 = new javax.swing.JComboBox<>();
        txtOdenis = new javax.swing.JTextField();
        txtAxtaris = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtBarcode_reader = new javax.swing.JTextField();
        txtQaliq = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlinanMallar = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtCemMebleg = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLMalinQiymeti = new javax.swing.JLabel();
        TextMalinMiqdari = new javax.swing.JTextField();
        TextMalinAdi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMovsumId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textKateqoriyaId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAltKateqoriyaID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSatisTarixi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtQiymet = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtUmumi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbNagd = new javax.swing.JCheckBox();
        cbNisye = new javax.swing.JCheckBox();
        btnDuzelisEt = new javax.swing.JButton();
        btnElaveEt = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnSatildi = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnGeriQaytar = new javax.swing.JButton();
        cbMehsullar = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAxtaris = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        txtDisplay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();

        Detallar.setText("Detallar");
        Detallar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetallarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Detallar);

        Sil.setText("Sil");
        Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Sil);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Satış", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbYaz.setBackground(new java.awt.Color(153, 153, 255));
        cbYaz.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbYaz.setForeground(java.awt.Color.white);
        cbYaz.setText("Yaz");
        cbYaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYazActionPerformed(evt);
            }
        });

        cbYay.setBackground(new java.awt.Color(153, 153, 255));
        cbYay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbYay.setForeground(java.awt.Color.white);
        cbYay.setText("Yay");
        cbYay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYayActionPerformed(evt);
            }
        });

        cbPayiz.setBackground(new java.awt.Color(153, 153, 255));
        cbPayiz.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbPayiz.setForeground(java.awt.Color.white);
        cbPayiz.setText("Payiz");
        cbPayiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPayizActionPerformed(evt);
            }
        });

        cbQis.setBackground(new java.awt.Color(153, 153, 255));
        cbQis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbQis.setForeground(java.awt.Color.white);
        cbQis.setText("Qis");
        cbQis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbYaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbYay, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbPayiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbQis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPayiz)
                    .addComponent(cbYaz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbQis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbYay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Movsumler");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbKisi.setBackground(new java.awt.Color(153, 153, 255));
        cbKisi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbKisi.setForeground(java.awt.Color.white);
        cbKisi.setText("Kisi");
        cbKisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbKisiMouseClicked(evt);
            }
        });
        cbKisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKisiActionPerformed(evt);
            }
        });

        cbUsaq.setBackground(new java.awt.Color(153, 153, 255));
        cbUsaq.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbUsaq.setForeground(java.awt.Color.white);
        cbUsaq.setText("Usaq");
        cbUsaq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbUsaqMouseClicked(evt);
            }
        });
        cbUsaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsaqActionPerformed(evt);
            }
        });

        cbQadin.setBackground(new java.awt.Color(153, 153, 255));
        cbQadin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbQadin.setForeground(java.awt.Color.white);
        cbQadin.setText("Qadin");
        cbQadin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbQadinMouseClicked(evt);
            }
        });
        cbQadin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQadinActionPerformed(evt);
            }
        });

        cbQarisiq.setBackground(new java.awt.Color(153, 153, 255));
        cbQarisiq.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbQarisiq.setForeground(java.awt.Color.white);
        cbQarisiq.setText("Qarisiq");
        cbQarisiq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbQarisiqMouseClicked(evt);
            }
        });
        cbQarisiq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQarisiqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbKisi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbQadin))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbUsaq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbQarisiq, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbQadin)
                    .addComponent(cbKisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbUsaq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbQarisiq))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kateqoriyalar");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cbAltKateqoriyalar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbAltKateqoriyalar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAltKateqoriyalarItemStateChanged(evt);
            }
        });
        cbAltKateqoriyalar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbAltKateqoriyalarMouseClicked(evt);
            }
        });
        cbAltKateqoriyalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAltKateqoriyalarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alt Kateqoriyalar");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cbMehsullar_2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbMehsullar_2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMehsullar_2ItemStateChanged(evt);
            }
        });
        cbMehsullar_2.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                cbMehsullar_2HierarchyChanged(evt);
            }
        });
        cbMehsullar_2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cbMehsullar_2MouseMoved(evt);
            }
        });
        cbMehsullar_2.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                cbMehsullar_2AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        cbMehsullar_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMehsullar_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbMehsullar_2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbMehsullar_2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbMehsullar_2MouseReleased(evt);
            }
        });
        cbMehsullar_2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                cbMehsullar_2ComponentMoved(evt);
            }
        });
        cbMehsullar_2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                cbMehsullar_2CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                cbMehsullar_2InputMethodTextChanged(evt);
            }
        });
        cbMehsullar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMehsullar_2ActionPerformed(evt);
            }
        });
        cbMehsullar_2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbMehsullar_2PropertyChange(evt);
            }
        });
        cbMehsullar_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbMehsullar_2KeyPressed(evt);
            }
        });
        cbMehsullar_2.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                cbMehsullar_2VetoableChange(evt);
            }
        });

        txtOdenis.setBackground(new java.awt.Color(255, 0, 0));
        txtOdenis.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtOdenis.setForeground(new java.awt.Color(255, 255, 255));
        txtOdenis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOdenis.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtOdenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOdenisActionPerformed(evt);
            }
        });
        txtOdenis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOdenisKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOdenisKeyReleased(evt);
            }
        });

        txtAxtaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAxtarisActionPerformed(evt);
            }
        });
        txtAxtaris.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAxtarisKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Axtar..");

        txtBarcode_reader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarcode_readerActionPerformed(evt);
            }
        });
        txtBarcode_reader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBarcode_readerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarcode_readerKeyReleased(evt);
            }
        });

        txtQaliq.setBackground(new java.awt.Color(255, 0, 0));
        txtQaliq.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtQaliq.setForeground(new java.awt.Color(255, 255, 255));
        txtQaliq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQaliq.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtQaliq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQaliqActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Ödəniş");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Qalıq");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAxtaris, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMehsullar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(cbAltKateqoriyalar, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBarcode_reader, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtOdenis, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQaliq, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAxtaris, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBarcode_reader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOdenis)
                            .addComponent(txtQaliq))
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbAltKateqoriyalar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cbMehsullar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        jSeparator1.setBackground(new java.awt.Color(102, 51, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator1.setName(""); // NOI18N

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        tblAlinanMallar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblAlinanMallar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Say", "ID", "Malin_adi", "Miqdari", "Qiyməti", "Mövsüm_İD", "Kateqoriya_İD", "Alt_Kateqoriya_İD", "Ümumi_məbləğ", "Tarix"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAlinanMallar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlinanMallarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblAlinanMallarMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAlinanMallarMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlinanMallar);
        if (tblAlinanMallar.getColumnModel().getColumnCount() > 0) {
            tblAlinanMallar.getColumnModel().getColumn(0).setMinWidth(5);
            tblAlinanMallar.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblAlinanMallar.getColumnModel().getColumn(0).setMaxWidth(100);
            tblAlinanMallar.getColumnModel().getColumn(1).setMinWidth(2);
            tblAlinanMallar.getColumnModel().getColumn(1).setPreferredWidth(2);
            tblAlinanMallar.getColumnModel().getColumn(1).setMaxWidth(70);
            tblAlinanMallar.getColumnModel().getColumn(2).setMinWidth(100);
            tblAlinanMallar.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblAlinanMallar.getColumnModel().getColumn(2).setMaxWidth(300);
            tblAlinanMallar.getColumnModel().getColumn(5).setMinWidth(2);
            tblAlinanMallar.getColumnModel().getColumn(5).setPreferredWidth(2);
            tblAlinanMallar.getColumnModel().getColumn(5).setMaxWidth(100);
            tblAlinanMallar.getColumnModel().getColumn(6).setMinWidth(2);
            tblAlinanMallar.getColumnModel().getColumn(6).setPreferredWidth(2);
            tblAlinanMallar.getColumnModel().getColumn(6).setMaxWidth(100);
            tblAlinanMallar.getColumnModel().getColumn(7).setMinWidth(2);
            tblAlinanMallar.getColumnModel().getColumn(7).setPreferredWidth(2);
            tblAlinanMallar.getColumnModel().getColumn(7).setMaxWidth(100);
        }

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cəmi");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtCemMebleg.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtCemMebleg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCemMebleg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCemMeblegActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText(" Malin adi  :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Malin miqdari :");

        jLMalinQiymeti.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLMalinQiymeti.setForeground(new java.awt.Color(255, 255, 255));
        jLMalinQiymeti.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLMalinQiymeti.setText("Malin qiyməti :");

        TextMalinMiqdari.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextMalinMiqdari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMalinMiqdariActionPerformed(evt);
            }
        });
        TextMalinMiqdari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextMalinMiqdariKeyReleased(evt);
            }
        });

        TextMalinAdi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextMalinAdi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextMalinAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMalinAdiActionPerformed(evt);
            }
        });
        TextMalinAdi.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TextMalinAdiPropertyChange(evt);
            }
        });
        TextMalinAdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextMalinAdiKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("KateqoriyaID :");

        txtMovsumId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMovsumId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovsumIdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("MovsumID :");

        textKateqoriyaId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textKateqoriyaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textKateqoriyaIdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Alt KateqoriyaID :");

        txtAltKateqoriyaID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAltKateqoriyaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltKateqoriyaIDActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Satış tarixi :");

        txtSatisTarixi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSatisTarixi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSatisTarixiActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Ümumi məbləğ :");

        txtQiymet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQiymet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQiymetActionPerformed(evt);
            }
        });
        txtQiymet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQiymetKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQiymetKeyReleased(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Mehsul ID :");

        txtUmumi.setBackground(new java.awt.Color(255, 0, 0));
        txtUmumi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtUmumi.setForeground(new java.awt.Color(255, 255, 255));
        txtUmumi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUmumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmumiActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Ödənişin tipi :");

        cbNagd.setText("Nağd");
        cbNagd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNagdActionPerformed(evt);
            }
        });

        cbNisye.setText("Nisyə");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(jLMalinQiymeti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMovsumId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextMalinMiqdari, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQiymet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextMalinAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUmumi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSatisTarixi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(textKateqoriyaId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAltKateqoriyaID, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cbNagd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbNisye)))
                .addGap(16, 16, 16))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextMalinAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextMalinMiqdari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLMalinQiymeti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQiymet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMovsumId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textKateqoriyaId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAltKateqoriyaID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSatisTarixi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUmumi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNagd)
                    .addComponent(cbNisye))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnDuzelisEt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDuzelisEt.setText("Düzəliş et");
        btnDuzelisEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuzelisEtActionPerformed(evt);
            }
        });

        btnElaveEt.setBackground(new java.awt.Color(0, 204, 0));
        btnElaveEt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnElaveEt.setForeground(new java.awt.Color(255, 255, 255));
        btnElaveEt.setText("Əlavə et");
        btnElaveEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElaveEtActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SIl");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnSatildi.setBackground(new java.awt.Color(0, 204, 0));
        btnSatildi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSatildi.setForeground(new java.awt.Color(255, 255, 255));
        btnSatildi.setText("Satıldı");
        btnSatildi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSatildiMouseClicked(evt);
            }
        });
        btnSatildi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatildiActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancel.setText("Ləğv et");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnGeriQaytar.setBackground(new java.awt.Color(51, 51, 255));
        btnGeriQaytar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGeriQaytar.setForeground(new java.awt.Color(255, 255, 255));
        btnGeriQaytar.setText("Geri Qaytar");
        btnGeriQaytar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGeriQaytarMouseClicked(evt);
            }
        });
        btnGeriQaytar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriQaytarActionPerformed(evt);
            }
        });

        cbMehsullar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbMehsullar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMehsullarItemStateChanged(evt);
            }
        });
        cbMehsullar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbMehsullarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbMehsullarMousePressed(evt);
            }
        });
        cbMehsullar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMehsullarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnElaveEt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGeriQaytar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMehsullar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSatildi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDuzelisEt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCemMebleg, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDuzelisEt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSatildi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGeriQaytar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnElaveEt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCemMebleg, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cbMehsullar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

        tblAxtaris.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Malin adi", "Qiymet", "MovsumID", "KateqoriyaID", "AltKateqoriyaID"
            }
        ));
        tblAxtaris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAxtarisMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAxtaris);
        if (tblAxtaris.getColumnModel().getColumnCount() > 0) {
            tblAxtaris.getColumnModel().getColumn(0).setMinWidth(10);
            tblAxtaris.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblAxtaris.getColumnModel().getColumn(0).setMaxWidth(150);
            tblAxtaris.getColumnModel().getColumn(1).setMinWidth(10);
            tblAxtaris.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblAxtaris.getColumnModel().getColumn(1).setMaxWidth(200);
            tblAxtaris.getColumnModel().getColumn(2).setMinWidth(2);
            tblAxtaris.getColumnModel().getColumn(2).setPreferredWidth(3);
            tblAxtaris.getColumnModel().getColumn(2).setMaxWidth(100);
            tblAxtaris.getColumnModel().getColumn(3).setMinWidth(2);
            tblAxtaris.getColumnModel().getColumn(3).setPreferredWidth(3);
            tblAxtaris.getColumnModel().getColumn(3).setMaxWidth(100);
            tblAxtaris.getColumnModel().getColumn(4).setMinWidth(2);
            tblAxtaris.getColumnModel().getColumn(4).setPreferredWidth(3);
            tblAxtaris.getColumnModel().getColumn(4).setMaxWidth(100);
            tblAxtaris.getColumnModel().getColumn(5).setMinWidth(2);
            tblAxtaris.getColumnModel().getColumn(5).setPreferredWidth(3);
            tblAxtaris.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        jPanel7.setPreferredSize(new java.awt.Dimension(320, 500));

        txtDisplay.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtDisplay.setForeground(new java.awt.Color(0, 0, 255));
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });
        txtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDisplayKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("C");
        jButton1.setMaximumSize(new java.awt.Dimension(80, 22));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 22));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 22));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\git projects\\VeneraMarket\\VeneraMarket\\src\\main\\java\\pictures\\icons8-clear-symbol-24.png")); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(80, 22));
        jButton2.setMinimumSize(new java.awt.Dimension(80, 22));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 22));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("%");
        jButton4.setMaximumSize(new java.awt.Dimension(80, 22));
        jButton4.setMinimumSize(new java.awt.Dimension(80, 22));
        jButton4.setPreferredSize(new java.awt.Dimension(80, 22));

        btnDivision.setBackground(new java.awt.Color(255, 153, 51));
        btnDivision.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnDivision.setText("÷");
        btnDivision.setMaximumSize(new java.awt.Dimension(80, 22));
        btnDivision.setMinimumSize(new java.awt.Dimension(80, 22));
        btnDivision.setPreferredSize(new java.awt.Dimension(80, 22));
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnNum7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNum7.setText("7");
        btnNum7.setMaximumSize(new java.awt.Dimension(80, 22));
        btnNum7.setMinimumSize(new java.awt.Dimension(80, 22));
        btnNum7.setPreferredSize(new java.awt.Dimension(80, 22));
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnNum8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNum8.setText("8");
        btnNum8.setMaximumSize(new java.awt.Dimension(80, 22));
        btnNum8.setMinimumSize(new java.awt.Dimension(80, 22));
        btnNum8.setPreferredSize(new java.awt.Dimension(80, 22));
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNum9.setText("9");
        btnNum9.setMaximumSize(new java.awt.Dimension(80, 22));
        btnNum9.setMinimumSize(new java.awt.Dimension(80, 22));
        btnNum9.setPreferredSize(new java.awt.Dimension(80, 22));
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnMultiplication.setBackground(new java.awt.Color(255, 153, 51));
        btnMultiplication.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnMultiplication.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplication.setText("*");
        btnMultiplication.setMaximumSize(new java.awt.Dimension(80, 22));
        btnMultiplication.setMinimumSize(new java.awt.Dimension(80, 22));
        btnMultiplication.setPreferredSize(new java.awt.Dimension(80, 22));
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnNum5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNum5.setText("5");
        btnNum5.setMaximumSize(new java.awt.Dimension(80, 22));
        btnNum5.setMinimumSize(new java.awt.Dimension(80, 22));
        btnNum5.setPreferredSize(new java.awt.Dimension(80, 22));
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnMinus.setBackground(new java.awt.Color(255, 153, 51));
        btnMinus.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(255, 255, 255));
        btnMinus.setText("-");
        btnMinus.setMaximumSize(new java.awt.Dimension(80, 22));
        btnMinus.setMinimumSize(new java.awt.Dimension(80, 22));
        btnMinus.setPreferredSize(new java.awt.Dimension(80, 22));
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnNum6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNum6.setText("6");
        btnNum6.setMaximumSize(new java.awt.Dimension(80, 22));
        btnNum6.setMinimumSize(new java.awt.Dimension(80, 22));
        btnNum6.setPreferredSize(new java.awt.Dimension(80, 22));
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnNum4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNum4.setText("4");
        btnNum4.setMaximumSize(new java.awt.Dimension(80, 22));
        btnNum4.setMinimumSize(new java.awt.Dimension(80, 22));
        btnNum4.setPreferredSize(new java.awt.Dimension(80, 22));
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNum3.setText("3");
        btnNum3.setMaximumSize(new java.awt.Dimension(80, 22));
        btnNum3.setMinimumSize(new java.awt.Dimension(80, 22));
        btnNum3.setPreferredSize(new java.awt.Dimension(80, 22));
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnNum2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNum2.setText("2");
        btnNum2.setMaximumSize(new java.awt.Dimension(80, 22));
        btnNum2.setMinimumSize(new java.awt.Dimension(80, 22));
        btnNum2.setPreferredSize(new java.awt.Dimension(80, 22));
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnNum1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNum1.setText("1");
        btnNum1.setMaximumSize(new java.awt.Dimension(80, 22));
        btnNum1.setMinimumSize(new java.awt.Dimension(80, 22));
        btnNum1.setPreferredSize(new java.awt.Dimension(80, 22));
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnPlus.setBackground(new java.awt.Color(255, 153, 51));
        btnPlus.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus.setText("+");
        btnPlus.setMaximumSize(new java.awt.Dimension(80, 22));
        btnPlus.setMinimumSize(new java.awt.Dimension(80, 22));
        btnPlus.setPreferredSize(new java.awt.Dimension(80, 22));
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton18.setText("∓");
        jButton18.setMaximumSize(new java.awt.Dimension(80, 22));
        jButton18.setMinimumSize(new java.awt.Dimension(80, 22));
        jButton18.setPreferredSize(new java.awt.Dimension(80, 22));

        btnNum0.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnNum0.setText("0");
        btnNum0.setMaximumSize(new java.awt.Dimension(80, 22));
        btnNum0.setMinimumSize(new java.awt.Dimension(80, 22));
        btnNum0.setPreferredSize(new java.awt.Dimension(80, 22));
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton20.setText(",");
        jButton20.setMaximumSize(new java.awt.Dimension(80, 22));
        jButton20.setMinimumSize(new java.awt.Dimension(80, 22));
        jButton20.setPreferredSize(new java.awt.Dimension(80, 22));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        btnEqual.setBackground(new java.awt.Color(255, 153, 51));
        btnEqual.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnEqual.setForeground(new java.awt.Color(255, 255, 255));
        btnEqual.setText("=");
        btnEqual.setMaximumSize(new java.awt.Dimension(80, 22));
        btnEqual.setMinimumSize(new java.awt.Dimension(80, 22));
        btnEqual.setPreferredSize(new java.awt.Dimension(80, 22));
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisplay)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAxtarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAxtarisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAxtarisActionPerformed

    private void tblAlinanMallarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlinanMallarMouseReleased
        
        df = (DefaultTableModel) tblAlinanMallar.getModel();
        
        int selected = tblAlinanMallar.getSelectedRow();
        
        if (SwingUtilities.isRightMouseButton(evt)) {
            jPopupMenu1.show(tblAlinanMallar, evt.getX(), evt.getY());
        }

    }//GEN-LAST:event_tblAlinanMallarMouseReleased

    private void DetallarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetallarActionPerformed
        
        exploreAboutProduct();

    }//GEN-LAST:event_DetallarActionPerformed

    private void SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilActionPerformed
        
        delete();

    }//GEN-LAST:event_SilActionPerformed

    private void btnGeriQaytarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGeriQaytarMouseClicked
        try {
            
            String tarix = txtSatisTarixi.getText();
            double id = Double.parseDouble(txtID.getText());
            
            pres = con.prepareStatement("delete from satilan_mallar s where s.id =? and s.Satis_Tarixi = ?");
            pres.setDouble(1, id);
            pres.setString(2, tarix);
            pres.executeUpdate();
            
            geriQaytarma();
            
            JOptionPane.showMessageDialog(this, "Mehsul ugurla silindi!");
            
        } catch (SQLException ex) {
            System.out.println("Gosterilen mehsul satilan mallar siyahisinda yoxdur!");
        }

    }//GEN-LAST:event_btnGeriQaytarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        txtDisplay.setText("");
        txtDisplay.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        
        birinciReqem = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "+";
        txtDisplay.requestFocus();

    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        
        birinciReqem = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "-";
        txtDisplay.requestFocus();
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        
        birinciReqem = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "*";
        txtDisplay.requestFocus();
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        birinciReqem = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operation = "/";
        txtDisplay.requestFocus();
    }//GEN-LAST:event_btnDivisionActionPerformed
    
    public void beraberlik() {
        
        double ikinciReqem = Double.parseDouble(txtDisplay.getText());
        
        if (operation == "+") {
            double cem = birinciReqem + ikinciReqem;
            txtDisplay.setText(Double.toString(cem));
        }
        if (operation == "-") {
            double cem = birinciReqem - ikinciReqem;
            txtDisplay.setText(Double.toString(cem));
        }
        if (operation == "*") {
            double cem = birinciReqem * ikinciReqem;
            txtDisplay.setText(Double.toString(cem));
        }
        if (operation == "/") {
            double cem = birinciReqem / ikinciReqem;
            txtDisplay.setText(Double.toString(cem));
        }
        
    }
    
    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        
        beraberlik();

    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + 1);

    }//GEN-LAST:event_btnNum1ActionPerformed

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        

    }//GEN-LAST:event_txtDisplayActionPerformed

    private void txtDisplayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisplayKeyReleased
        
        int button = evt.getKeyCode();
        System.out.println("Sizin ID = " + button);
        
        switch (button) {
            case 107: {
                String ilk = txtDisplay.getText();
                int say = ilk.length();
                String ilkReqem = ilk.substring(0, say - 1);
                birinciReqem = Integer.parseInt(ilkReqem);
                txtDisplay.setText("");
                operation = "+";
                txtDisplay.requestFocus();
                break;
            }
            case 109: {
                String ilk = txtDisplay.getText();
                int say = ilk.length();
                String ilkReqem = ilk.substring(0, say - 1);
                birinciReqem = Integer.parseInt(ilkReqem);
                txtDisplay.setText("");
                operation = "-";
                txtDisplay.requestFocus();
                break;
            }
            case 106: {
                String ilk = txtDisplay.getText();
                int say = ilk.length();
                String ilkReqem = ilk.substring(0, say - 1);
                birinciReqem = Integer.parseInt(ilkReqem);
                txtDisplay.setText("");
                operation = "*";
                txtDisplay.requestFocus();
                break;
            }
            case 111: {
                String ilk = txtDisplay.getText();
                int say = ilk.length();
                String ilkReqem = ilk.substring(0, say - 1);
                birinciReqem = Integer.parseInt(ilkReqem);
                txtDisplay.setText("");
                operation = "/";
                txtDisplay.requestFocus();
                break;
            }
            case 10: {
                beraberlik();
                break;
            }
            
            default:
                System.out.println("Hec biri");
        }
        

    }//GEN-LAST:event_txtDisplayKeyReleased

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + 2);
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + 3);
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + 4);
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + 5);
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + 6);
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + 7);
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + 8);
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + 9);
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + 0);
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        
        txtDisplay.setText(txtDisplay.getText() + ".");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int length = txtDisplay.getText().length();
        int reqem = txtDisplay.getText().length() - 1;
        String store;
        
        if (length > 0) {
            
            StringBuilder back = new StringBuilder(txtDisplay.getText());
            back.deleteCharAt(reqem);
            store = back.toString();
            txtDisplay.setText(store);
        }
        

    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void delete() {
        
        btnSatildi.setVisible(false);
        
        df = (DefaultTableModel) tblAlinanMallar.getModel();
        
        int selected = tblAlinanMallar.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 1).toString());
        
        try {
            pres = con.prepareStatement("delete from sebet where id = ? ");
            
            pres.setInt(1, id);
            pres.executeUpdate();
            load();
            
            df = (DefaultTableModel) tblAlinanMallar.getModel();
            if (df.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Səbət boşdur!");
                
                say = 1;
                txtBarcode_reader.requestFocus();
                
                TextMalinAdi.setText("");
                TextMalinMiqdari.setText("");
                txtQiymet.setText("");
                txtMovsumId.setText("");
                textKateqoriyaId.setText("");
                txtAltKateqoriyaID.setText("");
                txtQaliq.setText("");
                txtOdenis.setText("");
                txtID.setText("");
                txtUmumi.setText("");
                txtBarcode_reader.requestFocus();
                btnSatildi.setVisible(true);
                btnElaveEt.setVisible(true);
                txtCemMebleg.setText("");
                
            } else {
                
                sebetinHesablanmasi();
                
            }
            
            if (df.getRowCount() != 0) {
                
                JOptionPane.showMessageDialog(this, "Mehsul silindi");
                
                TextMalinAdi.setText("");
                TextMalinMiqdari.setText("");
                txtQiymet.setText("");
                txtMovsumId.setText("");
                textKateqoriyaId.setText("");
                txtAltKateqoriyaID.setText("");
                txtQaliq.setText("");
                txtOdenis.setText("");
                txtID.setText("");
                txtUmumi.setText("");
                txtBarcode_reader.requestFocus();
                btnSatildi.setVisible(true);
                btnElaveEt.setVisible(true);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Satici_Elave_Etmek.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void exploreAboutProduct() {
        
        try {
            df = (DefaultTableModel) tblAlinanMallar.getModel();
            int selected = tblAlinanMallar.getSelectedRow();
            
            int id = Integer.parseInt(df.getValueAt(selected, 1).toString());
            String malinAdi = (df.getValueAt(selected, 2).toString());
            
            Mehsullar mehsul = mehDao.getMehsulById(id);
            Mehsullar qaliq = mehDao.exploreMehsulQaliqById(id);
            Integer satisMiq = mehsul.getNumberOfProduct();
            
            Integer qaliqsay = qaliq.getHowMuchLeft();
            System.out.println("budu---> " + qaliqsay);
            pres = con.prepareStatement("truncate table detallar;");
            pres.executeUpdate();
            
            pres = con.prepareStatement("insert into detallar (DetalliArasdirilacaqMehsul, id, Miqdari, Qaliq_say ) values(?,?,?,?)");
            pres.setString(1, malinAdi);
            pres.setInt(2, id);
            pres.setInt(3, satisMiq);
            pres.setInt(4, qaliqsay);
            pres.executeUpdate();
            
            exploreAboutProduct ex = new exploreAboutProduct();
            ex.setVisible(true);

            //int satisMiq2 = mehDao.exploreMehsulById(id);
            //int say = explore.size();
            txtAxtaris.setText(Integer.toString(say));
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    Connection con;
    PreparedStatement pres;
    Statement stmt;
    DefaultTableModel df;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem Stock;
    JMenuItem Products;
    JMenuItem Saticilar;
    JMenuItem Kassa;
    JMenuItem Deyisme;
    JMenuItem BorclarlaEmeliyyat;
    JMenuItem Alış_Qaimeleri;
    ImageIcon venera;
    ImageIcon logo;
    
    public void satisEmeliyyati() {
        
        boolean yoxla = cbNisye.isSelected();
        
        df = (DefaultTableModel) tblAlinanMallar.getModel();
        if (df.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Səbət boşdur!");
        } else {
            String ID, Malin_adi, Miqdari, Qiymeti, Movsum_ID, Kateqoriya_ID, Alt_Kateqoriya_ID, Ümumi_Məbləğ, Tarix;
            try {
                connect();
                
                try {
                    if (yoxla != false) {
                        
                        BorcYazmaq borcSiyahisi = new BorcYazmaq();
                        borcSiyahisi.setVisible(true);
                        
                    } else {
                        int say = 1;
                        Statement stmt = con.createStatement();
                        stmt.execute("select * from satilan_mallar");
                        ResultSet rs = stmt.getResultSet();
                        while (rs.next()) {
                            say++;
                        }
                        
                        for (int i = 0; i < df.getRowCount(); i++) {

                            // Burada "tblAlinanMallar" table-da bezi sutunlar gizledilmisdir.
                            ID = df.getValueAt(i, 1).toString();
                            Malin_adi = df.getValueAt(i, 2).toString();
                            Miqdari = df.getValueAt(i, 3).toString();
                            Qiymeti = df.getValueAt(i, 4).toString();
                            Movsum_ID = df.getValueAt(i, 5).toString();
                            Kateqoriya_ID = df.getValueAt(i, 6).toString();
                            Alt_Kateqoriya_ID = df.getValueAt(i, 7).toString();
                            Ümumi_Məbləğ = df.getValueAt(i, 8).toString();
                            Tarix = df.getValueAt(i, 9).toString();
                            
                            String query = "insert into satilan_mallar( Satis_ID, id, Malin_adi, Miqdari, Satis_qiymeti, Movsum_id, Kateqoriya_id, Alt_kateqoriya_id, Umumi_Mebleg, Satis_Tarixi ) values(?,?,?,?,?,?,?,?,?,?)";
                            
                            pres = con.prepareStatement(query);
                            
                            pres.setInt(1, say);
                            pres.setString(2, ID);
                            pres.setString(3, Malin_adi);
                            pres.setString(4, Miqdari);
                            pres.setString(5, Qiymeti);
                            pres.setString(6, Movsum_ID);
                            pres.setString(7, Kateqoriya_ID);
                            pres.setString(8, Alt_Kateqoriya_ID);
                            pres.setString(9, Ümumi_Məbləğ);
                            pres.setString(10, Tarix);
                            pres.execute();
                        }
                        
                        satis();
                        sebetinSilinmesi();
                        
                        JOptionPane.showMessageDialog(this, "Satış uğurla başa çatdı");
                        
                        df.setRowCount(0);
                        
                        TextMalinAdi.setText("");
                        TextMalinMiqdari.setText("");
                        txtQiymet.setText("");
                        txtMovsumId.setText("");
                        textKateqoriyaId.setText("");
                        txtAltKateqoriyaID.setText("");
                        
                        txtID.setText("");
                        txtUmumi.setText("");
                        
                        txtCemMebleg.setText("");
                        txtOdenis.setText("");
                        txtQaliq.setText("");
                        txtBarcode_reader.requestFocus();
                        say = 1;
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public void qaliqPul() {
        
        DecimalFormat dformater = new DecimalFormat("#.##");
        
        try {
            double odenmeli = Double.parseDouble(txtCemMebleg.getText());
            
            double odenis = Double.parseDouble(txtOdenis.getText());
            
            double result = odenis - odenmeli;
            
            String formattedresult = dformater.format(result);
            
            txtQaliq.setText(formattedresult);
        } catch (Exception ex) {
            System.out.println(ex);
            
        }
    }
    
    public void Sebeteadd() {
        
        DecimalFormat dformater = new DecimalFormat("#.##");
        
        if (TextMalinAdi.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Zəhmət olmasa bütün məlumatları doldurun");
        } else {
            
            df = (DefaultTableModel) tblAlinanMallar.getModel();
            int selected = tblAlinanMallar.getRowCount();
            
            int id = Integer.parseInt(txtID.getText());
            String malinadi = TextMalinAdi.getText();
            Integer miqdari = Integer.parseInt(TextMalinMiqdari.getText());
            double qiymet = Double.parseDouble(txtQiymet.getText());
            String movsumId = txtMovsumId.getText();
            String kateqoriyaId = textKateqoriyaId.getText();
            String altKateqoriya = txtAltKateqoriyaID.getText();
            double umumiMebleg = Double.parseDouble(txtUmumi.getText());
            String alisTarixi = txtSatisTarixi.getText();
            
            Integer i = mehDao.getAllProductFromSebet(id, qiymet);
            load();
            if (i == 0) {
                
                try {
                    
                    pres = con.prepareStatement(
                            "insert into sebet (id2, id, Malin_adi, Miqdari, Satis_qiymeti, Movsum_id, Kateqoriya_id, Alt_kateqoriya_id, Umumi_Mebleg, Tarix ) values(?,?,?,?,?,?,?,?,?,?)");
                    
                    pres.setInt(1, say);
                    pres.setInt(2, id);
                    pres.setString(3, malinadi);
                    pres.setInt(4, miqdari);
                    pres.setDouble(5, qiymet);
                    pres.setString(6, movsumId);
                    pres.setString(7, kateqoriyaId);
                    pres.setString(8, altKateqoriya);
                    pres.setDouble(9, qiymet * miqdari);
                    pres.setString(10, alisTarixi);
                    pres.executeUpdate();
                    say++;
                    
                    TextMalinAdi.setText("");
                    TextMalinMiqdari.setText("");
                    txtQiymet.setText("");
                    txtMovsumId.setText("");
                    textKateqoriyaId.setText("");
                    txtAltKateqoriyaID.setText("");
                    txtQaliq.setText("");
                    txtOdenis.setText("");
                    txtID.setText("");
                    txtUmumi.setText("");
                    txtBarcode_reader.requestFocus();
                    
                } catch (Exception ex) {
                    
                }
                
                load();
                
                txtID.setText("");
                sebetinHesablanmasi();
                
            }
            load();
            TextMalinAdi.setText("");
            TextMalinMiqdari.setText("");
            txtQiymet.setText("");
            txtMovsumId.setText("");
            textKateqoriyaId.setText("");
            txtAltKateqoriyaID.setText("");
            txtQaliq.setText("");
            txtOdenis.setText("");
            
            txtID.setText("");
            txtUmumi.setText("");
            
            txtBarcode_reader.requestFocus();
            
        }
    }
    
    public void addMenu() {
        menuBar = new JMenuBar();
        
        venera = new ImageIcon("C:\\Users\\samil\\OneDrive\\Изображения\\Camera Roll\\Icon file.jpg");
        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("edit");
        helpMenu = new JMenu("Help");
        
        Stock = new JMenuItem("Məhsul əlavə et");
        Alış_Qaimeleri = new JMenuItem("Alış Qaimeleri");
        Saticilar = new JMenuItem("Satici elave et");
        Kassa = new JMenuItem("Kassa");
        Deyisme = new JMenuItem("Dəyişmə Əməliyyatı");
        BorclarlaEmeliyyat = new JMenuItem("Borclarla Əməliyyat");
        Products = new JMenuItem("Məhsullar");
        
        Stock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Stock) {
                    
                    try {
                        AlisQaimesi mehsul = new AlisQaimesi();
                        mehsul.setVisible(true);
                        
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        });
        
        Alış_Qaimeleri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Alış_Qaimeleri) {
                    
                    try {
                        AlisQaimeleri mehsul = new AlisQaimeleri();
                        mehsul.setVisible(true);
                        
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        });
        
        Kassa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (e.getSource() == Kassa) {
                    try {
                        Kassa kassa = new Kassa();
                        kassa.setVisible(true);
                        
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        });
        Saticilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (e.getSource() == Saticilar) {
                    try {
                        Satici_Elave_Etmek satici = new Satici_Elave_Etmek();
                        satici.setVisible(true);
                        
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        });
        
        Deyisme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Deyisme) {
                    
                    try {
                        MehsulDeyisdirilmesi mehsuldeyisme = new MehsulDeyisdirilmesi();
                        mehsuldeyisme.setVisible(true);
                        
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        });
        BorclarlaEmeliyyat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == BorclarlaEmeliyyat) {
                    
                    try {
                        BorclarlaEmeliyyat borclarlaEmeliyyat = new BorclarlaEmeliyyat();
                        borclarlaEmeliyyat.setVisible(true);
                        
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        });
        
        Products.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Products) {
                    
                    try {
                        Mehsul_Elave_etmek products = new Mehsul_Elave_etmek();
                        products.setVisible(true);
                        
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        });
        
        fileMenu.add(Stock);
        fileMenu.add(Saticilar);
        fileMenu.add(Kassa);
        fileMenu.add(Deyisme);
        fileMenu.add(BorclarlaEmeliyyat);
        
        editMenu.add(Alış_Qaimeleri);
        editMenu.add(Products);
        
        Stock.setIcon(venera);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
        
    }
    
    public void add() {
        
        try {
            if (TextMalinAdi.getText().isEmpty() || TextMalinMiqdari.getText().isEmpty()
                    || txtQiymet.getText().isEmpty() || txtMovsumId.getText().isEmpty()
                    || textKateqoriyaId.getText().isEmpty() || txtAltKateqoriyaID.getText().isEmpty()
                    || txtSatisTarixi.getText().isEmpty()) {
                
                JOptionPane.showMessageDialog(this, "Zəhmət olmasa bütün məlumatları doldurun");
            } else {
                String id = txtID.getText();
                String malinadi = TextMalinAdi.getText();
                String miqdari = TextMalinMiqdari.getText();
                String qiymet = txtQiymet.getText();
                String movsumId = txtMovsumId.getText();
                String kateqoriyaId = textKateqoriyaId.getText();
                String altKateqoriya = txtAltKateqoriyaID.getText();
                double umumiMebleg = Double.parseDouble(txtUmumi.getText());
                String alisTarixi = txtSatisTarixi.getText();
                
                double kohneCemMebleg = Double.parseDouble(txtCemMebleg.getText());
                double yeniCemMebleg = kohneCemMebleg + umumiMebleg;
                txtCemMebleg.setText(Double.toString(yeniCemMebleg));
                
                pres = con.prepareStatement(
                        "insert into sebet ( id, Malin_adi, Miqdari, Satis_qiymeti, Movsum_id, Kateqoriya_id, Alt_kateqoriya_id, Umumi_Mebleg, Tarix ) values(?,?,?,?,?,?,?,?,?)");
                
                pres.setString(1, id);
                pres.setString(2, malinadi);
                pres.setString(3, miqdari);
                pres.setString(4, qiymet);
                pres.setString(5, movsumId);
                pres.setString(6, kateqoriyaId);
                pres.setString(7, altKateqoriya);
                pres.setDouble(8, umumiMebleg);
                pres.setString(9, alisTarixi);
                pres.executeUpdate();
                load();
                JOptionPane.showMessageDialog(this, "Məhsul məlumatları uğurla yeniləndi");
                
                TextMalinAdi.setText("");
                TextMalinMiqdari.setText("");
                txtQiymet.setText("");
                txtMovsumId.setText("");
                textKateqoriyaId.setText("");
                txtAltKateqoriyaID.setText("");
                
                txtID.setText("");
                
                boolean cem = txtCemMebleg.getText().isEmpty();
                
                if (cem != true) {
                    
                    double umumi = Double.parseDouble(txtUmumi.getText());
                    double cem6 = Double.parseDouble(txtCemMebleg.getText());
                    double cem2 = cem6 + umumi;
                    txtCemMebleg.setText(Double.toString(cem2));
                    txtUmumi.setText("");
                } else if (cem == true) {
                    txtCemMebleg.setText(Double.toString(umumiMebleg));
                    txtUmumi.setText("");
                    TextMalinAdi.requestFocus();
                    
                }
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Satici_Elave_Etmek.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void deleteAndUpdate() {
        
        btnSatildi.setVisible(false);
        
        df = (DefaultTableModel) tblAlinanMallar.getModel();
        
        int selected = tblAlinanMallar.getSelectedRow();
        
        double kohneumumi = Double.parseDouble(txtCemMebleg.getText());
        
        int silinenMiqdar = Integer.parseInt(TextMalinMiqdari.getText());
        
        double silinenQiymet = Double.parseDouble(txtQiymet.getText());
        
        double silinencem = (silinenMiqdar * silinenQiymet);
        
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        try {
            pres = con.prepareStatement("delete from sebet where id = ? ");
            
            pres.setInt(1, id);
            pres.executeUpdate();
            load();
            
            txtCemMebleg.setText(Double.toString(kohneumumi - silinencem));
            
            btnSatildi.setVisible(true);
            btnElaveEt.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(Satici_Elave_Etmek.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void sebetinSilinmesi() {
        
        try {
            connect();
            
            String query2 = "delete from sebet";
            
            stmt = con.createStatement();
            stmt.execute(query2);
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void satis() {
        
        String ID, Miqdari, Ümumi_Məbləğ;
        
        try {
            connect();
            df = (DefaultTableModel) tblAlinanMallar.getModel();
            
            for (int i = 0; i < df.getRowCount(); i++) {
                
                ID = df.getValueAt(i, 1).toString();
                Miqdari = df.getValueAt(i, 3).toString();
                Ümumi_Məbləğ = df.getValueAt(i, 8).toString();
                
                String query2 = "update mehsullar set Satis_miqdari = Satis_miqdari + ?,  Satisin_toplam_deyeri = Satisin_toplam_deyeri + ?, Qaliq_say = Miqdari - Satis_miqdari where id = ?";
                
                pres = con.prepareStatement(query2);
                
                pres.setString(1, Miqdari);
                pres.setString(2, Ümumi_Məbləğ);
                pres.setString(3, ID);
                pres.executeUpdate();
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void geriQaytarma() {
        
        try {
            connect();
            
            double id = Double.parseDouble(txtID.getText());
            int miqdari = Integer.parseInt(TextMalinMiqdari.getText());
            double umumiMebleg = Double.parseDouble(txtUmumi.getText());
            
            String query2 = "update mehsullar set Satis_miqdari = Satis_miqdari - ?,  Satisin_toplam_deyeri = Satisin_toplam_deyeri - ?, Qaliq_say = Qaliq_say + Satis_miqdari where id = ?";
            
            pres = con.prepareStatement(query2);
            
            pres.setInt(1, miqdari);
            pres.setDouble(2, umumiMebleg);
            pres.setDouble(3, id);
            pres.executeUpdate();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
    public void axtaris() {
        
        String s = txtAxtaris.getText();
        
        int a;
        try {
            pres = con.prepareCall("select * from mehsullar m where m.Malin_adi like " + "'" + "%" + s + "%" + "'");
            
            ResultSet rs = pres.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblAxtaris.getModel();
            df.setRowCount(0);
            
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getString("Satis_qiymeti"));
                    v2.add(rs.getString("Movsum_id"));
                    v2.add(rs.getString("Kateqoriya_id"));
                    v2.add(rs.getString("Alt_kateqoriya_id"));
                    
                }
                df.addRow(v2);
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Satici_Elave_Etmek.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void setTime() {
        
        while (true) {
            try {
                time = sdf3.format(Calendar.getInstance().getTime());
                // txtDate.setText(time);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void connect() throws Exception {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        con = DriverManager.getConnection("jdbc:mysql://localhost/mehsullar", "root", "dxdiag92");
        
    }

    // public void barcodeWriter() {
    //
    // try {
    //
    // InputStream barInputStream = new
    // FileInputStream("C:\\Users\\samil\\OneDrive\\Документы\\NetBeansProjects\\VeneraMarket\\Barcodes\\"
    // + "txtBarcoduYaz.getText()" + ".png");
    // BufferedImage barImage = ImageIO.read(barInputStream);
    // LuminanceSource source = new BufferedImageLuminanceSource(barImage);
    // BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
    // Reader reader = new MultiFormatReader();
    // Result result = reader.decode(bitmap);
    // //txtBarcode_reader.setText(result.getText());
    //
    // } catch (Exception ex) {
    //
    // }
    //
    // }
    //
    // public void barcodeReader() {
    //
    // try {
    //
    // InputStream barInputStream = new
    // FileInputStream("C:\\Users\\samil\\OneDrive\\Документы\\NetBeansProjects\\VeneraMarket\\Barcodes\\"
    // + txtBarcode_reader.getText() + ".png");
    // BufferedImage barImage = ImageIO.read(barInputStream);
    // LuminanceSource source = new BufferedImageLuminanceSource(barImage);
    // BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
    // Reader reader = new MultiFormatReader();
    // Result result = reader.decode(bitmap);
    // TextMalinAdi.setText(result.getText());
    //
    // } catch (Exception ex) {
    //
    // }
    //
    // }
    public void sebetinHesablanmasi() {
        
        DecimalFormat dformater = new DecimalFormat("#.##");
        
        int a;
        try {
            pres = con.prepareCall("select * from sebet");
            
            ResultSet rs = pres.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblAlinanMallar.getModel();
            df.setRowCount(0);
            
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                    v2.add(rs.getString("id2"));
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getString("Miqdari"));
                    v2.add(rs.getString("Satis_qiymeti"));
                    v2.add(rs.getString("Movsum_id"));
                    v2.add(rs.getString("Kateqoriya_id"));
                    v2.add(rs.getString("Alt_kateqoriya_id"));
                    Double s = rs.getDouble("Umumi_Mebleg");
                    v2.add(s);
                    v2.add(rs.getString("Tarix"));
                    
                }
                df.addRow(v2);
                
            }
            
            df = (DefaultTableModel) tblAlinanMallar.getModel();
            
            double toplam, cem = 0;
            
            for (int i = 0; i < df.getRowCount(); i++) {
                
                toplam = Double.parseDouble(df.getValueAt(i, 8).toString());
                cem += toplam;
                String formattedGelir = dformater.format(cem);
                txtCemMebleg.setText(formattedGelir);
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Satici_Elave_Etmek.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void load() {
        
        int a;
        try {
            pres = con.prepareCall("select * from sebet");
            
            ResultSet rs = pres.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblAlinanMallar.getModel();
            df.setRowCount(0);
            
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 0; i < a; i++) {
                    
                    v2.add(rs.getInt("id2"));
                    v2.add(rs.getInt("id"));
                    v2.add(rs.getString("Malin_adi"));
                    v2.add(rs.getString("Miqdari"));
                    v2.add(rs.getString("Satis_qiymeti"));
                    v2.add(rs.getString("Movsum_id"));
                    v2.add(rs.getString("Kateqoriya_id"));
                    v2.add(rs.getString("Alt_kateqoriya_id"));
                    v2.add(rs.getDouble("Umumi_Mebleg"));
                    v2.add(rs.getString("Tarix"));
                    
                }
                df.addRow(v2);
                
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public void Eynilesdirme() {
        
        int a;
        try {
            pres = con.prepareCall("select * from sebet");
            
            ResultSet rs = pres.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel) tblAlinanMallar.getModel();
            df.setRowCount(0);
            
            while (rs.next()) {
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Satici_Elave_Etmek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void findPrice() {
        
        String s = (String) cbMehsullar_2.getSelectedItem(); // buradan

        TextMalinAdi.setText(s);
        
        boolean MovsumQis = cbQis.isSelected();
        boolean SecimQadin = cbQadin.isSelected();
        boolean SecimKisi = cbKisi.isSelected();
        boolean SecimUsaq = cbUsaq.isSelected();
        boolean SecimQarisiq = cbQarisiq.isSelected();
        
        if (MovsumQis != false) {
            
            if (SecimQadin != false) {
                
                int MovsumQis1 = 4;
                int SecimQadin1 = 2;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                int NumberOfSubCategory2 = NumberOfSubCategory + 1;
                String name = TextMalinAdi.getText();
                String name2 = "'" + name + "'";
                List<Qiymetler> id1 = QiymetDao.getPriceByCategoryAndSubCategoryAndSeasonIdAndByName(SecimQadin1,
                        NumberOfSubCategory2, MovsumQis1, name2);
                
                for (int i = 0; i < id1.size(); i++) {
                    
                    txtMovsumId.removeAll();
                    textKateqoriyaId.removeAll();
                    txtAltKateqoriyaID.removeAll();
                    txtQiymet.removeAll();
                    TextMalinMiqdari.removeAll();
                    txtID.removeAll();
                    
                    Qiymetler i2 = id1.get(i);
                    
                    txtMovsumId.setText(i2.getSeasonId());
                    textKateqoriyaId.setText(i2.getCategoryID());
                    txtAltKateqoriyaID.setText(i2.getSubCategoryId());
                    txtQiymet.setText(i2.getQiymet());
                    txtID.setText(i2.getId());
                    TextMalinMiqdari.setText("");
                    txtUmumi.setText("");
                    
                }
                
            }
            if (SecimKisi != false) {
                
                int MovsumQis1 = 4;
                int SecimKisi1 = 1;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                int NumberOfSubCategory2 = NumberOfSubCategory + 1;
                
                String name = TextMalinAdi.getText();
                String name2 = "'" + name + "'";
                List<Qiymetler> id1 = QiymetDao.getPriceByCategoryAndSubCategoryAndSeasonIdAndByName(SecimKisi1,
                        NumberOfSubCategory2, MovsumQis1, name2);
                
                for (int i = 0; i < id1.size(); i++) {
                    
                    txtMovsumId.removeAll();
                    textKateqoriyaId.removeAll();
                    txtAltKateqoriyaID.removeAll();
                    txtQiymet.removeAll();
                    TextMalinMiqdari.removeAll();
                    txtID.removeAll();

                    // // cbMalinQiymeti.addItem(id1.get(i));
                    Qiymetler i2 = id1.get(i);
                    
                    txtMovsumId.setText(i2.getSeasonId());
                    textKateqoriyaId.setText(i2.getCategoryID());
                    txtAltKateqoriyaID.setText(i2.getSubCategoryId());
                    txtQiymet.setText(i2.getQiymet());
                    txtID.setText(i2.getId());
                    TextMalinMiqdari.setText("");
                    txtUmumi.setText("");
                    
                }
                
            }
            
            if (SecimUsaq != false) {
                
                int MovsumQis1 = 4;
                int SecimUsaq3 = 3;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                int NumberOfSubCategory2 = NumberOfSubCategory + 1;
                
                String name = TextMalinAdi.getText();
                String name2 = "'" + name + "'";
                List<Qiymetler> id1 = QiymetDao.getPriceByCategoryAndSubCategoryAndSeasonIdAndByName(SecimUsaq3,
                        NumberOfSubCategory2, MovsumQis1, name2);
                
                for (int i = 0; i < id1.size(); i++) {
                    
                    txtMovsumId.removeAll();
                    textKateqoriyaId.removeAll();
                    txtAltKateqoriyaID.removeAll();
                    txtQiymet.removeAll();
                    TextMalinMiqdari.removeAll();
                    txtID.removeAll();

                    // // cbMalinQiymeti.addItem(id1.get(i));
                    Qiymetler i2 = id1.get(i);
                    
                    txtMovsumId.setText(i2.getSeasonId());
                    textKateqoriyaId.setText(i2.getCategoryID());
                    txtAltKateqoriyaID.setText(i2.getSubCategoryId());
                    txtQiymet.setText(i2.getQiymet());
                    txtID.setText(i2.getId());
                    TextMalinMiqdari.setText("");
                    txtUmumi.setText("");
                    
                }
                
            }
            
            if (SecimQarisiq != false) {
                
                int MovsumQis1 = 4;
                int SecimQarisiq4 = 4;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                int NumberOfSubCategory2 = NumberOfSubCategory + 1;
                
                String name = TextMalinAdi.getText();
                String name2 = "'" + name + "'";
                List<Qiymetler> id1 = QiymetDao.getPriceByCategoryAndSubCategoryAndSeasonIdAndByName(SecimQarisiq4,
                        NumberOfSubCategory2, MovsumQis1, name2);
                
                for (int i = 0; i < id1.size(); i++) {
                    
                    txtMovsumId.removeAll();
                    textKateqoriyaId.removeAll();
                    txtAltKateqoriyaID.removeAll();
                    txtQiymet.removeAll();
                    TextMalinMiqdari.removeAll();
                    txtID.removeAll();

                    // // cbMalinQiymeti.addItem(id1.get(i));
                    Qiymetler i2 = id1.get(i);
                    
                    txtMovsumId.setText(i2.getSeasonId());
                    textKateqoriyaId.setText(i2.getCategoryID());
                    txtAltKateqoriyaID.setText(i2.getSubCategoryId());
                    txtQiymet.setText(i2.getQiymet());
                    txtID.setText(i2.getId());
                    TextMalinMiqdari.setText("");
                    txtUmumi.setText("");
                    
                }
                
            }
            
        }
        
    }
    
    private void fillWindowForYaz() {
        
        Boolean secim1 = cbYaz.isSelected();
        Boolean secim2 = cbYay.isSelected();
        Boolean secim3 = cbPayiz.isSelected();
        Boolean secim4 = cbQis.isSelected();
        // System.out.println(secim1);
        int countForYaz = 0;
        int countForYay = 0;
        if (secim2 != false) { // Secim 2 in yoxlanisi buradan baslayir
            cbMehsullar.removeAllItems();
            List<Mehsullar> id = mehDao.getMehsulByMovsumId(1);
            for (int i = 0; i < id.size(); i++) {
                cbMehsullar.addItem(id.get(i));
                countForYaz++;
            }
            countForYaz++;
            if (secim2 != false) {
                List<Mehsullar> id2 = mehDao.getMehsulByMovsumId(2);
                countForYay++;
                for (int i = 0; i < id2.size(); i++) {
                    cbMehsullar.addItem(id.get(i));
                }
            }
        }

        // Secim 3 un yoxlanisi buradan baslayir
        if (secim3 != false) {
            cbMehsullar.removeAllItems();
            if (secim3 != false) {
                List<Mehsullar> id2 = mehDao.getMehsulByMovsumId(3);
                
                for (int i = 0; i < id2.size(); i++) {
                    cbMehsullar.addItem(id2.get(i));
                }
                
            }
            List<Mehsullar> id = mehDao.getMehsulByMovsumId(1);
            
            for (int i = 0; i < id.size(); i++) {
                cbMehsullar.addItem(id.get(i));
                countForYaz++;
            }
            
            if (secim2 != false) {
                
                List<Mehsullar> id2 = mehDao.getMehsulByMovsumId(2);
                for (int i = 0; i < id2.size(); i++) {
                    cbMehsullar.addItem(id2.get(i));
                }
            }
            
            if (secim4 != false & countForYay > 0) {
                List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(4);
                for (int i = 0; i < id3.size(); i++) {
                    cbMehsullar.addItem(id3.get(i));
                }
                
            }
            
        }
        
        if (secim4 != false) { // Secim 4 un yoxlanisi buradan baslayir
            cbMehsullar.removeAllItems();
            List<Mehsullar> id = mehDao.getMehsulByMovsumId(1);
            for (int i = 0; i < id.size(); i++) {
                cbMehsullar.addItem(id.get(i));
            }
            if (secim2 != false) {
                List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(2);
                for (int i = 0; i < id3.size(); i++) {
                    cbMehsullar.addItem(id3.get(i));
                }
                
            }
            if (secim3 != false) {
                List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(3);
                for (int i = 0; i < id3.size(); i++) {
                    cbMehsullar.addItem(id3.get(i));
                }
                
            }
            if (secim4 != false) {
                List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(4);
                for (int i = 0; i < id3.size(); i++) {
                    cbMehsullar.addItem(id3.get(i));
                }
            }
            
        } else {
            if (secim1 != false & countForYaz <= 0) {
                cbMehsullar.removeAllItems();
                List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(1);
                for (int i = 0; i < id3.size(); i++) {
                    cbMehsullar.addItem(id3.get(i));
                }
                
            }
        }
        
    }
    
    private void fillWindowForYay() {
        
        Boolean secim1 = cbYaz.isSelected();
        Boolean secim2 = cbYay.isSelected();
        Boolean secim3 = cbPayiz.isSelected();
        Boolean secim4 = cbQis.isSelected();
        // System.out.println(secim1);
        int countForYaz = 0;
        int countForYay = 0;
        if (secim1 != false) { // Secim 1 in yoxlanisi buradan baslayir
            cbMehsullar.removeAllItems();
            List<Mehsullar> id = mehDao.getMehsulByMovsumId(1);
            for (int i = 0; i < id.size(); i++) {
                cbMehsullar.addItem(id.get(i));
            }
            countForYaz++;
            List<Mehsullar> id2 = mehDao.getMehsulByMovsumId(2);
            countForYay++;
            for (int i = 0; i < id2.size(); i++) {
                cbMehsullar.addItem(id2.get(i));
            }
        }

        // Secim 3 un yoxlanisi buradan baslayir
        if (secim3 != false) {
            cbMehsullar.removeAllItems();
            if (secim1 != false) {
                List<Mehsullar> id = mehDao.getMehsulByMovsumId(1);
                for (int i = 0; i < id.size(); i++) {
                    cbMehsullar.addItem(id.get(i));
                }
                
            }
            
            List<Mehsullar> id2 = mehDao.getMehsulByMovsumId(2);
            countForYay++;
            for (int i = 0; i < id2.size(); i++) {
                cbMehsullar.addItem(id2.get(i));
            }
            List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(3);
            for (int i = 0; i < id3.size(); i++) {
                cbMehsullar.addItem(id3.get(i));
            }
            
        }
        
        if (secim4 != false) { // Secim 4 un yoxlanisi buradan baslayir
            cbMehsullar.removeAllItems();
            if (secim1 != false) {
                List<Mehsullar> id = mehDao.getMehsulByMovsumId(1);
                for (int i = 0; i < id.size(); i++) {
                    cbMehsullar.addItem(id.get(i));
                }
                
            }
            
            List<Mehsullar> id2 = mehDao.getMehsulByMovsumId(2);
            
            for (int i = 0; i < id2.size(); i++) {
                
                cbMehsullar.addItem(id2.get(i));
                countForYay++;
            }
            
            if (secim3 != false) {
                List<Mehsullar> id5 = mehDao.getMehsulByMovsumId(3);
                for (int i = 0; i < id5.size(); i++) {
                    cbMehsullar.addItem(id5.get(i));
                }
            }
            
            if (secim4 != false) {
                List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(4);
                for (int i = 0; i < id3.size(); i++) {
                    cbMehsullar.addItem(id3.get(i));
                }
                
            } else {

                // secim 2 in yoxlanilmasi
                if (secim2 != false) {
                    List<Mehsullar> id = mehDao.getMehsulByMovsumId(2);
                    for (int i = 0; i < id.size(); i++) {
                        cbMehsullar.addItem(id.get(i));
                    }
                    countForYay++;
                }
                
            }
            
        }
        if (secim2 != false & countForYay <= 0) {
            cbMehsullar.removeAllItems();
            List<Mehsullar> id6 = mehDao.getMehsulByMovsumId(2);
            for (int i = 0; i < id6.size(); i++) {
                cbMehsullar.addItem(id6.get(i));
            }
            
        }
        
    }
    
    private void fillWindowForPayiz() {
        
        Boolean secim1 = cbYaz.isSelected();
        Boolean secim2 = cbYay.isSelected();
        Boolean secim3 = cbPayiz.isSelected();
        Boolean secim4 = cbQis.isSelected();
        
        int countForYaz = 0;
        int countForYay = 0;
        int countForPayiz = 0;
        if (secim1 != false) { // Secim 1 in yoxlanisi buradan baslayir
            cbMehsullar.removeAllItems();
            List<Mehsullar> id = mehDao.getMehsulByMovsumId(3);
            countForPayiz++;
            for (int i = 0; i < id.size(); i++) {
                cbMehsullar.addItem(id.get(i));
                
            }
            
            List<Mehsullar> id2 = mehDao.getMehsulByMovsumId(1);
            countForYaz++;
            for (int i = 0; i < id2.size(); i++) {
                cbMehsullar.addItem(id2.get(i));
            }
        }

        // Secim 2 in yoxlanisi buradan baslayir
        if (secim2 != false) {
            cbMehsullar.removeAllItems();
            if (secim1 != false) {
                List<Mehsullar> id = mehDao.getMehsulByMovsumId(1);
                for (int i = 0; i < id.size(); i++) {
                    cbMehsullar.addItem(id.get(i));
                }
                
            }
            
            List<Mehsullar> id2 = mehDao.getMehsulByMovsumId(2);
            countForYay++;
            for (int i = 0; i < id2.size(); i++) {
                cbMehsullar.addItem(id2.get(i));
            }
            List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(3);
            for (int i = 0; i < id3.size(); i++) {
                cbMehsullar.addItem(id3.get(i));
                countForPayiz++;
                
            }
            if (secim4 != false) {
                List<Mehsullar> id4 = mehDao.getMehsulByMovsumId(4);
                for (int i = 0; i < id4.size(); i++) {
                    cbMehsullar.addItem(id4.get(i));
                }
                
            }
        }
        
        if (secim4 != false) { // Secim 4 un yoxlanisi buradan baslayir
            cbMehsullar.removeAllItems();
            if (secim1 != false) {
                List<Mehsullar> id = mehDao.getMehsulByMovsumId(1);
                for (int i = 0; i < id.size(); i++) {
                    cbMehsullar.addItem(id.get(i));
                }
                
            }
            if (secim2 != false) {
                List<Mehsullar> id5 = mehDao.getMehsulByMovsumId(2);
                for (int i = 0; i < id5.size(); i++) {
                    cbMehsullar.addItem(id5.get(i));
                }
            }
            
            List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(3);
            for (int i = 0; i < id3.size(); i++) {
                cbMehsullar.addItem(id3.get(i));
                countForPayiz++;
            }
            
            if (secim4 != false) {
                List<Mehsullar> id5 = mehDao.getMehsulByMovsumId(4);
                for (int i = 0; i < id5.size(); i++) {
                    cbMehsullar.addItem(id5.get(i));
                    
                }
                
            }
            
        } else if (secim3 != false & countForPayiz <= 0) {
            cbMehsullar.removeAllItems();
            List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(3);
            for (int i = 0; i < id3.size(); i++) {
                cbMehsullar.addItem(id3.get(i));
            }
            
        }
        
    }
    
    private void fillWindowForQis() {
        Boolean secim1 = cbYaz.isSelected();
        Boolean secim2 = cbYay.isSelected();
        Boolean secim3 = cbPayiz.isSelected();
        Boolean secim4 = cbQis.isSelected();
        // ============================================================================================
        int countForYaz = 0;
        int countForYay = 0;
        int countForPayiz = 0;
        int countForQis = 0;
        
        if (secim1 != false) { // Secim 1 in yoxlanisi buradan baslayir
            cbMehsullar.removeAllItems();
            List<Mehsullar> id = mehDao.getMehsulByMovsumId(4);
            countForQis++;
            for (int i = 0; i < id.size(); i++) {
                cbMehsullar.addItem(id.get(i));
                
            }
            
            List<Mehsullar> id2 = mehDao.getMehsulByMovsumId(1);
            countForYaz++;
            for (int i = 0; i < id2.size(); i++) {
                cbMehsullar.addItem(id2.get(i));
            }
            if (secim2 != false) {
                List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(2);
                countForYay++;
                for (int i = 0; i < id3.size(); i++) {
                    cbMehsullar.addItem(id3.get(i));
                }
                
            }
            
        }

        // Secim 2 in yoxlanisi buradan baslayir
        if (secim2 != false) {
            cbMehsullar.removeAllItems();
            if (secim1 != false) {
                List<Mehsullar> id = mehDao.getMehsulByMovsumId(1);
                for (int i = 0; i < id.size(); i++) {
                    cbMehsullar.addItem(id.get(i));
                }
                
            }
            
            List<Mehsullar> id2 = mehDao.getMehsulByMovsumId(2);
            countForYay++;
            for (int i = 0; i < id2.size(); i++) {
                cbMehsullar.addItem(id2.get(i));
            }
            List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(4);
            countForQis++;
            for (int i = 0; i < id3.size(); i++) {
                cbMehsullar.addItem(id3.get(i));
            }
            if (secim3 != false) {
                List<Mehsullar> id4 = mehDao.getMehsulByMovsumId(3);
                for (int i = 0; i < id4.size(); i++) {
                    cbMehsullar.addItem(id4.get(i));
                }
                
            }
        }
        
        if (secim3 != false) { // Secim 3 un yoxlanisi buradan baslayir
            cbMehsullar.removeAllItems();
            if (secim1 != false) {
                List<Mehsullar> id = mehDao.getMehsulByMovsumId(1);
                for (int i = 0; i < id.size(); i++) {
                    cbMehsullar.addItem(id.get(i));
                }
                
            }
            if (secim2 != false) {
                List<Mehsullar> id5 = mehDao.getMehsulByMovsumId(2);
                for (int i = 0; i < id5.size(); i++) {
                    cbMehsullar.addItem(id5.get(i));
                }
            }
            
            List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(4);
            for (int i = 0; i < id3.size(); i++) {
                cbMehsullar.addItem(id3.get(i));
                
            }
            
            if (secim4 != false) {
                List<Mehsullar> id5 = mehDao.getMehsulByMovsumId(3);
                for (int i = 0; i < id5.size(); i++) {
                    cbMehsullar.addItem(id5.get(i));
                    countForQis++;
                }
                
            }
            
        } else if (secim4 != false & countForQis <= 0) {
            cbMehsullar.removeAllItems();
            List<Mehsullar> id3 = mehDao.getMehsulByMovsumId(4);
            for (int i = 0; i < id3.size(); i++) {
                cbMehsullar.addItem(id3.get(i));
            }
            
        }
        
    }
    
    private void fillMehsullarByIdYaz() {
        Boolean secim1 = cbYaz.isSelected();
        if (secim1 != false) {
            fillWindowForYaz();
        }
        
    }
    
    private void fillMehsullarByIdYay() {
        Boolean secim2 = cbYay.isSelected();
        if (secim2 != false) {
            fillWindowForYay();
            
        }
        
    }
    
    private void fillMehsullarByIdPayiz() {
        Boolean secim3 = cbPayiz.isSelected();
        if (secim3 != false) {
            fillWindowForPayiz();
            
        }
        
    }
    
    private void fillMehsullarByIdQis() {
        Boolean secim4 = cbQis.isSelected();
        if (secim4 != false) {
            
            fillWindowForQis();
            
        }
        
    }
    
    private void cbYazActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbYazActionPerformed

        fillMehsullarByIdYaz();
        
    }// GEN-LAST:event_cbYazActionPerformed

    private void cbYayActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbYayActionPerformed
        fillMehsullarByIdYay();
    }// GEN-LAST:event_cbYayActionPerformed

    private void cbPayizActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbPayizActionPerformed

        fillMehsullarByIdPayiz();
    }// GEN-LAST:event_cbPayizActionPerformed

    private void cbQisActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbQisActionPerformed
        fillMehsullarByIdQis();
    }// GEN-LAST:event_cbQisActionPerformed

    private void cbKisiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbKisiActionPerformed

        cbMehsullar.removeAllItems();
        Boolean secim1 = cbYaz.isSelected();
        Boolean secim2 = cbYay.isSelected();
        Boolean secim3 = cbPayiz.isSelected();
        Boolean secim4 = cbQis.isSelected();
        if (secim1 != false) { // 1ci secimin yoxlanisi
            int seasonId = 1;
            List<Mehsullar> id = mehDao.getMehsulByCategoryAndSeasonId(1, seasonId);
            
            for (int i = 0; i < id.size(); i++) {
                cbMehsullar.addItem(id.get(i));
            }
        }
        if (secim2 != false) { // 2ci secimin yoxlanisi
            cbMehsullar.removeAllItems();
            int seasonId = 2;
            
            List<Mehsullar> id = mehDao.getMehsulByCategoryAndSeasonId(1, seasonId);
            for (int i = 0; i < id.size(); i++) {
                cbMehsullar.addItem(id.get(i));
            }
            if (secim1 != false) {
                int seasonIdYay = 1;
                List<Mehsullar> id2 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdYay);
                for (int ii = 0; ii < id2.size(); ii++) {
                    cbMehsullar.addItem(id2.get(ii));
                }
                
            }
            if (secim3 != false) {
                int seasonIdPayiz = 3;
                List<Mehsullar> id3 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdPayiz);
                for (int ii = 0; ii < id3.size(); ii++) {
                    cbMehsullar.addItem(id3.get(ii));
                }
                
            }
            if (secim4 != false) {
                int seasonIdPayiz = 3;
                List<Mehsullar> id3 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdPayiz);
                for (int ii = 0; ii < id3.size(); ii++) {
                    cbMehsullar.addItem(id3.get(ii));
                }
            }
            
        }
        if (secim3 != false) { // 3cu secimin yoxlanisi
            cbMehsullar.removeAllItems();
            int seasonIdPayiz = 3;
            List<Mehsullar> id2 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdPayiz);
            for (int ii = 0; ii < id2.size(); ii++) {
                cbMehsullar.addItem(id2.get(ii));
            }
            if (secim1 != false) {
                int seasonIdYaz = 1;
                List<Mehsullar> id3 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdYaz);
                for (int ii = 0; ii < id3.size(); ii++) {
                    cbMehsullar.addItem(id3.get(ii));
                }
            }
            
            if (secim2 != false) {
                int seasonIdYay = 2;
                List<Mehsullar> id4 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdYay);
                for (int ii = 0; ii < id4.size(); ii++) {
                    cbMehsullar.addItem(id4.get(ii));
                }
            }
            if (secim4 != false) {
                int seasonIdQis = 4;
                List<Mehsullar> id4 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdQis);
                for (int ii = 0; ii < id4.size(); ii++) {
                    cbMehsullar.addItem(id4.get(ii));
                }
            }
            
        }
        
        if (secim4 != false) { // 4cu secimin yoxlanilmasi
            cbMehsullar.removeAllItems();
            int seasonIdQis = 4;
            List<Mehsullar> id4 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdQis);
            for (int ii = 0; ii < id4.size(); ii++) {
                cbMehsullar.addItem(id4.get(ii));
            }
            
            if (secim1 != false) {
                int seasonIdYaz = 1;
                List<Mehsullar> id3 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdYaz);
                for (int ii = 0; ii < id3.size(); ii++) {
                    cbMehsullar.addItem(id3.get(ii));
                }
                
            }
            if (secim2 != false) {
                int seasonIdYay = 2;
                List<Mehsullar> id2 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdYay);
                for (int ii = 0; ii < id2.size(); ii++) {
                    cbMehsullar.addItem(id2.get(ii));
                }
            }
            if (secim3 != false) {
                int seasonIdPayiz = 3;
                List<Mehsullar> id2 = mehDao.getMehsulByCategoryAndSeasonId(1, seasonIdPayiz);
                for (int ii = 0; ii < id2.size(); ii++) {
                    cbMehsullar.addItem(id2.get(ii));
                }
            }
            
        } // GEN-LAST:event_cbKisiActionPerformed
    }
    
    private void cbUsaqActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbUsaqActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cbUsaqActionPerformed

    private void cbQadinActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbQadinActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cbQadinActionPerformed

    private void cbQarisiqActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbQarisiqActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cbQarisiqActionPerformed

    private void cbKisiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbKisiMouseClicked
        cbAltKateqoriyalar.removeAllItems();
        
        List<AltKateqoriyalar> id555 = mehDao2.getAltKateqoriyaBySeasonIdKisi();
        for (int ii = 0; ii < id555.size(); ii++) {
            cbAltKateqoriyalar.addItem(id555.get(ii));
        }
    }// GEN-LAST:event_cbKisiMouseClicked

    private void cbAltKateqoriyalarItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cbAltKateqoriyalarItemStateChanged
        TextMalinAdi.setText("");
        boolean yoxla1 = TextMalinAdi.getText().isEmpty();
        
        if (yoxla1 != false) {
            
            txtMovsumId.setText("");
            textKateqoriyaId.setText("");
            txtAltKateqoriyaID.setText("");
            txtQiymet.setText("");
            
        }
        
    }// GEN-LAST:event_cbAltKateqoriyalarItemStateChanged

    private void cbAltKateqoriyalarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbAltKateqoriyalarActionPerformed
        MehsullarDaoInter mehDao = Contex.instanceOfMehsullarDao();
        boolean SecimYay = cbYay.isSelected();
        boolean SecimYaz = cbYaz.isSelected();
        boolean SecimPayiz = cbPayiz.isSelected();
        boolean SecimQis = cbQis.isSelected();

        // ==================== Yaz movsumunun yoxlanilmasi
        // ===============================
        boolean SecimKisi = cbKisi.isSelected();
        boolean SecimQadin = cbQadin.isSelected();
        boolean SecimUsaq = cbUsaq.isSelected();
        boolean SecimQarisiq = cbQarisiq.isSelected();
        
        if (SecimYaz != false) {
            
            if (SecimKisi != false) {
                cbMehsullar_2.removeAllItems();
                int SecimYaz1 = 1;
                int SecimKisi1 = 1;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimKisi1,
                        NumberOfSubCategory + 1, SecimYaz1);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                }
                
            }
            if (SecimQadin != false) {
                
                cbMehsullar_2.removeAllItems();
                int SecimYaz1 = 1;
                int SecimQadin2 = 2;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimQadin2,
                        NumberOfSubCategory, SecimYaz1);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                }
                
            }
            if (SecimUsaq != false) {
                
                cbMehsullar_2.removeAllItems();
                int SecimYaz1 = 1;
                int SecimUsaq3 = 3;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimUsaq3,
                        NumberOfSubCategory + 1, SecimYaz1);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                }
                
            }
            if (SecimQarisiq != false) {
                cbMehsullar_2.removeAllItems();
                int SecimYaz1 = 1;
                int SecimQarisiq4 = 4;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimQarisiq4,
                        NumberOfSubCategory + 1, SecimYaz1);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                }
                
            }
            
        }
        // ==================== Yay movsumunun yoxlanilmasi
        // ===============================
        if (SecimYay != false) {
            if (SecimKisi != false) {
                if (SecimKisi != false) {
                    cbMehsullar_2.removeAllItems();
                    int SecimYay1 = 2;
                    int SecimKisi1 = 1;
                    int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                    
                    List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimKisi1,
                            NumberOfSubCategory + 1, SecimYay1);
                    for (int i = 0; i < id1.size(); i++) {
                        cbMehsullar_2.addItem(id1.get(i).toString());
                    }
                    
                }
                
            }
            
            if (SecimQadin != false) {
                cbMehsullar_2.removeAllItems();
                int SecimYay1 = 2;
                int SecimQadin2 = 2;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimQadin2,
                        NumberOfSubCategory + 1, SecimYay1);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                }
                
            }
            if (SecimUsaq != false) {
                cbMehsullar_2.removeAllItems();
                int SecimYay1 = 2;
                int SecimUsaq3 = 3;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimUsaq3,
                        NumberOfSubCategory + 1, SecimYay1);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                }
                
            }
            if (SecimQarisiq != false) {
                cbMehsullar_2.removeAllItems();
                int SecimYay1 = 2;
                int SecimQarisiq4 = 4;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimQarisiq4,
                        NumberOfSubCategory + 1, SecimYay1);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                }
                
            }
            
        }
        // ==================== Qis movsumunun yoxlanilmasi
        // ===============================
        if (SecimQis != false) {
            
            if (SecimKisi != false) {
                cbMehsullar_2.removeAllItems();
                int SecimQis4 = 4;
                int SecimKisi1 = 1;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimKisi1,
                        NumberOfSubCategory + 1, SecimQis4);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                    
                }
                
            }
            
            if (SecimQadin != false) {
                cbMehsullar_2.removeAllItems();
                int SecimQis4 = 4;
                int SecimQadin2 = 2;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimQadin2,
                        NumberOfSubCategory + 1, SecimQis4);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                    
                }
                
            }
            
            if (SecimUsaq != false) {
                cbMehsullar_2.removeAllItems();
                int SecimQis4 = 4;
                int SecimUsaq1 = 3;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimUsaq1,
                        NumberOfSubCategory + 1, SecimQis4);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                    
                }
                
            }
            if (SecimQarisiq != false) {
                cbMehsullar_2.removeAllItems();
                int SecimQis4 = 4;
                int SecimQarisiq4 = 4;
                int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
                
                List<Mehsullar> id1 = mehDao.getMehsulByCategoryAndSubCategoryAndSeasonId(SecimQarisiq4,
                        NumberOfSubCategory + 1, SecimQis4);
                for (int i = 0; i < id1.size(); i++) {
                    cbMehsullar_2.addItem(id1.get(i).toString());
                    
                }
                
            }
            
        }
        
    }// GEN-LAST:event_cbAltKateqoriyalarActionPerformed

    private void cbAltKateqoriyalarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbAltKateqoriyalarMouseClicked

    }// GEN-LAST:event_cbAltKateqoriyalarMouseClicked

    private void TextMalinAdiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TextMalinAdiActionPerformed

        // boolean yoxla = TextMalinAdi.getText().isEmpty();
        //
        // if(yoxla != true){
        // int id = Integer.parseInt(txtBarcode_reader.getText());
        // Mehsullar mm = mehDao.getMehsulById(id);
        //
        // TextMalinAdi.setText(mm.getName());
        //
        //
        //
        // }
        // boolean MovsumQis = cbQis.isSelected();
        // boolean SecimQadin = cbQadin.isSelected();
        // boolean SecimKisi = cbKisi.isSelected();
        //
        // if (MovsumQis != false) {
        //
        // if (SecimQadin != false) {
        //
        // int MovsumQis1 = 4;
        // int SecimQadin2 = 2;
        // int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
        // String name = TextMalinAdi.getText();
        //
        // List<Qiymetler> id1 =
        // QiymetDao.getPriceByCategoryAndSubCategoryAndSeasonIdAndByName(SecimQadin2,
        // NumberOfSubCategory + 9, MovsumQis1, name);
        //
        // for (int i = 0; i < id1.size(); i++) {
        //
        // }
        //
        // }
        // if (SecimKisi != false) {
        //
        // int MovsumQis1 = 4;
        // int SecimKisi1 = 1;
        // int NumberOfSubCategory = cbAltKateqoriyalar.getSelectedIndex();
        // String name = TextMalinAdi.getText();
        //
        // List<Qiymetler> id1 =
        // QiymetDao.getPriceByCategoryAndSubCategoryAndSeasonIdAndByName(SecimKisi1,
        // NumberOfSubCategory, MovsumQis1, name);
        //
        // for (int i = 0; i < id1.size(); i++) {
        //
        // }
        //
        // }
        //
        // }
        //
    }// GEN-LAST:event_TextMalinAdiActionPerformed

    private void cbMehsullarItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cbMehsullarItemStateChanged

    }// GEN-LAST:event_cbMehsullarItemStateChanged

    private void cbMehsullarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbMehsullarMousePressed

    }// GEN-LAST:event_cbMehsullarMousePressed

    private void cbMehsullarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbMehsullarMouseEntered

    }// GEN-LAST:event_cbMehsullarMouseEntered

    private void cbMehsullar_2ItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cbMehsullar_2ItemStateChanged

    }// GEN-LAST:event_cbMehsullar_2ItemStateChanged

    private void cbMehsullar_2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbMehsullar_2ActionPerformed

        findPrice();
    }// GEN-LAST:event_cbMehsullar_2ActionPerformed

    private void cbMehsullarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbMehsullarActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cbMehsullarActionPerformed

    private void cbMehsullar_2PropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_cbMehsullar_2PropertyChange

    }// GEN-LAST:event_cbMehsullar_2PropertyChange

    private void cbMehsullar_2MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbMehsullar_2MousePressed

    }// GEN-LAST:event_cbMehsullar_2MousePressed

    private void cbMehsullar_2MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbMehsullar_2MouseReleased

    }// GEN-LAST:event_cbMehsullar_2MouseReleased

    private void cbMehsullar_2CaretPositionChanged(java.awt.event.InputMethodEvent evt) {// GEN-FIRST:event_cbMehsullar_2CaretPositionChanged

    }// GEN-LAST:event_cbMehsullar_2CaretPositionChanged

    private void cbMehsullar_2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {// GEN-FIRST:event_cbMehsullar_2InputMethodTextChanged

    }// GEN-LAST:event_cbMehsullar_2InputMethodTextChanged

    private void cbMehsullar_2MouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbMehsullar_2MouseMoved

    }// GEN-LAST:event_cbMehsullar_2MouseMoved

    private void cbMehsullar_2KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_cbMehsullar_2KeyPressed

    }// GEN-LAST:event_cbMehsullar_2KeyPressed

    private void cbMehsullar_2MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbMehsullar_2MouseEntered

    }// GEN-LAST:event_cbMehsullar_2MouseEntered

    private void cbMehsullar_2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbMehsullar_2MouseClicked

    }// GEN-LAST:event_cbMehsullar_2MouseClicked

    private void cbQadinMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbQadinMouseClicked

        cbAltKateqoriyalar.removeAllItems();
        List<AltKateqoriyalar> id555 = mehDao2.getAltKateqoriyaBySeasonIdQadin();
        for (int ii = 0; ii < id555.size(); ii++) {
            cbAltKateqoriyalar.addItem(id555.get(ii));
        }
        
    }// GEN-LAST:event_cbQadinMouseClicked

    private void TextMalinAdiPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_TextMalinAdiPropertyChange
        // boolean yoxla = TextMalinAdi.getText().isEmpty();
        //
        // if(yoxla != true){
        // int id = Integer.parseInt(txtBarcode_reader.getText());
        // Mehsullar mm = mehDao.getMehsulByCategoryId(id);
        //
        // TextMalinAdi.setText(mm.getName());
        //
        //
        //
        // }
        //
        //

    }// GEN-LAST:event_TextMalinAdiPropertyChange

    private void TextMalinMiqdariActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TextMalinMiqdariActionPerformed

        DecimalFormat dformater = new DecimalFormat("#.##");
        
        boolean yoxla = txtUmumi.getText().isEmpty();
        
        if (yoxla == true) {
            int s = Integer.parseInt(TextMalinMiqdari.getText());
            
            double aaa = Double.parseDouble(txtQiymet.getText());
            
            double cem = (s * aaa);
            
            String formattedCem = dformater.format(cem);
            
            txtUmumi.setText(formattedCem);
            
        } else {
            
            int s = Integer.parseInt(TextMalinMiqdari.getText());
            
            double aaa = Double.parseDouble(txtQiymet.getText());
            
            double cem = (s * aaa);
            
            String formattedCem = dformater.format(cem);
            
            txtUmumi.setText(formattedCem);
            
        }
        
    }// GEN-LAST:event_TextMalinMiqdariActionPerformed

    private void btnElaveEtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnElaveEtActionPerformed

        Sebeteadd();
        
    }// GEN-LAST:event_btnElaveEtActionPerformed

    private void txtMovsumIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtMovsumIdActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtMovsumIdActionPerformed

    private void textKateqoriyaIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_textKateqoriyaIdActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_textKateqoriyaIdActionPerformed

    private void txtAltKateqoriyaIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtAltKateqoriyaIDActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtAltKateqoriyaIDActionPerformed

    private void txtSatisTarixiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSatisTarixiActionPerformed
        Date date = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        String date2 = sdf.format(date);
        
        txtSatisTarixi.setText(date2);
        
    }// GEN-LAST:event_txtSatisTarixiActionPerformed

    private void txtAlisQiymetiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtAlisQiymetiActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtAlisQiymetiActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtIDActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_jPanel1MouseClicked

    private void txtUmumiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtUmumiActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtUmumiActionPerformed

    private void btnSatildiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSatildiMouseClicked

        satisEmeliyyati();
        
    }// GEN-LAST:event_btnSatildiMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        btnSatildi.setVisible(false);
        
        df = (DefaultTableModel) tblAlinanMallar.getModel();
        
        int selected = tblAlinanMallar.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 1).toString());
        
        try {
            pres = con.prepareStatement("delete from sebet where id = ? ");
            
            pres.setInt(1, id);
            pres.executeUpdate();
            load();
            
            df = (DefaultTableModel) tblAlinanMallar.getModel();
            if (df.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Səbət boşdur!");
                
                say = 1;
                txtBarcode_reader.requestFocus();
                
                TextMalinAdi.setText("");
                TextMalinMiqdari.setText("");
                txtQiymet.setText("");
                txtMovsumId.setText("");
                textKateqoriyaId.setText("");
                txtAltKateqoriyaID.setText("");
                txtQaliq.setText("");
                txtOdenis.setText("");
                txtID.setText("");
                txtUmumi.setText("");
                txtBarcode_reader.requestFocus();
                btnSatildi.setVisible(true);
                btnElaveEt.setVisible(true);
                txtCemMebleg.setText("");
                
            } else {
                
                sebetinHesablanmasi();
                
            }
            
            if (df.getRowCount() != 0) {
                
                JOptionPane.showMessageDialog(this, "Mehsul silindi");
                
                TextMalinAdi.setText("");
                TextMalinMiqdari.setText("");
                txtQiymet.setText("");
                txtMovsumId.setText("");
                textKateqoriyaId.setText("");
                txtAltKateqoriyaID.setText("");
                txtQaliq.setText("");
                txtOdenis.setText("");
                
                txtID.setText("");
                txtUmumi.setText("");
                
                txtBarcode_reader.requestFocus();
                btnSatildi.setVisible(true);
                btnElaveEt.setVisible(true);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Satici_Elave_Etmek.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void tblAlinanMallarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblAlinanMallarMouseClicked

        df = (DefaultTableModel) tblAlinanMallar.getModel();
        
        int selected = tblAlinanMallar.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 1).toString());
        TextMalinAdi.setText(df.getValueAt(selected, 2).toString());
        TextMalinMiqdari.setText(df.getValueAt(selected, 3).toString());
        txtQiymet.setText(df.getValueAt(selected, 4).toString());
        txtMovsumId.setText(df.getValueAt(selected, 5).toString());
        textKateqoriyaId.setText(df.getValueAt(selected, 6).toString());
        txtAltKateqoriyaID.setText(df.getValueAt(selected, 7).toString());
        txtUmumi.setText(df.getValueAt(selected, 8).toString());
        txtSatisTarixi.setText(df.getValueAt(selected, 9).toString());
        txtID.setText(Integer.toString(id));
        
        btnSatildi.setVisible(false);
        btnElaveEt.setVisible(false);
        
    }// GEN-LAST:event_tblAlinanMallarMouseClicked

    private void btnDuzelisEtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        btnSatildi.setVisible(false);
        btnElaveEt.setVisible(false);
        
        df = (DefaultTableModel) tblAlinanMallar.getModel();
        
        int selected = tblAlinanMallar.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 1).toString());
        int id2 = Integer.parseInt(df.getValueAt(selected, 0).toString());
        
        try {
            pres = con.prepareStatement("delete from sebet where id = ? ");
            
            pres.setInt(1, id);
            pres.executeUpdate();
            load();
            
            btnSatildi.setVisible(true);
            btnElaveEt.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(Satici_Elave_Etmek.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            if (TextMalinAdi.getText().isEmpty() || TextMalinMiqdari.getText().isEmpty()
                    || txtQiymet.getText().isEmpty() || txtMovsumId.getText().isEmpty()
                    || textKateqoriyaId.getText().isEmpty() || txtAltKateqoriyaID.getText().isEmpty()
                    || txtSatisTarixi.getText().isEmpty()) {
                
                JOptionPane.showMessageDialog(this, "Zəhmət olmasa bütün məlumatları doldurun");
            } else {
                // String id = txtID.getText();
                String malinadi = TextMalinAdi.getText();
                String miqdari = TextMalinMiqdari.getText();
                String qiymet = txtQiymet.getText();
                String movsumId = txtMovsumId.getText();
                String kateqoriyaId = textKateqoriyaId.getText();
                String altKateqoriya = txtAltKateqoriyaID.getText();
                double umumiMebleg = Double.parseDouble(txtUmumi.getText());
                String alisTarixi = txtSatisTarixi.getText();
                pres = con.prepareStatement(
                        "insert into sebet ( id2 , id, Malin_adi, Miqdari, Satis_qiymeti, Movsum_id, Kateqoriya_id, Alt_kateqoriya_id, Umumi_Mebleg, Tarix ) values(?,?,?,?,?,?,?,?,?,?)");
                
                pres.setInt(1, id2);
                pres.setInt(2, id);
                pres.setString(3, malinadi);
                pres.setString(4, miqdari);
                pres.setString(5, qiymet);
                pres.setString(6, movsumId);
                pres.setString(7, kateqoriyaId);
                pres.setString(8, altKateqoriya);
                pres.setDouble(9, umumiMebleg);
                pres.setString(10, alisTarixi);
                pres.executeUpdate();
                load();
                JOptionPane.showMessageDialog(this, "Məhsul məlumatları uğurla yeniləndi");
                
                TextMalinAdi.setText("");
                TextMalinMiqdari.setText("");
                txtQiymet.setText("");
                txtMovsumId.setText("");
                textKateqoriyaId.setText("");
                txtAltKateqoriyaID.setText("");
                
                txtID.setText("");
                
                sebetinHesablanmasi();
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Satici_Elave_Etmek.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void txtCemMeblegActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCemMeblegActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCemMeblegActionPerformed

    private void tblAlinanMallarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblAlinanMallarMouseEntered

    }// GEN-LAST:event_tblAlinanMallarMouseEntered

    private void cbUsaqMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbUsaqMouseClicked

        cbAltKateqoriyalar.removeAllItems();
        
        List<AltKateqoriyalar> id555 = mehDao2.getAltKateqoriyaBySeasonIdUsaq();
        for (int ii = 0; ii < id555.size(); ii++) {
            cbAltKateqoriyalar.addItem(id555.get(ii));
        }
        
    }// GEN-LAST:event_cbUsaqMouseClicked

    private void cbQarisiqMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cbQarisiqMouseClicked

        cbAltKateqoriyalar.removeAllItems();
        
        List<AltKateqoriyalar> id555 = mehDao2.getAltKateqoriyaBySeasonIdQarisiq();
        for (int ii = 0; ii < id555.size(); ii++) {
            cbAltKateqoriyalar.addItem(id555.get(ii));
        }
        
    }// GEN-LAST:event_cbQarisiqMouseClicked

    private void cbMehsullar_2HierarchyChanged(java.awt.event.HierarchyEvent evt) {// GEN-FIRST:event_cbMehsullar_2HierarchyChanged

    }// GEN-LAST:event_cbMehsullar_2HierarchyChanged

    private void cbMehsullar_2VetoableChange(java.beans.PropertyChangeEvent evt)
            throws java.beans.PropertyVetoException {// GEN-FIRST:event_cbMehsullar_2VetoableChange

    }// GEN-LAST:event_cbMehsullar_2VetoableChange

    private void cbMehsullar_2AncestorMoved(java.awt.event.HierarchyEvent evt) {// GEN-FIRST:event_cbMehsullar_2AncestorMoved

    }// GEN-LAST:event_cbMehsullar_2AncestorMoved

    private void cbMehsullar_2ComponentMoved(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_cbMehsullar_2ComponentMoved

    }// GEN-LAST:event_cbMehsullar_2ComponentMoved

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnCancelMouseClicked

        TextMalinAdi.setText("");
        TextMalinMiqdari.setText("");
        txtQiymet.setText("");
        txtMovsumId.setText("");
        textKateqoriyaId.setText("");
        txtAltKateqoriyaID.setText("");
        txtID.setText("");
        txtUmumi.setText("");
        btnElaveEt.setVisible(true);
        btnSatildi.setVisible(true);
        
    }// GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnCancelActionPerformed

    private void TextMalinMiqdariKeyReleased(java.awt.event.KeyEvent evt) {
        
        deyisiklik();
    }
    
    public void deyisiklik() {
        
        DecimalFormat dformater = new DecimalFormat("#.##");
        
        double s = Double.parseDouble(TextMalinMiqdari.getText());
        
        double aaa = Double.parseDouble(txtQiymet.getText());
        
        double cem = (s * aaa);
        
        String formattedCem = dformater.format(cem);
        
        txtUmumi.setText(formattedCem);
        
    }
    
    private void txtAlisQiymetiKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtAlisQiymetiKeyReleased

        boolean yoxla = txtUmumi.getText().isEmpty();
        
        if (yoxla == true) {
            int s = Integer.parseInt(TextMalinMiqdari.getText());
            
            double aaa = Double.parseDouble(txtQiymet.getText());
            
            double cem = (s * aaa);
            
            txtUmumi.setText(Double.toString(cem));
            
        } else {
            
            int s = Integer.parseInt(TextMalinMiqdari.getText());
            
            double aaa = Double.parseDouble(txtQiymet.getText());
            
            double cem = (s * aaa);
            
            txtUmumi.setText(Double.toString(cem));
            
        }
        
    }// GEN-LAST:event_txtAlisQiymetiKeyReleased

    private void cbNagdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbNagdActionPerformed

    }// GEN-LAST:event_cbNagdActionPerformed

    private void txtAxtarisKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtAxtarisKeyReleased
        axtaris();
        
    }// GEN-LAST:event_txtAxtarisKeyReleased

    private void tblAxtarisMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblAxtarisMouseClicked
        df = (DefaultTableModel) tblAxtaris.getModel();
        
        int selected = tblAxtaris.getSelectedRow();
        
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
        TextMalinAdi.setText(df.getValueAt(selected, 1).toString());
        // TextMalinMiqdari.setText(df.getValueAt(selected, 2).toString());
        txtQiymet.setText(df.getValueAt(selected, 2).toString());
        txtMovsumId.setText(df.getValueAt(selected, 3).toString());
        textKateqoriyaId.setText(df.getValueAt(selected, 4).toString());
        txtAltKateqoriyaID.setText(df.getValueAt(selected, 5).toString());
        // txtSatisTarixi.setText(df.getValueAt(selected, 8).toString());
        // txtUmumi.setText(df.getValueAt(selected, 7).toString());

        txtID.setText(Integer.toString(id));
    }// GEN-LAST:event_tblAxtarisMouseClicked

    private void txtBarcode_readerKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtBarcode_readerKeyReleased
        //
        // barcodeReader();
        //
        // boolean yoxla = TextMalinAdi.getText().isEmpty();
        //
        // if (yoxla != true) {
        // String barcode = txtBarcode_reader.getText();
        // Mehsullar mm = mehDao.getMehsulByBarcode(barcode);
        //
        // TextMalinAdi.setText(mm.getName());
        // txtQiymet.setText(mm.getPriceOfSell());
        // txtMovsumId.setText(mm.getSeasonId());
        // textKateqoriyaId.setText(mm.getCategoryId());
        // txtAltKateqoriyaID.setText(mm.getSubCategoryId());
        //
        // int id2 = mm.getId();
        // txtID.setText(Integer.toString(id2));
        //
        // }
        //

    }// GEN-LAST:event_txtBarcode_readerKeyReleased

    private void txtBarcode_readerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtBarcode_readerActionPerformed
        String barcode = txtBarcode_reader.getText();
        Mehsullar mm2 = mehDao.getMehsulByBarcode(barcode);
        String barcode2 = mm2.getId2();
        int id = mm2.getId();
        String name = mm2.getName();
        double priveOfSell = mm2.getPriceOfSell();
        String seasonId = mm2.getSeasonId();
        String cattegoryId = mm2.getCategoryId();
        String subcattegoryId = mm2.getSubCategoryId();
        String tarix = txtSatisTarixi.getText();
        System.out.println(barcode2);
        
        Integer i = mehDao.getAllProductFromSebet(id, priveOfSell);
        
        if (i == 0) {
            
            try {
                
                pres = con.prepareStatement(
                        "insert into sebet ( id2, id, Malin_adi, Miqdari, Satis_qiymeti, Movsum_id, Kateqoriya_id, Alt_kateqoriya_id, Umumi_Mebleg, Tarix ) values(?,?,?,?,?,?,?,?,?,?)");
                
                pres.setInt(1, say);
                pres.setInt(2, id);
                pres.setString(3, name);
                pres.setInt(4, 1);
                pres.setDouble(5, priveOfSell);
                pres.setString(6, seasonId);
                pres.setString(7, cattegoryId);
                pres.setString(8, subcattegoryId);
                pres.setDouble(9, priveOfSell * 1);
                pres.setString(10, tarix);
                pres.executeUpdate();
                say++;
            } catch (Exception ex) {
                
                System.out.println(ex);
                
            }
            TextMalinAdi.setText(name);
            TextMalinMiqdari.setText(Integer.toString(1));
            txtQiymet.setText(Double.toString(priveOfSell));
            txtMovsumId.setText(seasonId);
            textKateqoriyaId.setText(cattegoryId);
            txtAltKateqoriyaID.setText(subcattegoryId);
            txtID.setText(Integer.toString(id));
            txtUmumi.setText(Double.toString(priveOfSell));
            load();
            
            sebetinHesablanmasi();
            txtBarcode_reader.setText("");
            
        } else {
            
            load();
            
            sebetinHesablanmasi();
            txtBarcode_reader.setText("");
            TextMalinAdi.setText(name);
            TextMalinMiqdari.setText(Integer.toString(1));
            txtQiymet.setText(Double.toString(priveOfSell));
            txtMovsumId.setText(seasonId);
            textKateqoriyaId.setText(cattegoryId);
            txtAltKateqoriyaID.setText(subcattegoryId);
            txtID.setText(Integer.toString(id));
            txtUmumi.setText(Double.toString(priveOfSell));
            
        }
    }
    
    private void txtOdenisActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtOdenisActionPerformed

        // txtQaliq.setText(date3);
    }// GEN-LAST:event_txtOdenisActionPerformed

    private void txtQaliqActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtQaliqActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtQaliqActionPerformed

    private void btnGeriQaytarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnElaveEt1ActionPerformed

        try {
            
            String tarix = txtSatisTarixi.getText();
            double id = Double.parseDouble(txtID.getText());
            double miqdari = Double.parseDouble(txtID.getText());
            
            pres = con.prepareStatement("delete from satilan_mallar s where s.id =? and s.Satis_Tarixi = ?");
            pres.setDouble(1, id);
            pres.setString(2, tarix);
            pres.executeUpdate();
            
            geriQaytarma();
            
            JOptionPane.showMessageDialog(this, "Mehsul ugurla silindi!");
            
        } catch (SQLException ex) {
            System.out.println("Gosterilen mehsul satilan mallar siyahisinda yoxdur!");
        }
        
    }
    
    private void txtOdenisKeyReleased(java.awt.event.KeyEvent evt) {
        qaliqPul();
        
    }// GEN-LAST:event_txtOdenisKeyReleased

    private void txtBarcode_readerKeyPressed(java.awt.event.KeyEvent evt) {
        
        System.out.println("you have released " + evt.getKeyCode());
        int s = evt.getKeyCode();
        if (s == 39) {
            
            txtOdenis.requestFocus();
            
        }
        if (s == 17) {
            
            satisEmeliyyati();
            
        }
        if (s == 68) {
            
            try {
                MehsulDeyisdirilmesi md = new MehsulDeyisdirilmesi();
                md.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if (s == 66) {
            
            try {
                BorclarlaEmeliyyat be = new BorclarlaEmeliyyat();
                be.setVisible(true);
                
            } catch (Exception ex) {
                
                System.out.println(ex);
                
            }
            
        }
        
    }// GEN-LAST:event_txtBarcode_readerKeyPressed

    private void txtOdenisKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtOdenisKeyPressed

        int s = evt.getKeyCode();
        
        if (s == 10 || s == 17) {
            
            satisEmeliyyati();
            
        }
        if (s == 37) {
            
            txtBarcode_reader.requestFocus();
            
        }
        
    }// GEN-LAST:event_txtOdenisKeyPressed

    private void TextMalinAdiKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_TextMalinAdiKeyReleased
        // TODO add your handling code here:
    }
    
    private void txtQiymetKeyReleased(java.awt.event.KeyEvent evt) {
        
        deyisiklik();
    }
    
    private void txtQiymetActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void btnSatildiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSatildiActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnSatildiActionPerformed

    private void txtQiymetKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtQiymetKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtQiymetKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Main().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Detallar;
    private javax.swing.JMenuItem Sil;
    private javax.swing.JTextField TextMalinAdi;
    private javax.swing.JTextField TextMalinMiqdari;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDuzelisEt;
    private javax.swing.JButton btnElaveEt;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnGeriQaytar;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSatildi;
    private javax.swing.JComboBox<AltKateqoriyalar> cbAltKateqoriyalar;
    private javax.swing.JCheckBox cbKisi;
    private javax.swing.JComboBox<Mehsullar> cbMehsullar;
    private javax.swing.JComboBox<String> cbMehsullar_2;
    private javax.swing.JCheckBox cbNagd;
    private javax.swing.JCheckBox cbNisye;
    private javax.swing.JCheckBox cbPayiz;
    private javax.swing.JCheckBox cbQadin;
    private javax.swing.JCheckBox cbQarisiq;
    private javax.swing.JCheckBox cbQis;
    private javax.swing.JCheckBox cbUsaq;
    private javax.swing.JCheckBox cbYay;
    private javax.swing.JCheckBox cbYaz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLMalinQiymeti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblAlinanMallar;
    private javax.swing.JTable tblAxtaris;
    private javax.swing.JTextField textKateqoriyaId;
    private javax.swing.JTextField txtAltKateqoriyaID;
    private javax.swing.JTextField txtAxtaris;
    private javax.swing.JTextField txtBarcode_reader;
    private javax.swing.JTextField txtCemMebleg;
    private javax.swing.JTextField txtDisplay;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMovsumId;
    private javax.swing.JTextField txtOdenis;
    private javax.swing.JTextField txtQaliq;
    private javax.swing.JTextField txtQiymet;
    private javax.swing.JTextField txtSatisTarixi;
    private javax.swing.JTextField txtUmumi;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyReleased(KeyEvent e) {
        
        System.out.println("You relesed " + e.getKeyChar());
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
