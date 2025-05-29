
package lensico_inventory.pos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CRETURN extends javax.swing.JFrame {

  private static final String RETURN_PRODUCT_FILE = "src/file_storage/returnproduct.txt";
  
  private PRODUCTSTATUS productStatusInstance;
 
  
public CRETURN() {
    this.productStatusInstance = new PRODUCTSTATUS();  // Initialize productStatusInstance
    initComponents();
    setReturnDateToToday();
    loadReturnProductsFromFile();
    this.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent evt) {
            saveReturnProductsToFile();
        }
    });
}

   private void setReturnDateToToday() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // or your desired format
    String today = sdf.format(new Date());
    rdate.setText(today);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer = new javax.swing.JButton();
        invoice = new javax.swing.JButton();
        product = new javax.swing.JButton();
        stockmanagement = new javax.swing.JButton();
        usersetting = new javax.swing.JButton();
        employeee = new javax.swing.JButton();
        accounthistory = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        returnproducts = new javax.swing.JTable();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        quanti = new javax.swing.JTextField();
        pdate = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        rdate = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
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

        invoice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        invoice.setContentAreaFilled(false);
        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });
        getContentPane().add(invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 270, 40));

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

        returnproducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer's ID", "Product Name", "Price", "Quantity", "Total Amount", "Date of Purchased ", "Date of Return"
            }
        ));
        jScrollPane1.setViewportView(returnproducts);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 850, 460));

        update.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        update.setContentAreaFilled(false);
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 100, 30));

        delete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        delete.setContentAreaFilled(false);
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 100, 30));

        save.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        save.setContentAreaFilled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 240, 100, 30));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 190, 20));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 190, 20));

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        getContentPane().add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 190, 20));

        quanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantiActionPerformed(evt);
            }
        });
        getContentPane().add(quanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 190, 20));

        pdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdateActionPerformed(evt);
            }
        });
        getContentPane().add(pdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 190, 20));

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 190, 20));

        rdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdateActionPerformed(evt);
            }
        });
        getContentPane().add(rdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 190, 20));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 190, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/RETURN.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void quantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantiActionPerformed

    private void pdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdateActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void rdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdateActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
      // Step 1: Get input values
        String customerId = id.getText().trim();
        String customerName = name.getText().trim();
        String productName = pname.getText().trim();
        String priceText = price.getText().trim();
        String quantityText = quanti.getText().trim();
        String amountText = amount.getText().trim();
        String purchaseDate = pdate.getText().trim();

        // Current return date
        String returnDate = java.time.LocalDate.now().toString();

        // Step 2: Validate fields not empty
        if (customerId.isEmpty() || customerName.isEmpty() || productName.isEmpty() ||
                priceText.isEmpty() || quantityText.isEmpty() || amountText.isEmpty() || purchaseDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled.");
            return;
        }

        // Step 3: Validate customer ID exists
        if (!isCustomerIdValid(customerId)) {
            JOptionPane.showMessageDialog(this, "Customer ID not found.");
            return;
        }

        // Step 4: Validate transaction matches receipt
        if (findMatchingTransactionInReceipt(customerId, productName, priceText, quantityText, amountText, purchaseDate) == null) {
            JOptionPane.showMessageDialog(this, "No matching transaction found in receipts.");
            return;
        }

        // Step 5: Confirm before saving
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to save this return transaction?",
                "Confirm",
                JOptionPane.YES_NO_OPTION
        );
        if (confirm != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Operation cancelled.");
            return;
        }

        // Step 6: Save to returnproduct.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RETURN_PRODUCT_FILE, true))) {
            String returnLine = String.join("%%",
                    customerId,
                    customerName,
                    productName,
                    priceText,
                    quantityText,
                    amountText,
                    purchaseDate,
                    returnDate
            );
            writer.write(returnLine);
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving return transaction: " + e.getMessage());
            return;
        }

        // Step 7: Add to JTable
        DefaultTableModel model = (DefaultTableModel) returnproducts.getModel();
        model.addRow(new Object[]{
                customerId,
                productName,
                priceText,
                quantityText,
                amountText,
                purchaseDate,
                returnDate
        });

        // Step 8: Update product quantities
        String productId = getProductIdByName(productName);
        if (productId == null) {
            JOptionPane.showMessageDialog(this, "Product ID not found for product: " + productName);
            return;
        }

        int returnQty;
        try {
            returnQty = Integer.parseInt(quantityText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid quantity.");
            return;
        }

       if (productStatusInstance != null) {
    // Call method to update product quantity
    productStatusInstance.addReturnedQuantityToProduct(productId, returnQty);
    // Call to reload product status panels and reflect updated data
    productStatusInstance.loadProductStatusPanels();
} else {
    JOptionPane.showMessageDialog(this, "Product status instance not found. Unable to update UI.");
}


        // Step 10: Clear form and notify
        JOptionPane.showMessageDialog(this, "Return transaction saved and quantities updated.");
         loadProductStatusPanels();
        clearReturnForm();
       
    }//GEN-LAST:event_saveActionPerformed

    
    private boolean isCustomerIdValid(String customerId) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/file_storage/customer.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("%%");
                if (parts.length > 0 && parts[0].equals(customerId)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Find matching receipt transaction or return null if not found
    private ReturnTransaction findMatchingTransactionInReceipt(String customerId, String productName, String price,
                                                              String quantity, String amount, String purchaseDate) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/file_storage/receipt.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("%%");
                if (parts.length >= 7) {
                    String rCustomerId = parts[0];
                    String rProductName = parts[2];
                    String rPrice = parts[3];
                    String rQuantity = parts[4];
                    String rAmount = parts[5];
                    String rPurchaseDate = parts[6];

                    if (rCustomerId.equals(customerId) &&
                            rProductName.equals(productName) &&
                            rPrice.equals(price) &&
                            rQuantity.equals(quantity) &&
                            rAmount.equals(amount) &&
                            rPurchaseDate.equals(purchaseDate)) {
                        return new ReturnTransaction(rCustomerId, productName, price, quantity, amount, purchaseDate);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static class ReturnTransaction {
        String customerId, productName, price, quantity, amount, purchaseDate;

        ReturnTransaction(String cId, String pName, String p, String q, String a, String pDate) {
            customerId = cId;
            productName = pName;
            price = p;
            quantity = q;
            amount = a;
            purchaseDate = pDate;
        }
    }

    // Clear input fields
    private void clearReturnForm() {
        id.setText("");
        name.setText("");
        pname.setText("");
        price.setText("");
        quanti.setText("");
        amount.setText("");
        pdate.setText("");
        rdate.setText(java.time.LocalDate.now().toString());
    }

    // Get product ID by product name from product.txt
    private String getProductIdByName(String productName) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/file_storage/product.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("%%");
                if (parts.length >= 3) {
                    String model = parts[2];
                    if (model.equals(productName)) {
                        return parts[1]; // productId at index 1
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Load return transactions from file to JTable
    private void loadReturnProductsFromFile() {
        DefaultTableModel model = (DefaultTableModel) returnproducts.getModel();
        model.setRowCount(0);

        try (BufferedReader reader = new BufferedReader(new FileReader(RETURN_PRODUCT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("%%");
                if (parts.length == 8) {
                    model.addRow(new Object[]{
                            parts[0], // customerId
                            parts[2], // productName
                            parts[3], // price
                            parts[4], // quantity
                            parts[5], // amount
                            parts[6], // purchaseDate
                            parts[7]  // returnDate
                    });
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading return products: " + e.getMessage());
        }
    }

    // Save JTable return transactions back to file
    private void saveReturnProductsToFile() {
        DefaultTableModel model = (DefaultTableModel) returnproducts.getModel();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RETURN_PRODUCT_FILE))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < model.getColumnCount(); j++) {
                    sb.append(model.getValueAt(i, j));
                    if (j < model.getColumnCount() - 1) sb.append("%%");
                }
                writer.write(sb.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving return products: " + e.getMessage());
        }
    }

    
    private void updateQuantityInFileAdd(String filePath, String productId, int qtyToAdd, int quantityIndex) {
    File inputFile = new File(filePath);
    File tempFile = new File(filePath + "_temp.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");

            if (parts.length > quantityIndex) {
                boolean matches = false;

                // Check if productId matches depending on your file structure
                // For example, assume productId is at index 1 in product.txt and cashierproduct.txt
                if (filePath.contains("product.txt") || filePath.contains("cashierproduct.txt")) {
                    matches = parts[1].equals(productId);
                } else if (filePath.contains("productstatus.txt")) {
                    // In productstatus.txt, productId might be at different index (like model name at index 1)
                    matches = parts[1].equals(productId);
                }

                if (matches) {
                    int currentQty = 0;
                    try {
                        currentQty = Integer.parseInt(parts[quantityIndex]);
                    } catch (NumberFormatException e) {
                        currentQty = 0;
                    }
                    int newQty = currentQty + qtyToAdd;
                    parts[quantityIndex] = String.valueOf(newQty);

                    String updatedLine = String.join("%%", parts);
                    writer.write(updatedLine);
                    writer.newLine();
                    continue;
                }
            }

            // Write original line if no match
            writer.write(line);
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error updating quantity in file: " + filePath);
    }

    // Replace original file with updated file
    if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
        JOptionPane.showMessageDialog(null, "Failed to update file: " + filePath);
    }
}
    
    public void addReturnedQuantityToProduct(String productId, int returnQty) {
    // Update quantity in product.txt (assume quantity at index 6)
    updateQuantityInFileAdd("src/file_storage/product.txt", productId, returnQty, 6);

    // Update quantity in productstatus.txt (assume quantity at index 3)
    updateQuantityInFileAdd("src/file_storage/productstatus.txt", productId, returnQty, 3);

    // Update quantity in cashierproduct.txt (assume quantity at index 3)
    updateQuantityInFileAdd("src/file_storage/cashierproduct.txt", productId, returnQty, 3);
}
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRETURN().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accounthistory;
    private javax.swing.JTextField amount;
    private javax.swing.JButton customer;
    private javax.swing.JButton delete;
    private javax.swing.JButton employeee;
    private javax.swing.JTextField id;
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pdate;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField price;
    private javax.swing.JButton product;
    private javax.swing.JTextField quanti;
    private javax.swing.JTextField rdate;
    private javax.swing.JTable returnproducts;
    private javax.swing.JButton save;
    private javax.swing.JButton stockmanagement;
    private javax.swing.JButton update;
    private javax.swing.JButton usersetting;
    // End of variables declaration//GEN-END:variables
}
