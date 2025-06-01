
package lensico_inventory.pos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.properties.TextAlignment;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PRODUCT extends javax.swing.JFrame {
       
    private static final String FILE_PATH = "src/file_storage/product.txt";
        
    public PRODUCT() {
       
        
        initComponents();
      
       
        loadTableFromTextFile(product, FILE_PATH);
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer = new javax.swing.JButton();
        invoice = new javax.swing.JButton();
        stockmanagement = new javax.swing.JButton();
        creturn = new javax.swing.JButton();
        usersetting = new javax.swing.JButton();
        employeee = new javax.swing.JButton();
        accounthistory = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        product = new javax.swing.JTable();
        selecttype = new javax.swing.JComboBox<>();
        quantitiystatus = new javax.swing.JComboBox<>();
        PRINT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
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

        stockmanagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        stockmanagement.setContentAreaFilled(false);
        stockmanagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockmanagementActionPerformed(evt);
            }
        });
        getContentPane().add(stockmanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 270, 40));

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

        product.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Product ID", "Product Model", "Barcode", "Unit Price", "Brandname", "Quantity", "Description", "Iconpath"
            }
        ));
        product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(product);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 850, 610));

        selecttype.setBackground(new java.awt.Color(255, 153, 0));
        selecttype.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selecttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "All", "Laptop", "Tablet", "Screen Monitor", "KeyBoard ", "Mouse ", " " }));
        getContentPane().add(selecttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 720, 285, 30));

        quantitiystatus.setBackground(new java.awt.Color(255, 153, 0));
        quantitiystatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quantitiystatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Quantity Status", "All", "High Stock", "Medium Stock", "Low Stock" }));
        getContentPane().add(quantitiystatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 720, 285, 30));

        PRINT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PRINT.setContentAreaFilled(false);
        PRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINTActionPerformed(evt);
            }
        });
        getContentPane().add(PRINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 710, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/product.png"))); // NOI18N
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

    private void stockmanagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockmanagementActionPerformed
        this.setVisible(false);
        SALESREPORT SM = new SALESREPORT();
        SM.setVisible(true);
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

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_productMouseClicked

    private void PRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRINTActionPerformed
      generateFilteredPdf();
    }//GEN-LAST:event_PRINTActionPerformed

 public void AddRowToJTable(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel) product.getModel();
        model.addRow(dataRow);
    }

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

    public void loadTableFromTextFile(javax.swing.JTable table, String filePath) {
    table.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] {"Type", "Product ID", "Product Model", "Barcode", "Unit Price", "Brand Name", "Quantity", "Description"}
    ));

    DefaultTableModel model = (DefaultTableModel) table.getModel();

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] rowData = line.split("%%");
            if (rowData.length == 8) {
                model.addRow(rowData);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
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
    // Update product.txt
    updateQuantityInFileAdd("src/file_storage/product.txt", productId, returnQty);

    // Update productstatus.txt
    updateQuantityInFileAdd("src/file_storage/productstatus.txt", productId, returnQty);

    // Update cashierproduct.txt
    updateQuantityInFileAdd("src/file_storage/cashierproduct.txt", productId, returnQty);

    // Also update the UI tables accordingly here or call reload methods
    // For example, reload the product JTable in PRODUCT and productlist in CASHIER_EMPLOYEE
}

private void updateQuantityInFileAdd(String filePath, String productId, int qtyToAdd) {
    File inputFile = new File(filePath);
    File tempFile = new File(filePath + "_temp.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("%%");

            // Quantity is usually at index 6 (adjust if your file format differs)
            if (parts.length > 6 && parts[1].equals(productId)) {
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

    if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
        JOptionPane.showMessageDialog(null, "Failed to update file: " + filePath);
    }
}

public JTable getProductTable() {
    return product;
}

private void generateFilteredPdf() {
    String typeSelected = (String) selecttype.getSelectedItem();
    String qtyStatusSelected = (String) quantitiystatus.getSelectedItem();

    if (typeSelected == null || qtyStatusSelected == null
        || typeSelected.equals("Select Type") || qtyStatusSelected.equals("Select Quantity Status")) {
        JOptionPane.showMessageDialog(this, "Please select valid options in both Type and Quantity Status.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    DefaultTableModel model = (DefaultTableModel) product.getModel();

    // Collect filtered rows
    ArrayList<String[]> filteredRows = new ArrayList<>();

    for (int i = 0; i < model.getRowCount(); i++) {
        String type = model.getValueAt(i, 0).toString();
        String productId = model.getValueAt(i, 1).toString();
        String productModel = model.getValueAt(i, 2).toString();
        String barcode = model.getValueAt(i, 3).toString();
        String unitPrice = model.getValueAt(i, 4).toString();
        String brandname = model.getValueAt(i, 5).toString();

        int quantity = 0;
        try {
            quantity = Integer.parseInt(model.getValueAt(i, 6).toString());
        } catch (NumberFormatException e) {
            quantity = 0;
        }

        String description = model.getValueAt(i, 7).toString();

        boolean typeMatch = typeSelected.equalsIgnoreCase("All") || type.equalsIgnoreCase(typeSelected);

        boolean qtyMatch = false;
        if (qtyStatusSelected.equalsIgnoreCase("All")) {
            qtyMatch = true;
        } else if (qtyStatusSelected.equalsIgnoreCase("High Stock")) {
            qtyMatch = quantity >= 15;
        } else if (qtyStatusSelected.equalsIgnoreCase("Medium Stock")) {
            qtyMatch = quantity >= 8 && quantity <= 14;
        } else if (qtyStatusSelected.equalsIgnoreCase("Low Stock")) {
            qtyMatch = quantity <= 7;
        }

        if (typeMatch && qtyMatch) {
            filteredRows.add(new String[] {
                type, productId, productModel, barcode, unitPrice, brandname, String.valueOf(quantity), description
            });
        }
    }

    if (filteredRows.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No products found for the selected filters.", "Info", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    String fileName = "ProductList_" + System.currentTimeMillis() + ".pdf";

    // Fix: ensure Desktop folder exists
    String userHome = System.getProperty("user.home");
    File desktopDir = new File(userHome, "Desktop");
    if (!desktopDir.exists()) {
        desktopDir.mkdirs();
    }
    File pdfFile = new File(desktopDir, fileName);

    try {
        PdfWriter writer = new PdfWriter(pdfFile.getAbsolutePath());
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document document = new Document(pdfDoc);

        Paragraph title = new Paragraph("DISPLAY HUB")
                .setBold()
                .setFontSize(20)
                .setTextAlignment(TextAlignment.CENTER);
        document.add(title);

        document.add(new Paragraph(" "));

        Paragraph subTitle = new Paragraph("Product List")
                .setFontSize(18)
                .setTextAlignment(TextAlignment.CENTER);
        document.add(subTitle);

        document.add(new Paragraph(" "));

        for (String[] row : filteredRows) {
            document.add(new Paragraph("Type: " + row[0]));
            document.add(new Paragraph("Product ID: " + row[1]));
            document.add(new Paragraph("Product Model: " + row[2]));
            document.add(new Paragraph("Barcode: " + row[3]));
            document.add(new Paragraph("Unit Price: " + row[4]));
            document.add(new Paragraph("Brandname: " + row[5]));
            document.add(new Paragraph("Quantity: " + row[6]));
            document.add(new Paragraph("Description: " + row[7]));
            document.add(new Paragraph("----------------------------------------------------------------------------------------"));
        }

        document.close();

        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(pdfFile);
        }

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error generating PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PRINT;
    private javax.swing.JButton accounthistory;
    private javax.swing.JButton creturn;
    private javax.swing.JButton customer;
    private javax.swing.JButton employeee;
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private static javax.swing.JTable product;
    private javax.swing.JComboBox<String> quantitiystatus;
    private javax.swing.JComboBox<String> selecttype;
    private javax.swing.JButton stockmanagement;
    private javax.swing.JButton usersetting;
    // End of variables declaration//GEN-END:variables
}
