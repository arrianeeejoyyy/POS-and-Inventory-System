
package lensico_inventory.pos;

import com.toedter.calendar.JDateChooser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;

 class ACCHISTORY extends javax.swing.JFrame {

 public static ACCHISTORY instance;
 
  private JDateChooser startDateChooser;
private JDateChooser endDateChooser;
 
    public ACCHISTORY() {
        initComponents();
        
        instance = this;  // assign current instance on creation

        // Load all history tables on start
        loadHistoryCTableFromFile();
        loadHistoryETableFromFile();
        loadHistoryUTableFromFile();
        loadHistoryPTableFromFile();
        loadHistoryRTableFromFile();
        
       startDateChooser = new JDateChooser();
endDateChooser = new JDateChooser();

// Optionally set date format
startDateChooser.setDateFormatString("yyyy-MM-dd");
endDateChooser.setDateFormatString("yyyy-MM-dd");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usersetting = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        employeee = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        invoice = new javax.swing.JButton();
        product = new javax.swing.JButton();
        stockmanagement = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        historyU = new javax.swing.JTable();
        cenddateU = new javax.swing.JButton();
        cstartdateU = new javax.swing.JButton();
        startdateU = new javax.swing.JLabel();
        enddateU = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        printU = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        historyP = new javax.swing.JTable();
        cstartdateP = new javax.swing.JButton();
        cenddateP = new javax.swing.JButton();
        printP = new javax.swing.JButton();
        startdateP = new javax.swing.JLabel();
        enddateP = new javax.swing.JLabel();
        iconp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        historyR = new javax.swing.JTable();
        cstartdateR = new javax.swing.JButton();
        cenddateR = new javax.swing.JButton();
        printR = new javax.swing.JButton();
        startdateR = new javax.swing.JLabel();
        enddateR = new javax.swing.JLabel();
        iconr = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyC = new javax.swing.JTable();
        cstartdateC = new javax.swing.JButton();
        cenddateC = new javax.swing.JButton();
        printC = new javax.swing.JButton();
        startdateC = new javax.swing.JLabel();
        enddateC = new javax.swing.JLabel();
        iconc = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyE = new javax.swing.JTable();
        cstartdateE = new javax.swing.JButton();
        cenddateE = new javax.swing.JButton();
        printE = new javax.swing.JButton();
        startdateE = new javax.swing.JLabel();
        enddateE = new javax.swing.JLabel();
        icone = new javax.swing.JLabel();
        creturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 1215, 838));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersetting.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        usersetting.setContentAreaFilled(false);
        usersetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersettingActionPerformed(evt);
            }
        });
        getContentPane().add(usersetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 270, 40));

        logout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logout.setContentAreaFilled(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 270, 30));

        employeee.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        employeee.setContentAreaFilled(false);
        employeee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeeActionPerformed(evt);
            }
        });
        getContentPane().add(employeee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 270, 40));

        customer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        customer.setContentAreaFilled(false);
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        getContentPane().add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 270, 40));

        invoice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        invoice.setContentAreaFilled(false);
        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });
        getContentPane().add(invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 270, 40));

        product.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        product.setContentAreaFilled(false);
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        getContentPane().add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 270, 40));

        stockmanagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        stockmanagement.setContentAreaFilled(false);
        stockmanagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockmanagementActionPerformed(evt);
            }
        });
        getContentPane().add(stockmanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 270, 40));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Date", "Time", "Status"
            }
        ));
        jScrollPane3.setViewportView(historyU);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 590));

        cenddateU.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cenddateU.setContentAreaFilled(false);
        cenddateU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenddateUActionPerformed(evt);
            }
        });
        jPanel5.add(cenddateU, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 40, 30));

        cstartdateU.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cstartdateU.setContentAreaFilled(false);
        cstartdateU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstartdateUActionPerformed(evt);
            }
        });
        jPanel5.add(cstartdateU, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 40, 30));

        startdateU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel5.add(startdateU, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 170, 25));

        enddateU.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel5.add(enddateU, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 655, 170, 25));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 170, -1));

        printU.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        printU.setContentAreaFilled(false);
        printU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printUActionPerformed(evt);
            }
        });
        jPanel5.add(printU, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 623, 190, 50));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/historyU.png"))); // NOI18N
        icon.setText("jLabel6");
        jPanel5.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("User Setting", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Date", "Time", "Status"
            }
        ));
        jScrollPane4.setViewportView(historyP);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 590));

        cstartdateP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cstartdateP.setContentAreaFilled(false);
        cstartdateP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstartdatePActionPerformed(evt);
            }
        });
        jPanel6.add(cstartdateP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 40, 30));

        cenddateP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cenddateP.setContentAreaFilled(false);
        cenddateP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenddatePActionPerformed(evt);
            }
        });
        jPanel6.add(cenddateP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 40, 30));

        printP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        printP.setContentAreaFilled(false);
        printP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printPActionPerformed(evt);
            }
        });
        jPanel6.add(printP, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 623, 190, 50));

        startdateP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel6.add(startdateP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 170, 25));

        enddateP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel6.add(enddateP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 655, 170, 25));

        iconp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/historyP.png"))); // NOI18N
        iconp.setText("jLabel5");
        jPanel6.add(iconp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jTabbedPane1.addTab("Product", jPanel6);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Date", "Time", "Status "
            }
        ));
        jScrollPane5.setViewportView(historyR);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 590));

        cstartdateR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cstartdateR.setContentAreaFilled(false);
        cstartdateR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstartdateRActionPerformed(evt);
            }
        });
        jPanel1.add(cstartdateR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 40, 30));

        cenddateR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cenddateR.setContentAreaFilled(false);
        cenddateR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenddateRActionPerformed(evt);
            }
        });
        jPanel1.add(cenddateR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 40, 30));

        printR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        printR.setContentAreaFilled(false);
        printR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRActionPerformed(evt);
            }
        });
        jPanel1.add(printR, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 623, 190, 50));

        startdateR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(startdateR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 170, 25));

        enddateR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(enddateR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 655, 170, 25));

        iconr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/historyR.png"))); // NOI18N
        iconr.setText("jLabel4");
        jPanel1.add(iconr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jTabbedPane1.addTab("Return Product", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Date", "Time", "Status"
            }
        ));
        jScrollPane2.setViewportView(historyC);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 590));

        cstartdateC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cstartdateC.setContentAreaFilled(false);
        cstartdateC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstartdateCActionPerformed(evt);
            }
        });
        jPanel3.add(cstartdateC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 40, 30));

        cenddateC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cenddateC.setContentAreaFilled(false);
        cenddateC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenddateCActionPerformed(evt);
            }
        });
        jPanel3.add(cenddateC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 40, 30));

        printC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        printC.setContentAreaFilled(false);
        printC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printCActionPerformed(evt);
            }
        });
        jPanel3.add(printC, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 623, 190, 50));

        startdateC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(startdateC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 170, 25));

        enddateC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(enddateC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 655, 170, 25));

        iconc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/historyC.png"))); // NOI18N
        iconc.setText("jLabel3");
        jPanel3.add(iconc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jTabbedPane1.addTab("Customer", jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Date", "Time", "Status"
            }
        ));
        jScrollPane1.setViewportView(historyE);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 590));

        cstartdateE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cstartdateE.setContentAreaFilled(false);
        cstartdateE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstartdateEActionPerformed(evt);
            }
        });
        jPanel4.add(cstartdateE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 40, 30));

        cenddateE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cenddateE.setContentAreaFilled(false);
        cenddateE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenddateEActionPerformed(evt);
            }
        });
        jPanel4.add(cenddateE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 40, 30));

        printE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        printE.setContentAreaFilled(false);
        printE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printEActionPerformed(evt);
            }
        });
        jPanel4.add(printE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 623, 190, 50));

        startdateE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel4.add(startdateE, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 170, 25));

        enddateE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel4.add(enddateE, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 655, 170, 25));

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/historyE.png"))); // NOI18N
        icone.setText("jLabel2");
        icone.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel4.add(icone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        jTabbedPane1.addTab("Employee", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 900, 730));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Customer");

        creturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        creturn.setContentAreaFilled(false);
        creturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creturnActionPerformed(evt);
            }
        });
        getContentPane().add(creturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/HISTORY.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     // ----------------- Customer History -----------------
    public void saveHistoryCTableToFile() {
        saveTableToFile(historyC, "src/file_storage/historyC.txt");
    }

    public void loadHistoryCTableFromFile() {
        loadTableFromFile(historyC, "src/file_storage/historyC.txt");
    }

    // ----------------- Employee History -----------------
    public void saveHistoryETableToFile() {
        saveTableToFile(historyE, "src/file_storage/historyE.txt");
    }

    public void loadHistoryETableFromFile() {
        loadTableFromFile(historyE, "src/file_storage/historyE.txt");
    }

    // ----------------- User Setting History -----------------
    public void saveHistoryUTableToFile() {
        saveTableToFile(historyU, "src/file_storage/historyU.txt");
    }

    public void loadHistoryUTableFromFile() {
        loadTableFromFile(historyU, "src/file_storage/historyU.txt");
    }

    // ----------------- Product History -----------------
    public void saveHistoryPTableToFile() {
        saveTableToFile(historyP, "src/file_storage/historyP.txt");
    }

    public void loadHistoryPTableFromFile() {
        loadTableFromFile(historyP, "src/file_storage/historyP.txt");
    }

    // ----------------- Return Product History -----------------
    public void saveHistoryRTableToFile() {
        saveTableToFile(historyR, "src/file_storage/historyR.txt");
    }

    public void loadHistoryRTableFromFile() {
        loadTableFromFile(historyR, "src/file_storage/historyR.txt");
    }

    // ----------------- Generic Table Save/Load Methods -----------------
    private void saveTableToFile(javax.swing.JTable table, String filePath) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object val = model.getValueAt(i, j);
                    writer.write(val == null ? "" : val.toString());
                    if (j < model.getColumnCount() - 1) {
                        writer.write("%%");
                    }
                }
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving to file " + filePath + ": " + e.getMessage());
        }
    }

    private void loadTableFromFile(javax.swing.JTable table, String filePath) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] rowData = line.split("%%");
                model.addRow(rowData);
            }
        } catch (IOException e) {
            // It's okay if file doesn't exist yet (first run)
        }
    }
    
    private void usersettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersettingActionPerformed
        this.setVisible(false);
        USERSETTING US = new USERSETTING();
        US.setVisible(true);

    }//GEN-LAST:event_usersettingActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
             int response = JOptionPane.showConfirmDialog(
            null,
            "Are you sure you want to Sign Out?",
            "Confirm",
            JOptionPane.YES_NO_OPTION
        );

        if (response == JOptionPane.YES_OPTION) {
            System.out.println("User chose YES.");
        } else if (response == JOptionPane.NO_OPTION) {
            System.out.println("User chose NO.");
        } else {
            System.out.println("User closed the dialog or canceled.");
        }

        this.setVisible(false);
        LOG_IN login = new LOG_IN();
        login.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void employeeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeeActionPerformed
        this.setVisible(false);
        EMPLOYEE EMP = new EMPLOYEE();
        EMP.setVisible(true);
    }//GEN-LAST:event_employeeeActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        this.setVisible(false);
        CUSTOMER cus = new CUSTOMER();
        cus.setVisible(true);
    }//GEN-LAST:event_customerActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        this.setVisible(false);
        PRODUCTSTATUS IN = new PRODUCTSTATUS();
        IN.setVisible(true);
    }//GEN-LAST:event_invoiceActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        this.setVisible(false);
        PRODUCT PRO = new PRODUCT();
        PRO.setVisible(true);

    }//GEN-LAST:event_productActionPerformed

    private void stockmanagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockmanagementActionPerformed
        this.setVisible(false);
        SALESREPORT SM = new SALESREPORT();
        SM.setVisible(true);
    }//GEN-LAST:event_stockmanagementActionPerformed

    private void creturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creturnActionPerformed
        this.setVisible(false);
        CRETURN CR = new CRETURN();
        CR.setVisible(true);
    }//GEN-LAST:event_creturnActionPerformed

    private void cstartdateUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstartdateUActionPerformed
        Date selectedDate = showDatePickerDialog(startDateChooser, "Select Start Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        startdateU.setText(sdf.format(selectedDate));
        
        // Optional: reset end date if it is before start date
        String endDateText = enddateU.getText();
        if (!endDateText.isEmpty()) {
            try {
                Date endDate = sdf.parse(endDateText);
                if (endDate.before(selectedDate)) {
                    enddateU.setText("");
                }
            } catch (Exception ex) { }
        }
    }
    }//GEN-LAST:event_cstartdateUActionPerformed

    private void cstartdatePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstartdatePActionPerformed
           Date selectedDate = showDatePickerDialog(startDateChooser, "Select Start Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        startdateP.setText(sdf.format(selectedDate));
        
        // Optional: reset end date if it is before start date
        String endDateText = enddateP.getText();
        if (!endDateText.isEmpty()) {
            try {
                Date endDate = sdf.parse(endDateText);
                if (endDate.before(selectedDate)) {
                    enddateP.setText("");
                }
            } catch (Exception ex) { }
        }
    }
    }//GEN-LAST:event_cstartdatePActionPerformed

    private void cstartdateRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstartdateRActionPerformed
           Date selectedDate = showDatePickerDialog(startDateChooser, "Select Start Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        startdateR.setText(sdf.format(selectedDate));
        
        // Optional: reset end date if it is before start date
        String endDateText = enddateR.getText();
        if (!endDateText.isEmpty()) {
            try {
                Date endDate = sdf.parse(endDateText);
                if (endDate.before(selectedDate)) {
                    enddateR.setText("");
                }
            } catch (Exception ex) { }
        }
    }
    }//GEN-LAST:event_cstartdateRActionPerformed

    private void cstartdateCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstartdateCActionPerformed
          Date selectedDate = showDatePickerDialog(startDateChooser, "Select Start Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        startdateC.setText(sdf.format(selectedDate));
        
        // Optional: reset end date if it is before start date
        String endDateText = enddateC.getText();
        if (!endDateText.isEmpty()) {
            try {
                Date endDate = sdf.parse(endDateText);
                if (endDate.before(selectedDate)) {
                    enddateC.setText("");
                }
            } catch (Exception ex) { }
        }
    }
    }//GEN-LAST:event_cstartdateCActionPerformed

    private void cstartdateEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstartdateEActionPerformed
            Date selectedDate = showDatePickerDialog(startDateChooser, "Select Start Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        startdateE.setText(sdf.format(selectedDate));
        
        // Optional: reset end date if it is before start date
        String endDateText = enddateE.getText();
        if (!endDateText.isEmpty()) {
            try {
                Date endDate = sdf.parse(endDateText);
                if (endDate.before(selectedDate)) {
                    enddateE.setText("");
                }
            } catch (Exception ex) { }
        }
    }
    }//GEN-LAST:event_cstartdateEActionPerformed

    private void cenddateUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenddateUActionPerformed
        String startDateText = startdateU.getText();
    if (startDateText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select the Start Date first.");
        return;
    }
    Date selectedDate = showDatePickerDialog(endDateChooser, "Select End Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date startDate = sdf.parse(startDateText);
            if (selectedDate.before(startDate)) {
                JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
                return;
            }
            enddateU.setText(sdf.format(selectedDate));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Start Date.");
        }
    }
    }//GEN-LAST:event_cenddateUActionPerformed

    private void cenddatePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenddatePActionPerformed
       String startDateText = startdateP.getText();
    if (startDateText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select the Start Date first.");
        return;
    }
    Date selectedDate = showDatePickerDialog(endDateChooser, "Select End Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date startDate = sdf.parse(startDateText);
            if (selectedDate.before(startDate)) {
                JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
                return;
            }
            enddateP.setText(sdf.format(selectedDate));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Start Date.");
        }
    }
    }//GEN-LAST:event_cenddatePActionPerformed

    private void cenddateRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenddateRActionPerformed
       String startDateText = startdateR.getText();
    if (startDateText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select the Start Date first.");
        return;
    }
    Date selectedDate = showDatePickerDialog(endDateChooser, "Select End Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date startDate = sdf.parse(startDateText);
            if (selectedDate.before(startDate)) {
                JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
                return;
            }
            enddateR.setText(sdf.format(selectedDate));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Start Date.");
        }
    }
    }//GEN-LAST:event_cenddateRActionPerformed

    private void cenddateCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenddateCActionPerformed
        String startDateText = startdateC.getText();
    if (startDateText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select the Start Date first.");
        return;
    }
    Date selectedDate = showDatePickerDialog(endDateChooser, "Select End Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date startDate = sdf.parse(startDateText);
            if (selectedDate.before(startDate)) {
                JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
                return;
            }
            enddateC.setText(sdf.format(selectedDate));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Start Date.");
        }
    }
    }//GEN-LAST:event_cenddateCActionPerformed

    private void cenddateEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenddateEActionPerformed
       String startDateText = startdateE.getText();
    if (startDateText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select the Start Date first.");
        return;
    }
    Date selectedDate = showDatePickerDialog(endDateChooser, "Select End Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date startDate = sdf.parse(startDateText);
            if (selectedDate.before(startDate)) {
                JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
                return;
            }
            enddateE.setText(sdf.format(selectedDate));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Start Date.");
        }
    }
    }//GEN-LAST:event_cenddateEActionPerformed

    private void printEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printEActionPerformed
         String startDateStr = startdateE.getText();
    String endDateStr = enddateE.getText();

    if (startDateStr.isEmpty() || endDateStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select both Start Date and End Date.");
        return;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    try {
        Date startDate = sdf.parse(startDateStr);
        Date endDate = sdf.parse(endDateStr);

        if (endDate.before(startDate)) {
            JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
            return;
        }

        String filePath = "EmployeeHistory_" + startDateStr + "_to_" + endDateStr + ".pdf";

        PdfWriter writer = new PdfWriter(filePath);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);

        // Title - DISPLAY HUB centered, 20 font
        Paragraph title = new Paragraph("DISPLAY HUB")
            .setFontSize(20)
            .setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER);
        document.add(title);

        // Subtitle - Employee History (startdate) to (enddate) centered
        Paragraph subtitle = new Paragraph("Employee History (" + startDateStr + ") to (" + endDateStr + ")")
            .setFontSize(12)
            .setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER)
            .setMarginBottom(20);
        document.add(subtitle);

        DefaultTableModel model = (DefaultTableModel) historyE.getModel();

        // Iterate through rows filtered by date range (Date column index 1)
        for (int i = 0; i < model.getRowCount(); i++) {
            Object dateObj = model.getValueAt(i, 1); // Date column
            if (dateObj == null) continue;

            Date rowDate = sdf.parse(dateObj.toString());
            if (!rowDate.before(startDate) && !rowDate.after(endDate)) {
                // For each row, add fields in vertical block format
                String employeeId = model.getValueAt(i, 0) == null ? "" : model.getValueAt(i, 0).toString();
                String date = model.getValueAt(i, 1) == null ? "" : model.getValueAt(i, 1).toString();
                String time = model.getValueAt(i, 2) == null ? "" : model.getValueAt(i, 2).toString();
                String status = model.getValueAt(i, 3) == null ? "" : model.getValueAt(i, 3).toString();

                Paragraph record = new Paragraph()
                    .add("Employee ID: " + employeeId + "\n")
                    .add("Date: " + date + "\n")
                    .add("Time: " + time + "\n")
                    .add("Status: " + status + "\n\n");

                document.add(record);
            }
        }

        document.close();

        JOptionPane.showMessageDialog(this, "PDF generated successfully:\n" + filePath);

        // Open PDF automatically
        try {
            if (java.awt.Desktop.isDesktopSupported()) {
                java.awt.Desktop.getDesktop().open(new File(filePath));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Could not open PDF automatically: " + e.getMessage());
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error generating PDF: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_printEActionPerformed

    private void printUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printUActionPerformed
         String startDateStr = startdateU.getText();
    String endDateStr = enddateU.getText();

    if (startDateStr.isEmpty() || endDateStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select both Start Date and End Date.");
        return;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    try {
        Date startDate = sdf.parse(startDateStr);
        Date endDate = sdf.parse(endDateStr);

        if (endDate.before(startDate)) {
            JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
            return;
        }

        String filePath = "UserSettingHistory_" + startDateStr + "_to_" + endDateStr + ".pdf";

        PdfWriter writer = new PdfWriter(filePath);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);

        // Title - DISPLAY HUB (20 font, centered)
        Paragraph title = new Paragraph("DISPLAY HUB")
            .setFontSize(20)
            .setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER);
        document.add(title);

        // Subtitle - User Setting History (startdate) to (enddate) centered
        Paragraph subtitle = new Paragraph("User Setting History (" + startDateStr + ") to (" + endDateStr + ")")
            .setFontSize(12)
            .setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER)
            .setMarginBottom(20);
        document.add(subtitle);

        DefaultTableModel model = (DefaultTableModel) historyU.getModel();

        // Loop through filtered rows by date (Date column index 1)
        for (int i = 0; i < model.getRowCount(); i++) {
            Object dateObj = model.getValueAt(i, 1);
            if (dateObj == null) continue;

            Date rowDate = sdf.parse(dateObj.toString());
            if (!rowDate.before(startDate) && !rowDate.after(endDate)) {
                String userId = model.getValueAt(i, 0) == null ? "" : model.getValueAt(i, 0).toString();
                String date = model.getValueAt(i, 1) == null ? "" : model.getValueAt(i, 1).toString();
                String time = model.getValueAt(i, 2) == null ? "" : model.getValueAt(i, 2).toString();
                String status = model.getValueAt(i, 3) == null ? "" : model.getValueAt(i, 3).toString();

                Paragraph record = new Paragraph()
                    .add("User ID: " + userId + "\n")
                    .add("Date: " + date + "\n")
                    .add("Time: " + time + "\n")
                    .add("Status: " + status + "\n\n");

                document.add(record);
            }
        }

        document.close();

        JOptionPane.showMessageDialog(this, "PDF generated successfully:\n" + filePath);

        // Open the PDF automatically
        try {
            if (java.awt.Desktop.isDesktopSupported()) {
                java.awt.Desktop.getDesktop().open(new File(filePath));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Could not open PDF automatically: " + e.getMessage());
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error generating PDF: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_printUActionPerformed

    private void printPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printPActionPerformed
        String startDateStr = startdateP.getText();
    String endDateStr = enddateP.getText();

    if (startDateStr.isEmpty() || endDateStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select both Start Date and End Date.");
        return;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    try {
        Date startDate = sdf.parse(startDateStr);
        Date endDate = sdf.parse(endDateStr);

        if (endDate.before(startDate)) {
            JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
            return;
        }

        String filePath = "ProductHistory_" + startDateStr + "_to_" + endDateStr + ".pdf";

        PdfWriter writer = new PdfWriter(filePath);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);

        // Title - DISPLAY HUB (20 font, centered)
        Paragraph title = new Paragraph("DISPLAY HUB")
            .setFontSize(20)
            .setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER);
        document.add(title);

        // Subtitle - Product History (startdate) to (enddate) centered
        Paragraph subtitle = new Paragraph("Product History (" + startDateStr + ") to (" + endDateStr + ")")
            .setFontSize(12)
            .setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER)
            .setMarginBottom(20);
        document.add(subtitle);

        DefaultTableModel model = (DefaultTableModel) historyP.getModel();

        // Loop through rows filtered by date (Date column index 1)
        for (int i = 0; i < model.getRowCount(); i++) {
            Object dateObj = model.getValueAt(i, 1);
            if (dateObj == null) continue;

            Date rowDate = sdf.parse(dateObj.toString());
            if (!rowDate.before(startDate) && !rowDate.after(endDate)) {
                String productId = model.getValueAt(i, 0) == null ? "" : model.getValueAt(i, 0).toString();
                String date = model.getValueAt(i, 1) == null ? "" : model.getValueAt(i, 1).toString();
                String time = model.getValueAt(i, 2) == null ? "" : model.getValueAt(i, 2).toString();
                String status = model.getValueAt(i, 3) == null ? "" : model.getValueAt(i, 3).toString();

                Paragraph record = new Paragraph()
                    .add("Product ID: " + productId + "\n")
                    .add("Date: " + date + "\n")
                    .add("Time: " + time + "\n")
                    .add("Status: " + status + "\n\n");

                document.add(record);
            }
        }

        document.close();

        JOptionPane.showMessageDialog(this, "PDF generated successfully:\n" + filePath);

        // Open the PDF automatically
        try {
            if (java.awt.Desktop.isDesktopSupported()) {
                java.awt.Desktop.getDesktop().open(new File(filePath));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Could not open PDF automatically: " + e.getMessage());
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error generating PDF: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_printPActionPerformed

    private void printRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRActionPerformed
        String startDateStr = startdateR.getText();
    String endDateStr = enddateR.getText();

    if (startDateStr.isEmpty() || endDateStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select both Start Date and End Date.");
        return;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    try {
        Date startDate = sdf.parse(startDateStr);
        Date endDate = sdf.parse(endDateStr);

        if (endDate.before(startDate)) {
            JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
            return;
        }

        String filePath = "ReturnProductHistory_" + startDateStr + "_to_" + endDateStr + ".pdf";

        PdfWriter writer = new PdfWriter(filePath);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);

        // Title - DISPLAY HUB (20 font, centered)
        Paragraph title = new Paragraph("DISPLAY HUB")
            .setFontSize(20)
            .setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER);
        document.add(title);

        // Subtitle - Return Product History (startdate) to (enddate) centered
        Paragraph subtitle = new Paragraph("Return Product History (" + startDateStr + ") to (" + endDateStr + ")")
            .setFontSize(12)
            .setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER)
            .setMarginBottom(20);
        document.add(subtitle);

        DefaultTableModel model = (DefaultTableModel) historyR.getModel();

        // Loop through filtered rows by date (Date column index 1)
        for (int i = 0; i < model.getRowCount(); i++) {
            Object dateObj = model.getValueAt(i, 1);
            if (dateObj == null) continue;

            Date rowDate = sdf.parse(dateObj.toString());
            if (!rowDate.before(startDate) && !rowDate.after(endDate)) {
                String productId = model.getValueAt(i, 0) == null ? "" : model.getValueAt(i, 0).toString();
                String date = model.getValueAt(i, 1) == null ? "" : model.getValueAt(i, 1).toString();
                String time = model.getValueAt(i, 2) == null ? "" : model.getValueAt(i, 2).toString();
                String status = model.getValueAt(i, 3) == null ? "" : model.getValueAt(i, 3).toString();

                Paragraph record = new Paragraph()
                    .add("Product ID: " + productId + "\n")
                    .add("Date: " + date + "\n")
                    .add("Time: " + time + "\n")
                    .add("Status: " + status + "\n\n");

                document.add(record);
            }
        }

        document.close();

        JOptionPane.showMessageDialog(this, "PDF generated successfully:\n" + filePath);

        // Open the PDF automatically
        try {
            if (java.awt.Desktop.isDesktopSupported()) {
                java.awt.Desktop.getDesktop().open(new File(filePath));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Could not open PDF automatically: " + e.getMessage());
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error generating PDF: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_printRActionPerformed

    private void printCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printCActionPerformed
       String startDateStr = startdateC.getText();
    String endDateStr = enddateC.getText();

    if (startDateStr.isEmpty() || endDateStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select both Start Date and End Date.");
        return;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    try {
        Date startDate = sdf.parse(startDateStr);
        Date endDate = sdf.parse(endDateStr);

        if (endDate.before(startDate)) {
            JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
            return;
        }

        String filePath = "CustomerHistory_" + startDateStr + "_to_" + endDateStr + ".pdf";

        PdfWriter writer = new PdfWriter(filePath);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);

        // Title - DISPLAY HUB (20 font, center)
        Paragraph title = new Paragraph("DISPLAY HUB")
            .setFontSize(20)
            .setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER);
        document.add(title);

        // Subtitle - Customer History (startdate) to (enddate) centered
        Paragraph subtitle = new Paragraph("Customer History (" + startDateStr + ") to (" + endDateStr + ")")
            .setFontSize(12)
            .setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER)
            .setMarginBottom(20);
        document.add(subtitle);

        DefaultTableModel model = (DefaultTableModel) historyC.getModel();

        // Loop through rows filtered by date range (Date column index 1)
        for (int i = 0; i < model.getRowCount(); i++) {
            Object dateObj = model.getValueAt(i, 1);
            if (dateObj == null) continue;

            Date rowDate = sdf.parse(dateObj.toString());
            if (!rowDate.before(startDate) && !rowDate.after(endDate)) {
                String customerId = model.getValueAt(i, 0) == null ? "" : model.getValueAt(i, 0).toString();
                String date = model.getValueAt(i, 1) == null ? "" : model.getValueAt(i, 1).toString();
                String time = model.getValueAt(i, 2) == null ? "" : model.getValueAt(i, 2).toString();
                String status = model.getValueAt(i, 3) == null ? "" : model.getValueAt(i, 3).toString();

                Paragraph record = new Paragraph()
                    .add("Customer ID: " + customerId + "\n")
                    .add("Date: " + date + "\n")
                    .add("Time: " + time + "\n")
                    .add("Status: " + status + "\n\n");

                document.add(record);
            }
        }

        document.close();

        JOptionPane.showMessageDialog(this, "PDF generated successfully:\n" + filePath);

        // Open the PDF automatically
        try {
            if (java.awt.Desktop.isDesktopSupported()) {
                java.awt.Desktop.getDesktop().open(new File(filePath));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Could not open PDF automatically: " + e.getMessage());
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error generating PDF: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_printCActionPerformed

   
 private Date showDatePickerDialog(JDateChooser dateChooser, String title) {
    int result = JOptionPane.showConfirmDialog(
        this, 
        dateChooser, 
        title, 
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
        return dateChooser.getDate();
    }
    return null;
}
    
   

    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACCHISTORY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cenddateC;
    private javax.swing.JButton cenddateE;
    private javax.swing.JButton cenddateP;
    private javax.swing.JButton cenddateR;
    private javax.swing.JButton cenddateU;
    private javax.swing.JButton creturn;
    private javax.swing.JButton cstartdateC;
    private javax.swing.JButton cstartdateE;
    private javax.swing.JButton cstartdateP;
    private javax.swing.JButton cstartdateR;
    private javax.swing.JButton cstartdateU;
    private javax.swing.JButton customer;
    private javax.swing.JButton employeee;
    private javax.swing.JLabel enddateC;
    private javax.swing.JLabel enddateE;
    private javax.swing.JLabel enddateP;
    private javax.swing.JLabel enddateR;
    private javax.swing.JLabel enddateU;
    public javax.swing.JTable historyC;
    public javax.swing.JTable historyE;
    public javax.swing.JTable historyP;
    public javax.swing.JTable historyR;
    public javax.swing.JTable historyU;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel iconc;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel iconp;
    private javax.swing.JLabel iconr;
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton printC;
    private javax.swing.JButton printE;
    private javax.swing.JButton printP;
    private javax.swing.JButton printR;
    private javax.swing.JButton printU;
    private javax.swing.JButton product;
    private javax.swing.JLabel startdateC;
    private javax.swing.JLabel startdateE;
    private javax.swing.JLabel startdateP;
    private javax.swing.JLabel startdateR;
    private javax.swing.JLabel startdateU;
    private javax.swing.JButton stockmanagement;
    private javax.swing.JButton usersetting;
    // End of variables declaration//GEN-END:variables
}
