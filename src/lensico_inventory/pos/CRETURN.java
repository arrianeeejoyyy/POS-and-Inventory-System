
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
      
    }//GEN-LAST:event_priceActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        
    }//GEN-LAST:event_idActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
      
    }//GEN-LAST:event_pnameActionPerformed

    private void quantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantiActionPerformed
      
    }//GEN-LAST:event_quantiActionPerformed

    private void pdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdateActionPerformed
     
    }//GEN-LAST:event_pdateActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed

    }//GEN-LAST:event_amountActionPerformed

    private void rdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdateActionPerformed
     
    }//GEN-LAST:event_rdateActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
    
    }//GEN-LAST:event_nameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    // 1. Read input values from text fields
    String customerId = id.getText().trim();
    String customerName = name.getText().trim();
    String productName = pname.getText().trim();
    String priceStr = price.getText().trim();
    String quantityStr = quanti.getText().trim();
    String amountStr = amount.getText().trim();
    String purchaseDate = pdate.getText().trim();
    String returnDate = rdate.getText().trim();

    // 2. Basic validation for empty fields
    if (customerId.isEmpty() || customerName.isEmpty() || productName.isEmpty() || 
        priceStr.isEmpty() || quantityStr.isEmpty() || amountStr.isEmpty() || 
        purchaseDate.isEmpty() || returnDate.isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    // 3. Validate numeric fields
    try {
        Double.parseDouble(priceStr);
        Integer.parseInt(quantityStr);
        Double.parseDouble(amountStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for price, quantity, and amount.");
        return;
    }

    // 4. Validate against salesreport.txt
    File file = new File("src/file_storage/salesreport.txt");
    boolean matchFound = false;

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("%%");
            if (data.length >= 8) {
                String fileCustomerId = data[2].trim();
                String fileName = data[1].trim();
                String fileProductName = data[3].trim();
                String filePrice = data[4].trim();
                String fileQuantity = data[5].trim();
                String fileAmount = data[6].trim();
                String filePurchaseDate = data[7].trim();

                if (!fileCustomerId.equalsIgnoreCase(customerId)) {
                    JOptionPane.showMessageDialog(this, "Customer ID does not match with sales record.");
                } else if (!fileName.equalsIgnoreCase(customerName)) {
                    JOptionPane.showMessageDialog(this, "Customer Name does not match with sales record.");
                } else if (!fileProductName.equalsIgnoreCase(productName)) {
                    JOptionPane.showMessageDialog(this, "Product Name does not match with sales record.");
                } else if (!filePrice.equalsIgnoreCase(priceStr)) {
                    JOptionPane.showMessageDialog(this, "Price does not match with sales record.");
                } else if (!fileQuantity.equalsIgnoreCase(quantityStr)) {
                    JOptionPane.showMessageDialog(this, "Quantity does not match with sales record.");
                } else if (!fileAmount.equalsIgnoreCase(amountStr)) {
                    JOptionPane.showMessageDialog(this, "Amount does not match with sales record.");
                } else if (!filePurchaseDate.equalsIgnoreCase(purchaseDate)) {
                    JOptionPane.showMessageDialog(this, "Purchase Date does not match with sales record.");
                } else {
                    matchFound = true;
                    break;
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading sales report: " + e.getMessage());
        return;
    }

    if (!matchFound) {
        return; // Do not proceed if no match was found
    }

    // 5. Add row to JTable
    DefaultTableModel model = (DefaultTableModel) returnproducts.getModel();
    Object[] newRow = new Object[] {
        customerId,
        productName,
        priceStr,
        quantityStr,
        amountStr,
        purchaseDate,
        returnDate
    };
    model.addRow(newRow);

    // 6. Save table to file
    saveReturnProductsToFile();

    // 7. Clear inputs
    id.setText("");
    name.setText("");
    pname.setText("");
    price.setText("");
    quanti.setText("");
    amount.setText("");
    pdate.setText("");
    rdate.setText("");

    JOptionPane.showMessageDialog(this, "Return product saved successfully.");

  
    }//GEN-LAST:event_saveActionPerformed

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
