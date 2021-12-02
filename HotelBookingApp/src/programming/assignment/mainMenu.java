package programming.assignment;

/**
 *
 * @author Sukhman Singh & Vaughn Carroll
 */
public class mainMenu extends javax.swing.JFrame {
    private HotelGrid hotel;

    public mainMenu() {
        hotel = new HotelGrid();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainmenuPanel = new javax.swing.JPanel();
        mainmenuTitle = new javax.swing.JLabel();
        checkinButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        mainmenuTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        mainmenuTitle.setText("Hotel Self-Service");

        checkinButton.setBackground(new java.awt.Color(255, 153, 0));
        checkinButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        checkinButton.setForeground(new java.awt.Color(255, 255, 255));
        checkinButton.setText("Check-In");
        checkinButton.setBorderPainted(false);
        checkinButton.setFocusPainted(false);
        checkinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinButtonActionPerformed(evt);
            }
        });

        checkoutButton.setBackground(new java.awt.Color(255, 153, 0));
        checkoutButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        checkoutButton.setForeground(new java.awt.Color(255, 255, 255));
        checkoutButton.setText("Check-Out");
        checkoutButton.setBorderPainted(false);
        checkoutButton.setFocusPainted(false);
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 153, 0));
        exitButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.setBorderPainted(false);
        exitButton.setFocusPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainmenuPanelLayout = new javax.swing.GroupLayout(mainmenuPanel);
        mainmenuPanel.setLayout(mainmenuPanelLayout);
        mainmenuPanelLayout.setHorizontalGroup(
            mainmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainmenuPanelLayout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addGroup(mainmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainmenuPanelLayout.createSequentialGroup()
                        .addGroup(mainmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainmenuPanelLayout.createSequentialGroup()
                        .addComponent(mainmenuTitle)
                        .addGap(250, 250, 250))))
        );
        mainmenuPanelLayout.setVerticalGroup(
            mainmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainmenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainmenuTitle)
                .addGap(61, 61, 61)
                .addComponent(checkinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainmenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainmenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void checkinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinButtonActionPerformed
        if(!hotel.checkFullyBooked()){
            this.dispose();
            new customerDetails(hotel).setVisible(true);
        }else{
            new fullyBooked().setVisible(true);
        }
    }//GEN-LAST:event_checkinButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        this.dispose();
        new checkOut(hotel).setVisible(true);
    }//GEN-LAST:event_checkoutButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkinButton;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel mainmenuPanel;
    private javax.swing.JLabel mainmenuTitle;
    // End of variables declaration//GEN-END:variables
}
