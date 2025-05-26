/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lensico_inventory.pos;

import common.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class CUSTOMER extends javax.swing.JFrame {
        private static final String FILE_PATH = "src/file_storage/txtxt.txt"; // Path to your data file
    
        private javax.swing.JTextField jTextField1; 
        
    public CUSTOMER() {
        initComponents();
        loadTableFromTextFile(customerdetails, "src/file_storage/txtxt.txt");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_addcus = new javax.swing.JButton();
        Creport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerdetails = new javax.swing.JTable();
        invoice = new javax.swing.JButton();
        product = new javax.swing.JButton();
        stockmanagement = new javax.swing.JButton();
        creturn = new javax.swing.JButton();
        usersetting = new javax.swing.JButton();
        employeee = new javax.swing.JButton();
        accounthistory = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        btn_editcus = new javax.swing.JButton();
        btn_deletecus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 1215, 838));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_addcus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addcus.setContentAreaFilled(false);
        btn_addcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addcusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 730, 240, 40));

        Creport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Creport.setContentAreaFilled(false);
        Creport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreportActionPerformed(evt);
            }
        });
        getContentPane().add(Creport, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 730, 250, 40));

        customerdetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        customerdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "CONTACT NUMBER", "EMAIL", "ADDRESS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerdetails.setFocusTraversalPolicyProvider(true);
        customerdetails.setName(""); // NOI18N
        customerdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerdetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerdetails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 860, 580));

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

        creturn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        creturn.setContentAreaFilled(false);
        creturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creturnActionPerformed(evt);
            }
        });
        getContentPane().add(creturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 270, 40));

        usersetting.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        usersetting.setContentAreaFilled(false);
        usersetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersettingActionPerformed(evt);
            }
        });
        getContentPane().add(usersetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 270, 40));

        employeee.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        employeee.setContentAreaFilled(false);
        employeee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeeActionPerformed(evt);
            }
        });
        getContentPane().add(employeee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 270, 40));

        accounthistory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        accounthistory.setContentAreaFilled(false);
        accounthistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accounthistoryActionPerformed(evt);
            }
        });
        getContentPane().add(accounthistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 270, 40));

        logout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logout.setContentAreaFilled(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 270, 30));

        btn_editcus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editcus.setContentAreaFilled(false);
        btn_editcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editcusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 720, 130, 50));

        btn_deletecus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_deletecus.setContentAreaFilled(false);
        btn_deletecus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletecusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_deletecus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 720, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/CUSTOMER.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addcusActionPerformed

        CUSTOMERADD add = new CUSTOMERADD();
        add.setVisible(true);
    }//GEN-LAST:event_btn_addcusActionPerformed

    private void customerdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerdetailsMouseClicked

    }//GEN-LAST:event_customerdetailsMouseClicked

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

    private void usersettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersettingActionPerformed
        this.setVisible(false);
        USERSETTING US = new USERSETTING();
        US.setVisible(true);

    }//GEN-LAST:event_usersettingActionPerformed

    private void employeeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeeActionPerformed
        this.setVisible(false);
        EMPLOYEE EMP = new EMPLOYEE();
        EMP.setVisible(true);
    }//GEN-LAST:event_employeeeActionPerformed

    private void accounthistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accounthistoryActionPerformed
        this.setVisible(false);
        ACCHISTORY AH = new ACCHISTORY();
        AH.setVisible(true);
    }//GEN-LAST:event_accounthistoryActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int response = JOptionPane.showConfirmDialog(
            null,
            "Are you sure you want to Exit?",
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

    private void btn_editcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editcusActionPerformed
                int selectedRow = customerdetails.getSelectedRow();

            if (selectedRow != -1) {
                DefaultTableModel model = (DefaultTableModel) customerdetails.getModel();

                // Get current values
                String id = (String) model.getValueAt(selectedRow, 0);
                String n, c, e, a;

                // Repeat Name input until valid
                while (true) {
                    n = JOptionPane.showInputDialog(null, "Edit Name", model.getValueAt(selectedRow, 1));
                    if (n == null) return; // User pressed cancel
                    if (n.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Name is empty. Please provide a name.");
                    } else if (!n.matches("[a-zA-Z ]+")) {
                        JOptionPane.showMessageDialog(null, "Name must only contain letters and spaces.");
                    } else {
                        break;
                    }
                }

                // Repeat Contact input until valid
                while (true) {
                    c = JOptionPane.showInputDialog(null, "Edit Contact", model.getValueAt(selectedRow, 2));
                    if (c == null) return;
                    if (!c.matches("^09\\d{9}$")) {
                        JOptionPane.showMessageDialog(null, "Contact Number must start with 09 and be exactly 11 digits.");
                    } else {
                        break;
                    }
                }

                // Repeat Email input until valid
                while (true) {
                    e = JOptionPane.showInputDialog(null, "Edit Email", model.getValueAt(selectedRow, 3));
                    if (e == null) return;
                    if (!e.endsWith("@gmail.com")) {
                        JOptionPane.showMessageDialog(null, "Email must end with @gmail.com.");
                    } else {
                        break;
                    }
                }

                // Repeat Address input until valid
                while (true) {
                    a = JOptionPane.showInputDialog(null, "Edit Address", model.getValueAt(selectedRow, 4));
                    if (a == null) return;
                    if (a.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Address must be filled in.");
                    } else {
                        break;
                    }
                }

                // Confirmation dialog
                int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Are you sure to proceed?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION) {
                    // Update the model
                    model.setValueAt(n, selectedRow, 1);
                    model.setValueAt(c, selectedRow, 2);
                    model.setValueAt(e, selectedRow, 3);
                    model.setValueAt(a, selectedRow, 4);

                    // Save to file
                    saveTableToTextFile(customerdetails, FILE_PATH);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please select a row to edit.");
            }
    }//GEN-LAST:event_btn_editcusActionPerformed

    private void btn_deletecusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletecusActionPerformed
        int selectedRow = customerdetails.getSelectedRow();

    if (selectedRow != -1) {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) customerdetails.getModel();
            model.removeRow(selectedRow);

            // Save updated table to file
            saveTableToTextFile(customerdetails, FILE_PATH);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a row to delete.");
    }
        
    }//GEN-LAST:event_btn_deletecusActionPerformed

    private void CreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreportActionPerformed

    
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
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER().setVisible(true);
            }
        });
    }

    public static void AddRowToJTable(Object[]dataRow)
    {
        DefaultTableModel model = (DefaultTableModel)customerdetails.getModel();
        model.addRow(dataRow);
        
    }
    
   //load edit dasgdqiudoweo 
    public void saveTableToTextFile(JTable table, String filePath) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        TableModel model = table.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                writer.write(model.getValueAt(i, j).toString());
                if (j < model.getColumnCount() - 1) {
                    writer.write("%%");
                }
            }
            writer.newLine();
        }
        JOptionPane.showMessageDialog(null, "Data saved to text file.");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error saving to file: " + e.getMessage());
    }
}

// Load JTable data from a text file
public void loadTableFromTextFile(JTable table, String filePath) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0); // Clear existing rows

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] rowData = line.split("%%");
            model.addRow(rowData);
        }
    } catch (IOException e) {
        // File might not exist on first run — ignore
    }
}



    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Creport;
    private javax.swing.JButton accounthistory;
    private javax.swing.JButton btn_addcus;
    private javax.swing.JButton btn_deletecus;
    private javax.swing.JButton btn_editcus;
    private javax.swing.JButton creturn;
    private static javax.swing.JTable customerdetails;
    private javax.swing.JButton employeee;
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton product;
    private javax.swing.JButton stockmanagement;
    private javax.swing.JButton usersetting;
    // End of variables declaration//GEN-END:variables
}
