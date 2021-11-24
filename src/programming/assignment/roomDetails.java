package programming.assignment;

/**
 *
 * @author Sukhman Singh & Vaughn Carroll
 */
public class roomDetails extends javax.swing.JFrame {
    private HotelGrid hotel;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private char temp;

    public roomDetails(HotelGrid hotelObj, String firstname, String lastname, String phonenumber) {
        this.hotel = hotelObj;
        this.firstName = firstname;
        this.lastName = lastname;
        this.phoneNumber = phonenumber;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        floorButtongroup = new javax.swing.ButtonGroup();
        roomdetailsPanel = new javax.swing.JPanel();
        customerdetailsTitle = new javax.swing.JLabel();
        packageCombobox = new javax.swing.JComboBox<>();
        packageLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        mainmenuButton = new javax.swing.JButton();
        roomsizeLabel = new javax.swing.JLabel();
        capacityLabel = new javax.swing.JLabel();
        nightcostLabel = new javax.swing.JLabel();
        packagepriceLabel = new javax.swing.JLabel();
        floorPanel = new javax.swing.JPanel();
        floor1Checkbox = new javax.swing.JCheckBox();
        floor2Checkbox = new javax.swing.JCheckBox();
        floor3Checkbox = new javax.swing.JCheckBox();
        floor4Checkbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setLocation(new java.awt.Point(0, 0));

        roomdetailsPanel.setMinimumSize(new java.awt.Dimension(700, 500));

        customerdetailsTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        customerdetailsTitle.setText("Room Details");

        packageCombobox.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        packageCombobox.setMaximumRowCount(5);
        packageCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        packageCombobox.setBorder(null);
        packageCombobox.setFocusable(false);
        packageCombobox.setLightWeightPopupEnabled(false);
        silverLoop:
        for (int x = 0; x < hotel.getTotalFloors(); x++) {       //Rooms are checked to see if they're booked
            for (int y = 0; y < hotel.getTotalRooms(); y++) {
                if ('S' == hotel.getHotelGrid(x, y).getRoomCode() && hotel.getHotelGrid(x, y).getIsBooked() == false) {
                    this.packageCombobox.addItem("Silver");
                    break silverLoop;
                }
            }
        }

        goldLoop:
        for (int x = 0; x < hotel.getTotalFloors(); x++) {       //Rooms are checked to see if they're booked
            for (int y = 0; y < hotel.getTotalRooms(); y++) {
                if ('G' == hotel.getHotelGrid(x, y).getRoomCode() && hotel.getHotelGrid(x, y).getIsBooked() == false) {
                    this.packageCombobox.addItem("Gold");
                    break goldLoop;
                }
            }
        }

        platinumLoop:
        for (int x = 0; x < hotel.getTotalFloors(); x++) {       //Rooms are checked to see if they're booked
            for (int y = 0; y < hotel.getTotalRooms(); y++) {
                if ('P' == hotel.getHotelGrid(x, y).getRoomCode() && hotel.getHotelGrid(x, y).getIsBooked() == false) {
                    this.packageCombobox.addItem("Platinum");
                    break platinumLoop;
                }
            }
        }

        diamondLoop:
        for (int x = 0; x < hotel.getTotalFloors(); x++) {       //Rooms are checked to see if they're booked
            for (int y = 0; y < hotel.getTotalRooms(); y++) {
                if ('D' == hotel.getHotelGrid(x, y).getRoomCode() && hotel.getHotelGrid(x, y).getIsBooked() == false) {
                    this.packageCombobox.addItem("Diamond");
                    break diamondLoop;
                }
            }
        }
        packageCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageComboboxActionPerformed(evt);
            }
        });

        packageLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        packageLabel.setText("Package");

        nextButton.setBackground(new java.awt.Color(255, 153, 0));
        nextButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next");
        nextButton.setBorderPainted(false);
        nextButton.setEnabled(false);
        nextButton.setFocusPainted(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
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

        roomsizeLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        roomsizeLabel.setToolTipText("");

        capacityLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N

        nightcostLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N

        packagepriceLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        packagepriceLabel.setToolTipText("");

        floorPanel.setMaximumSize(new java.awt.Dimension(85, 165));
        floorPanel.setMinimumSize(new java.awt.Dimension(85, 165));

        floorButtongroup.add(floor1Checkbox);
        floor1Checkbox.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        floor1Checkbox.setText("Floor 1");
        floor1Checkbox.setActionCommand("0");
        floor1Checkbox.setBorder(null);
        floor1Checkbox.setBorderPainted(true);
        floor1Checkbox.setMargin(new java.awt.Insets(0, 2, 0, 2));
        this.floor1Checkbox.setVisible(false);
        floor1Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor1CheckboxActionPerformed(evt);
            }
        });

        floorButtongroup.add(floor2Checkbox);
        floor2Checkbox.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        floor2Checkbox.setText("Floor 2");
        floor2Checkbox.setActionCommand("1");
        floor2Checkbox.setBorder(null);
        floor2Checkbox.setBorderPainted(true);
        floor2Checkbox.setMargin(new java.awt.Insets(0, 2, 0, 2));
        this.floor2Checkbox.setVisible(false);
        floor2Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor2CheckboxActionPerformed(evt);
            }
        });

        floorButtongroup.add(floor3Checkbox);
        floor3Checkbox.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        floor3Checkbox.setText("Floor 3");
        floor3Checkbox.setActionCommand("2");
        floor3Checkbox.setBorder(null);
        floor3Checkbox.setBorderPainted(true);
        floor3Checkbox.setMargin(new java.awt.Insets(0, 2, 0, 2));
        this.floor3Checkbox.setVisible(false);
        floor3Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor3CheckboxActionPerformed(evt);
            }
        });

        floorButtongroup.add(floor4Checkbox);
        floor4Checkbox.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        floor4Checkbox.setText("Floor 4");
        floor4Checkbox.setActionCommand("3");
        floor4Checkbox.setBorder(null);
        floor4Checkbox.setBorderPainted(true);
        floor4Checkbox.setMargin(new java.awt.Insets(0, 2, 0, 2));
        this.floor4Checkbox.setVisible(false);
        floor4Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor4CheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout floorPanelLayout = new javax.swing.GroupLayout(floorPanel);
        floorPanel.setLayout(floorPanelLayout);
        floorPanelLayout.setHorizontalGroup(
            floorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(floor1Checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(floor2Checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(floor3Checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(floor4Checkbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        floorPanelLayout.setVerticalGroup(
            floorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(floorPanelLayout.createSequentialGroup()
                .addComponent(floor1Checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(floor2Checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(floor3Checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(floor4Checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout roomdetailsPanelLayout = new javax.swing.GroupLayout(roomdetailsPanel);
        roomdetailsPanel.setLayout(roomdetailsPanelLayout);
        roomdetailsPanelLayout.setHorizontalGroup(
            roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomdetailsPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(floorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(roomdetailsPanelLayout.createSequentialGroup()
                .addGroup(roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomdetailsPanelLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(customerdetailsTitle))
                    .addGroup(roomdetailsPanelLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roomdetailsPanelLayout.createSequentialGroup()
                                .addGroup(roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nightcostLabel)
                                    .addComponent(roomsizeLabel))
                                .addGap(60, 60, 60)
                                .addGroup(roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(capacityLabel)
                                    .addComponent(packagepriceLabel)))
                            .addGroup(roomdetailsPanelLayout.createSequentialGroup()
                                .addComponent(packageLabel)
                                .addGap(18, 18, 18)
                                .addComponent(packageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roomdetailsPanelLayout.setVerticalGroup(
            roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomdetailsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(customerdetailsTitle)
                .addGap(44, 44, 44)
                .addGroup(roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageLabel))
                .addGap(37, 37, 37)
                .addGroup(roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomsizeLabel)
                    .addComponent(capacityLabel))
                .addGap(18, 18, 18)
                .addGroup(roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nightcostLabel)
                    .addComponent(packagepriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomdetailsPanelLayout.createSequentialGroup()
                        .addGroup(roomdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomdetailsPanelLayout.createSequentialGroup()
                        .addComponent(floorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roomdetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roomdetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void packageComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageComboboxActionPerformed
        temp = '?';
        this.floor1Checkbox.setVisible(false);
        this.floor2Checkbox.setVisible(false);
        this.floor3Checkbox.setVisible(false);
        this.floor4Checkbox.setVisible(false);
        this.floorButtongroup.clearSelection();
        this.nextButton.setEnabled(false);
        
        if(this.packageCombobox.getSelectedItem().toString().equalsIgnoreCase("Silver")){
            temp = 'S';
        }
        else if(this.packageCombobox.getSelectedItem().toString().equalsIgnoreCase("Gold")){
            temp = 'G';
        }
        else if(this.packageCombobox.getSelectedItem().toString().equalsIgnoreCase("Platinum")){
            temp = 'P';
        }
        else if(this.packageCombobox.getSelectedItem().toString().equalsIgnoreCase("Diamond")){
            temp = 'D';
        }
        else{
            this.roomsizeLabel.setText("");
            this.capacityLabel.setText("");
            this.nightcostLabel.setText("");
            this.packagepriceLabel.setText("");
        }
        
        if(temp != '?'){
            this.roomsizeLabel.setText("Room Size: "+hotel.getRoom(temp).getSize());
            this.capacityLabel.setText("Capacity: "+hotel.getRoom(temp).getMaxPeople());
            this.nightcostLabel.setText("$"+hotel.getRoom(temp).getNightlyCost()+"0 per night");
            this.packagepriceLabel.setText("Package Price: $"+hotel.getRoom(temp).getCost()+"0");
            
            for (int floor = 0; floor < hotel.getTotalFloors(); floor++) {
                for (int room = 0; room < hotel.getTotalRooms(); room++) {
                    if (temp == hotel.getHotelGrid(floor, room).getRoomCode() && hotel.getHotelGrid(floor, room).getIsBooked() == false){
                        switch (floor) {
                            case 0:
                                this.floor1Checkbox.setVisible(true);
                                break;
                            case 1:
                                this.floor2Checkbox.setVisible(true);
                                break;
                            case 2:
                                this.floor3Checkbox.setVisible(true);
                                break;
                            case 3:
                                this.floor4Checkbox.setVisible(true);
                                break;
                            default:
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_packageComboboxActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        this.dispose();
        int userfloor = Integer.parseInt(floorButtongroup.getSelection().getActionCommand());
        int userroom = 0;
        
        for(int room = 0; room < hotel.getTotalRooms(); room++) {
            if(hotel.getHotelGrid(userfloor, room).getIsBooked() == false && temp == hotel.getHotelGrid(userfloor, room).getRoomCode()){
                hotel.getHotelGrid(userfloor, room).setIsBooked(true);
                userroom = room;
                break;
            }
        } 
        this.hotel.getHotelGrid(userfloor, userroom).getCustInfo().addPersonalRoomInfo(firstName, lastName, phoneNumber, Integer.toString(userfloor), Integer.toString(userroom));
        this.hotel.setUserFloor(userfloor);
        this.hotel.setUserRoom(userroom);
        new vipDetails(hotel).setVisible(true);
    }//GEN-LAST:event_nextButtonActionPerformed

    private void mainmenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuButtonActionPerformed
        this.dispose();
        new mainMenu().setVisible(true);
    }//GEN-LAST:event_mainmenuButtonActionPerformed

    private void floor4CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor4CheckboxActionPerformed
        this.nextButton.setEnabled(true);
    }//GEN-LAST:event_floor4CheckboxActionPerformed

    private void floor3CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor3CheckboxActionPerformed
        this.nextButton.setEnabled(true);
    }//GEN-LAST:event_floor3CheckboxActionPerformed

    private void floor2CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor2CheckboxActionPerformed
        this.nextButton.setEnabled(true);
    }//GEN-LAST:event_floor2CheckboxActionPerformed

    private void floor1CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor1CheckboxActionPerformed
        this.nextButton.setEnabled(true);
    }//GEN-LAST:event_floor1CheckboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel capacityLabel;
    private javax.swing.JLabel customerdetailsTitle;
    private javax.swing.JCheckBox floor1Checkbox;
    private javax.swing.JCheckBox floor2Checkbox;
    private javax.swing.JCheckBox floor3Checkbox;
    private javax.swing.JCheckBox floor4Checkbox;
    private javax.swing.ButtonGroup floorButtongroup;
    private javax.swing.JPanel floorPanel;
    private javax.swing.JButton mainmenuButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel nightcostLabel;
    private javax.swing.JComboBox<String> packageCombobox;
    private javax.swing.JLabel packageLabel;
    private javax.swing.JLabel packagepriceLabel;
    private javax.swing.JPanel roomdetailsPanel;
    private javax.swing.JLabel roomsizeLabel;
    // End of variables declaration//GEN-END:variables
}
