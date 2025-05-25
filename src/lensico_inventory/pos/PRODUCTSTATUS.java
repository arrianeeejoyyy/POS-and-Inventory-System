
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
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PRODUCTSTATUS extends javax.swing.JFrame {
          private static final int baseProductId = 202500;
        private static int ProductCounter = 1;
    
private boolean isEditing = false;            // Tracks if we are editing an existing product
private String editingProductId = null;       // Stores the Product ID currently being edited
        
        
    public PRODUCTSTATUS() {
        initComponents();
 
         loadProductCounter(); // Load last saved counter
        generateProductId();  // Generate ID based on that
        id.setEditable(false);
        
        description.setOpaque(false);
        description.setBackground(new Color (0,0,0,0));
 
    loadProductStatusPanels(); 
    
      type.addActionListener(e -> generateProductId());
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
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
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
        getContentPane().add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 180, 20));

        type.setBackground(new java.awt.Color(102, 102, 102));
        type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Tablet", "Screen Monitor", "KeyBoard ", "Mouse " }));
        type.setSelectedIndex(-1);
        type.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 180, -1));

        price.setBackground(new java.awt.Color(102, 102, 102));
        price.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 180, 20));

        code.setBackground(new java.awt.Color(102, 102, 102));
        code.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        code.setForeground(new java.awt.Color(255, 255, 255));
        code.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        getContentPane().add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 180, 20));

        brand.setBackground(new java.awt.Color(102, 102, 102));
        brand.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        brand.setForeground(new java.awt.Color(255, 255, 255));
        brand.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });
        getContentPane().add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 180, 20));

        quantity.setBackground(new java.awt.Color(102, 102, 102));
        quantity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        quantity.setForeground(new java.awt.Color(255, 255, 255));
        quantity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 180, 20));

        id.setBackground(new java.awt.Color(102, 102, 102));
        id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 180, 20));

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, -1, -1));

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 290, 150));
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 545, 155, 95));

        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 760, 100, 20));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 750, 120, 20));

        jPanel1.setAlignmentY(0.0F);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 510, 760));

        imagepath.setText("jTextField1");
        imagepath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagepathActionPerformed(evt);
            }
        });
        getContentPane().add(imagepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 110, -1));

        edit.setText("jButton3");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 720, -1, -1));

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 720, -1, -1));

        jButton6.setText("jButton6");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, -1, -1));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 670, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Airi\\Desktop\\POS AND INVONTORY FINAL\\PRODUCT STATUS.png")); // NOI18N
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
    String selectedtext = type.getSelectedItem().toString();
    String pid = id.getText();
    String pmodel = model.getText();
    String barcode = code.getText();
    String uprice = price.getText();
    String brandn = brand.getText();
    String quanti = quantity.getText();
    String des = description.getText();
    String iconpath = imagepath.getText();

    
    if (barcode.isEmpty() || uprice.isEmpty() || brandn.isEmpty() || quanti.isEmpty() || des.isEmpty()) {
        JOptionPane.showMessageDialog(null, "All Fields must be filled in.");
        return;
    }
    if (barcode.length() < 2 || barcode.length() > 500 ||
        uprice.length() < 2 || uprice.length() > 500 ||
        brandn.length() < 2 || brandn.length() > 500 ||
        quanti.length() < 2 || quanti.length() > 500 ||
        des.length() < 2 || des.length() > 500) {
        JOptionPane.showMessageDialog(null, "Must contain between 2 to 500 characters.");
        return;
    }

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

    if (isEditing) {
        
        updateProductData(editingProductId, selectedtext, pid, pmodel, barcode, uprice, brandn, quanti, des, iconpath);
        JOptionPane.showMessageDialog(null, "Product updated successfully.");
    } else {
        
        addNewProduct(selectedtext, pid, pmodel, barcode, uprice, brandn, quanti, des, iconpath);
        JOptionPane.showMessageDialog(null, "Successfully saved.");
    }

   
    clearForm();
    isEditing = false;
    editingProductId = null;

    
    id.setEditable(false);
    type.setEnabled(true);
    quantity.setEditable(true);

   
    loadProductStatusPanels();
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

    String selectedModel = selectedPanel.model.getText();

    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Airi\\Documents\\product.txt"))) {
        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");
            if (parts.length >= 8 && parts[2].equals(selectedModel)) {
                // Populate form fields
                type.setSelectedItem(parts[0]);
                id.setText(parts[1]);
                model.setText(parts[2]);
                code.setText(parts[3]);
                price.setText(parts[4]);
                brand.setText(parts[5]);
                quantity.setText(parts[6]);
                description.setText(parts[7]);

                loadIconPathToIcon(parts[2]);

                // Disable editing on ID, Type, Quantity fields
                id.setEditable(false);
                type.setEnabled(false);
                quantity.setEditable(false);

                // Enter edit mode
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       String removeValue = jTextField1.getText();
       type.removeItem(removeValue);
       
    }//GEN-LAST:event_jButton4ActionPerformed

   
private void generateProductId() {
    String prefix = "";

    Object selectedObj = type.getSelectedItem();
    if (selectedObj != null) {
        String selectedType = selectedObj.toString().trim().toLowerCase();

        switch (selectedType) {
            case "laptop":
                prefix = "L";
                break;
            case "tablet":
                prefix = "T";
                break;
            case "screen monitor":
                prefix = "S";
                break;
            case "keyboard":
                prefix = "K";
                break;
            case "mouse":
                prefix = "M";
                break;
            default:
                prefix = "";
                break;
        }
    }

    String generatedId = prefix + String.valueOf(baseProductId + ProductCounter);
    id.setText(generatedId);
}

   private void saveProductCounter() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Airi\\Documents\\product_counter.txt"))) {
        writer.write(String.valueOf(ProductCounter));
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private void loadProductCounter() {
    try {
        java.io.File file = new java.io.File("C:\\Users\\Airi\\Documents\\product_counter.txt");
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

private void loadProductStatusPanels() {
    jPanel1.removeAll();

    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Airi\\Documents\\productstatus.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");
            if (parts.length >= 4) {
                String iconPath = parts[0];
                String modelText = parts[1];
                String PriceText = parts[2];
                String quantityText = parts[3];

                PRODUCTSTATUSPPP panel = new PRODUCTSTATUSPPP();

                File imgFile = new File(iconPath);
                if (imgFile.exists()) {
                    ImageIcon icon = new ImageIcon(iconPath);
                    int fixedWidth = 140;
                    int fixedHeight = 130;
                    Image img = icon.getImage().getScaledInstance(fixedWidth, fixedHeight, Image.SCALE_SMOOTH);
                    panel.image.setIcon(new ImageIcon(img));
                } else {
                    panel.image.setIcon(null);
                }

                panel.model.setText(modelText);

                
                panel.price.setText(PriceText);  

                panel.quantity.setText(quantityText);

                
                panel.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        if (selectedPanel != null) {
                            selectedPanel.setBorder(null);  
                        }
                        selectedPanel = panel;
                        selectedPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));  
                    }
                });

                jPanel1.add(panel);
                jPanel1.add(Box.createVerticalStrut(10));
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
    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Airi\\Documents\\productstatus.txt"))) {
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
        File inputFile = new File("C:\\Users\\Airi\\Documents\\product.txt");
        File tempFile = new File("C:\\Users\\Airi\\Documents\\product_temp.txt");

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
        inputFile = new File("C:\\Users\\Airi\\Documents\\productstatus.txt");
        tempFile = new File("C:\\Users\\Airi\\Documents\\productstatus_temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("%%");
                if (parts.length >= 3 && parts[1].equals(pmodel)) {
                    writer.write(iconpath + "%%" + pmodel + "%%" + uprice + "%%" + quanti);
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

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Airi\\Documents\\product.txt", true))) {
        // Save full product info
        writer.write(selectedtext + "%%" + pid + "%%" + pmodel + "%%" + barcode + "%%" +
                uprice + "%%" + brandn + "%%" + quanti + "%%" + des);
        writer.newLine();

        try (BufferedWriter writer3 = new BufferedWriter(new FileWriter("C:\\Users\\Airi\\Documents\\productstatus.txt", true))) {
            // Save product status info
            writer3.write(iconpath + "%%" + pmodel + "%%" + uprice + "%%" + quanti);
            writer3.newLine();
        }

        try (BufferedWriter writerCashier = new BufferedWriter(new FileWriter("C:\\Users\\Airi\\Documents\\cashierproduct.txt", true))) {
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
    updateQuantityInFile("C:\\Users\\Airi\\Documents\\product.txt", productId, quantitySold);
    updateQuantityInFile("C:\\Users\\Airi\\Documents\\productstatus.txt", productId, quantitySold);
    updateQuantityInFile("C:\\Users\\Airi\\Documents\\cashierproduct.txt", productId, quantitySold);
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
    private javax.swing.JTextField brand;
    private javax.swing.JTextField code;
    private javax.swing.JButton creturn;
    private javax.swing.JButton customer;
    private javax.swing.JTextArea description;
    private javax.swing.JButton edit;
    private javax.swing.JButton employeee;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField id;
    private javax.swing.JTextField imagepath;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField model;
    private javax.swing.JTextField price;
    private javax.swing.JButton product;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton save;
    private javax.swing.JButton stockmanagement;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton usersetting;
    // End of variables declaration//GEN-END:variables
}
