
package lensico_inventory.pos;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileOutputStream;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.properties.TextAlignment;


public class SALESREPORT extends javax.swing.JFrame {
 public static SALESREPORT instance;

  private JDateChooser startDateChooser;
private JDateChooser endDateChooser;
     
    public SALESREPORT() {
        initComponents();
         loadSalesReportFromFile();

         instance = this; // assign instance on creation

         
         startDateChooser = new JDateChooser();
endDateChooser = new JDateChooser();

// Optionally set date format
startDateChooser.setDateFormatString("yyyy-MM-dd");
endDateChooser.setDateFormatString("yyyy-MM-dd");
    }

    


    
 public void loadSalesReportFromFile() {
    DefaultTableModel model = (DefaultTableModel) salesreport.getModel();
    model.setRowCount(0); // Clear existing rows

    File file = new File("src/file_storage/salesreport.txt");
    if (!file.exists()) return;

    double grandTotal = 0.0;
    double todayTotal = 0.0;

    // Get today's date in Philippines timezone
    ZoneId phZone = ZoneId.of("Asia/Manila");
    LocalDate today = LocalDate.now(phZone);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Adjust if your date format is different

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("%%");
            if (data.length == 8) {
                model.addRow(data);

                try {
                    // Parse total sales from column index 6
                    double totalValue = Double.parseDouble(data[6]);
                    grandTotal += totalValue;

                    // Parse date from column index 7
                    LocalDate saleDate = LocalDate.parse(data[7], formatter);

                    if (saleDate.equals(today)) {
                        todayTotal += totalValue;
                    }
                } catch (NumberFormatException | java.time.format.DateTimeParseException e) {
                    // If parsing fails, skip this row's calculations
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading sales report: " + e.getMessage());
    }

    // Update the labels with formatted currency strings
    totalsales.setText(String.format("₱%.2f", grandTotal));
    salestoday.setText(String.format("₱%.2f", todayTotal));
}
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        invoice = new javax.swing.JButton();
        product = new javax.swing.JButton();
        creturn = new javax.swing.JButton();
        usersetting = new javax.swing.JButton();
        employeee = new javax.swing.JButton();
        accounthistory = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesreport = new javax.swing.JTable();
        totalsales = new javax.swing.JLabel();
        salestoday = new javax.swing.JLabel();
        startdate = new javax.swing.JLabel();
        enddate = new javax.swing.JLabel();
        cstartdate = new javax.swing.JButton();
        cenddate = new javax.swing.JButton();
        printr = new javax.swing.JButton();
        icon = new javax.swing.JLabel();

        jButton1.setText("jButton1");

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
        getContentPane().add(invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 270, 40));

        product.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        product.setContentAreaFilled(false);
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        getContentPane().add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 270, 40));

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

        salesreport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction Number", "Customer ID", "Product ID", "Price", "Quantity", "Total", "Date"
            }
        ));
        jScrollPane1.setViewportView(salesreport);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 49, 865, 590));

        totalsales.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        totalsales.setForeground(new java.awt.Color(255, 255, 255));
        totalsales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalsales.setToolTipText("");
        getContentPane().add(totalsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 680, 180, 50));

        salestoday.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        salestoday.setForeground(new java.awt.Color(255, 255, 255));
        salestoday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salestoday.setToolTipText("");
        getContentPane().add(salestoday, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 680, 140, 50));

        startdate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        startdate.setText("Start Date");
        getContentPane().add(startdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 665, 90, -1));

        enddate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        enddate.setText("End Date");
        getContentPane().add(enddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 700, 80, -1));

        cstartdate.setToolTipText("");
        cstartdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cstartdate.setContentAreaFilled(false);
        cstartdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstartdateActionPerformed(evt);
            }
        });
        getContentPane().add(cstartdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 663, 40, 30));

        cenddate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cenddate.setContentAreaFilled(false);
        cenddate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenddateActionPerformed(evt);
            }
        });
        getContentPane().add(cenddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 700, 40, 20));

        printr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        printr.setContentAreaFilled(false);
        printr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printrActionPerformed(evt);
            }
        });
        getContentPane().add(printr, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 733, 160, 40));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/SALES REPORT.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

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

    private void cstartdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstartdateActionPerformed
       Date selectedDate = showDatePickerDialog(startDateChooser, "Select Start Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        startdate.setText(sdf.format(selectedDate));
        
        // Optional: reset end date if it is before start date
        String endDateText = enddate.getText();
        if (!endDateText.isEmpty()) {
            try {
                Date endDate = sdf.parse(endDateText);
                if (endDate.before(selectedDate)) {
                    enddate.setText("");
                }
            } catch (Exception ex) { }
        }
    }
    }//GEN-LAST:event_cstartdateActionPerformed

    private void cenddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenddateActionPerformed
       String startDateText = startdate.getText();
    if (startDateText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select the Start Date first.");
        return;
    }
    Date selectedDate = showDatePickerDialog(endDateChooser, "Select End Date");
    if (selectedDate != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date startDate = sdf.parse(startDateText);
            if (selectedDate.before(startDate)) {
                JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
                return;
            }
            enddate.setText(sdf.format(selectedDate));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Start Date.");
        }
    }
    }//GEN-LAST:event_cenddateActionPerformed

    private void printrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printrActionPerformed
         String startDateStr = startdate.getText();
    String endDateStr = enddate.getText();

    if (startDateStr.isEmpty() || endDateStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select both Start Date and End Date.");
        return;
    }

    try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);
        LocalDate endDate = LocalDate.parse(endDateStr, formatter);

        if (endDate.isBefore(startDate)) {
            JOptionPane.showMessageDialog(this, "End Date cannot be before Start Date.");
            return;
        }

        generatePdfReport(startDate, endDate);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Invalid date format.");
    }
    }//GEN-LAST:event_printrActionPerformed

    
    private Date showDatePickerDialog(JDateChooser dateChooser, String title) {
    int result = JOptionPane.showConfirmDialog(
        this, 
        dateChooser, 
        title, 
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
        return dateChooser.getDate();
    }
    return null;
}
    
    
 private void generatePdfReport(LocalDate startDate, LocalDate endDate) {
    try {
        String dest = "sales_report_" + startDate + "_to_" + endDate + ".pdf";
        PdfWriter writer = new PdfWriter(new FileOutputStream(dest));
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document doc = new Document(pdfDoc);

        // Title
        doc.add(new Paragraph("DISPLAY HUB")
            .setFontSize(20)
            .setBold()
            .setTextAlignment(TextAlignment.CENTER));
        doc.add(new Paragraph(" "));

        // Subtitle
        String subtitleText = "Sales Report " + startDate + " to " + endDate;
        doc.add(new Paragraph(subtitleText)
            .setFontSize(18)
            .setTextAlignment(TextAlignment.CENTER));
        doc.add(new Paragraph(" "));

        DefaultTableModel model = (DefaultTableModel) salesreport.getModel();

        double totalSalesInRange = 0.0;

        DateTimeFormatter isoFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter altFormatter = DateTimeFormatter.ofPattern("MMM d, yyyy"); // fallback if needed

        // First, accumulate total sales of filtered rows
        for (int i = 0; i < model.getRowCount(); i++) {
            String dateStrRaw = model.getValueAt(i, 7).toString().trim();
            LocalDate rowDate = null;

            // Try parsing with isoFormatter first
            try {
                rowDate = LocalDate.parse(dateStrRaw, isoFormatter);
            } catch (Exception e1) {
                // try fallback format
                try {
                    rowDate = LocalDate.parse(dateStrRaw, altFormatter);
                } catch (Exception e2) {
                    // skip this row if date can't be parsed
                    continue;
                }
            }

            if ((rowDate.isEqual(startDate) || rowDate.isAfter(startDate)) &&
                (rowDate.isEqual(endDate) || rowDate.isBefore(endDate))) {
                try {
                    double rowTotal = Double.parseDouble(model.getValueAt(i, 6).toString());
                    totalSalesInRange += rowTotal;
                } catch (NumberFormatException ex) {
                    // skip total parse error
                }
            }
        }

        // Add total sales paragraph
        Paragraph totalSalesParagraph = new Paragraph()
            .add("TOTAL SALES: ")
            .setFontSize(16)
            .setBold()
            .setTextAlignment(TextAlignment.LEFT);
        totalSalesParagraph.add(String.format("₱%.2f", totalSalesInRange));
        doc.add(totalSalesParagraph);
        doc.add(new Paragraph(" "));

        // Add the filtered rows with details
        for (int i = 0; i < model.getRowCount(); i++) {
            String dateStrRaw = model.getValueAt(i, 7).toString().trim();
            LocalDate rowDate = null;

            try {
                rowDate = LocalDate.parse(dateStrRaw, isoFormatter);
            } catch (Exception e1) {
                try {
                    rowDate = LocalDate.parse(dateStrRaw, altFormatter);
                } catch (Exception e2) {
                    continue;
                }
            }

            if ((rowDate.isEqual(startDate) || rowDate.isAfter(startDate)) &&
                (rowDate.isEqual(endDate) || rowDate.isBefore(endDate))) {

                
                doc.add(new Paragraph("Transaction Number: " + model.getValueAt(i, 0).toString()));
                doc.add(new Paragraph("Customer ID: " + model.getValueAt(i, 1).toString()));
                doc.add(new Paragraph("Product ID: " + model.getValueAt(i, 2).toString()));
                doc.add(new Paragraph("Price: " + model.getValueAt(i, 3).toString()));
                doc.add(new Paragraph("Quantity: " + model.getValueAt(i, 4).toString()));
                doc.add(new Paragraph("Total: " + model.getValueAt(i, 5).toString()));
                doc.add(new Paragraph("Date: " + model.getValueAt(i, 6).toString()));

                doc.add(new Paragraph("----------------------------------------------------------------------------------------"));
                doc.add(new Paragraph(" "));
            }
        }

        doc.close();

        JOptionPane.showMessageDialog(this, "PDF Report generated:\n" + dest);

        // Open PDF automatically
        try {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            java.io.File pdfFile = new java.io.File(dest);
            if (pdfFile.exists()) {
                desktop.open(pdfFile);
            } else {
                JOptionPane.showMessageDialog(this, "Cannot find generated PDF to open.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Could not open PDF file automatically:\n" + ex.getMessage());
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error generating PDF: " + e.getMessage());
    }
}

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SALESREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALESREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALESREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALESREPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SALESREPORT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accounthistory;
    private javax.swing.JButton cenddate;
    private javax.swing.JButton creturn;
    private javax.swing.JButton cstartdate;
    private javax.swing.JButton customer;
    private javax.swing.JButton employeee;
    private javax.swing.JLabel enddate;
    private javax.swing.JLabel icon;
    private javax.swing.JButton invoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton printr;
    private javax.swing.JButton product;
    public javax.swing.JTable salesreport;
    private javax.swing.JLabel salestoday;
    private javax.swing.JLabel startdate;
    private javax.swing.JLabel totalsales;
    private javax.swing.JButton usersetting;
    // End of variables declaration//GEN-END:variables
}
