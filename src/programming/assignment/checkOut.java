package programming.assignment;

import java.awt.Color;

/**
 *
 * @author Sukhman Singh & Vaughn Carroll
 */
public class checkOut extends javax.swing.JFrame {
    private HotelGrid hotel;
    private String number;
    
    public checkOut(HotelGrid hotelObj) {
        hotel = hotelObj;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkoutPanel = new javax.swing.JPanel();
        phonenumberTextfield = new javax.swing.JTextField();
        phonenumberLabel = new javax.swing.JLabel();
        customerdetailsTitle = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        mainmenuButton = new javax.swing.JButton();
        phonenumberStatus = new javax.swing.JLabel();
        customerPanel = new javax.swing.JPanel();
        this.customerPanel.setVisible(false);
        customerLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        roomPanel = new javax.swing.JPanel();
        this.roomPanel.setVisible(false);
        jLabel1 = new javax.swing.JLabel();
        packageLabel = new javax.swing.JLabel();
        floorLabel = new javax.swing.JLabel();
        roomLabel = new javax.swing.JLabel();
        extraLabel = new javax.swing.JLabel();
        nightLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        checkoutPanel.setMaximumSize(new java.awt.Dimension(700, 500));
        checkoutPanel.setMinimumSize(new java.awt.Dimension(700, 500));
        checkoutPanel.setPreferredSize(new java.awt.Dimension(700, 500));

        phonenumberTextfield.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        phonenumberLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        phonenumberLabel.setText("Phone Number");

        customerdetailsTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        customerdetailsTitle.setText("Check-Out");

        checkButton.setBackground(new java.awt.Color(255, 153, 0));
        checkButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        checkButton.setForeground(new java.awt.Color(255, 255, 255));
        checkButton.setText("Check");
        checkButton.setBorderPainted(false);
        checkButton.setFocusPainted(false);
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        checkoutButton.setBackground(new java.awt.Color(255, 153, 0));
        checkoutButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        checkoutButton.setForeground(new java.awt.Color(255, 255, 255));
        checkoutButton.setText("Check-Out");
        checkoutButton.setBorderPainted(false);
        checkoutButton.setEnabled(false);
        checkoutButton.setFocusPainted(false);
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

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

        phonenumberStatus.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        phonenumberStatus.setToolTipText("");
        phonenumberStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        customerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        customerPanel.setMaximumSize(new java.awt.Dimension(260, 156));
        customerPanel.setMinimumSize(new java.awt.Dimension(260, 156));
        customerPanel.setPreferredSize(new java.awt.Dimension(260, 156));

        customerLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        customerLabel.setText("Customer Details");

        nameLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nameLabel.setText("Sukhman Vaughn");

        numberLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        numberLabel.setText("02102102102");

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(customerLabel))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(numberLabel))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameLabel)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerLabel)
                .addGap(23, 23, 23)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberLabel)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        roomPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        roomPanel.setMaximumSize(new java.awt.Dimension(260, 156));
        roomPanel.setMinimumSize(new java.awt.Dimension(260, 156));
        roomPanel.setPreferredSize(new java.awt.Dimension(260, 156));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Room Details");

        packageLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        packageLabel.setText("Silver Package");

        floorLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        floorLabel.setText("Floor 1");

        roomLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        roomLabel.setText("Room 1");

        extraLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        extraLabel.setText("Extra People: None");

        nightLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nightLabel.setText("Nights Staying: 3");

        javax.swing.GroupLayout roomPanelLayout = new javax.swing.GroupLayout(roomPanel);
        roomPanel.setLayout(roomPanelLayout);
        roomPanelLayout.setHorizontalGroup(
            roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomPanelLayout.createSequentialGroup()
                .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(packageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(floorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomLabel))
                    .addGroup(roomPanelLayout.createSequentialGroup()
                        .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roomPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(extraLabel))
                            .addGroup(roomPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nightLabel))
                            .addGroup(roomPanelLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roomPanelLayout.setVerticalGroup(
            roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageLabel)
                    .addComponent(floorLabel)
                    .addComponent(roomLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extraLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nightLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout checkoutPanelLayout = new javax.swing.GroupLayout(checkoutPanel);
        checkoutPanel.setLayout(checkoutPanelLayout);
        checkoutPanelLayout.setHorizontalGroup(
            checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutPanelLayout.createSequentialGroup()
                        .addComponent(customerdetailsTitle)
                        .addGap(293, 293, 293))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutPanelLayout.createSequentialGroup()
                        .addComponent(phonenumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phonenumberStatus)
                            .addGroup(checkoutPanelLayout.createSequentialGroup()
                                .addComponent(phonenumberTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutPanelLayout.createSequentialGroup()
                        .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(roomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        checkoutPanelLayout.setVerticalGroup(
            checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerdetailsTitle)
                .addGap(39, 39, 39)
                .addGroup(checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonenumberTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenumberLabel)
                    .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phonenumberStatus)
                .addGap(38, 38, 38)
                .addGroup(checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(checkoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        boolean pnumberCheck = false;
        this.checkoutButton.setEnabled(false);
        this.customerPanel.setVisible(false);
        this.roomPanel.setVisible(false);
        
        if(this.phonenumberTextfield.getText().length() == 0){
            this.phonenumberTextfield.setForeground(Color.red);
            this.phonenumberStatus.setForeground(Color.red);
            this.phonenumberStatus.setText("Required");
        }
        else if(this.phonenumberTextfield.getText().length() < 6 || this.phonenumberTextfield.getText().length() > 13 || this.phonenumberTextfield.getText().matches("[0-9]+") == false){
            this.phonenumberTextfield.setForeground(Color.red);
            this.phonenumberStatus.setForeground(Color.red);
            this.phonenumberStatus.setText("Please enter 6-13 digits");
        }
        else{
            if(hotel.checkPhoneNum(this.phonenumberTextfield.getText())){
                this.phonenumberTextfield.setForeground(Color.green);
                this.phonenumberStatus.setForeground(Color.green);
                this.phonenumberStatus.setText("Booking found");
                number = this.phonenumberTextfield.getText();
                pnumberCheck = true;
            }
            else{
                this.phonenumberTextfield.setForeground(Color.red);
                this.phonenumberStatus.setForeground(Color.red);
                this.phonenumberStatus.setText("No booking found");
            }
        }
        
        if(pnumberCheck){
            this.checkoutButton.setEnabled(true);
            this.customerPanel.setVisible(true);
            for(int f = 0; f < hotel.getTotalFloors(); ++f){
                for(int r = 0; r < hotel.getTotalRooms(); ++r){
                    if(!hotel.getHotelGrid(f, r).getCustInfo().getArrCustInfo().isEmpty()){
                        if(hotel.getHotelGrid(f, r).getCustInfo().getArrCustInfo().get(2).equalsIgnoreCase(number)){
                            this.nameLabel.setText(hotel.getHotelGrid(f, r).getCustInfo().getArrCustInfo().get(0)+" "+hotel.getHotelGrid(f, r).getCustInfo().getArrCustInfo().get(1));
                            this.numberLabel.setText(hotel.getHotelGrid(f, r).getCustInfo().getArrCustInfo().get(2));
                            this.packageLabel.setText(hotel.getHotelGrid(f, r).toString()+" Package");
                            this.floorLabel.setText("Floor "+(f+1));
                            this.roomLabel.setText("Room "+(r+1));
                            int temp = (Integer.parseInt(hotel.getHotelGrid(f, r).getCustInfo().getArrCustInfo().get(5)))-1;
                            this.extraLabel.setText("Extra People: "+temp);
                            this.nightLabel.setText("Nights Staying: "+hotel.getHotelGrid(f, r).getCustInfo().getArrCustInfo().get(6));
                        }
                    }
                }
            }
            this.roomPanel.setVisible(true);
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        hotel.removeBooking(number);
        this.dispose();
        new checkedOut().setVisible(true);
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void mainmenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuButtonActionPerformed
        this.dispose();
        new mainMenu().setVisible(true);
    }//GEN-LAST:event_mainmenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkButton;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JPanel checkoutPanel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JLabel customerdetailsTitle;
    private javax.swing.JLabel extraLabel;
    private javax.swing.JLabel floorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mainmenuButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nightLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JLabel packageLabel;
    private javax.swing.JLabel phonenumberLabel;
    private javax.swing.JLabel phonenumberStatus;
    private javax.swing.JTextField phonenumberTextfield;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JPanel roomPanel;
    // End of variables declaration//GEN-END:variables
}
