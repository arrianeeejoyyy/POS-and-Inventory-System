package lensico_inventory.pos;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


public class USERSETTINGCASHIERACC extends javax.swing.JFrame {

      private static final String FILE_PATH = "src/file_storage/usercashier.txt";
       private ArrayList<UserAccount> userList = new ArrayList<>();
      
    public USERSETTINGCASHIERACC() {
        initComponents();
        loadTableFromTextFile(cashiersAccList, FILE_PATH);
        
         pass.setOpaque(false);
        pass.setBackground(new Color (0,0,0,0));
        
         npass.setOpaque(false);
        npass.setBackground(new Color (0,0,0,0));
        
        rnpass.setOpaque(false);
        rnpass.setBackground(new Color (0,0,0,0));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        cashiersAccList = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        npass = new javax.swing.JPasswordField();
        rnpass = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonSAVE = new javax.swing.JButton();
        jButtonCLEAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cashiersAccList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Password", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cashiersAccList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashiersAccListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cashiersAccList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 480, 560));

        delete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        delete.setContentAreaFilled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 90, 30));

        back.setToolTipText("");
        back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 643, 40, 40));

        edit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        edit.setContentAreaFilled(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 640, 100, 40));

        pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pass.setOpaque(false);
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 280, 24));

        npass.setOpaque(false);
        npass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        npass.setForeground(new java.awt.Color(255, 255, 255));
        npass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        npass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(npass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 280, 24));

        rnpass.setOpaque(false);
        rnpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rnpass.setForeground(new java.awt.Color(255, 255, 255));
        rnpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rnpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rnpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnpassActionPerformed(evt);
            }
        });
        getContentPane().add(rnpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 280, 24));

        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 40, 30));

        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, 40, 30));

        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, 40, 30));

        jButtonSAVE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonSAVE.setContentAreaFilled(false);
        jButtonSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSAVEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 110, 30));

        jButtonCLEAR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonCLEAR.setContentAreaFilled(false);
        jButtonCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLEARActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/cashier’ Account list .png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cashiersAccListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashiersAccListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cashiersAccListMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
     int selectedRow = cashiersAccList.getSelectedRow();
    if (selectedRow != -1) {
        if (selectedRow == 0) {
            JOptionPane.showMessageDialog(null, "The first row cannot be deleted.");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) cashiersAccList.getModel();
            model.removeRow(selectedRow);
            userList.remove(selectedRow); // Also remove from ArrayList
            saveTableToTextFile(cashiersAccList, FILE_PATH);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a row to delete.");
    }

    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
int selectedRow = cashiersAccList.getSelectedRow();

    if (selectedRow != -1) {
        DefaultTableModel model = (DefaultTableModel) cashiersAccList.getModel();

        String id = model.getValueAt(selectedRow, 0).toString();
        String username = model.getValueAt(selectedRow, 1).toString();
        String password = model.getValueAt(selectedRow, 2).toString();
        Boolean status = (Boolean) model.getValueAt(selectedRow, 3);

        String newUsername;
        while (true) {
            newUsername = JOptionPane.showInputDialog(null, "Edit Username", username);
            if (newUsername == null) return;
            if (newUsername.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Username cannot be empty.");
                continue;
            }
            if (!newUsername.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(null, "Username must contain only letters and spaces.");
                continue;
            }
            break;
        }

        String newPassword;
        while (true) {
            newPassword = JOptionPane.showInputDialog(null, "Edit Password", password);
            if (newPassword == null) return;
            if (newPassword.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Password cannot be empty.");
                continue;
            }
            break;
        }

        int confirm = JOptionPane.showConfirmDialog(null,
            "Save changes for Employee ID: " + id + "?",
            "Confirm Edit",
            JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            model.setValueAt(newUsername, selectedRow, 1);
            model.setValueAt(newPassword, selectedRow, 2);

            // Update ArrayList
            UserAccount user = userList.get(selectedRow);
            user.setUsername(newUsername);
            user.setPassword(newPassword);
            user.setStatus(status);

            saveTableToTextFile(cashiersAccList, FILE_PATH);
            JOptionPane.showMessageDialog(null, "Account updated successfully.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a row to edit.");
    }
    }//GEN-LAST:event_editActionPerformed

    private void rnpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnpassActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JButton clickedButton = (JButton) evt.getSource();

        if (pass.getEchoChar() == '\u0000') {
            pass.setEchoChar('•');
            clickedButton.setText("");
        } else {
            pass.setEchoChar('\u0000');
            clickedButton.setText("");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JButton clickedButton = (JButton) evt.getSource();

        if (npass.getEchoChar() == '\u0000') {
            npass.setEchoChar('•');
            clickedButton.setText("");
        } else {
            npass.setEchoChar('\u0000');
            clickedButton.setText("");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JButton clickedButton = (JButton) evt.getSource();

        if (rnpass.getEchoChar() == '\u0000') {
            rnpass.setEchoChar('•');
            clickedButton.setText("");
        } else {
            rnpass.setEchoChar('\u0000');
            clickedButton.setText("");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSAVEActionPerformed
        int selectedRow = cashiersAccList.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select a user from the table.");
        return;
    }

    String currentPassInput = new String(pass.getPassword());
    String newPassInput = new String(npass.getPassword());
    String retypeNewPassInput = new String(rnpass.getPassword());

    // Get the existing password from the table's selected row (column 2)
    String existingPassword = cashiersAccList.getValueAt(selectedRow, 2).toString();

    // Check if current pass input matches the existing password in the table
    if (!currentPassInput.equals(existingPassword)) {
        JOptionPane.showMessageDialog(null, "Current password does not match the selected user's password.");
        pass.setText("");
        return;
    }

    // Check if new password and re-typed new password match
    if (!newPassInput.equals(retypeNewPassInput)) {
        JOptionPane.showMessageDialog(null, "New password and re-typed password do not match.");
        npass.setText("");
        rnpass.setText("");
        return;
    }

    // Confirm with user if they want to proceed
    int confirm = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to change the password?",
        "Confirm Password Change",
        JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        // Update the password in the table model
        DefaultTableModel model = (DefaultTableModel) cashiersAccList.getModel();
        model.setValueAt(newPassInput, selectedRow, 2);

        // Also update in userList
        UserAccount user = userList.get(selectedRow);
        user.setPassword(newPassInput);

        // Save changes to file
        saveTableToTextFile(cashiersAccList, FILE_PATH);

        JOptionPane.showMessageDialog(null, "Password updated successfully.");

        // Clear password fields
        pass.setText("");
        npass.setText("");
        rnpass.setText("");
    } else {
        JOptionPane.showMessageDialog(null, "Password change cancelled.");
    }
    }//GEN-LAST:event_jButtonSAVEActionPerformed

    private void jButtonCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLEARActionPerformed
        pass.setText("");
        npass.setText("");
        rnpass.setText("");
    }//GEN-LAST:event_jButtonCLEARActionPerformed

    public void AddRowToJTable(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel) cashiersAccList.getModel();
        model.addRow(dataRow);
    }

   public void saveTableToTextFile(JTable table, String filePath) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        userList.clear(); // Clear existing list

        for (int i = 0; i < model.getRowCount(); i++) {
            String id = model.getValueAt(i, 0).toString();
            String username = model.getValueAt(i, 1).toString();
            String password = model.getValueAt(i, 2).toString();
            boolean status = (Boolean) model.getValueAt(i, 3);

            UserAccount user = new UserAccount(id, username, password, status);
            userList.add(user);

            writer.write(user.toString());
            writer.newLine();
        }

        JOptionPane.showMessageDialog(null, "Data saved successfully.");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error saving: " + e.getMessage());
    }
}

    public void loadTableFromTextFile(JTable table, String filePath) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0); // Clear table
    userList.clear();     // Clear list

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            UserAccount user = UserAccount.fromString(line);
            if (user != null) {
                Object[] row = new Object[]{
                    user.getEmployeeId(),
                    user.getUsername(),
                    user.getPassword(),
                    user.isStatus()
                };
                model.addRow(row);
                userList.add(user);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
    }
}
 
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USERSETTINGCASHIERACC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    public javax.swing.JTable cashiersAccList;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonCLEAR;
    private javax.swing.JButton jButtonSAVE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField npass;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField rnpass;
    // End of variables declaration//GEN-END:variables

    private void loadTableFromTextFile(String cashierlist, String cUsersAiriDocumentscashierlisttxt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
