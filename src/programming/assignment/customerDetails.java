package programming.assignment;

import java.awt.Color;

/**
 *
 * @author Sukhman Singh & Vaughn Carroll
 */
public class customerDetails extends javax.swing.JFrame {
    private HotelGrid hotel;

    public customerDetails(HotelGrid hotelObj) {
        hotel = hotelObj;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerdetailsPanel = new javax.swing.JPanel();
        customerdetailsTitle = new javax.swing.JLabel();
        firstnameTextfield = new javax.swing.JTextField();
        lastnameTextfield = new javax.swing.JTextField();
        phonenumberTextfield = new javax.swing.JTextField();
        firstnameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        phonenumberLabel = new javax.swing.JLabel();
        mainmenuButton = new javax.swing.JButton();
        firstnameStatus = new javax.swing.JLabel();
        lastnameStatus = new javax.swing.JLabel();
        phonenumberStatus = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerdetailsTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        customerdetailsTitle.setText("Personal Details");

        firstnameTextfield.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lastnameTextfield.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        phonenumberTextfield.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        firstnameLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        firstnameLabel.setText("First Name");
        firstnameLabel.setToolTipText("");

        lastnameLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lastnameLabel.setText("Last Name");

        phonenumberLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        phonenumberLabel.setText("Phone Number");

        mainmenuButton.setBackground(new java.awt.Color(255, 153, 0));
        mainmenuButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mainmenuButton.setForeground(new java.awt.Color(255, 255, 255));
        mainmenuButton.setText("Main Menu");
        mainmenuButton.setBorderPainted(false);
        mainmenuButton.setFocusPainted(false);
        mainmenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuButtonActionPerformed(evt);
            }
        });

        firstnameStatus.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        lastnameStatus.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        phonenumberStatus.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        phonenumberStatus.setToolTipText("");
        phonenumberStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nextButton.setBackground(new java.awt.Color(255, 153, 0));
        nextButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next");
        nextButton.setBorderPainted(false);
        nextButton.setFocusPainted(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerdetailsPanelLayout = new javax.swing.GroupLayout(customerdetailsPanel);
        customerdetailsPanel.setLayout(customerdetailsPanelLayout);
        customerdetailsPanelLayout.setHorizontalGroup(
            customerdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerdetailsPanelLayout.createSequentialGroup()
                .addGroup(customerdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(customerdetailsPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(customerdetailsPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(customerdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastnameLabel)
                            .addComponent(firstnameLabel)
                            .addComponent(phonenumberLabel))
                        .addGap(31, 31, 31)
                        .addGroup(customerdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstnameStatus)
                            .addComponent(lastnameStatus)
                            .addComponent(phonenumberStatus)
                            .addComponent(lastnameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(phonenumberTextfield)
                            .addComponent(firstnameTextfield))
                        .addGap(26, 26, 26)))
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerdetailsPanelLayout.createSequentialGroup()
                .addGap(0, 262, Short.MAX_VALUE)
                .addComponent(customerdetailsTitle)
                .addGap(262, 262, 262))
        );
        customerdetailsPanelLayout.setVerticalGroup(
            customerdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerdetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerdetailsTitle)
                .addGap(73, 73, 73)
                .addGroup(customerdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstnameStatus)
                .addGap(25, 25, 25)
                .addGroup(customerdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastnameStatus)
                .addGap(25, 25, 25)
                .addGroup(customerdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonenumberTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phonenumberStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(customerdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerdetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerdetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainmenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuButtonActionPerformed
        this.dispose();
        new mainMenu().setVisible(true);
    }//GEN-LAST:event_mainmenuButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        boolean fnameCheck = false;
        boolean lnameCheck = false;
        boolean pnumberCheck = false;

        if(this.firstnameTextfield.getText().length() == 0){
            this.firstnameTextfield.setForeground(Color.red);
            this.firstnameStatus.setForeground(Color.red);
            this.firstnameStatus.setText("Required");
        }else if(this.firstnameTextfield.getText().toUpperCase().matches("[A-Z]+") == false){
            this.firstnameTextfield.setForeground(Color.red);
            this.firstnameStatus.setForeground(Color.red);
            this.firstnameStatus.setText("No spaces, numbers or symbols");
        }else{
            this.firstnameTextfield.setForeground(Color.green);
            this.firstnameStatus.setForeground(Color.green);
            this.firstnameStatus.setText("Valid");
            fnameCheck = true;
        }

        if(this.lastnameTextfield.getText().length() == 0){
            this.lastnameTextfield.setForeground(Color.red);
            this.lastnameStatus.setForeground(Color.red);
            this.lastnameStatus.setText("Required");
        }else if(this.lastnameTextfield.getText().toUpperCase().matches("[A-Z]+") == false){
            this.lastnameTextfield.setForeground(Color.red);
            this.lastnameStatus.setForeground(Color.red);
            this.lastnameStatus.setText("No spaces, numbers or symbols");
        }else{
            this.lastnameTextfield.setForeground(Color.green);
            this.lastnameStatus.setForeground(Color.green);
            this.lastnameStatus.setText("Valid");
            lnameCheck = true;
        }

        if(this.phonenumberTextfield.getText().length() == 0){
            this.phonenumberTextfield.setForeground(Color.red);
            this.phonenumberStatus.setForeground(Color.red);
            this.phonenumberStatus.setText("Required");
        }else if(this.phonenumberTextfield.getText().length() < 6 || this.phonenumberTextfield.getText().length() > 13 || this.phonenumberTextfield.getText().matches("[0-9]+") == false){
            this.phonenumberTextfield.setForeground(Color.red);
            this.phonenumberStatus.setForeground(Color.red);
            this.phonenumberStatus.setText("Please enter 6-13 digits");
        }else{
            
            if(hotel.checkPhoneNum(this.phonenumberTextfield.getText())){
                this.phonenumberTextfield.setForeground(Color.red);
                this.phonenumberStatus.setForeground(Color.red);
                this.phonenumberStatus.setText("A booking with that number already exists");
            }else{
                this.phonenumberTextfield.setForeground(Color.green);
                this.phonenumberStatus.setForeground(Color.green);
                this.phonenumberStatus.setText("Valid");
                pnumberCheck = true;
            }
        }

        if(fnameCheck && lnameCheck && pnumberCheck){
            this.dispose();
            new roomDetails(hotel, this.firstnameTextfield.getText(), this.lastnameTextfield.getText(), this.phonenumberTextfield.getText()).setVisible(true);
        }
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel customerdetailsPanel;
    private javax.swing.JLabel customerdetailsTitle;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JLabel firstnameStatus;
    private javax.swing.JTextField firstnameTextfield;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JLabel lastnameStatus;
    private javax.swing.JTextField lastnameTextfield;
    private javax.swing.JButton mainmenuButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel phonenumberLabel;
    private javax.swing.JLabel phonenumberStatus;
    private javax.swing.JTextField phonenumberTextfield;
    // End of variables declaration//GEN-END:variables
}
