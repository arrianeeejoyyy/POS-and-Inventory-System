
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

  
  public void setStockLevelColor(Color color) {
    ICON.setOpaque(true);  // Make sure background color will show
    ICON.setBackground(color);
    repaint();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        proID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ICON = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setBackground(new java.awt.Color(102, 102, 102));
        add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 155, 95));
        add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 48, 190, 18));

        quantity.setBackground(new java.awt.Color(255, 255, 255));
        add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 88, 150, 20));
        add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 68, 110, 18));
        add(proID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 28, 180, 20));

        jLabel2.setText("MODEL :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 80, -1));

        jLabel3.setText("PRICE : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 70, -1));

        jLabel4.setText("QUANTITY : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel5.setText("PRODUCT ID : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        ICON.setBackground(new java.awt.Color(0, 0, 255));
        ICON.setForeground(new java.awt.Color(153, 153, 153));
        ICON.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(ICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 130));
    }// </editor-fold>//GEN-END:initComponents

    
    

    
    
    
 public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCTSTATUSPPP().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ICON;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel model;
    public javax.swing.JLabel price;
    public javax.swing.JLabel proID;
    public javax.swing.JLabel quantity;
    // End of variables declaration//GEN-END:variables
}
