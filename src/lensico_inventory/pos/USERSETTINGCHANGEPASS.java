
package lensico_inventory.pos;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class USERSETTINGCHANGEPASS extends javax.swing.JFrame {

    private USERSETTINGCASHIERACC userAccFrame;
    
    public USERSETTINGCHANGEPASS(USERSETTINGCASHIERACC userAccFrame) {
    this.userAccFrame = userAccFrame;
    initComponents();
    loadCurrentPassword();  // your method to load existing password if you have it
}
    
    public USERSETTINGCHANGEPASS() {
        initComponents();
        loadCurrentPassword();
    }

   private void loadCurrentPassword() {
    try {
        // Access row 0, col 2 (password)
        TableModel model = USERSETTINGCASHIERACC.cashiersAccList.getModel();
        String currentPass = model.getValueAt(0, 2).toString(); // row 0 = first row
        pass.setText(currentPass);
        // Set npass and rnpass empty initially
        npass.setText("");
        rnpass.setText("");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error loading current password: " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSAVE = new javax.swing.JButton();
        jButtonCLEAR = new javax.swing.JButton();
        jButtonBACK = new javax.swing.JButton();
        npass = new javax.swing.JPasswordField();
        rnpass = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSAVE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonSAVE.setContentAreaFilled(false);
        jButtonSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSAVEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 150, 30));

        jButtonCLEAR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonCLEAR.setContentAreaFilled(false);
        jButtonCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLEARActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 313, 150, 30));

        jButtonBACK.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonBACK.setContentAreaFilled(false);
        jButtonBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBACKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 310, 150, 30));

        npass.setOpaque(false);
        npass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(npass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 260, 30));

        rnpass.setOpaque(false);
        rnpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rnpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnpassActionPerformed(evt);
            }
        });
        getContentPane().add(rnpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 260, 30));

        pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pass.setOpaque(false);
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 260, 30));

        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 40, 30));

        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 40, 30));

        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/CHANGE ADMIN  PASSWORD.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rnpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnpassActionPerformed

    private void jButtonBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBACKActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButtonBACKActionPerformed

    private void jButtonCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLEARActionPerformed
       pass.setText("");
       npass.setText("");
       rnpass.setText("");

    }//GEN-LAST:event_jButtonCLEARActionPerformed

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

    private void jButtonSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSAVEActionPerformed
        savePasswordChange();
    }//GEN-LAST:event_jButtonSAVEActionPerformed

    private void savePasswordChange() {
    String currentPass = new String(pass.getPassword());
    String newPass = new String(npass.getPassword());
    String reNewPass = new String(rnpass.getPassword());

    // Check newPass and reNewPass are the same
    if (!newPass.equals(reNewPass)) {
        JOptionPane.showMessageDialog(this, "New password and confirmation do not match.");
        return;
    }

    // Check if newPass is actually different from current password, else no change
    if (newPass.equals(currentPass)) {
        JOptionPane.showMessageDialog(this, "New password must be different from the current password.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to change the password?",
            "Confirm Password Change",
            JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            // Update password in USERSETTINGCASHIERACC cashiersAccList row 0, col 2
            DefaultTableModel model = (DefaultTableModel) USERSETTINGCASHIERACC.cashiersAccList.getModel();
            model.setValueAt(newPass, 0, 2); // update password column

            // Optionally update your backing storage if applicable, e.g.,
            USERSETTINGCASHIERACC userAccFrame = getUserCashierAccInstance();
            userAccFrame.saveTableToTextFile(USERSETTINGCASHIERACC.cashiersAccList, USERSETTINGCASHIERACC.FILE_PATH);

            // Update pass field to new password
            pass.setText(newPass);
            npass.setText("");
            rnpass.setText("");

            JOptionPane.showMessageDialog(this, "Password changed successfully.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Failed to change password: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Password change canceled.");
    }
}

// Helper method to get instance of USERSETTINGCASHIERACC if needed
private USERSETTINGCASHIERACC getUserCashierAccInstance() {
    for (java.awt.Window window : java.awt.Window.getWindows()) {
        if (window instanceof USERSETTINGCASHIERACC) {
            return (USERSETTINGCASHIERACC) window;
        }
    }
    // Or create new instance if not found (depends on your app logic)
    return null;
}
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USERSETTINGCHANGEPASS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonBACK;
    private javax.swing.JButton jButtonCLEAR;
    private javax.swing.JButton jButtonSAVE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField npass;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField rnpass;
    // End of variables declaration//GEN-END:variables
}
