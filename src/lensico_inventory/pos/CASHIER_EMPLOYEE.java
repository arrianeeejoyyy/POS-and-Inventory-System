
package lensico_inventory.pos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;



public class CASHIER_EMPLOYEE extends javax.swing.JFrame {

    private static final String FILE_PATH = "src/file_storage/cashierproduct.txt";
    
    public CASHIER_EMPLOYEE(String username) {
    initComponents();  // initialize UI components
    CASHIER1.setText(username);  // set username on the label
     setupListenersAndLoadData();
}
    
    public CASHIER_EMPLOYEE() {
        initComponents();
       
        productid.addActionListener(e -> {
    String searchId = productid.getText().trim();
    searchProductById(searchId);
});
        
        // Listen for changes in CHECKOUT table to recalculate totals
CHECKOUT.getModel().addTableModelListener(e -> recalculateTotals());

// Listen for discount combo box changes
discount.addActionListener(e -> recalculateTotals());
        
        loadTableFromTextFile(productlist, FILE_PATH);
        
        generateReferenceNumber();
        updateDate();
        startClock();
        updateItemsCount();
        
        discount.addActionListener(e -> applyDiscount());
        
        productid.setOpaque(false);
        productid.setBackground(new Color (0,0,0,0));
        
        quanti.setOpaque(false);
        quanti.setBackground(new Color (0,0,0,0));
        
        this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("SPACE"), "addAction");
        this.getRootPane().getActionMap().put("addAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add.doClick();
            }
        });

        this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("BACK_SPACE"), "removeAction");
        this.getRootPane().getActionMap().put("removeAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove.doClick();
            }
        });

        this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ESCAPE"), "newTransactionAction");
        this.getRootPane().getActionMap().put("newTransactionAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newtransaction.doClick();
            }
        });

        // For Shift key — usually distinguish left/right Shift is complicated.
        // Here I bind any Shift key press:
        this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("shift pressed SHIFT"), "payAndPrintAction");
        this.getRootPane().getActionMap().put("payAndPrintAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payandprint.doClick();
            }
        });
    }

    
   
    public void updateProductStatusPanelsAfterSale() {
    PRODUCTSTATUS ps = new PRODUCTSTATUS();
    ps.loadProductStatusPanels(); // This reloads panels with latest file quantities
}
   
        private void setupListenersAndLoadData() {
        loadTableFromTextFile(productlist, FILE_PATH);
        setupKeyBindings();
        setupTableModelListeners();
        // any other initialization or listener setup
    }

    // call this when opening from login
    public void refreshProductList() {
        loadTableFromTextFile(productlist, FILE_PATH);
    }

    
     private void setupKeyBindings() {
    // Put all your key bindings here
    this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("SPACE"), "addAction");
    this.getRootPane().getActionMap().put("addAction", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            add.doClick();
        }
    });
    // Similarly for other keys: BACK_SPACE, ESCAPE, SHIFT, etc.
}

private void setupTableModelListeners() {
    // Put your table model listener registration here, for example:
    CHECKOUT.getModel().addTableModelListener(e -> recalculateTotals());
    discount.addActionListener(e -> recalculateTotals());
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CHECKOUT = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        productlist = new javax.swing.JTable();
        referencenumber = new javax.swing.JLabel();
        items = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        payandprint = new javax.swing.JButton();
        productid = new javax.swing.JTextField();
        quanti = new javax.swing.JTextField();
        productn = new javax.swing.JLabel();
        value = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        grandtotal = new javax.swing.JLabel();
        discount = new javax.swing.JComboBox<>();
        newtransaction = new javax.swing.JButton();
        TAX = new javax.swing.JLabel();
        CASHIER1 = new javax.swing.JLabel();
        customername = new javax.swing.JLabel();
        customerID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 1515, 835));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 740, 150, 50));

        CHECKOUT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Model", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(CHECKOUT);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 820, 420));

        productlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productlist.setAutoscrolls(false);
        productlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productlistMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(productlist);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, 670));

        referencenumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(referencenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 57, 190, 20));

        items.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(items, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 57, 150, 20));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 60, 110, 20));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 60, 100, 20));

        add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add.setContentAreaFilled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1305, 103, 150, 30));

        remove.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        remove.setContentAreaFilled(false);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        getContentPane().add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1305, 143, 150, 30));

        payandprint.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        payandprint.setContentAreaFilled(false);
        payandprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payandprintActionPerformed(evt);
            }
        });
        getContentPane().add(payandprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 220, 140, 30));

        productid.setBackground(new java.awt.Color(102, 102, 102));
        productid.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        productid.setForeground(new java.awt.Color(255, 255, 255));
        productid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        productid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productidActionPerformed(evt);
            }
        });
        getContentPane().add(productid, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 555, 210, 20));

        quanti.setBackground(new java.awt.Color(102, 102, 102));
        quanti.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        quanti.setForeground(new java.awt.Color(255, 255, 255));
        quanti.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(quanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 650, 210, 20));

        productn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        productn.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(productn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, 200, 20));

        value.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        value.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 180, 20));

        subtotal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        subtotal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 556, 210, 20));

        grandtotal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        grandtotal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(grandtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 650, 200, 20));

        discount.setBackground(new java.awt.Color(0, 0, 51));
        discount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        discount.setForeground(new java.awt.Color(255, 255, 255));
        discount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%", "15%", "20%", "25%", "30%" }));
        discount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1055, 587, 220, 20));

        newtransaction.setToolTipText("");
        newtransaction.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        newtransaction.setContentAreaFilled(false);
        newtransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtransactionActionPerformed(evt);
            }
        });
        getContentPane().add(newtransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 180, 150, 30));

        TAX.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TAX.setForeground(new java.awt.Color(255, 255, 255));
        TAX.setText("12%");
        getContentPane().add(TAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 620, -1, -1));

        CASHIER1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CASHIER1.setForeground(new java.awt.Color(255, 255, 255));
        CASHIER1.setText("airi");
        getContentPane().add(CASHIER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 768, 190, 20));

        customername.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customername.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(customername, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 765, 230, 20));

        customerID.setBackground(new java.awt.Color(0, 0, 51));
        customerID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customerID.setForeground(new java.awt.Color(255, 255, 255));
        customerID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        customerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDActionPerformed(evt);
            }
        });
        getContentPane().add(customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 730, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/CASHIER EMPLOYEE.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        LOG_IN in = new LOG_IN();
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productlistMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_productlistMouseClicked

    private void productidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productidActionPerformed
              String searchId = productid.getText().trim();
    if (!searchId.isEmpty()) {
        searchProductById(searchId);
    } else {
        productn.setText("");
        value.setText("");
        quanti.setToolTipText(null);
    }
    }//GEN-LAST:event_productidActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
          try {
        String productId = productid.getText().trim();
        String productModel = productn.getText().trim();
        String priceText = value.getText().trim();
        String quantityText = quanti.getText().trim();

        if (productId.isEmpty() || productModel.isEmpty() || priceText.isEmpty() || quantityText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all product fields.");
            return;
        }

        // Remove commas before parsing price
        String cleanedPrice = priceText.replaceAll(",", "").trim();
        double priceValue;
        try {
            priceValue = Double.parseDouble(cleanedPrice);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric price.");
            return;
        }

        // Remove commas before parsing quantity
        String cleanedQuantity = quantityText.replaceAll(",", "").trim();
        int quantityValue;
        try {
            quantityValue = Integer.parseInt(cleanedQuantity);
            if (quantityValue < 0) {
                JOptionPane.showMessageDialog(this, "Quantity cannot be negative.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric quantity.");
            return;
        }

        // Check available stock in productlist JTable
        DefaultTableModel productModelTable = (DefaultTableModel) productlist.getModel();
        int availableQty = 0;
        boolean found = false;

        for (int i = 0; i < productModelTable.getRowCount(); i++) {
            if (productModelTable.getValueAt(i, 0).toString().equalsIgnoreCase(productId)) {
                availableQty = Integer.parseInt(productModelTable.getValueAt(i, 3).toString()); // col 3 is stock qty
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "Product ID not found.");
            return;
        }

        if (quantityValue > availableQty) {
            JOptionPane.showMessageDialog(this, "Quantity entered exceeds available stock (" + availableQty + ").");
            return;
        }

        double total = priceValue * quantityValue;

        // Add row to CHECKOUT JTable (no stock subtraction here)
        DefaultTableModel checkoutModel = (DefaultTableModel) CHECKOUT.getModel();
        Object[] rowData = { productId, productModel, priceValue, quantityValue, total };
        checkoutModel.addRow(rowData);

        // Clear input fields
        productid.setText("");
        productn.setText("");
        value.setText("");
        quanti.setText("");
        quanti.setToolTipText(null);

        updateItemsCount();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error adding to checkout: " + e.getMessage());
    }
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
          DefaultTableModel model = (DefaultTableModel) CHECKOUT.getModel();
    int selectedRow = CHECKOUT.getSelectedRow();

    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a product to remove.", "No selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Remove selected row
    model.removeRow(selectedRow);

    // Recalculate subtotal after removal
    double grandTotal = 0;
    for (int i = 0; i < model.getRowCount(); i++) {
        Object val = model.getValueAt(i, 4); // Total column
        if (val != null) {
            try {
                grandTotal += Double.parseDouble(val.toString());
            } catch (NumberFormatException e) {
                // ignore invalid values
            }
        }
    }
    subtotal.setText(String.format("%.2f", grandTotal));

    updateItemsCount();
    applyDiscount();

    }//GEN-LAST:event_removeActionPerformed

    private void payandprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payandprintActionPerformed
        if (customerID.getText().trim().isEmpty() || customername.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter valid Customer ID and ensure customer name is displayed.", "Missing Customer Information", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        String paymentStr = JOptionPane.showInputDialog(this, "Enter payment amount:");
        if (paymentStr == null) return; // User cancelled

        double payment = Double.parseDouble(paymentStr);

        DefaultTableModel checkoutModel = (DefaultTableModel) CHECKOUT.getModel();

        double grandTotalValue;
        try {
            grandTotalValue = Double.parseDouble(grandtotal.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid grand total amount.");
            return;
        }

        if (payment < grandTotalValue) {
            JOptionPane.showMessageDialog(this, "Payment amount is less than total. Please enter a valid amount.");
            return;
        }

        double change = payment - grandTotalValue;
        double vatRate = 0.12;
        double vatAmount = grandTotalValue * vatRate;
        double vatSalesValue = grandTotalValue - vatAmount;

        int printConfirm = JOptionPane.showConfirmDialog(this, "Do you want to Save and Print your Receipt?", "Print", JOptionPane.YES_NO_OPTION);

        if (printConfirm == JOptionPane.YES_OPTION) {
            // Update quantities in files and UI
            for (int i = 0; i < checkoutModel.getRowCount(); i++) {
                String productId = checkoutModel.getValueAt(i, 0).toString();
                int quantitySold = Integer.parseInt(checkoutModel.getValueAt(i, 3).toString());

                updateProductQuantity(productId, quantitySold);          // Update files: product.txt, productstatus.txt, cashierproduct.txt
                subtractQuantityInProductList(productId, quantitySold);  // Update productlist JTable UI

                // Update productstatus.txt and UI panels via PRODUCTSTATUS singleton
                PRODUCTSTATUS ps = PRODUCTSTATUS.getInstance();
                if (ps != null) {
                    ps.updateQuantityInProductStatusFileWithoutTemp(productId, quantitySold);
                    ps.updatePanelQuantityByProductId(productId, quantitySold);
                }
            }

            // Save updated productlist JTable to file
            saveTableToTextFile(productlist, "src/file_storage/cashierproduct.txt");

            // Save sales data to salesreport.txt
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/file_storage/salesreport.txt", true))) {
                for (int i = 0; i < checkoutModel.getRowCount(); i++) {
                    String productID = checkoutModel.getValueAt(i, 0).toString();
                    String price = checkoutModel.getValueAt(i, 2).toString();
                    String quantity = checkoutModel.getValueAt(i, 3).toString();
                    String total = checkoutModel.getValueAt(i, 4).toString();

                    writer.write(String.join("%%",
                        CASHIER1.getText(),
                        referencenumber.getText(),
                        customerID.getText(),
                        productID,
                        price,
                        quantity,
                        total,
                        date.getText()
                    ));
                    writer.newLine();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving to salesreport.txt: " + e.getMessage());
                return;
            }
            
            
            // Update SALESREPORT JTable if open
            if (SALESREPORT.instance != null) {
                DefaultTableModel salesModel = (DefaultTableModel) SALESREPORT.instance.salesreport.getModel();
                for (int i = 0; i < checkoutModel.getRowCount(); i++) {
                    Object[] rowData = new Object[] {
                        CASHIER1.getText(),
                        referencenumber.getText(),
                        customerID.getText(),
                        checkoutModel.getValueAt(i, 0),
                        checkoutModel.getValueAt(i, 2),
                        checkoutModel.getValueAt(i, 3),
                        checkoutModel.getValueAt(i, 4),
                        date.getText()
                        
                    };
                    salesModel.addRow(rowData);
                }
            }

            // Generate and display receipt
            Reciept receiptFrame = new Reciept();
            receiptFrame.fillReceiptFromCheckout(CHECKOUT);
            receiptFrame.setFullReceiptSummary(
                referencenumber.getText(),
                date.getText(),
                time.getText(),
                items.getText(),
                subtotal.getText(),
                discount.getSelectedItem().toString(),
                grandtotal.getText(),
                CASHIER1.getText(),
                customerID.getText(),
                String.format("%.2f", payment),
                String.format("%.2f", change),
                String.format("%.2f", vatSalesValue),
                String.format("%.2f", vatAmount),
                customername.getText()
            );

            receiptFrame.setVisible(true);

            boolean pdfSaved = receiptFrame.savePanelImageAsPDFWithCustomNameAndAutoClose();

            if (pdfSaved) {
                receiptFrame.setVisible(false);
                this.setVisible(true);

                clearTransactionData();  // Clear input and tables after success

                JOptionPane.showMessageDialog(this, "Receipt Saved and Printed.");
            } else {
                receiptFrame.setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Transaction cancelled.");
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid number entered.");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_payandprintActionPerformed

    private void newtransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtransactionActionPerformed
       Reciept receiptFrame = new Reciept();
        receiptFrame.setVisible(false);
        
         // Clear CHECKOUT table
    DefaultTableModel checkoutModel = (DefaultTableModel) CHECKOUT.getModel();
    checkoutModel.setRowCount(0);

    // Generate new 10-digit reference number
    generateReferenceNumber();

    // Reset items label to 0
    items.setText("0");

    // Optionally clear subtotal, grandtotal, and other related fields if needed
    subtotal.setText("0.00");
    grandtotal.setText("0.00");

    // You may also clear product input fields here if you want:
    productid.setText("");
    productn.setText("");
    value.setText("");
    quanti.setText("");
    customerID.setText("");
    customername.setText("");
        
    }//GEN-LAST:event_newtransactionActionPerformed

    private void customerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDActionPerformed
       String customerId = customerID.getText().trim();

    if (customerId.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a Customer ID.");
        return;
    }

    String customerName = searchCustomerNameById(customerId);

    if (customerName == null) {
        JOptionPane.showMessageDialog(null, "No customer found with that ID.");
        customername.setText("");
    } else {
        int response = JOptionPane.showConfirmDialog(null, "Customer found: " + customerName + ".\nDo you want to continue?", "Confirm", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            customername.setText(customerName);
            // Proceed with transaction here or enable buttons etc.
        } else {
            // User selected NO, cancel transaction or clear fields
            customername.setText("");
            customerID.setText("");
        }
    }
    }//GEN-LAST:event_customerIDActionPerformed

    
      public void saveTableToTextFile(JTable table, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.write(model.getValueAt(i, j).toString());
                    if (j < model.getColumnCount() - 1) writer.write("%%");
                }
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Data saved successfully.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving: " + e.getMessage());
        }
    }

  // Reload the JTable productlist from cashierproduct.txt file
public void loadTableFromTextFile(javax.swing.JTable table, String filePath) {
    table.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] {"Product ID", "Product Model", "Unit Price", "Quantity"}
    ));

    DefaultTableModel model = (DefaultTableModel) table.getModel();

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] rowData = line.split("%%");
            if (rowData.length == 4) {
                model.addRow(rowData);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
    }
}

    
    public void AddRowToJTable(Object[] rowData) {
    DefaultTableModel model = (DefaultTableModel) productlist.getModel();
    model.addRow(rowData);
    saveTableToTextFile(productlist, FILE_PATH);
}
    
    public void updateOrAddProductRow(Object[] newData) {
    // newData example for CASHIER_EMPLOYEE: [pid, pmodel, uprice, quanti]
    String pid = (String) newData[0];

    boolean found = false;
    DefaultTableModel model = (DefaultTableModel) this.productlist.getModel();

    for (int i = 0; i < model.getRowCount(); i++) {
        String existingPid = (String) model.getValueAt(i, 0);  // Assuming first column is PID
        if (existingPid.equals(pid)) {
            // Update existing row
            model.setValueAt(newData[1], i, 1); // Update model
            model.setValueAt(newData[2], i, 2); // Update price
            model.setValueAt(newData[3], i, 3); // Update quantity
            found = true;
            break;
        }
    }

    if (!found) {
        model.addRow(newData); // Add new row if not found
    }
}
    
  private void clearTransactionData() {
    // Clear all input fields except the cashier label
    productid.setText("");
    productn.setText("");
    value.setText("");
    quanti.setText("");
    customerID.setText("");
    customername.setText("");
    
    // Clear CHECKOUT table
    DefaultTableModel checkoutModel = (DefaultTableModel) CHECKOUT.getModel();
    checkoutModel.setRowCount(0);

    // Reset labels and combo box
    subtotal.setText("0.00");
    grandtotal.setText("0.00");
    items.setText("0");
    discount.setSelectedIndex(0);
    
    // Reload product list JTable to sync UI quantities
    loadTableFromTextFile(productlist, "src/file_storage/cashierproduct.txt");

    // Reload product status panels to show updated stock
    PRODUCTSTATUS ps = PRODUCTSTATUS.getInstance();
    ps.loadProductStatusPanels();
}

    
    private void searchProductById(String id) {
    DefaultTableModel model = (DefaultTableModel) productlist.getModel();

    for (int i = 0; i < model.getRowCount(); i++) {
        String pid = model.getValueAt(i, 0).toString();
        if (pid.equalsIgnoreCase(id)) {
            String productName = model.getValueAt(i, 1).toString();  // product model
            String priceStr = model.getValueAt(i, 2).toString();     // price
            String stockStr = model.getValueAt(i, 3).toString();     // available stock

            productn.setText(productName);
            value.setText(priceStr);
            quanti.setToolTipText("Available stock: " + stockStr);

            return;
        }
    }

    // Clear fields if not found
    productn.setText("");
    value.setText("");
    quanti.setToolTipText(null);
}


    
    
    
   private void generateReferenceNumber() {
    Random rand = new Random();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < 10; i++) {
        int digit = rand.nextInt(10); // 0 to 9
        sb.append(digit);
    }

    referencenumber.setText(sb.toString());
}

// Set the current date in "MMM dd, yyyy" format
private void updateDate() {
    SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
    // Set timezone to Philippines
    sdf.setTimeZone(TimeZone.getTimeZone("Asia/Manila"));
    String dateStr = sdf.format(new Date());
    date.setText(dateStr);
}

// Start a timer to update time every second (HH:mm:ss format, PH timezone)
private void startClock() {
    SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
    timeFormat.setTimeZone(TimeZone.getTimeZone("Asia/Manila"));

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String currentTime = timeFormat.format(new Date());
            time.setText(currentTime);
        }
    });
    timer.setInitialDelay(0);
    timer.start();
}
// Calculate sum of "Total" column in CHECKOUT table and display in items label
private void updateItemsCount() {
    DefaultTableModel checkoutModel = (DefaultTableModel) CHECKOUT.getModel();
    double sum = 0;
    for (int i = 0; i < checkoutModel.getRowCount(); i++) {
        Object val = checkoutModel.getValueAt(i, 3);  // column index 4 is Total
        if (val != null) {
            try {
                sum += Double.parseDouble(val.toString());
            } catch (NumberFormatException ex) {
                // Ignore invalid number format for safety
            }
        }
    }
    int intSum = (int) Math.round(sum);  // Round to nearest integer
    items.setText(String.valueOf(intSum));
}



private void applyDiscount() {
    try {
        String subtotalText = subtotal.getText().trim();
        if (subtotalText.isEmpty()) {
            grandtotal.setText("0.00");
            return;
        }

        double subtotalValue = Double.parseDouble(subtotalText);

        String discountStr = (String) discount.getSelectedItem();
        if (discountStr == null || discountStr.isEmpty()) {
            grandtotal.setText(String.format("%.2f", subtotalValue));
            return;
        }

        double discountPercent = 0;
        if (discountStr.endsWith("%")) {
            discountPercent = Double.parseDouble(discountStr.substring(0, discountStr.length() - 1));
        }

        double discountAmount = subtotalValue * (discountPercent / 100.0);
        double grandTotalValue = subtotalValue - discountAmount;

        grandtotal.setText(String.format("%.2f", grandTotalValue));

    } catch (NumberFormatException e) {
        grandtotal.setText("0.00");
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

public void subtractQuantityInProductList(String productId, int quantitySold) {
    DefaultTableModel model = (DefaultTableModel) productlist.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        String pid = model.getValueAt(i, 0).toString(); // product ID column
        if (pid.equals(productId)) {
            try {
                int currentQty = Integer.parseInt(model.getValueAt(i, 3).toString()); // quantity column
                int newQty = currentQty - quantitySold;
                if (newQty < 0) newQty = 0;
                model.setValueAt(newQty, i, 3);
            } catch (NumberFormatException e) {
                // Log or handle error as needed
            }
            break;
        }
    }
}


public String searchCustomerNameById(String customerId) {
    String filePath = "src/file_storage/txtxt.txt"; // path to your customer data file
    
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");
            // Assuming parts[0] = ID, parts[1] = Name
            if (parts.length > 1 && parts[0].equals(customerId)) {
                return parts[1]; // Return customer name
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    return null; // Not found
}


private void recalculateTotals() {
    DefaultTableModel model = (DefaultTableModel) CHECKOUT.getModel();
    double subtotalValue = 0;

    for (int i = 0; i < model.getRowCount(); i++) {
        Object val = model.getValueAt(i, 4);  // column 4 is Total per row
        if (val != null) {
            try {
                subtotalValue += Double.parseDouble(val.toString());
            } catch (NumberFormatException ex) {
                // ignore invalid number formats
            }
        }
    }

    subtotal.setText(String.format("%.2f", subtotalValue));

    // Compute discount
    String discountStr = (String) discount.getSelectedItem();
    double discountPercent = 0;
    if (discountStr != null && discountStr.endsWith("%")) {
        try {
            discountPercent = Double.parseDouble(discountStr.substring(0, discountStr.length() - 1));
        } catch (NumberFormatException e) {
            discountPercent = 0;
        }
    }

    double discountAmount = subtotalValue * (discountPercent / 100.0);
    double grandTotalValue = subtotalValue - discountAmount;

    grandtotal.setText(String.format("%.2f", grandTotalValue));
}

public JTable getProductListTable() {
    return productlist;
}

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CASHIER_EMPLOYEE().setVisible(true);
            }
        });
    }

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CASHIER1;
    public javax.swing.JTable CHECKOUT;
    private javax.swing.JLabel TAX;
    private javax.swing.JButton add;
    private javax.swing.JTextField customerID;
    private javax.swing.JLabel customername;
    private javax.swing.JLabel date;
    private javax.swing.JComboBox<String> discount;
    private javax.swing.JLabel grandtotal;
    private javax.swing.JLabel items;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton newtransaction;
    private javax.swing.JButton payandprint;
    private javax.swing.JTextField productid;
    private static javax.swing.JTable productlist;
    private javax.swing.JLabel productn;
    private javax.swing.JTextField quanti;
    private javax.swing.JLabel referencenumber;
    private javax.swing.JButton remove;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel time;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables

    
}