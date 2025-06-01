package lensico_inventory.pos;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import static lensico_inventory.pos.USERSETTINGCASHIERACC.cashiersAccList;

public class USERSETTING extends javax.swing.JFrame {

    
    public USERSETTING() {
        initComponents();
         // name: no digits
         name.addKeyListener(new java.awt.event.KeyAdapter() {
             @Override
             public void keyTyped(java.awt.event.KeyEvent e) {
                 char c = e.getKeyChar();
                 if (Character.isDigit(c)) {
                     e.consume();
                     JOptionPane.showMessageDialog(null, "Numbers are not allowed in the Name field.");
                 }
             }
         });
         
         eid.setOpaque(false);
        eid.setBackground(new Color (0,0,0,0));
        
         name.setOpaque(false);
        name.setBackground(new Color (0,0,0,0));
        
        password.setOpaque(false);
        password.setBackground(new Color (0,0,0,0));
        
        confirmpassword.setOpaque(false);
        confirmpassword.setBackground(new Color (0,0,0,0)); 
         
    }
    
    

    @SuppressWarnings("unchecked")
    
    private void addToUserHistory(String eid) {
    try {
        // Get instance of ACCHISTORY (make sure ACCHISTORY.instance is accessible and initialized)
        ACCHISTORY accHistory = ACCHISTORY.instance;
        if (accHistory == null) {
            // If instance not created yet, create and show once (optional)
            accHistory = new ACCHISTORY();
            accHistory.setVisible(false); // invisible by default
            ACCHISTORY.instance = accHistory;
        }

        DefaultTableModel model = (DefaultTableModel) accHistory.historyU.getModel();

        // Prepare current date and time strings
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        String status = "Active";  // or any default status you want to show

        // Add row to historyU JTable
        model.addRow(new Object[] { eid, currentDate, currentTime, status });

        // Save updated table data to file
        accHistory.saveHistoryUTableToFile();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error updating user history: " + ex.getMessage());
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        eid = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confirmpassword = new javax.swing.JPasswordField();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cashierAcc = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        invoice = new javax.swing.JButton();
        product = new javax.swing.JButton();
        stockmanagement = new javax.swing.JButton();
        creturn = new javax.swing.JButton();
        employeee = new javax.swing.JButton();
        accounthistory = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        changepassword1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 1215, 838));
        setPreferredSize(new java.awt.Dimension(1215, 838));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setOpaque(false);
        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 323, 200, 25));

        eid.setOpaque(false);
        eid.setBackground(new java.awt.Color(0, 0, 0));
        eid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eid.setForeground(new java.awt.Color(255, 255, 255));
        eid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 292, 200, 25));

        password.setOpaque(false);
        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 355, 160, 25));

        confirmpassword.setOpaque(false);
        confirmpassword.setBackground(new java.awt.Color(0, 0, 0));
        confirmpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmpassword.setForeground(new java.awt.Color(255, 255, 255));
        confirmpassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(confirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 387, 160, 25));

        save.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        save.setContentAreaFilled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 90, 30));

        clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clear.setContentAreaFilled(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 90, 20));

        cashierAcc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cashierAcc.setContentAreaFilled(false);
        cashierAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierAccActionPerformed(evt);
            }
        });
        getContentPane().add(cashierAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 330, 40));

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
        getContentPane().add(invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 270, 40));

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

        changepassword1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        changepassword1.setContentAreaFilled(false);
        changepassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassword1ActionPerformed(evt);
            }
        });
        getContentPane().add(changepassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 320, 40));

        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, -1, -1));

        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, 30, 20));

        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 30, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/USER SETTING.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
         String user = name.getText();
    String pass = password.getText();
    String cpass = confirmpassword.getText();
    String id = eid.getText();

    if (!isEmployeeValid(id)) {
        JOptionPane.showMessageDialog(null, "Employee ID does not exist or is not a cashier.");
        return;
    }

    if (user.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Username is required.");
        name.setText("");
    } else if (!pass.equals(cpass)) {
        JOptionPane.showMessageDialog(null, "Passwords do not match.");
        password.setText("");
        confirmpassword.setText("");
    } else if (!jCheckBox1.isSelected()) {
        // Check if your checkbox is ticked, since you mentioned checkbox condition
        JOptionPane.showMessageDialog(null, "Please confirm the checkbox before saving.");
    } else {
        USERSETTINGCASHIERACC CACC = new USERSETTINGCASHIERACC();
        CACC.AddRowToJTable(new Object[]{id, user, pass, true}); // Add to cashier JTable

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/file_storage/usercashier.txt", true));
            writer.write(id + "%%" + user + "%%" + pass + "%%" + true);
            writer.newLine();
            writer.close();

            // Add to ACCHISTORY user history table and save file
            addToUserHistory(id);

            // Clear inputs
            name.setText("");
            eid.setText("");
            password.setText("");
            confirmpassword.setText("");
            jCheckBox1.setSelected(false);

            JOptionPane.showMessageDialog(null, "Employee has been added successfully to cashier");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving user data: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_saveActionPerformed

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

    private void cashierAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierAccActionPerformed
       USERSETTINGCASHIERACC cs = new USERSETTINGCASHIERACC();
        cs.setVisible(true);
    }//GEN-LAST:event_cashierAccActionPerformed

    private void changepassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassword1ActionPerformed
       USERSETTINGCHANGEPASS CP = new USERSETTINGCHANGEPASS();
       CP.setVisible(true);
    }//GEN-LAST:event_changepassword1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
                name.setText("");
                eid.setText("");
                password.setText("");
                confirmpassword.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              JButton clickedButton = (JButton) evt.getSource();

    if (password.getEchoChar() == '\u0000') {
        password.setEchoChar('•');
        clickedButton.setText("");
    } else {
        password.setEchoChar('\u0000');
        clickedButton.setText("");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           JButton clickedButton = (JButton) evt.getSource();

    if (confirmpassword.getEchoChar() == '\u0000') {
        confirmpassword.setEchoChar('•');
        clickedButton.setText("");
    } else {
        confirmpassword.setEchoChar('\u0000');
        clickedButton.setText("");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

            // Method to check if the employee is valid
        private boolean isEmployeeValid(String eid) {
            // Load employee data from the file
            try (BufferedReader reader = new BufferedReader(new FileReader("src/file_storage/employeee.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] rowData = line.split("%%");
                    if (rowData.length > 1) {
                        String employeeId = rowData[0].trim();
                        String position = rowData[2].trim(); // Assuming position is at index 2
                        if (employeeId.equals(eid) && position.equalsIgnoreCase("cashier")) {
                            return true; // Employee exists and is a cashier
                        }
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading employee data: " + e.getMessage());
            }
            return false; // Employee not found or not a cashier
        }
    
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
            java.util.logging.Logger.getLogger(USERSETTING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(USERSETTING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(USERSETTING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(USERSETTING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USERSETTING().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accounthistory;
    private javax.swing.JButton cashierAcc;
    private javax.swing.JButton changepassword1;
    private javax.swing.JButton clear;
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JButton creturn;
    private javax.swing.JButton customer;
    private javax.swing.JTextField eid;
    private javax.swing.JButton employeee;
    private javax.swing.JButton invoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton product;
    private javax.swing.JButton save;
    private javax.swing.JButton stockmanagement;
    // End of variables declaration//GEN-END:variables
}
