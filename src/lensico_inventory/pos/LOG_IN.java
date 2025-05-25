package lensico_inventory.pos;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import lensico_inventory.pos.ADMIN;
import lensico_inventory.pos.CASHIER_EMPLOYEE;
import lensico_inventory.pos.Lensico_InventoryPOS;
import static lensico_inventory.pos.Lensico_InventoryPOS.defaultpassword;
import static lensico_inventory.pos.Lensico_InventoryPOS.defaultusername;
import lensico_inventory.pos.UserAccount;
import lensico_inventory.pos.UserManager;

public class LOG_IN extends javax.swing.JFrame {

    private int loginAttempts = 0;
    
    public LOG_IN() {
        initComponents();
          
         defaultusername.add("admin");
         defaultpassword.add("123456");
 // Enter key on password field submits the login
    pin.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                enter.doClick();
            }
        }
    });

    // Optional: Pressing Enter on username field moves focus to password field
    jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                pin.requestFocus();
            }
        }
    });
        exit.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    exit.doClick(); // Simulate exit button click
                }
            }
        });
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        enter = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        pin = new javax.swing.JPasswordField();
        seepass = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        EXIT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 50, 1200, 800));
        setPreferredSize(new java.awt.Dimension(1215, 838));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1215, 838));
        jPanel1.setLayout(null);

        enter.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        enter.setContentAreaFilled(false);
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        jPanel1.add(enter);
        enter.setBounds(475, 590, 120, 40);

        clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clear.setContentAreaFilled(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(600, 590, 120, 40);

        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(460, 470, 310, 35);

        pin.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        pin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel1.add(pin);
        pin.setBounds(460, 540, 280, 35);

        seepass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        seepass.setContentAreaFilled(false);
        seepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seepassActionPerformed(evt);
            }
        });
        jPanel1.add(seepass);
        seepass.setBounds(740, 543, 40, 30);

        exit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        exit.setContentAreaFilled(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(1065, 743, 110, 40);

        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss/LOG IN.png"))); // NOI18N
        EXIT.setText("jLabel1");
        jPanel1.add(EXIT);
        EXIT.setBounds(0, 0, 1200, 800);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        String username = jTextField1.getText();
        String password = pin.getText();

        for (UserAccount user : UserManager.users) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    loginAttempts = 0;
                    JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL!");
                    this.setVisible(false);
                    if (username.equals("admin")&& password.equals("123456")) {
                        this.setVisible(false);
                        new ADMIN().setVisible(true);
                    } else {
                        this.setVisible(false);
                        new CASHIER_EMPLOYEE().setVisible(true);
                    }
                    return;
                } else {
                    loginAttempts++;
                    pin.setText("");
                    JOptionPane.showMessageDialog(null, "Incorrect password.");
                    if (loginAttempts >= 3) {
                        JOptionPane.showMessageDialog(null, "Too many failed attempts.");
                        System.exit(0);
                    }
                    return;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Username not found.");

    }//GEN-LAST:event_enterActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
         jTextField1.setText("");
        pin.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void seepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seepassActionPerformed
          JButton clickedButton = (JButton) evt.getSource();

    if (pin.getEchoChar() == '\u0000') {
        pin.setEchoChar('•');
        clickedButton.setText("");
    } else {
        pin.setEchoChar('\u0000');
        clickedButton.setText("");
    }
    }//GEN-LAST:event_seepassActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        JPasswordField passwordfield = new JPasswordField(20);
        passwordfield.setHorizontalAlignment(JPasswordField.CENTER);
        
        Object[] message = {"Enter Password: ", passwordfield};
        
        int option = JOptionPane.showConfirmDialog(LOG_IN.this, message, "Enter Password",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        if (option == JOptionPane.OK_OPTION) {
            char [] passwordArray = passwordfield.getPassword();
            String password = new String (passwordArray);
            
            if (password.equals("123456")) {
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(LOG_IN.this,"Incorrect Password!", "Error", JOptionPane.ERROR_MESSAGE);
            }
       }
    }//GEN-LAST:event_exitActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOG_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOG_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOG_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOG_IN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOG_IN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EXIT;
    private javax.swing.JButton clear;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField pin;
    private javax.swing.JButton seepass;
    // End of variables declaration//GEN-END:variables
}
