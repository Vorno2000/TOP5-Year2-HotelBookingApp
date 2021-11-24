package programming.assignment;

/**
 *
 * @author Sukhman Singh & Vaughn Carroll
 */
public class Summary extends javax.swing.JFrame{
    private HotelGrid hotel;

    public Summary(HotelGrid hotelObj) {
        hotel = hotelObj;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        summaryPanel = new javax.swing.JPanel();
        summaryTitle = new javax.swing.JLabel();
        String totalcost = "Grand Total: $"+this.hotel.calculateCost()+"0";
        costLabel = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        customerPanel = new javax.swing.JPanel();
        customerLabel = new javax.swing.JLabel();
        String fullname;

        fullname = this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getCustInfo().getArrCustInfo().get(0)+" "+this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getCustInfo().getArrCustInfo().get(1);
        nameLabel = new javax.swing.JLabel();
        String phonenum = this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getCustInfo().getArrCustInfo().get(2);
        phoneLabel = new javax.swing.JLabel();
        roomPanel = new javax.swing.JPanel();
        roomdetailsLabel = new javax.swing.JLabel();
        String rPackage = hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).toString()+" Package";
        packageLabel = new javax.swing.JLabel();
        String floor = "Floor "+(hotel.getUserFloor()+1);
        floorLabel = new javax.swing.JLabel();
        String room = "Room "+(hotel.getUserRoom()+1);
        roomLabel = new javax.swing.JLabel();
        String roomCost = "$"+Float.toString(hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getCost())+"0";
        packpriceLabel = new javax.swing.JLabel();
        vipPanel = new javax.swing.JPanel();
        vipLabel = new javax.swing.JLabel();
        vipoptionsPanel = new javax.swing.JPanel();
        barLabel = new javax.swing.JLabel();
        skytvLabel = new javax.swing.JLabel();
        hotpoolsLabel = new javax.swing.JLabel();
        massageroomsLabel = new javax.swing.JLabel();
        massageroomsPrice = new javax.swing.JLabel();
        hotpoolsPrice = new javax.swing.JLabel();
        skytvPrice = new javax.swing.JLabel();
        barPrice = new javax.swing.JLabel();
        novipLabel = new javax.swing.JLabel();
        this.novipLabel.setVisible(true);
        for(int i = 0; i < hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().size(); ++i){
            if(hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(i).getIsSelected()){
                this.novipLabel.setVisible(false);
            }
        }
        otherPanel = new javax.swing.JPanel();
        otherLabel = new javax.swing.JLabel();
        String nightStay = "Nights Staying: "+this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getCustInfo().getArrCustInfo().get(6);
        nightLabel = new javax.swing.JLabel();
        String extrapeople = "";

        if(hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getCustInfo().getArrCustInfo().get(5).equalsIgnoreCase("1")){
            extrapeople = "Extra People: None";
        }
        else{
            int extra = Integer.parseInt(hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getCustInfo().getArrCustInfo().get(5));
            extra--;
            extrapeople = "Extra People: "+extra;
        }
        extraLabel = new javax.swing.JLabel();
        int cost = Integer.parseInt(hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getCustInfo().getArrCustInfo().get(6));
        cost *= this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getNightlyCost();

        String nightcost = "$"+cost+".00";
        nightCost = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        summaryPanel.setMaximumSize(new java.awt.Dimension(700, 500));
        summaryPanel.setMinimumSize(new java.awt.Dimension(700, 500));
        summaryPanel.setPreferredSize(new java.awt.Dimension(700, 500));

        summaryTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        summaryTitle.setText("Booking");

        costLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        costLabel.setForeground(new java.awt.Color(255, 153, 0));
        costLabel.setText(totalcost);

        payButton.setBackground(new java.awt.Color(255, 153, 0));
        payButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        payButton.setForeground(new java.awt.Color(255, 255, 255));
        payButton.setText("Book");
        payButton.setBorderPainted(false);
        payButton.setFocusPainted(false);
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 153, 0));
        cancelButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorderPainted(false);
        cancelButton.setFocusPainted(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        customerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        customerPanel.setMaximumSize(new java.awt.Dimension(250, 150));
        customerPanel.setMinimumSize(new java.awt.Dimension(250, 150));
        customerPanel.setPreferredSize(new java.awt.Dimension(250, 150));

        customerLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        customerLabel.setText("Customer Details");

        nameLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nameLabel.setText(fullname);

        phoneLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        phoneLabel.setText(phonenum);

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(customerLabel)
                .addGap(53, 53, 53))
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(phoneLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneLabel)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        roomPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        roomPanel.setMaximumSize(new java.awt.Dimension(250, 150));
        roomPanel.setMinimumSize(new java.awt.Dimension(250, 150));
        roomPanel.setPreferredSize(new java.awt.Dimension(250, 150));

        roomdetailsLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        roomdetailsLabel.setText("Room Details");

        packageLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        packageLabel.setText(rPackage);

        floorLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        floorLabel.setText(floor);

        roomLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        roomLabel.setText(room);

        packpriceLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        packpriceLabel.setForeground(new java.awt.Color(255, 153, 0));
        packpriceLabel.setText(roomCost);

        javax.swing.GroupLayout roomPanelLayout = new javax.swing.GroupLayout(roomPanel);
        roomPanel.setLayout(roomPanelLayout);
        roomPanelLayout.setHorizontalGroup(
            roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomPanelLayout.createSequentialGroup()
                        .addComponent(packageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(packpriceLabel))
                    .addGroup(roomPanelLayout.createSequentialGroup()
                        .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(floorLabel)
                            .addComponent(roomLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roomdetailsLabel)
                .addGap(68, 68, 68))
        );
        roomPanelLayout.setVerticalGroup(
            roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomPanelLayout.createSequentialGroup()
                .addComponent(roomdetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packpriceLabel)
                    .addComponent(packageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(floorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomLabel)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        vipPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        vipPanel.setMaximumSize(new java.awt.Dimension(250, 150));
        vipPanel.setMinimumSize(new java.awt.Dimension(250, 150));
        vipPanel.setPreferredSize(new java.awt.Dimension(250, 150));

        vipLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        vipLabel.setText("VIP Details");

        vipoptionsPanel.setMaximumSize(new java.awt.Dimension(226, 94));
        vipoptionsPanel.setMinimumSize(new java.awt.Dimension(226, 40));
        vipoptionsPanel.setPreferredSize(new java.awt.Dimension(226, 94));

        barLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        barLabel.setText("Bar");
        barLabel.setMaximumSize(new java.awt.Dimension(17, 18));
        barLabel.setMinimumSize(new java.awt.Dimension(17, 18));
        barLabel.setPreferredSize(new java.awt.Dimension(17, 18));
        this.barLabel.setVisible(false);
        this.barPrice.setVisible(false);

        if(this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(0).getIsSelected()){
            this.barLabel.setVisible(true);
            this.barPrice.setVisible(true);
        }

        skytvLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        skytvLabel.setText("Sky TV");
        skytvLabel.setMaximumSize(new java.awt.Dimension(35, 18));
        skytvLabel.setMinimumSize(new java.awt.Dimension(35, 18));
        skytvLabel.setPreferredSize(new java.awt.Dimension(35, 18));
        this.skytvLabel.setVisible(false);
        this.skytvPrice.setVisible(false);

        if(this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(1).getIsSelected()){
            this.skytvLabel.setVisible(true);
            this.skytvPrice.setVisible(true);
        }

        hotpoolsLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        hotpoolsLabel.setText("Hot Pools");
        hotpoolsLabel.setMaximumSize(new java.awt.Dimension(49, 18));
        hotpoolsLabel.setMinimumSize(new java.awt.Dimension(49, 18));
        hotpoolsLabel.setPreferredSize(new java.awt.Dimension(49, 18));
        this.hotpoolsLabel.setVisible(false);
        this.hotpoolsPrice.setVisible(false);

        if(this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(2).getIsSelected()){
            this.hotpoolsLabel.setVisible(true);
            this.hotpoolsPrice.setVisible(true);
        }

        massageroomsLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        massageroomsLabel.setText("Massage Rooms");
        massageroomsLabel.setMaximumSize(new java.awt.Dimension(84, 18));
        massageroomsLabel.setMinimumSize(new java.awt.Dimension(84, 18));
        massageroomsLabel.setPreferredSize(new java.awt.Dimension(84, 18));
        this.massageroomsLabel.setVisible(false);
        this.massageroomsPrice.setVisible(false);

        if(this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(3).getIsSelected()){
            this.massageroomsLabel.setVisible(true);
            this.massageroomsPrice.setVisible(true);
        }

        massageroomsPrice.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        massageroomsPrice.setForeground(new java.awt.Color(255, 153, 0));
        massageroomsPrice.setText("$150.00");

        hotpoolsPrice.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        hotpoolsPrice.setForeground(new java.awt.Color(255, 153, 0));
        hotpoolsPrice.setText("$115.00");

        skytvPrice.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        skytvPrice.setForeground(new java.awt.Color(255, 153, 0));
        skytvPrice.setText("$25.00");

        barPrice.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        barPrice.setForeground(new java.awt.Color(255, 153, 0));
        barPrice.setText("$10.00");

        novipLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        novipLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        novipLabel.setText("None");

        javax.swing.GroupLayout vipoptionsPanelLayout = new javax.swing.GroupLayout(vipoptionsPanel);
        vipoptionsPanel.setLayout(vipoptionsPanelLayout);
        vipoptionsPanelLayout.setHorizontalGroup(
            vipoptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipoptionsPanelLayout.createSequentialGroup()
                .addComponent(barLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(154, 154, 154)
                .addComponent(barPrice))
            .addGroup(vipoptionsPanelLayout.createSequentialGroup()
                .addComponent(massageroomsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(massageroomsPrice))
            .addGroup(vipoptionsPanelLayout.createSequentialGroup()
                .addGroup(vipoptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skytvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotpoolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(vipoptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hotpoolsPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(skytvPrice, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(vipoptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vipoptionsPanelLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(novipLabel)
                    .addContainerGap(92, Short.MAX_VALUE)))
        );
        vipoptionsPanelLayout.setVerticalGroup(
            vipoptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipoptionsPanelLayout.createSequentialGroup()
                .addGroup(vipoptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vipoptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skytvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skytvPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(vipoptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hotpoolsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotpoolsPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vipoptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(massageroomsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(massageroomsPrice)))
            .addGroup(vipoptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vipoptionsPanelLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(novipLabel)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout vipPanelLayout = new javax.swing.GroupLayout(vipPanel);
        vipPanel.setLayout(vipPanelLayout);
        vipPanelLayout.setHorizontalGroup(
            vipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vipLabel)
                .addGap(79, 79, 79))
            .addGroup(vipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vipoptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        vipPanelLayout.setVerticalGroup(
            vipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipPanelLayout.createSequentialGroup()
                .addComponent(vipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vipoptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        otherPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        otherPanel.setMaximumSize(new java.awt.Dimension(250, 150));
        otherPanel.setMinimumSize(new java.awt.Dimension(250, 150));
        otherPanel.setPreferredSize(new java.awt.Dimension(250, 150));

        otherLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        otherLabel.setText("Other Details");

        nightLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nightLabel.setText(nightStay);

        extraLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        extraLabel.setText(extrapeople);

        nightCost.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nightCost.setForeground(new java.awt.Color(255, 153, 0));
        nightCost.setText(nightcost);

        javax.swing.GroupLayout otherPanelLayout = new javax.swing.GroupLayout(otherPanel);
        otherPanel.setLayout(otherPanelLayout);
        otherPanelLayout.setHorizontalGroup(
            otherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(otherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(otherPanelLayout.createSequentialGroup()
                        .addComponent(extraLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(otherPanelLayout.createSequentialGroup()
                        .addComponent(nightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(nightCost)))
                .addContainerGap())
            .addGroup(otherPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(otherLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        otherPanelLayout.setVerticalGroup(
            otherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherPanelLayout.createSequentialGroup()
                .addComponent(otherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(extraLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(otherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nightLabel)
                    .addComponent(nightCost))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout summaryPanelLayout = new javax.swing.GroupLayout(summaryPanel);
        summaryPanel.setLayout(summaryPanelLayout);
        summaryPanelLayout.setHorizontalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryPanelLayout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vipPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryPanelLayout.createSequentialGroup()
                        .addComponent(summaryTitle)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryPanelLayout.createSequentialGroup()
                        .addComponent(costLabel)
                        .addGap(271, 271, 271))))
        );
        summaryPanelLayout.setVerticalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(summaryTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vipPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(costLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(summaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(summaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        this.dispose();
        new Payment(hotel).setVisible(true);
    }//GEN-LAST:event_payButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
        new mainMenu().setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barLabel;
    private javax.swing.JLabel barPrice;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel costLabel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JLabel extraLabel;
    private javax.swing.JLabel floorLabel;
    private javax.swing.JLabel hotpoolsLabel;
    private javax.swing.JLabel hotpoolsPrice;
    private javax.swing.JLabel massageroomsLabel;
    private javax.swing.JLabel massageroomsPrice;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nightCost;
    private javax.swing.JLabel nightLabel;
    private javax.swing.JLabel novipLabel;
    private javax.swing.JLabel otherLabel;
    private javax.swing.JPanel otherPanel;
    private javax.swing.JLabel packageLabel;
    private javax.swing.JLabel packpriceLabel;
    private javax.swing.JButton payButton;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JPanel roomPanel;
    private javax.swing.JLabel roomdetailsLabel;
    private javax.swing.JLabel skytvLabel;
    private javax.swing.JLabel skytvPrice;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JLabel summaryTitle;
    private javax.swing.JLabel vipLabel;
    private javax.swing.JPanel vipPanel;
    private javax.swing.JPanel vipoptionsPanel;
    // End of variables declaration//GEN-END:variables
}
