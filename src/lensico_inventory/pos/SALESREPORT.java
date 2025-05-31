/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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


public class SALESREPORT extends javax.swing.JFrame {

  private JDateChooser startDateChooser;
private JDateChooser endDateChooser;
     
    public SALESREPORT() {
        initComponents();
         loadSalesReportFromFile();
         
         
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
                "Cashier Name", "Transaction Number", "Customer ID", "Product ID", "Price", "Quantity", "Total", "Date"
            }
        ));
        jScrollPane1.setViewportView(salesreport);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 49, 865, 590));

        totalsales.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        totalsales.setForeground(new java.awt.Color(255, 255, 255));
        totalsales.setText("jLabel1");
        getContentPane().add(totalsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 690, 120, 30));

        salestoday.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        salestoday.setForeground(new java.awt.Color(255, 255, 255));
        salestoday.setText("jLabel1");
        getContentPane().add(salestoday, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 690, 120, 30));

        startdate.setText("Start Date");
        getContentPane().add(startdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 90, -1));

        enddate.setText("End Date");
        getContentPane().add(enddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 700, 80, -1));

        cstartdate.setText("jButton2");
        cstartdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstartdateActionPerformed(evt);
            }
        });
        getContentPane().add(cstartdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 40, -1));

        cenddate.setText("jButton3");
        cenddate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenddateActionPerformed(evt);
            }
        });
        getContentPane().add(cenddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, 30, -1));

        printr.setText("jButton2");
        printr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printrActionPerformed(evt);
            }
        });
        getContentPane().add(printr, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 750, 180, -1));

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

        // Add title
        doc.add(new Paragraph("Sales Report from " + startDate + " to " + endDate).setBold().setFontSize(16));

        // Create table with 8 columns (matching your JTable columns)
        Table table = new Table(8);
        // Add headers
        String[] headers = {"Cashier Name", "Transaction Number", "Customer ID", "Product ID", "Price", "Quantity", "Total", "Date"};
        for (String header : headers) {
            table.addHeaderCell(new Cell().add(new Paragraph(header).setBold()));
        }

        DefaultTableModel model = (DefaultTableModel) salesreport.getModel();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ZoneId phZone = ZoneId.of("Asia/Manila");

        for (int i = 0; i < model.getRowCount(); i++) {
            String dateStr = model.getValueAt(i, 7).toString();
            LocalDate rowDate = LocalDate.parse(dateStr, formatter);

            if ((rowDate.isEqual(startDate) || rowDate.isAfter(startDate)) &&
                (rowDate.isEqual(endDate) || rowDate.isBefore(endDate))) {
                // Add the row cells
                IntStream.range(0, model.getColumnCount())
                    .forEach(col -> table.addCell(model.getValueAt(i, col).toString()));
            }
        }

        doc.add(table);
        doc.close();

        JOptionPane.showMessageDialog(this, "PDF Report generated:\n" + dest);

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
