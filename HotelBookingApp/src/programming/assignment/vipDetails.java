package programming.assignment;

/**
 *
 * @author Sukhman Singh & Vaughn Carroll
 */
public class vipDetails extends javax.swing.JFrame {
    private HotelGrid hotel;

    public vipDetails(HotelGrid hotelObj) {
        hotel = hotelObj;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vipdetailsPanel = new javax.swing.JPanel();
        customerdetailsTitle = new javax.swing.JLabel();
        barCheckBox = new javax.swing.JCheckBox();
        skytvCheckBox = new javax.swing.JCheckBox();
        hotpoolsCheckBox = new javax.swing.JCheckBox();
        massageCheckBox = new javax.swing.JCheckBox();
        selectvipLabel = new javax.swing.JLabel();
        barpriceLabel = new javax.swing.JLabel();
        skytvpriceLabel = new javax.swing.JLabel();
        hotpoolspriceLabel = new javax.swing.JLabel();
        massagepriceLabel = new javax.swing.JLabel();
        mainmenuButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerdetailsTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        customerdetailsTitle.setText("VIP Details");

        barCheckBox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        barCheckBox.setText("Bar");
        barCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barCheckBoxActionPerformed(evt);
            }
        });

        skytvCheckBox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        skytvCheckBox.setText("Sky TV");
        skytvCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skytvCheckBoxActionPerformed(evt);
            }
        });

        hotpoolsCheckBox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        hotpoolsCheckBox.setText("Hot Pools");
        hotpoolsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotpoolsCheckBoxActionPerformed(evt);
            }
        });

        massageCheckBox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        massageCheckBox.setText("Massage Rooms");
        massageCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massageCheckBoxActionPerformed(evt);
            }
        });

        selectvipLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        selectvipLabel.setText("Select VIP Access");

        barpriceLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        barpriceLabel.setText("+$10.00");

        skytvpriceLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        skytvpriceLabel.setText("+$25.00");

        hotpoolspriceLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        hotpoolspriceLabel.setText("+$115.00");

        massagepriceLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        massagepriceLabel.setText("+$150.00");

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

        javax.swing.GroupLayout vipdetailsPanelLayout = new javax.swing.GroupLayout(vipdetailsPanel);
        vipdetailsPanel.setLayout(vipdetailsPanelLayout);
        vipdetailsPanelLayout.setHorizontalGroup(
            vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipdetailsPanelLayout.createSequentialGroup()
                .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vipdetailsPanelLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(customerdetailsTitle))
                    .addGroup(vipdetailsPanelLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectvipLabel)
                            .addGroup(vipdetailsPanelLayout.createSequentialGroup()
                                .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(vipdetailsPanelLayout.createSequentialGroup()
                                        .addComponent(skytvCheckBox)
                                        .addGap(66, 66, 66))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipdetailsPanelLayout.createSequentialGroup()
                                        .addComponent(barCheckBox)
                                        .addGap(88, 88, 88)))
                                .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(barpriceLabel)
                                    .addComponent(skytvpriceLabel)))
                            .addGroup(vipdetailsPanelLayout.createSequentialGroup()
                                .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hotpoolsCheckBox)
                                    .addComponent(massageCheckBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(massagepriceLabel)
                                    .addComponent(hotpoolspriceLabel))))))
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(vipdetailsPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        vipdetailsPanelLayout.setVerticalGroup(
            vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipdetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerdetailsTitle)
                .addGap(49, 49, 49)
                .addComponent(selectvipLabel)
                .addGap(6, 6, 6)
                .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barpriceLabel))
                .addGap(2, 2, 2)
                .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skytvCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skytvpriceLabel))
                .addGap(2, 2, 2)
                .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hotpoolsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotpoolspriceLabel))
                .addGap(2, 2, 2)
                .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(massageCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(massagepriceLabel))
                .addGap(34, 34, 34)
                .addGroup(vipdetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vipdetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vipdetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void barCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barCheckBoxActionPerformed
        if(this.barCheckBox.isSelected()){
            hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(0).setIsSelected(true);
        }
        else{
            hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(0).setIsSelected(false);
        }
    }//GEN-LAST:event_barCheckBoxActionPerformed

    private void skytvCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skytvCheckBoxActionPerformed
        if(this.skytvCheckBox.isSelected()){
            hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(1).setIsSelected(true);
        }
        else{
            hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(1).setIsSelected(false);
        }
    }//GEN-LAST:event_skytvCheckBoxActionPerformed

    private void hotpoolsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotpoolsCheckBoxActionPerformed
        if(this.hotpoolsCheckBox.isSelected()){
            hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(2).setIsSelected(true);
        }
        else{
            hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(2).setIsSelected(false);
        }
    }//GEN-LAST:event_hotpoolsCheckBoxActionPerformed

    private void massageCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massageCheckBoxActionPerformed
        if(this.massageCheckBox.isSelected()){
            hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(3).setIsSelected(true);
        }
        else{
            hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getVipAccess().get(3).setIsSelected(false);
        }
    }//GEN-LAST:event_massageCheckBoxActionPerformed

    private void mainmenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuButtonActionPerformed
        this.dispose();
        new mainMenu().setVisible(true);
    }//GEN-LAST:event_mainmenuButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        this.dispose();
        new finalDetails(hotel).setVisible(true);
    }//GEN-LAST:event_nextButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox barCheckBox;
    private javax.swing.JLabel barpriceLabel;
    private javax.swing.JLabel customerdetailsTitle;
    private javax.swing.JCheckBox hotpoolsCheckBox;
    private javax.swing.JLabel hotpoolspriceLabel;
    private javax.swing.JButton mainmenuButton;
    private javax.swing.JCheckBox massageCheckBox;
    private javax.swing.JLabel massagepriceLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel selectvipLabel;
    private javax.swing.JCheckBox skytvCheckBox;
    private javax.swing.JLabel skytvpriceLabel;
    private javax.swing.JPanel vipdetailsPanel;
    // End of variables declaration//GEN-END:variables
}
