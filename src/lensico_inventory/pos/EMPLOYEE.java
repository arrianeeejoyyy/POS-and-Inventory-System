
package lensico_inventory.pos;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EMPLOYEE extends javax.swing.JFrame {
        private static final int baseEmployeeId = 11292200;
        private static int EmployeeCounter = 1;
   
    public EMPLOYEE() {
        initComponents();
            loadEmployeeCounter(); // Load last saved counter
            generateCustomerId();  // Generate ID based on that
          eid.setEditable(false);
          
           // Block non-digit input in contact number
        mobilenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                    e.consume(); // Prevent input
                    JOptionPane.showMessageDialog(null, "Only numeric values are allowed for Contact Number.");
                }
            }
        });
        
         age.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                    e.consume(); // Prevent input
                    JOptionPane.showMessageDialog(null, "Only numeric values are allowed for Contact Number.");
                }
            }
        });
         
          accno.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                    e.consume(); // Prevent input
                    JOptionPane.showMessageDialog(null, "Only numeric values are allowed for Contact Number.");
                }
            }
        });
          
           cpnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && !Character.isISOControl(c)) {
                    e.consume(); // Prevent input
                    JOptionPane.showMessageDialog(null, "Only numeric values are allowed for Contact Number.");
                }
            }
        });
  
                // name: no digits
         name.addKeyListener(new java.awt.event.KeyAdapter() {
             @Override
             public void keyTyped(java.awt.event.KeyEvent e) {
                 char c = e.getKeyChar();
                 if (Character.isDigit(c)) {
                     e.consume();
                     JOptionPane.showMessageDialog(null, "Numbers are not allowed in the Name field.");
                 }
             }
         });
         
         position.addKeyListener(new java.awt.event.KeyAdapter() {
             @Override
             public void keyTyped(java.awt.event.KeyEvent e) {
                 char c = e.getKeyChar();
                 if (Character.isDigit(c)) {
                     e.consume();
                     JOptionPane.showMessageDialog(null, "Numbers are not allowed in the Name field.");
                 }
             }
         });
         
         sex.addKeyListener(new java.awt.event.KeyAdapter() {
             @Override
             public void keyTyped(java.awt.event.KeyEvent e) {
                 char c = e.getKeyChar();
                 if (Character.isDigit(c)) {
                     e.consume();
                     JOptionPane.showMessageDialog(null, "Numbers are not allowed in the Name field.");
                 }
             }
         });
         
         bankacc.addKeyListener(new java.awt.event.KeyAdapter() {
             @Override
             public void keyTyped(java.awt.event.KeyEvent e) {
                 char c = e.getKeyChar();
                 if (Character.isDigit(c)) {
                     e.consume();
                     JOptionPane.showMessageDialog(null, "Numbers are not allowed in the Name field.");
                 }
             }
         });
         
         cperson.addKeyListener(new java.awt.event.KeyAdapter() {
             @Override
             public void keyTyped(java.awt.event.KeyEvent e) {
                 char c = e.getKeyChar();
                 if (Character.isDigit(c)) {
                     e.consume();
                     JOptionPane.showMessageDialog(null, "Numbers are not allowed in the Name field.");
                 }
             }
         });
          
          eid.setOpaque(false);
        eid.setBackground(new Color (0,0,0,0));
        
        name.setOpaque(false);
        name.setBackground(new Color (0,0,0,0));
        
         mobilenumber.setOpaque(false);
        mobilenumber.setBackground(new Color (0,0,0,0));
        
        email.setOpaque(false);
        email.setBackground(new Color (0,0,0,0));
        
         age.setOpaque(false);
        age.setBackground(new Color (0,0,0,0));
        
        bankacc.setOpaque(false);
        bankacc.setBackground(new Color (0,0,0,0));
        
         accno.setOpaque(false);
        accno.setBackground(new Color (0,0,0,0));
        
        cperson.setOpaque(false);
        cperson.setBackground(new Color (0,0,0,0));
        
        cpnumber.setOpaque(false);
        cpnumber.setBackground(new Color (0,0,0,0)); 
         
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JButton();
        accounthistory = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        invoice = new javax.swing.JButton();
        product = new javax.swing.JButton();
        stockmanagement = new javax.swing.JButton();
        creturn = new javax.swing.JButton();
        usersetting = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        mobilenumber = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        bankacc = new javax.swing.JTextField();
        accno = new javax.swing.JTextField();
        cpnumber = new javax.swing.JTextField();
        cperson = new javax.swing.JTextField();
        efd = new javax.swing.JButton();
        save = new javax.swing.JButton();
        ereport = new javax.swing.JButton();
        age = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        eid = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        position = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 1215, 838));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logout.setContentAreaFilled(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 270, 30));

        accounthistory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        accounthistory.setContentAreaFilled(false);
        accounthistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accounthistoryActionPerformed(evt);
            }
        });
        getContentPane().add(accounthistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 270, 40));

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
        getContentPane().add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 40));

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

        clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clear.setContentAreaFilled(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 570, 160, 30));

        mobilenumber.setBackground(new java.awt.Color(0, 0, 0));
        mobilenumber.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        mobilenumber.setForeground(new java.awt.Color(255, 255, 255));
        mobilenumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(mobilenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 266, 330, 30));
        mobilenumber.setOpaque(false);

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 180, 330, 30));
        name.setOpaque(false);

        email.setBackground(new java.awt.Color(0, 0, 0));
        email.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 309, 330, 30));
        email.setOpaque(false);

        bankacc.setBackground(new java.awt.Color(0, 0, 0));
        bankacc.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        bankacc.setForeground(new java.awt.Color(255, 255, 255));
        bankacc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(bankacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 395, 330, 30));
        bankacc.setOpaque(false);

        accno.setBackground(new java.awt.Color(0, 0, 0));
        accno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        accno.setForeground(new java.awt.Color(255, 255, 255));
        accno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(accno, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 438, 330, 30));
        accno.setOpaque(false);

        cpnumber.setBackground(new java.awt.Color(0, 0, 0));
        cpnumber.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cpnumber.setForeground(new java.awt.Color(255, 255, 255));
        cpnumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(cpnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 524, 330, 30));
        cpnumber.setOpaque(false);

        cperson.setBackground(new java.awt.Color(0, 0, 0));
        cperson.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cperson.setForeground(new java.awt.Color(255, 255, 255));
        cperson.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(cperson, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 481, 330, 30));
        cperson.setOpaque(false);

        efd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        efd.setContentAreaFilled(false);
        efd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efdActionPerformed(evt);
            }
        });
        getContentPane().add(efd, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 740, 400, 40));

        save.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        save.setContentAreaFilled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 170, 30));

        ereport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ereport.setContentAreaFilled(false);
        ereport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ereportActionPerformed(evt);
            }
        });
        getContentPane().add(ereport, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 740, 390, 30));

        age.setBackground(new java.awt.Color(0, 0, 0));
        age.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 352, 120, 30));
        age.setOpaque(false);

        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 690, 20, 20));

        eid.setBackground(new java.awt.Color(0, 0, 0));
        eid.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        eid.setForeground(new java.awt.Color(255, 255, 255));
        eid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidActionPerformed(evt);
            }
        });
        getContentPane().add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 140, 330, 30));
        eid.setOpaque(false);

        sex.setBackground(new java.awt.Color(102, 102, 102));
        sex.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        sex.setForeground(new java.awt.Color(255, 255, 255));
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Male", "Female" }));
        sex.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 354, 110, -1));

        position.setBackground(new java.awt.Color(102, 102, 102));
        position.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        position.setForeground(new java.awt.Color(255, 255, 255));
        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Position", "Counter", "Bagger", "Manager" }));
        position.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(position, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 225, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesss_panel/EMPLOYEE.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void accounthistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accounthistoryActionPerformed
        this.setVisible(false);
        ACCHISTORY AH = new ACCHISTORY();
        AH.setVisible(true);
    }//GEN-LAST:event_accounthistoryActionPerformed

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

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
         // Check if terms checkbox is selected
    // Check if terms checkbox is selected
    if (!jCheckBox1.isSelected()) {
        JOptionPane.showMessageDialog(null, "You must agree to the terms to proceed.");
        return;  // Stop further execution if not checked
    }

    String id = eid.getText().trim();
    String user = name.getText().trim();
    String num = mobilenumber.getText().trim();
    String mail = email.getText().trim();
    String aa = age.getText().trim();
    String ba = bankacc.getText().trim();
    String an = accno.getText().trim();
    String cp = cperson.getText().trim();
    String cpn = cpnumber.getText().trim();
    String poss = (String) position.getSelectedItem();
    String ge = (String) sex.getSelectedItem();

    // Validation patterns
    String namePattern = "^[a-zA-Z ]+$";
    String numberPattern = "^09\\d{9}$";
    String digitsOnlyPattern = "^\\d+$";

    // Validate combo box selections
    if (poss.equals("Select Position")) {
        JOptionPane.showMessageDialog(null, "Please select a valid Position.");
        return;
    }
    if (ge.equals("Please Select")) {
        JOptionPane.showMessageDialog(null, "Please select a valid Sex.");
        return;
    }

    if (user.isEmpty() || !user.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Name must not be empty and contain only letters and spaces.");
        name.setText("");
        return;
    } else if (ba.isEmpty() || !ba.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Bank Account name must not be empty and contain only letters and spaces.");
        bankacc.setText("");
        return;
    } else if (cp.isEmpty() || !cp.matches(namePattern)) {
        JOptionPane.showMessageDialog(null, "Contact Person must not be empty and contain only letters and spaces.");
        cperson.setText("");
        return;
    } else if (mail.isEmpty() || !mail.endsWith("@gmail.com")) {
        JOptionPane.showMessageDialog(null, "Email must end with @gmail.com.");
        email.setText("");
        return;
    } else if (!num.matches(numberPattern)) {
        JOptionPane.showMessageDialog(null, "Mobile number must start with 09 and be exactly 11 digits.");
        mobilenumber.setText("");
        return;
    } else if (!cpn.matches(numberPattern)) {
        JOptionPane.showMessageDialog(null, "Contact Person's number must start with 09 and be exactly 11 digits.");
        cpnumber.setText("");
        return;
    } else if (num.equals(cpn)) {
        JOptionPane.showMessageDialog(null, "Contact Person's number must not be the same as the Mobile number.");
        mobilenumber.setText("");
        cpnumber.setText("");
        return;
    } else if (user.equalsIgnoreCase(cp)) {
        JOptionPane.showMessageDialog(null, "Contact Person's name must not be the same as the Name.");
        name.setText("");
        cperson.setText("");
        return;
    } else if (!an.matches(digitsOnlyPattern)) {
        JOptionPane.showMessageDialog(null, "Account Number must contain digits only.");
        accno.setText("");
        return;
    } else if (!aa.matches(digitsOnlyPattern)) {
        JOptionPane.showMessageDialog(null, "Age must contain digits only.");
        age.setText("");
        return;
    } else {
        // Format data string to save and add to table
        String data = id + "%%" + user + "%%" + poss + "%%" + num + "%%" + mail + "%%" + aa + "%%" + ge + "%%" + ba + "%%" + an + "%%" + cp + "%%" + cpn;

        // Add to JTable (your existing code references EMPLOYEEFULLD for this)
        EMPLOYEEFULLD FULLD = new EMPLOYEEFULLD();
        FULLD.AddRowToJTable(new Object[] { data });

        // Save employee data to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/file_storage/employeee.txt", true))) {
            writer.write(data);
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Successfully saved.");

            EmployeeCounter++;
            saveEmployeeCounter();
            generateCustomerId();

            // Now update ACCHISTORY JTable for employee history
            ACCHISTORY historyWindow = new ACCHISTORY();
            loadHistoryETableFromFile(historyWindow);

            // Prepare row data: id, date, time, status "Active"
            String date = java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            String time = java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"));
            String status = "Active";

            javax.swing.table.DefaultTableModel historyModel = (javax.swing.table.DefaultTableModel) historyWindow.historyE.getModel();
            historyModel.addRow(new Object[] { id, date, time, status });

            saveHistoryETableToFile(historyWindow);

            // Clear input fields
            name.setText("");
            mobilenumber.setText("");
            email.setText("");
            age.setText("");
            bankacc.setText("");
            accno.setText("");
            cperson.setText("");
            cpnumber.setText("");
            position.setSelectedIndex(0);
            sex.setSelectedIndex(0);
            jCheckBox1.setSelected(false);

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving data.");
        }
    }
    }//GEN-LAST:event_saveActionPerformed

    private void ereportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ereportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ereportActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void efdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efdActionPerformed
        EMPLOYEEFULLD efd = new EMPLOYEEFULLD();
        efd.setVisible(true);
    }//GEN-LAST:event_efdActionPerformed

    private void eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eidActionPerformed

   private void generateCustomerId() {
    String generatedId = String.valueOf(baseEmployeeId + EmployeeCounter);
    eid.setText(generatedId);
}
    
    
   private void saveEmployeeCounter() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/file_storage/employee_counter.txt"))) {
        writer.write(String.valueOf(EmployeeCounter));
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private void loadEmployeeCounter() {
    try {
        java.io.File file = new java.io.File("src/file_storage/employee_counter.txt");
        if (file.exists()) {
            java.util.Scanner scanner = new java.util.Scanner(file);
            if (scanner.hasNextInt()) {
                EmployeeCounter = scanner.nextInt();
            }
            scanner.close();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public void saveHistoryETableToFile(ACCHISTORY historyWindow) {
    String filePath = "src/file_storage/historyE.txt";
    DefaultTableModel model = (DefaultTableModel) historyWindow.historyE.getModel();

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                writer.write(model.getValueAt(i, j).toString());
                if (j < model.getColumnCount() - 1) {
                    writer.write("%%");
                }
            }
            writer.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error saving historyE to file: " + e.getMessage());
    }
}

// 2. Load historyE JTable data from file
public void loadHistoryETableFromFile(ACCHISTORY historyWindow) {
    String filePath = "src/file_storage/historyE.txt";
    DefaultTableModel model = (DefaultTableModel) historyWindow.historyE.getModel();
    model.setRowCount(0); // Clear existing rows

    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] rowData = line.split("%%");
            model.addRow(rowData);
        }
    } catch (IOException e) {
        // If file not found, no problem on first run
    }
}

   
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EMPLOYEE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accno;
    private javax.swing.JButton accounthistory;
    private javax.swing.JTextField age;
    private javax.swing.JTextField bankacc;
    private javax.swing.JButton clear;
    private javax.swing.JTextField cperson;
    private javax.swing.JTextField cpnumber;
    private javax.swing.JButton creturn;
    private javax.swing.JButton customer;
    private javax.swing.JButton efd;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField email;
    private javax.swing.JButton ereport;
    private javax.swing.JButton invoice;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField mobilenumber;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JButton product;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JButton stockmanagement;
    private javax.swing.JButton usersetting;
    // End of variables declaration//GEN-END:variables
}
