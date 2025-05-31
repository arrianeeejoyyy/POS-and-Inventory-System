/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lensico_inventory.pos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Airi
 */
public class CUSTOMERADD extends javax.swing.JFrame {
    
        private static final int baseCustomerId = 1112050;
        private static int customerCounter = 1;
        private static final String COUNTER_FILE = "src/file_storage/customer_counter.txt";
       
private ACCHISTORY accHistory;


public CUSTOMERADD(ACCHISTORY accHistory) {
    initComponents();
    this.accHistory = accHistory;
    // load counter, generate ID, etc.
    loadCustomerCounter();
    generateCustomerId();
    // Your existing input listeners...
}
        
    public CUSTOMERADD() {
        initComponents();
        
        
        id.setEditable(false);
        generateCustomerId();
        
         // Block non-digit input in contact number
        contactnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                    e.consume(); // Prevent input
                    JOptionPane.showMessageDialog(null, "Only numeric values are allowed for Contact Number.");
                }
            }
        });
  
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

    }

    private void loadCustomerCounter() {
        File file = new File(COUNTER_FILE);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = br.readLine();
                if (line != null) {
                    customerCounter = Integer.parseInt(line.trim());
                }
            } catch (IOException | NumberFormatException ex) {
                System.err.println("Failed to load customer counter, starting at 1");
                customerCounter = 1;
            }
        } else {
            customerCounter = 1; // Default start
        }
    }

    private void saveCustomerCounter() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(COUNTER_FILE))) {
            bw.write(String.valueOf(customerCounter));
        } catch (IOException ex) {
            System.err.println("Failed to save customer counter.");
        }
    }

    
    
    private void generateCustomerId() {
    int count = CustomerCounterManager.getInstance().getCounter();
    String generatedId = String.valueOf(baseCustomerId + count);
    id.setText(generatedId);
}

private void incrementCustomerCounter() {
    CustomerCounterManager.getInstance().incrementCounter();
}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        contactnumber = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        SAVE = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 815, 535));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setOpaque(false);
        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 320, 30));

        contactnumber.setOpaque(false);
        contactnumber.setBackground(new java.awt.Color(0, 0, 0));
        contactnumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contactnumber.setForeground(new java.awt.Color(255, 255, 255));
        contactnumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(contactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 320, 30));

        email.setOpaque(false);
        email.setBackground(new java.awt.Color(0, 0, 0));
        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 222, 320, 30));

        address.setOpaque(false);
        address.setBackground(new java.awt.Color(0, 0, 0));
        address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 262, 320, 30));

        id.setBackground(new java.awt.Color(0, 0, 0));
        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        id.setOpaque(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 102, 320, 30));

        SAVE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SAVE.setContentAreaFilled(false);
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });
        getContentPane().add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 150, 40));

        clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clear.setContentAreaFilled(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 150, 40));

        close.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        close.setContentAreaFilled(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 150, 40));

        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/CUSTOMER REGISTRATION.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
       if (!jCheckBox1.isSelected()) {
        JOptionPane.showMessageDialog(null, "You must agree to the terms to proceed.");
        return;
    }

    String n = name.getText().trim();
    String c = contactnumber.getText().trim();
    String e = email.getText().trim();
    String a = address.getText().trim();

    // Validate inputs
    if (n.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Name is empty. Please provide a name.");
        name.setText("");
        return;
    }
    if (!c.matches("^09\\d{9}$")) {
        JOptionPane.showMessageDialog(null, "Contact Number must be 11 digits only and start with 09.");
        contactnumber.setText("");
        return;
    }
    if (!e.contains("@gmail.com")) {
        JOptionPane.showMessageDialog(null, "Email must be a Gmail address.");
        email.setText("");
        return;
    }
    if (a.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Address must be filled in.");
        return;
    }

    // Confirm save
    int confirm = JOptionPane.showConfirmDialog(
        null,
        "Are you sure to proceed?",
        "Confirmation",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm != JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Operation cancelled.");
        return;
    }

    
     CUSTOMER.AddRowToJTable(new Object[]{
                                    id.getText(),
                                    name.getText(),
                                    contactnumber.getText(),
                                    email.getText(),
                                    address.getText()
                                    });
                
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/file_storage/txtxt.txt", true))) {
                        writer.write(id.getText() + "%%" +
                                            name.getText() + "%%" +
                                            contactnumber.getText() + "%%" +
                                            email.getText() + "%%" +
                                            address.getText());
                        writer.newLine();
                        JOptionPane.showMessageDialog(null, "Information saved to text file.");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error saving to file: " + ex.getMessage());
                    }
                
    // TODO: Save the customer info to your database or file here

    // Increment and save the customer counter
    incrementCustomerCounter();

    // Add to ACCHISTORY's historyC table and file if accHistory is not null
    if (accHistory != null) {
        String customerId = id.getText().trim();
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String status = "ACTIVE";

        // Add row to JTable
        DefaultTableModel model = (DefaultTableModel) accHistory.historyC.getModel();
        model.addRow(new Object[]{customerId, date, time, status});

        // Append to file
        accHistory.appendToHistoryCFile(customerId, date, time, status);
    }

    
        // Generate next customer ID

    generateCustomerId();

    // Clear form fields
    name.setText("");
    contactnumber.setText("");
    email.setText("");
    address.setText("");
    jCheckBox1.setSelected(false);

    JOptionPane.showMessageDialog(null, "Information saved successfully!");
    
    }//GEN-LAST:event_SAVEActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        id.setText("");
        name.setText("");
        contactnumber.setText("");
        email.setText("");
        address.setText("");
       
    }//GEN-LAST:event_clearActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
      
    }//GEN-LAST:event_idActionPerformed


    
    
    
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
            java.util.logging.Logger.getLogger(CUSTOMERADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CUSTOMERADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CUSTOMERADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CUSTOMERADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMERADD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SAVE;
    private javax.swing.JTextField address;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JTextField contactnumber;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
