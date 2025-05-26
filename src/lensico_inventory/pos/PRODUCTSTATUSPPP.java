
package lensico_inventory.pos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class PRODUCTSTATUSPPP extends javax.swing.JPanel {
     

 
  
    public PRODUCTSTATUSPPP() {
        initComponents();
        
       
    }

  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 155, 95));

        model.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        model.setForeground(new java.awt.Color(255, 255, 255));
        add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 140, 18));

        quantity.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        quantity.setForeground(new java.awt.Color(255, 255, 255));
        add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 150, 20));

        price.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 70, 18));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 180, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/PRODUCT STATUS.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 130));
    }// </editor-fold>//GEN-END:initComponents

    
    

    
    
    
 public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCTSTATUSPPP().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel model;
    public javax.swing.JLabel price;
    public javax.swing.JLabel quantity;
    // End of variables declaration//GEN-END:variables
}
