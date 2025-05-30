
package lensico_inventory.pos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 class ACCHISTORY extends javax.swing.JFrame {

 public static ACCHISTORY instance;
 
 
    public ACCHISTORY() {
        initComponents();
        
        instance = this;  // assign current instance on creation

        // Load all history tables on start
        loadHistoryCTableFromFile();
        loadHistoryETableFromFile();
        loadHistoryUTableFromFile();
        loadHistoryPTableFromFile();
        loadHistoryRTableFromFile();
        
       
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyC = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyE = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        historyU = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        historyP = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        historyR = new javax.swing.JTable();
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

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Date", "Time", "Status"
            }
        ));
        jScrollPane2.setViewportView(historyC);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 420));

        jTabbedPane1.addTab("Customer", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Date", "Time", "Status"
            }
        ));
        jScrollPane1.setViewportView(historyE);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jTabbedPane1.addTab("Employee", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Date", "Time", "Status"
            }
        ));
        jScrollPane3.setViewportView(historyU);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 900, -1));

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

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 430));

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

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jTabbedPane1.addTab("Return Product", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 900, 740));
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

   
 
    
    
    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACCHISTORY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creturn;
    private javax.swing.JButton customer;
    private javax.swing.JButton employeee;
    public javax.swing.JTable historyC;
    public javax.swing.JTable historyE;
    public javax.swing.JTable historyP;
    public javax.swing.JTable historyR;
    public javax.swing.JTable historyU;
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JButton product;
    private javax.swing.JButton stockmanagement;
    private javax.swing.JButton usersetting;
    // End of variables declaration//GEN-END:variables
}
