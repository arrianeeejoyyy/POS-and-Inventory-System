
package lensico_inventory.pos;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class PRODUCTSTATUS extends javax.swing.JFrame {
    
    
    
          private static final int baseProductId = 202500;
        private static int ProductCounter = 1;
    
private boolean isEditing = false;            // Tracks if we are editing an existing product
private String editingProductId = null;       // Stores the Product ID currently being edited
        
         private static PRODUCTSTATUS instance;

    public static PRODUCTSTATUS getInstance() {
        if (instance == null) {
            instance = new PRODUCTSTATUS();
        }
        return instance;
    }
    
    
   
    
    
    
    public PRODUCTSTATUS() {
        initComponents();
 
         loadProductCounter(); // Load last saved counter
        generateProductId();  // Generate ID based on that
        id.setEditable(false);
        
         // name: no digits
         brand.addKeyListener(new java.awt.event.KeyAdapter() {
             @Override
             public void keyTyped(java.awt.event.KeyEvent e) {
                 char c = e.getKeyChar();
                 if (Character.isDigit(c)) {
                     e.consume();
                     JOptionPane.showMessageDialog(null, "Numbers are not allowed in the Name field.");
                 }
             }
         });
         
          // Block non-digit input in contact number
      
         code.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                    e.consume(); // Prevent input
                    JOptionPane.showMessageDialog(null, "Only numeric values are allowed for Contact Number.");
                }
            }
        });
         
           quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                    e.consume(); // Prevent input
                    JOptionPane.showMessageDialog(null, "Only numeric values are allowed for Contact Number.");
                }
            }
        });
        
        
        imagepath.setOpaque(false);
        imagepath.setBackground(new Color (0,0,0,0));
        
        addtype.setOpaque(false);
        addtype.setBackground(new Color (0,0,0,0));
        
        id.setOpaque(false);
        id.setBackground(new Color (0,0,0,0));
        
        model.setOpaque(false);
        model.setBackground(new Color (0,0,0,0));
        
        code.setOpaque(false);
        code.setBackground(new Color (0,0,0,0));
        
        price.setOpaque(false);
        price.setBackground(new Color (0,0,0,0));
        
        brand.setOpaque(false);
        brand.setBackground(new Color (0,0,0,0));
        
        quantity.setOpaque(false);
        quantity.setBackground(new Color (0,0,0,0));
        
        imagepath.setOpaque(false);
        imagepath.setBackground(new Color (0,0,0,0));
        
        addtype.setOpaque(false);
        addtype.setBackground(new Color (0,0,0,0));
        
 
    loadProductStatusPanels(); 
    
      type.addActionListener(e -> generateProductId());
    }

    public void updatePanelQuantityByProductId(String productId, int quantitySold) {
    if (!this.isVisible()) {
        // Skip UI update if the window is not visible
        return;
    }
    for (int i = 0; i < jPanel1.getComponentCount(); i++) {
        java.awt.Component comp = jPanel1.getComponent(i);
        if (comp instanceof PRODUCTSTATUSPPP) {
            PRODUCTSTATUSPPP panel = (PRODUCTSTATUSPPP) comp;
            String panelProductId = panel.proID.getText();
            if (panelProductId.equals(productId)) {
                try {
                    int currentQty = Integer.parseInt(panel.quantity.getText().trim());
                    int newQty = currentQty - quantitySold;
                    if (newQty < 0) newQty = 0;
                    panel.quantity.setText(String.valueOf(newQty));
                    
                    // Change panel color based on stock
                    if (newQty >= 1 && newQty <= 7) {
                        panel.setStockLevelColor(Color.RED);
                    } else if (newQty >= 8 && newQty <= 14) {
                        panel.setStockLevelColor(Color.YELLOW);
                    } else if (newQty >= 15) {
                        panel.setStockLevelColor(Color.GREEN);
                    } else {
                        panel.setStockLevelColor(null);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Invalid quantity number in panel for product: " + productId);
                }
                break;
            }
        }
    }
}
 
    public void addQuantityToPanelByProductId(String productId, int quantityToAdd) {
    if (!this.isVisible()) {
        // Skip UI update if the window is not visible
        return;
    }

    boolean updated = false;

    for (int i = 0; i < jPanel1.getComponentCount(); i++) {
        java.awt.Component comp = jPanel1.getComponent(i);
        if (comp instanceof PRODUCTSTATUSPPP) {
            PRODUCTSTATUSPPP panel = (PRODUCTSTATUSPPP) comp;
            String panelProductId = panel.proID.getText();
            if (panelProductId.equals(productId)) {
                try {
                    int currentQty = Integer.parseInt(panel.quantity.getText().trim());
                    int newQty = currentQty + quantityToAdd;  // Add quantity instead of subtract

                    panel.quantity.setText(String.valueOf(newQty));
                    updated = true;

                    // Update panel color based on newQty
                    if (newQty >= 15) {
                        panel.setStockLevelColor(Color.GREEN);
                    } else if (newQty >= 8) {
                        panel.setStockLevelColor(Color.YELLOW);
                    } else if (newQty >= 1) {
                        panel.setStockLevelColor(Color.RED);
                    } else {
                        panel.setStockLevelColor(null);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Invalid quantity number in panel for product: " + productId);
                }
                break;  // Found and updated the matching panel; exit loop
            }
        }
    }

    if (updated) {
        saveAllPanelQuantitiesToFile();
    }
}
    
private void saveAllPanelQuantitiesToFile() {
    File file = new File("src/file_storage/productstatus.txt");

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
        for (int i = 0; i < jPanel1.getComponentCount(); i++) {
            java.awt.Component comp = jPanel1.getComponent(i);
            if (comp instanceof PRODUCTSTATUSPPP) {
                PRODUCTSTATUSPPP panel = (PRODUCTSTATUSPPP) comp;

                // Extract text from JLabels
                String proID = panel.proID.getText();
                String model = panel.model.getText();
                String price = panel.price.getText();
                String quantity = panel.quantity.getText();

                // For the image, you could save the icon's description or a path if you have it
                // If not, leave it empty or save a placeholder
                String imagePath = ""; 
                if (panel.image.getIcon() instanceof ImageIcon) {
                    // Optional: you might store image file path somewhere accessible if needed
                    // imagePath = your image path or identifier
                }

                // Build the line - adapt columns to your actual file format order
                // Example: proID%%model%%price%%quantity%%imagePath
                String line = String.join("%%", new String[] {
                    proID, model, price, quantity, imagePath
                });

                writer.write(line);
                writer.newLine();
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Failed to save productstatus.txt: " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer = new javax.swing.JButton();
        product = new javax.swing.JButton();
        stockmanagement = new javax.swing.JButton();
        creturn = new javax.swing.JButton();
        usersetting = new javax.swing.JButton();
        employeee = new javax.swing.JButton();
        accounthistory = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        model = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        price = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        icon = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        imagepath = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        savetype = new javax.swing.JButton();
        deletetype = new javax.swing.JButton();
        addtype = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 1215, 838));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        customer.setContentAreaFilled(false);
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        getContentPane().add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 270, 40));

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
        getContentPane().add(stockmanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 250, 40));

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

        model.setBackground(new java.awt.Color(102, 102, 102));
        model.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        model.setForeground(new java.awt.Color(255, 255, 255));
        model.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });
        getContentPane().add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 145, 180, 20));

        type.setBackground(new java.awt.Color(0, 0, 0));
        type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Tablet", "Screen Monitor", "KeyBoard ", "Mouse " }));
        type.setSelectedIndex(-1);
        type.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 74, 180, -1));

        price.setBackground(new java.awt.Color(102, 102, 102));
        price.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 218, 180, 20));

        code.setBackground(new java.awt.Color(102, 102, 102));
        code.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        code.setForeground(new java.awt.Color(255, 255, 255));
        code.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        getContentPane().add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 183, 180, 20));

        brand.setBackground(new java.awt.Color(102, 102, 102));
        brand.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        brand.setForeground(new java.awt.Color(255, 255, 255));
        brand.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });
        getContentPane().add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 255, 180, 20));

        quantity.setBackground(new java.awt.Color(102, 102, 102));
        quantity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        quantity.setForeground(new java.awt.Color(255, 255, 255));
        quantity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 292, 180, 20));

        id.setBackground(new java.awt.Color(102, 102, 102));
        id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 110, 180, 20));

        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 603, 80, 20));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        description.setBackground(new java.awt.Color(102, 102, 102));
        description.setColumns(20);
        description.setForeground(new java.awt.Color(255, 255, 255));
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 320, 170));
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 545, 155, 95));

        save.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        save.setContentAreaFilled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 740, 120, 20));

        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 740, 120, 20));

        jPanel1.setAlignmentY(0.0F);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 480, 660));

        imagepath.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        imagepath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagepathActionPerformed(evt);
            }
        });
        getContentPane().add(imagepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 555, 120, 20));

        edit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        edit.setContentAreaFilled(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 710, 120, 20));

        delete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        delete.setContentAreaFilled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 130, 20));

        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, 160, 20));

        savetype.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        savetype.setContentAreaFilled(false);
        savetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savetypeActionPerformed(evt);
            }
        });
        getContentPane().add(savetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, 110, 20));

        deletetype.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deletetype.setContentAreaFilled(false);
        deletetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletetypeActionPerformed(evt);
            }
        });
        getContentPane().add(deletetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 100, 20));

        addtype.setForeground(new java.awt.Color(255, 255, 255));
        addtype.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addtype.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(addtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 80, 210, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/PRODUCT STATUS.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        this.setVisible(false);
        CUSTOMER cus = new CUSTOMER();
        cus.setVisible(true);
    }//GEN-LAST:event_customerActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        this.setVisible(false);
        PRODUCT PRO = new PRODUCT();
        PRO.setVisible(true);

    }//GEN-LAST:event_productActionPerformed

    private void stockmanagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockmanagementActionPerformed
        this.setVisible(false);
        SALESREPORT CR = new SALESREPORT();
        CR.setVisible(true);
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

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
      // === VALIDATION ===
    if (!model.getText().matches("[a-zA-Z0-9 ]{1,500}")) {
        JOptionPane.showMessageDialog(this, "Product Model must contain letters and numbers only (max 500 characters).");
        model.requestFocus();
        return;
    }

    if (!code.getText().matches("\\d{1,500}")) {
        JOptionPane.showMessageDialog(this, "Barcode must contain numbers only (max 500 digits).");
        code.requestFocus();
        return;
    }

    if (!price.getText().matches("\\d+([.,]\\d+)?")) {
        JOptionPane.showMessageDialog(this, "Unit Price must be a valid number (decimals allowed).");
        price.requestFocus();
        return;
    }

    if (!brand.getText().matches("[a-zA-Z ]{2,500}")) {
        JOptionPane.showMessageDialog(this, "Brand Name must contain letters only and length must be between 2 and 500 characters.");
        brand.requestFocus();
        return;
    }

    if (!quantity.getText().matches("\\d{1,10}")) {
        JOptionPane.showMessageDialog(this, "Quantity must be a number containing 1 to 10 digits only.");
        quantity.requestFocus();
        return;
    }

    if (description.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Specification cannot be empty.");
        description.requestFocus();
        return;
    }


    // === CONFIRM SAVE ===
    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to save this product?",
        "Save Confirmation",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm != JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "Save operation cancelled.");
        return;
    }

    // === GATHER FIELDS ===
    String selectedtext = type.getSelectedItem() != null ? type.getSelectedItem().toString() : "";
    String pid = id.getText();
    String pmodel = model.getText();
    String barcode = code.getText();
    String uprice = price.getText();
    String brandn = brand.getText();
    String quanti = quantity.getText();
    String des = description.getText();
    String iconpath = imagepath.getText();

    if (isEditing) {
        int quantityValue;
        try {
            quantityValue = Integer.parseInt(quanti);
            if (quantityValue < 0) {
                JOptionPane.showMessageDialog(null, "Quantity cannot be negative.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Quantity must be a valid integer number.");
            return;
        }
        
         loadProductStatusPanels();
        // Update files fully (including all fields)
        updateProductData(pid, selectedtext, pid, pmodel, barcode, uprice, brandn, quanti, des, iconpath);

        // Update matching panel UI inside jPanel1 based on proID == pid
        updatePanelByProductId(pid, pmodel, uprice, brandn, quanti);

        // If quantity field is editable, update selectedPanel's stock color
        if (quantity.isEditable() && selectedPanel != null) {
            if (quantityValue >= 15) {
                selectedPanel.setStockLevelColor(Color.GREEN);
            } else if (quantityValue >= 8) {
                selectedPanel.setStockLevelColor(Color.YELLOW);
            } else if (quantityValue >= 1) {
                selectedPanel.setStockLevelColor(Color.RED);
            } else {
                selectedPanel.setStockLevelColor(null);
            }
        }

        JOptionPane.showMessageDialog(null, "Product updated successfully.");
    } else {
        // Add new product
        addNewProduct(selectedtext, pid, pmodel, barcode, uprice, brandn, quanti, des, iconpath);
        JOptionPane.showMessageDialog(null, "Successfully saved.");
        addToProductHistory(pid);
    }

    // Clear and reset
    clearForm();
    isEditing = false;
    editingProductId = null;

    id.setEditable(false);
    type.setEnabled(true);
    quantity.setEditable(true);

   
    }//GEN-LAST:event_saveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
       
       File file = chooser.getSelectedFile();
       String path = file.getAbsolutePath();
       
        Image im = Toolkit.getDefaultToolkit().createImage(path);
        im = im.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ii = new ImageIcon(im);
        icon.setIcon(ii);
       
                imagepath.setText(path);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void imagepathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagepathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagepathActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
     if (selectedPanel == null) {
        JOptionPane.showMessageDialog(this, "Please select a product panel first.");
        return;
    }

    String selectedProductId = selectedPanel.proID.getText();

    try (BufferedReader reader = new BufferedReader(new FileReader("src/file_storage/product.txt"))) {
        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");
            if (parts.length >= 8 && parts[1].equals(selectedProductId)) {
                // Populate form fields with data for editing
                type.setSelectedItem(parts[0]);
                id.setText(parts[1]);
                model.setText(parts[2]);
                code.setText(parts[3]);
                price.setText(parts[4]);
                brand.setText(parts[5]);
                quantity.setText(parts[6]);
                description.setText(parts[7]);

                loadIconPathToIcon(parts[2]);

                // Editable settings
                id.setEditable(true);
                type.setEnabled(true);
                quantity.setEditable(false);  // BLOCK quantity editing here
                model.setEditable(true);
                code.setEditable(true);
                price.setEditable(true);
                brand.setEditable(true);
                description.setEditable(true);

                isEditing = true;
                editingProductId = id.getText();

                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Product details not found.");
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error reading product file.");
    }
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       if (selectedPanel == null) {
        JOptionPane.showMessageDialog(this, "Please select a product panel first.");
        return;
    }

    String productIdToDelete = selectedPanel.proID.getText();

    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to delete the selected product?",
        "Confirm Delete",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm != JOptionPane.YES_OPTION) {
        return; // User cancelled deletion
    }

    // Delete product from all files
    deleteProductFromFile("src/file_storage/productstatus.txt", productIdToDelete, 4); // ProductID at index 4
    deleteProductFromFile("src/file_storage/product.txt", productIdToDelete, 1);       // ProductID at index 1
    deleteProductFromFile("src/file_storage/cashierproduct.txt", productIdToDelete, 0); // ProductID at index 0

    // Reload UI panels
    loadProductStatusPanels();

    // Clear form and selection
    clearForm();

    JOptionPane.showMessageDialog(this, "Product deleted successfully.");
}

// Helper method to delete a product line from a file given productId and index of productId in line parts
private void deleteProductFromFile(String filePath, String productId, int productIdIndex) {
    File inputFile = new File(filePath);
    File tempFile = new File(filePath + "_temp.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");

            if (parts.length > productIdIndex && parts[productIdIndex].equals(productId)) {
                // Skip writing this line => delete
                continue;
            }
            writer.write(line);
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error deleting product from file: " + filePath);
    }

    if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
        JOptionPane.showMessageDialog(null, "Failed to update file after deletion: " + filePath);
    }
       
    }//GEN-LAST:event_deleteActionPerformed

    private void savetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savetypeActionPerformed
       String newType = addtype.getText().trim();

    if (newType.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a type to add.");
        return;
    }

    // Check if type already exists in combobox (case-insensitive)
    for (int i = 0; i < type.getItemCount(); i++) {
        if (type.getItemAt(i).equalsIgnoreCase(newType)) {
            JOptionPane.showMessageDialog(this, "This type already exists.");
            return;
        }
    }

    // Add new type to combobox
    type.addItem(newType);

    // Update ProductCounter and save it
    ProductCounter++;
    saveProductCounter();

    // Set combo box selection to newly added type
    type.setSelectedItem(newType);

    // Generate new product ID using first letter of newType (uppercase)
    char firstLetter = Character.toUpperCase(newType.charAt(0));
    String newId = firstLetter + String.valueOf(baseProductId + ProductCounter);

    // Update the ID JTextField with generated ID
    id.setText(newId);

    // Optionally clear addtype field after adding
    addtype.setText("");

    JOptionPane.showMessageDialog(this, "Type '" + newType + "' added with ID: " + newId);
    }//GEN-LAST:event_savetypeActionPerformed

    private void deletetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletetypeActionPerformed
        String typeToDelete = addtype.getText().trim();

    if (typeToDelete.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a type to delete.");
        return;
    }

    boolean found = false;
    int indexToDelete = -1;

    // Find index of type to delete
    for (int i = 0; i < type.getItemCount(); i++) {
        if (type.getItemAt(i).equalsIgnoreCase(typeToDelete)) {
            found = true;
            indexToDelete = i;
            break;
        }
    }

    if (!found) {
        JOptionPane.showMessageDialog(this, "Type '" + typeToDelete + "' not found in the list.");
        return;
    }

    // Confirm deletion
    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to delete the type '" + typeToDelete + "'?",
        "Confirm Delete",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        type.removeItemAt(indexToDelete);
        JOptionPane.showMessageDialog(this, "Type '" + typeToDelete + "' deleted.");
        addtype.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Deletion cancelled.");
    }
    }//GEN-LAST:event_deletetypeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if (selectedPanel == null) {
        JOptionPane.showMessageDialog(this, "Please select a product panel first.");
        return;
    }

    // Load selected panel data to form fields
    String productId = selectedPanel.proID.getText();

    try (BufferedReader reader = new BufferedReader(new FileReader("src/file_storage/product.txt"))) {
        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");
            if (parts.length >= 8 && parts[1].equals(productId)) {
                type.setSelectedItem(parts[0]);
                id.setText(parts[1]);
                model.setText(parts[2]);
                code.setText(parts[3]);
                price.setText(parts[4]);
                brand.setText(parts[5]);
                quantity.setText(parts[6]);
                description.setText(parts[7]);

                loadIconPathToIcon(parts[2]);
                
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, "Product details not found.");
            return;
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading product details.");
        return;
    }

    // Set editable states: only quantity editable
    model.setEditable(false);
    code.setEditable(false);
    price.setEditable(false);
    brand.setEditable(false);
    description.setEditable(false);
    quantity.setEditable(true);
    id.setEditable(false);
    type.setEnabled(false);

    icon.setEnabled(false);

    // Set editing mode flags
    isEditing = true;
    editingProductId = productId;

    JOptionPane.showMessageDialog(this, "Only quantity is editable now. Change it and click Save.");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       model.setText("");
       price.setText("");
       code.setText("");
       brand.setText("");
       quantity.setText("");
       description.setText("");
       imagepath.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void generateProductId() {
    String prefix = "";

    Object selectedObj = type.getSelectedItem();
    if (selectedObj != null) {
        String selectedType = selectedObj.toString().trim();
        if (!selectedType.isEmpty()) {
            prefix = String.valueOf(Character.toUpperCase(selectedType.charAt(0)));
        }
    }

    String generatedId = prefix + String.valueOf(baseProductId + ProductCounter);
    id.setText(generatedId);
}
    
    
    private void updatePanelByProductId(String productId, String newModel, String newPrice, String newBrand, String newQuantity) {
    for (int i = 0; i < jPanel1.getComponentCount(); i++) {
        java.awt.Component comp = jPanel1.getComponent(i);
        if (comp instanceof PRODUCTSTATUSPPP) {
            PRODUCTSTATUSPPP panel = (PRODUCTSTATUSPPP) comp;
            String panelProductId = panel.proID.getText();
            if (panelProductId.equals(productId)) {
                panel.model.setText(newModel);
                panel.price.setText(newPrice);
                // If you have brand displayed on panel, update it here as well
                panel.quantity.setText(newQuantity);

                // Update stock color based on quantity
                try {
                    int qty = Integer.parseInt(newQuantity);
                    if (qty >= 15) {
                        panel.setStockLevelColor(Color.GREEN);
                    } else if (qty >= 8) {
                        panel.setStockLevelColor(Color.YELLOW);
                    } else if (qty >= 1) {
                        panel.setStockLevelColor(Color.RED);
                    } else {
                        panel.setStockLevelColor(null);
                    }
                } catch (NumberFormatException e) {
                    panel.setStockLevelColor(null);
                }
                break;  // Found and updated, exit loop
            }
        }
    }
}
    
    
    private void loadProductDetailsToFormById(String productId) {
    try (BufferedReader reader = new BufferedReader(new FileReader("src/file_storage/product.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");
            if (parts.length >= 8 && parts[1].equals(productId)) {
                // parts: type%%productId%%model%%barcode%%price%%brand%%quantity%%description
                code.setText(parts[3]);
                brand.setText(parts[5]);
                description.setText(parts[7]);

                // Load image path from productstatus.txt if needed
                loadIconPathToIcon(parts[2]);

                break;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading product details: " + e.getMessage());
    }
}
    
   private void updateQuantityInFile(String filePath, String productId, int newQuantity, boolean replace) {
    File inputFile = new File(filePath);
    File tempFile = new File(filePath + "_temp.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");

            if (parts.length > 1 && parts[1].equals(productId)) {
                int quantityIndex = 6; // Adjust based on your file format

                if (parts.length > quantityIndex) {
                    if (replace) {
                        // Replace quantity with newQuantity
                        parts[quantityIndex] = String.valueOf(newQuantity);
                    } else {
                        // Subtract quantity (existing logic)
                        int currentQty = 0;
                        try {
                            currentQty = Integer.parseInt(parts[quantityIndex]);
                        } catch (NumberFormatException e) {
                            currentQty = 0;
                        }
                        int updatedQty = currentQty - newQuantity;
                        if (updatedQty < 0) updatedQty = 0;
                        parts[quantityIndex] = String.valueOf(updatedQty);
                    }
                    String updatedLine = String.join("%%", parts);
                    writer.write(updatedLine);
                } else {
                    writer.write(line);
                }
            } else {
                writer.write(line);
            }
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating quantity in file: " + filePath);
    }

    if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
        JOptionPane.showMessageDialog(null, "Failed to update file: " + filePath);
    }
}
    
    
    


   private void saveProductCounter() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/file_storage/product_counter.txt"))) {
        writer.write(String.valueOf(ProductCounter));
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private void loadProductCounter() {
    try {
        java.io.File file = new java.io.File("src/file_storage/product_counter.txt");
        if (file.exists()) {
            java.util.Scanner scanner = new java.util.Scanner(file);
            if (scanner.hasNextInt()) {
                ProductCounter = scanner.nextInt();
            }
            scanner.close();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}   

private PRODUCTSTATUSPPP selectedPanel = null; 

private void selectPanel(PRODUCTSTATUSPPP panel) {
    if (selectedPanel != null) {
        selectedPanel.setBorder(null);  // Remove previous selection border
    }
    selectedPanel = panel;
    selectedPanel.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLUE, 2));  // Highlight selected panel
}

public void loadProductStatusPanels() {
    jPanel1.removeAll();  // Clear existing panels

    try (BufferedReader reader = new BufferedReader(new FileReader("src/file_storage/productstatus.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");
            if (parts.length >= 5) {
                String iconPath = parts[0];
                String modelText = parts[1];
                String priceText = parts[2];
                String quantityText = parts[3];
                String productId = parts[4];  // Assuming Product ID is at index 4

                PRODUCTSTATUSPPP panel = new PRODUCTSTATUSPPP();
                File imgFile = new File(iconPath);
                if (imgFile.exists()) {
                    ImageIcon icon = new ImageIcon(iconPath);
                    int fixedWidth = 155;
                    int fixedHeight = 95;
                    Image img = icon.getImage().getScaledInstance(fixedWidth, fixedHeight, Image.SCALE_SMOOTH);
                    panel.image.setIcon(new ImageIcon(img));
                } else {
                    panel.image.setIcon(null);
                }

                panel.model.setText(modelText);
                panel.price.setText(priceText);
                panel.quantity.setText(quantityText);

                // Set Product ID in jLabel2
                panel.proID.setText(productId);

                // Add color coding based on quantity
                int qty = Integer.parseInt(quantityText.trim());
                if (qty >= 1 && qty <= 7) {
                    panel.setStockLevelColor(Color.RED);
                } else if (qty >= 8 && qty <= 14) {
                    panel.setStockLevelColor(Color.YELLOW);
                } else if (qty >= 15) {
                    panel.setStockLevelColor(Color.GREEN);
                }

                // Add mouse listener for selecting the panel
                panel.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        selectPanel(panel);
                    }
                });

                jPanel1.add(panel);
                jPanel1.add(Box.createVerticalStrut(10));  // Space between panels
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading product panels: " + e.getMessage());
    }

    jPanel1.revalidate();
    jPanel1.repaint();
}


private void loadIconPathToIcon(String modelToFind) {
    try (BufferedReader reader = new BufferedReader(new FileReader("src/file_storage/productstatus.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");
            if (parts.length >= 3) {
                String iconPath = parts[0];
                String modelText = parts[1];
                if (modelText.equals(modelToFind)) {
                    File imgFile = new File(iconPath);
                    if (imgFile.exists()) {
                        ImageIcon imgIcon = new ImageIcon(iconPath);
                        int fixedWidth = 160;
                        int fixedHeight = 100;
                        Image img = imgIcon.getImage().getScaledInstance(fixedWidth, fixedHeight, Image.SCALE_SMOOTH);
                        this.icon.setIcon(new ImageIcon(img));
                        imagepath.setText(iconPath);
                    } else {
                        icon.setIcon(null);
                        imagepath.setText("");
                    }
                    break;
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private void updateProductData(String targetProductId, String selectedtext, String pid, String pmodel, String barcode,
                               String uprice, String brandn, String quanti, String des, String iconpath) {
    try {
        // Update product.txt
        File inputFile = new File("src/file_storage/product.txt");
        File tempFile = new File("src/file_storage/product_temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("%%");
                if (parts.length >= 8 && parts[1].equals(targetProductId)) {
                    // Write updated product line
                    writer.write(selectedtext + "%%" + pid + "%%" + pmodel + "%%" + barcode + "%%" +
                            uprice + "%%" + brandn + "%%" + quanti + "%%" + des);
                } else {
                    writer.write(line);
                }
                writer.newLine();
            }
        }

        if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
            throw new IOException("Failed to replace product.txt file");
        }

        // Update productstatus.txt for icon info
        inputFile = new File("src/file_storage/productstatus.txt");
        tempFile = new File("src/file_storage/productstatus_temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("%%");
                if (parts.length >= 3 && parts[1].equals(pmodel)) {
                    writer.write(iconpath + "%%" + pmodel + "%%" + uprice + "%%" + quanti + "%%" + pid);
                } else {
                    writer.write(line);
                }
                writer.newLine();
            }
        }
                
        if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
            throw new IOException("Failed to replace productstatus.txt file");
        }

        // Reload the UI panels to reflect changes
        loadProductStatusPanels();

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating product data: " + e.getMessage());
    }
}


private void addNewProduct(String selectedtext, String pid, String pmodel, String barcode, String uprice,
                           String brandn, String quanti, String des, String iconpath) {

    // Add full product row to PRODUCT table (full details)
    PRODUCT FULLD = new PRODUCT();
    FULLD.AddRowToJTable(new Object[]{
        selectedtext + "%%" + pid + "%%" + pmodel + "%%" + barcode + "%%" +
                uprice + "%%" + brandn + "%%" + quanti + "%%" + des
    });
    
    // Add limited product info to CASHIER_EMPLOYEE table: ID, Model, Price, Quantity (in that order)
    CASHIER_EMPLOYEE CE = new CASHIER_EMPLOYEE();
    CE.updateOrAddProductRow(new Object[]{
    pid,
    pmodel,
    uprice,
    quanti
});

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/file_storage/product.txt", true))) {
        // Save full product info
        writer.write(selectedtext + "%%" + pid + "%%" + pmodel + "%%" + barcode + "%%" +
                uprice + "%%" + brandn + "%%" + quanti + "%%" + des);
        writer.newLine();

        try (BufferedWriter writer3 = new BufferedWriter(new FileWriter("src/file_storage/productstatus.txt", true))) {
            // Save product status info
            writer3.write(iconpath + "%%" + pmodel + "%%" + uprice + "%%" + quanti + "%%" + pid);
            writer3.newLine();
        }

        try (BufferedWriter writerCashier = new BufferedWriter(new FileWriter("src/file_storage/cashierproduct.txt", true))) {
            // Save limited info for cashierproduct.txt: ID, Model, Price, Quantity (separated by %%)
            writerCashier.write(pid + "%%" + pmodel + "%%" + uprice + "%%" + quanti);
            writerCashier.newLine();
        }
        
        ProductCounter++;
        saveProductCounter();
        generateProductId();

        // Reload product panels to update UI
        loadProductStatusPanels();

    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error saving data.");
    }
}


private void clearForm() {
    code.setText("");
    price.setText("");
    brand.setText("");
    quantity.setText("");
    description.setText("");
    model.setText("");
    icon.setIcon(null);
    imagepath.setText("");

    if (selectedPanel != null) {
        selectedPanel.setBorder(null);
        selectedPanel = null;
    }
}


public void updateProductQuantity(String productId, int quantitySold) {
    // Read each file, find the product, subtract quantitySold, then save back
    updateQuantityInFile("src/file_storage/product.txt", productId, quantitySold);
    updateQuantityInFile("src/file_storage/productstatus.txt", productId, quantitySold);
    updateQuantityInFile("src/file_storage/cashierproduct.txt", productId, quantitySold);
}

private void updateQuantityInFile(String filePath, String productId, int quantitySold) {
    File inputFile = new File(filePath);
    File tempFile = new File(filePath + "_temp.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");

            // Check if parts length is enough to access parts[1] and quantity index
            if (parts.length > 1 && parts[1].equals(productId)) {
                int quantityIndex = 6; // Make sure this is correct per file format

                // Check parts length for quantity index
                if (parts.length > quantityIndex) {
                    int currentQty = 0;
                    try {
                        currentQty = Integer.parseInt(parts[quantityIndex]);
                    } catch (NumberFormatException e) {
                        currentQty = 0; // fallback if parsing fails
                    }
                    int newQty = currentQty - quantitySold;
                    if (newQty < 0) newQty = 0;

                    parts[quantityIndex] = String.valueOf(newQty);
                    String updatedLine = String.join("%%", parts);
                    writer.write(updatedLine);
                } else {
                    // quantity index out of bounds, write line as-is or handle error
                    writer.write(line);
                }
            } else {
                // Not the product we want to update, write line as-is
                writer.write(line);
            }
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating quantity in file: " + filePath);
    }

    if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
        JOptionPane.showMessageDialog(null, "Failed to update file: " + filePath);
    }
}


public void addReturnedQuantityToProduct(String productId, int returnQty) {
    updateQuantityInFileAdd("src/file_storage/product.txt", productId, returnQty);
    updateQuantityInFileAdd("src/file_storage/productstatus.txt", productId, returnQty);
    updateQuantityInFileAdd("src/file_storage/cashierproduct.txt", productId, returnQty);

    // Refresh UI panels to reflect updated stock
    loadProductStatusPanels();
}

private void updateQuantityInFileAdd(String filePath, String productId, int qtyToAdd) {
    File inputFile = new File(filePath);
    File tempFile = new File(filePath + "_temp.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");

            if (parts.length > 6 && parts[1].equals(productId)) { // Assuming productId at index 1, quantity at index 6
                int currentQty = 0;
                try {
                    currentQty = Integer.parseInt(parts[6]);
                } catch (NumberFormatException e) {
                    currentQty = 0;
                }
                int newQty = currentQty + qtyToAdd;
                parts[6] = String.valueOf(newQty);

                String updatedLine = String.join("%%", parts);
                writer.write(updatedLine);
            } else {
                writer.write(line);
            }
            writer.newLine();
        }

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating quantity in file: " + filePath);
    }

    // Replace original file with updated temp file
    if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
        JOptionPane.showMessageDialog(null, "Failed to update file: " + filePath);
    }
}


public void updateQuantityInProductStatusFileWithoutTemp(String productId, int quantitySold) {
    File file = new File("src/file_storage/productstatus.txt");
    try {
        // Read all lines into memory
        java.util.List<String> lines = new java.util.ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("%%");
                if (parts.length >= 5 && parts[4].equals(productId)) {
                    int currentQty = 0;
                    try {
                        currentQty = Integer.parseInt(parts[3]);
                    } catch (NumberFormatException e) {
                        currentQty = 0;
                    }
                    int newQty = currentQty - quantitySold;
                    if (newQty < 0) newQty = 0;
                    parts[3] = String.valueOf(newQty);
                    line = String.join("%%", parts);
                }
                lines.add(line);
            }
        }

        // Overwrite the entire file with updated lines
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(null, "Error updating productstatus.txt: " + e.getMessage());
    }
}

public void addToProductHistory(String productId) {
    try {
        // Get current date and time
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"));
        String status = "Active";

        // Access ACCHISTORY instance and its historyP JTable
        ACCHISTORY accHistory = ACCHISTORY.instance;
        if (accHistory == null) {
            // If ACCHISTORY window is not opened yet, open it once (optional)
            accHistory = new ACCHISTORY();
            accHistory.setVisible(false); // keep hidden, only for data operations
        }

        DefaultTableModel model = (DefaultTableModel) accHistory.historyP.getModel();

        // Add new row to JTable
        model.addRow(new Object[] { productId, date, currentTime, status });

        // Save JTable data to file src/file_storage/historyP.txt
        saveHistoryPToFile(accHistory.historyP, "src/file_storage/historyP.txt");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error adding product history: " + e.getMessage());
    }
}

private void saveHistoryPToFile(javax.swing.JTable table, String filePath) {
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
        JOptionPane.showMessageDialog(this, "Error saving product history file: " + e.getMessage());
    }
}

///dont remove selfffff
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCTSTATUS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accounthistory;
    private javax.swing.JTextField addtype;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField code;
    private javax.swing.JButton creturn;
    private javax.swing.JButton customer;
    private javax.swing.JButton delete;
    private javax.swing.JButton deletetype;
    private javax.swing.JTextArea description;
    private javax.swing.JButton edit;
    private javax.swing.JButton employeee;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField id;
    private javax.swing.JTextField imagepath;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JTextField model;
    private javax.swing.JTextField price;
    private javax.swing.JButton product;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton save;
    private javax.swing.JButton savetype;
    private javax.swing.JButton stockmanagement;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton usersetting;
    // End of variables declaration//GEN-END:variables

}