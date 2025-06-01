
package lensico_inventory.pos;

import javax.swing.JButton;


public class USERSETTINGCHANGEPASS extends javax.swing.JFrame {

    
    public USERSETTINGCHANGEPASS() {
        initComponents();
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
