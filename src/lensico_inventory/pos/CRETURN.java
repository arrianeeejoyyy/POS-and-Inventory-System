
package lensico_inventory.pos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
     
    
}

   private void setReturnDateToToday() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // or your desired format
    String today = sdf.format(new Date());
    rdate.setText(today);
}
   
   
   private void updateReturnedQuantityInCashierAndProduct() {
    DefaultTableModel returnModel = (DefaultTableModel) returnproducts.getModel();

    for (int i = 0; i < returnModel.getRowCount(); i++) {
        String returnedProductId = returnModel.getValueAt(i, 1).toString(); // Column 2 (Product ID)
        int returnedQuantity = Integer.parseInt(returnModel.getValueAt(i, 3).toString()); // Column 4 (Quantity)

        // Update in CASHIER_EMPLOYEE.productlist JTable
        CASHIER_EMPLOYEE cashier = new CASHIER_EMPLOYEE();
        DefaultTableModel cashierModel = (DefaultTableModel) cashier.CHECKOUT.getModel();  // Modify to productlist if declared public
        for (int j = 0; j < cashierModel.getRowCount(); j++) {
            String cashierProductId = cashierModel.getValueAt(j, 0).toString(); // Column 1 (Product ID)
            if (cashierProductId.equals(returnedProductId)) {
                int currentQty = Integer.parseInt(cashierModel.getValueAt(j, 3).toString()); // Quantity column
                cashierModel.setValueAt(currentQty + returnedQuantity, j, 3);
                break;
            }
        }

        // Update in PRODUCT.product JTable
        PRODUCT productPanel = new PRODUCT();
        DefaultTableModel productModel = (DefaultTableModel) productPanel.getProductTable().getModel();  // you need to create a getter if product is private
        for (int k = 0; k < productModel.getRowCount(); k++) {
            String productProductId = productModel.getValueAt(k, 1).toString(); // Column 2 (Product ID)
            if (productProductId.equals(returnedProductId)) {
                int currentQty = Integer.parseInt(productModel.getValueAt(k, 6).toString()); // Column 7 = index 6
                productModel.setValueAt(currentQty + returnedQuantity, k, 6);
                break;
            }
        }
    }
}
   
   private void updateQuantitiesAfterReturn() {
    String returnProdId = ProdID.getText().trim();
    int returnQty;
    try {
        returnQty = Integer.parseInt(quanti.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid quantity for return.");
        return;
    }

    // --- Update CASHIER_EMPLOYEE productlist JTable and file ---
    CASHIER_EMPLOYEE cashier = new CASHIER_EMPLOYEE();

    DefaultTableModel cashierModel = (DefaultTableModel) cashier.getProductListTable().getModel();
    boolean foundInCashier = false;
    for (int i = 0; i < cashierModel.getRowCount(); i++) {
        String prodIdInCashier = cashierModel.getValueAt(i, 0).toString();
        if (prodIdInCashier.equals(returnProdId)) {
            // Add returned quantity
            int currentQty = Integer.parseInt(cashierModel.getValueAt(i, 3).toString());
            int newQty = currentQty + returnQty;
            cashierModel.setValueAt(newQty, i, 3);
            foundInCashier = true;
            break;
        }
    }

    if (foundInCashier) {
        // Save updated cashierproduct.txt file
        saveTableToFile(cashierModel, "src/file_storage/cashierproduct.txt");
    } else {
        JOptionPane.showMessageDialog(this, "Product ID not found in CASHIER_EMPLOYEE product list.");
    }

    // --- Update PRODUCT product JTable and file ---
    PRODUCT productPanel = new PRODUCT();
    DefaultTableModel productModel = (DefaultTableModel) productPanel.getProductTable().getModel();
    boolean foundInProduct = false;

    for (int i = 0; i < productModel.getRowCount(); i++) {
        String prodIdInProduct = productModel.getValueAt(i, 1).toString(); // col 2 (index 1)
        if (prodIdInProduct.equals(returnProdId)) {
            int currentQty = Integer.parseInt(productModel.getValueAt(i, 6).toString()); // col 7 (index 6)
            int newQty = currentQty + returnQty;
            productModel.setValueAt(newQty, i, 6);
            foundInProduct = true;
            break;
        }
    }

    if (foundInProduct) {
        // Save updated product.txt file
        saveTableToFile(productModel, "src/file_storage/product.txt");
    } else {
        JOptionPane.showMessageDialog(this, "Product ID not found in PRODUCT product list.");
    }
}

private void saveTableToFile(DefaultTableModel model, String filePath) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        int colCount = model.getColumnCount();
        for (int i = 0; i < model.getRowCount(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < colCount; j++) {
                sb.append(model.getValueAt(i, j) == null ? "" : model.getValueAt(i, j).toString());
                if (j < colCount - 1) sb.append("%%");
            }
            writer.write(sb.toString());
            writer.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving file " + filePath + ": " + e.getMessage());
    }
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
        ProdID = new javax.swing.JTextField();
        quanti = new javax.swing.JTextField();
        pdate = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        rdate = new javax.swing.JTextField();
        refnum = new javax.swing.JTextField();
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

        ProdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdIDActionPerformed(evt);
            }
        });
        getContentPane().add(ProdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 190, 20));

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

        refnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refnumActionPerformed(evt);
            }
        });
        getContentPane().add(refnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 190, 20));

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
      
    }//GEN-LAST:event_priceActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        
    }//GEN-LAST:event_idActionPerformed

    private void ProdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdIDActionPerformed
      
    }//GEN-LAST:event_ProdIDActionPerformed

    private void quantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantiActionPerformed
      
    }//GEN-LAST:event_quantiActionPerformed

    private void pdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdateActionPerformed
     
    }//GEN-LAST:event_pdateActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed

    }//GEN-LAST:event_amountActionPerformed

    private void rdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdateActionPerformed
     
    }//GEN-LAST:event_rdateActionPerformed

    private void refnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refnumActionPerformed
    
    }//GEN-LAST:event_refnumActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
     // 1. Read all inputs from text fields
    String refnumInput = refnum.getText().trim();
    String idInput = id.getText().trim();
    String prodIdInput = ProdID.getText().trim();
    String priceInput = price.getText().trim();
    String quantiInput = quanti.getText().trim();
    String amountInput = amount.getText().trim();
    String pdateInput = pdate.getText().trim();
    String rdateInput = rdate.getText().trim();

    // 2. Check for empty fields
    if (refnumInput.isEmpty() || idInput.isEmpty() || prodIdInput.isEmpty() || priceInput.isEmpty()
            || quantiInput.isEmpty() || amountInput.isEmpty() || pdateInput.isEmpty() || rdateInput.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    // 3. Validate numeric fields: price, quantity, amount
    try {
        Double.parseDouble(priceInput);
        Integer.parseInt(quantiInput);
        Double.parseDouble(amountInput);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid numeric value in price, quantity, or amount.");
        return;
    }

    // 4. Load salesreport JTable from SALESREPORT class
    SALESREPORT salesReportFrame = new SALESREPORT();
    javax.swing.JTable salesTable = salesReportFrame.salesreport;  // access the JTable

    // 5. Validate each input against the corresponding column in salesreport JTable
    boolean matchFound = false;
    for (int i = 0; i < salesTable.getRowCount(); i++) {
        String salesRefnum = salesTable.getValueAt(i, 1).toString().trim();     // col 2
        String salesId = salesTable.getValueAt(i, 2).toString().trim();         // col 3
        String salesProdId = salesTable.getValueAt(i, 3).toString().trim();     // col 4
        String salesPrice = salesTable.getValueAt(i, 4).toString().trim();      // col 5
        String salesQty = salesTable.getValueAt(i, 5).toString().trim();        // col 6
        String salesAmount = salesTable.getValueAt(i, 6).toString().trim();     // col 7
        String salesPdate = salesTable.getValueAt(i, 7).toString().trim();      // col 8

        if (salesRefnum.equalsIgnoreCase(refnumInput)
            && salesId.equalsIgnoreCase(idInput)
            && salesProdId.equalsIgnoreCase(prodIdInput)
            && salesPrice.equalsIgnoreCase(priceInput)
            && salesQty.equalsIgnoreCase(quantiInput)
            && salesAmount.equalsIgnoreCase(amountInput)
            && salesPdate.equalsIgnoreCase(pdateInput)) {
            matchFound = true;
            break;
        }
    }

    if (!matchFound) {
        JOptionPane.showMessageDialog(this, "No matching sales record found for the entered data.");
        return;
    }

    // 6. Add to returnproducts JTable
    DefaultTableModel returnModel = (DefaultTableModel) returnproducts.getModel();
    Object[] newRow = new Object[]{
        idInput,
        prodIdInput,
        priceInput,
        quantiInput,
        amountInput,
        pdateInput,
        rdateInput
    };
    returnModel.addRow(newRow);

    // 7. Save returnproducts JTable to returnproducts.txt file
    saveReturnProductsToFile();
    
    updateQuantitiesAfterReturn();

    // 8. Update product quantity in PRODUCTSTATUS panel and productstatus.txt
    PRODUCTSTATUS productStatusInstance = PRODUCTSTATUS.getInstance(); // Use singleton for single instance

    if (productStatusInstance != null) {
        productStatusInstance.addQuantityToPanelByProductId(prodIdInput, Integer.parseInt(quantiInput));
    } else {
        JOptionPane.showMessageDialog(this, "Product Status panel is not loaded.");
    }

    // 9. Persist quantity update to productstatus.txt file
    updateQuantityInProductStatusFile(prodIdInput, Integer.parseInt(quantiInput));

    // 10. Clear input fields
    refnum.setText("");
    id.setText("");
    ProdID.setText("");
    price.setText("");
    quanti.setText("");
    amount.setText("");
    pdate.setText("");
    rdate.setText("");

    JOptionPane.showMessageDialog(this, "Return recorded and inventory updated successfully.");
    }//GEN-LAST:event_saveActionPerformed

    private void updateQuantityInProductStatusFile(String productId, int qtyToAdd) {
    File file = new File("src/file_storage/productstatus.txt");

    try {
        // Read all lines into a List
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
                    int newQty = currentQty + qtyToAdd;
                    parts[3] = String.valueOf(newQty);
                    line = String.join("%%", parts);
                }
                lines.add(line);
            }
        }

        // Overwrite the original file with updated lines
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error updating productstatus.txt: " + e.getMessage());
    }
}
    
    
    
    
       public void saveReturnProductsToFile() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(RETURN_PRODUCT_FILE))) {
        DefaultTableModel model = (DefaultTableModel) returnproducts.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                Object value = model.getValueAt(i, j);
                writer.write(value == null ? "" : value.toString());
                if (j < model.getColumnCount() - 1) {
                    writer.write("%%");  // your delimiter
                }
            }
            writer.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving return products: " + e.getMessage());
    }
}

        public void loadReturnProductsFromFile() {
    DefaultTableModel model = (DefaultTableModel) returnproducts.getModel();
    model.setRowCount(0); // clear existing data

    try (BufferedReader reader = new BufferedReader(new FileReader(RETURN_PRODUCT_FILE))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("%%");
            if (data.length == model.getColumnCount()) {
                model.addRow(data);
            }
        }
    } catch (IOException e) {
        // file might not exist at first run - ignore or show message
        // JOptionPane.showMessageDialog(this, "Error loading return products: " + e.getMessage());
    }
}
    
      
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRETURN().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ProdID;
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
    private javax.swing.JTextField pdate;
    private javax.swing.JTextField price;
    private javax.swing.JButton product;
    private javax.swing.JTextField quanti;
    private javax.swing.JTextField rdate;
    private javax.swing.JTextField refnum;
    private javax.swing.JTable returnproducts;
    private javax.swing.JButton save;
    private javax.swing.JButton stockmanagement;
    private javax.swing.JButton update;
    private javax.swing.JButton usersetting;
    // End of variables declaration//GEN-END:variables
}
