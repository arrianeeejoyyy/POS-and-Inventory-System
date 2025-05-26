
package lensico_inventory.pos;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import java.awt.Desktop;
import javax.imageio.ImageIO;



public class Reciept extends javax.swing.JFrame {

    
    public Reciept() {
        initComponents();
         format_JTable(); 
    }

    public BufferedImage getReceiptPanelImage() {
    BufferedImage image = new BufferedImage(jPanel1.getWidth(), jPanel1.getHeight(), BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2d = image.createGraphics();
    jPanel1.paint(g2d);
    g2d.dispose();
    return image;
}
    
    
    
  private void format_JTable() {
        JTableHeader header = table_content.getTableHeader();
        header.setVisible(false); // Hide JTable header

        DefaultTableCellRenderer right = new DefaultTableCellRenderer();
        right.setHorizontalAlignment(JLabel.RIGHT);
        table_content.getColumnModel().getColumn(1).setCellRenderer(right);
        table_content.setShowGrid(false);
        
        // Remove this line (does not exist):
        // table_pane.getColumnHeader().setVisible(false);
        
        table_pane.getViewport().setBackground(Color.WHITE);
    }



    
 public void fillReceiptFromCheckout(javax.swing.JTable checkoutTable) {
        DefaultTableModel receiptModel = (DefaultTableModel) table_content.getModel();
        receiptModel.setRowCount(0); // Clear previous rows
        
        DefaultTableModel checkoutModel = (DefaultTableModel) checkoutTable.getModel();
        
        for (int i = 0; i < checkoutModel.getRowCount(); i++) {
            String productName = checkoutModel.getValueAt(i, 1).toString(); // Product Model
            double price = Double.parseDouble(checkoutModel.getValueAt(i, 2).toString());
            int quantity = Integer.parseInt(checkoutModel.getValueAt(i, 3).toString());
            double total = Double.parseDouble(checkoutModel.getValueAt(i, 4).toString());
            
            Object[] row = {productName, String.format("%.2f", price), quantity, String.format("%.2f", total)};
            receiptModel.addRow(row);
        }
    }

 
 
   public void printReceiptAndSavePDF() throws IOException {
    PDDocument doc = new PDDocument();
    PDPage page = new PDPage(PDRectangle.LETTER);
    doc.addPage(page);

    PDPageContentStream content = new PDPageContentStream(doc, page);
    content.beginText();

    // Set font and start position
    content.setFont(PDType1Font.HELVETICA, 14);
    content.newLineAtOffset(50, 700);
    content.showText("DISPLAY HUB Receipt");
    
    content.setFont(PDType1Font.HELVETICA, 12);
    content.newLineAtOffset(0, -30); // Move down 30 for next line

    DefaultTableModel model = (DefaultTableModel) table_content.getModel();
    
    // Print each row line by line with proper vertical spacing
    for (int i = 0; i < model.getRowCount(); i++) {
        String productName = model.getValueAt(i, 0).toString();
        String price = model.getValueAt(i, 1).toString();
        String qty = model.getValueAt(i, 2).toString();
        String total = model.getValueAt(i, 3).toString();

        String line = String.format("%s  Price: %s  Qty: %s  Total: %s", productName, price, qty, total);

        content.showText(line);
        content.newLineAtOffset(0, -20); // Move down 20 for next line
    }

    content.endText();
    content.close();

    // Save to a uniquely named file
    String filename = "receipt_" + System.currentTimeMillis() + ".pdf";
    doc.save(filename);
    doc.close();
}

    
   public void saveReceiptAsPDF() {
    try {
        // Get user's Documents folder
        String userHome = System.getProperty("user.home");
        String documentsPath = userHome + File.separator + "Documents";
        String fileName = "receipt_" + System.currentTimeMillis() + ".pdf";
        File pdfFile = new File(documentsPath, fileName);

        PDDocument document = new PDDocument();
        PDPage page = new PDPage(PDRectangle.LETTER);
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        // Start writing text
        contentStream.beginText();
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 16);
        contentStream.newLineAtOffset(50, 700);
        contentStream.showText("DISPLAY HUB Receipt");

        contentStream.setFont(PDType1Font.HELVETICA, 12);
        contentStream.newLineAtOffset(0, -25);
        contentStream.showText("National University - MOA");
        contentStream.newLineAtOffset(0, -15);
        contentStream.showText("Pasay City, Manila");
        contentStream.newLineAtOffset(0, -15);
        contentStream.showText("Contact Number: 09069753691");
        contentStream.newLineAtOffset(0, -15);
        contentStream.showText("Website: DisplayHub.com");
        contentStream.newLineAtOffset(0, -15);
        contentStream.showText("Email: displayhub@gmail.com");
        contentStream.newLineAtOffset(0, -30);

        // Table header
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.showText(String.format("%-20s %10s %10s %10s", "Product Name", "Price", "Qty", "Total"));
        contentStream.newLineAtOffset(0, -20);

        // Table content
        DefaultTableModel model = (DefaultTableModel) table_content.getModel();
        contentStream.setFont(PDType1Font.HELVETICA, 12);
        for (int i = 0; i < model.getRowCount(); i++) {
            String productName = model.getValueAt(i, 0).toString();
            String price = model.getValueAt(i, 1).toString();
            String qty = model.getValueAt(i, 2).toString();
            String total = model.getValueAt(i, 3).toString();

            String line = String.format("%-20s %10s %10s %10s", productName, price, qty, total);
            contentStream.showText(line);
            contentStream.newLineAtOffset(0, -15);
        }

        contentStream.endText();
        contentStream.close();

        // Save the PDF file
        document.save(pdfFile);
        document.close();

        // Optional: Show confirmation dialog
        javax.swing.JOptionPane.showMessageDialog(this, "Receipt saved to:\n" + pdfFile.getAbsolutePath());

    } catch (IOException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Error saving PDF: " + e.getMessage());
    }
}
   
    
  public boolean savePanelImageAsPDFWithCustomNameAndAutoClose() {
    try {
        // Prompt for filename
        String fileName = javax.swing.JOptionPane.showInputDialog(this, "Enter filename for the receipt (without extension):");
        if (fileName == null || fileName.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Filename cannot be empty.");
            return false;
        }

        String userHome = System.getProperty("user.home");
        String documentsPath = userHome + File.separator + "Documents";
        File pdfFile = new File(documentsPath, fileName.trim() + ".pdf");

        BufferedImage receiptImage = getReceiptPanelImage();

        PDDocument document = new PDDocument();
        PDPage page = new PDPage(new PDRectangle(receiptImage.getWidth(), receiptImage.getHeight()));
        document.addPage(page);

        PDImageXObject pdImage = PDImageXObject.createFromByteArray(document, bufferedImageToByteArray(receiptImage), "receipt_image");

        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.drawImage(pdImage, 0, 0, receiptImage.getWidth(), receiptImage.getHeight());
        contentStream.close();

        document.save(pdfFile);
        document.close();

        javax.swing.JOptionPane.showMessageDialog(this, "Receipt saved as PDF at:\n" + pdfFile.getAbsolutePath());

        // Attempt to open PDF and return true if successful
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop.getDesktop().open(pdfFile);
            return true;
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Automatic open not supported on this platform.");
            return false;
        }

    } catch (IOException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Error saving PDF: " + e.getMessage());
        return false;
    }
}

// Helper method to convert BufferedImage to byte[]
private byte[] bufferedImageToByteArray(BufferedImage image) throws IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    ImageIO.write(image, "png", baos);
    return baos.toByteArray();
}
   
   
  public void setFullReceiptSummary(
    String referenceNumber,
    String date,
    String time,
    String itemsCount,
    String subtotalAmount,
    String discountAmount,
    String grandTotalAmount,
    String cashierName,
    String customerName,
    String paymentAmount,
    String changeAmount,
    String vatSalesAmount,
    String vatAmount
) {
    refnumber1.setText(referenceNumber);
    date1.setText(date);
    time1.setText(time);
    numberofitem.setText(itemsCount);
    subtotal.setText(subtotalAmount);
    discount.setText(discountAmount);
    grandtotal.setText(grandTotalAmount);

    cashier1.setText(cashierName);
    customerID.setText(customerName); // per your design, customer name goes to time2 label
    cash.setText(paymentAmount);
    change.setText(changeAmount);
    vatsales.setText(vatSalesAmount);
    vatamount.setText(vatAmount);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        table_pane = new javax.swing.JScrollPane();
        table_content = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cashier1 = new javax.swing.JLabel();
        refnumber1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        customerID = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        discount = new javax.swing.JLabel();
        grandtotal = new javax.swing.JLabel();
        cash = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        vatsales = new javax.swing.JLabel();
        vatamount = new javax.swing.JLabel();
        numberofitem = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        time3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 430, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("SALES INVOICE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 190, 30));

        jLabel3.setText("**************************************************************************************");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 850, -1, 20));

        jLabel4.setText("-------------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jLabel5.setText("National University - MOA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel6.setText("Pasay City, Manila");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel7.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 685, 440, 10));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("WE LOVE TO HEAR YOU SACN THE QR CODE BELOW.");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 860, -1, 20));

        jLabel10.setText("Website: DisplayHub.com");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 950, -1, -1));

        jLabel11.setText("Email:displayhub@gmail.com");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 970, -1, -1));

        jLabel13.setText("Date:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        table_pane.setBackground(new java.awt.Color(255, 255, 255));
        table_pane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table_pane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        table_content.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductName", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_pane.setViewportView(table_content);

        jPanel1.add(table_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 410, 340));

        jLabel17.setText("Product Name");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel18.setText("Price");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel19.setText("Quantity ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jLabel20.setText("Total");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        jLabel21.setText("Reference Number:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel22.setText("Customer ID :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 695, -1, -1));

        jLabel23.setText("Time:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setText("DISPLAY HUB");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 10, 170, 30));

        jLabel12.setText("----------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel25.setText("Cashier:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel26.setText("Subtotal:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, -1, -1));

        jLabel27.setText("Discount:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, -1, -1));

        jLabel28.setText("Grand Total:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, -1, -1));

        jLabel29.setText("Cash:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, -1, -1));

        jLabel14.setText("------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 440, 20));

        jLabel30.setText("Number of Item Purchased:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 800, -1, -1));

        jLabel31.setText("Change Due:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, -1, -1));

        jLabel32.setText("Vatable Sales:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 740, -1, -1));

        jLabel33.setText("Vat:   (12%)");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 760, -1, -1));

        jLabel34.setText("Vat Amout: ");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 780, -1, -1));

        jLabel15.setText("**************************************************************************************");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, -1, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("THANKYOU AND PLEASE COME AGAIN.");
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 830, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 880, -1, 70));
        jPanel1.add(cashier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 15));
        jPanel1.add(refnumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, 15));
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 130, 15));
        jPanel1.add(time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 15));
        jPanel1.add(customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 695, 180, 15));
        jPanel1.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 110, 15));
        jPanel1.add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 610, 110, 15));
        jPanel1.add(grandtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 110, 15));
        jPanel1.add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 110, 15));
        jPanel1.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, 110, 15));
        jPanel1.add(vatsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 740, 110, 15));
        jPanel1.add(vatamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 780, 110, 15));
        jPanel1.add(numberofitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 800, 110, 15));

        jLabel35.setText("Customer Name :");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, -1, -1));
        jPanel1.add(time3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 710, 180, 15));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reciept().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cash;
    private javax.swing.JLabel cashier1;
    private javax.swing.JLabel change;
    private javax.swing.JLabel customerID;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel discount;
    private javax.swing.JLabel grandtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numberofitem;
    private javax.swing.JLabel refnumber1;
    private javax.swing.JLabel subtotal;
    private javax.swing.JTable table_content;
    private javax.swing.JScrollPane table_pane;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time3;
    private javax.swing.JLabel vatamount;
    private javax.swing.JLabel vatsales;
    // End of variables declaration//GEN-END:variables
}
