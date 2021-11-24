package programming.assignment;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sukhman Singh & Vaughn Carroll
 */
public class finalDetails extends javax.swing.JFrame {
    private HotelGrid hotel;

    public finalDetails(HotelGrid hotelObj) {
        hotel = hotelObj;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finaldetailsPanel = new javax.swing.JPanel();
        finaldetailsTitle = new javax.swing.JLabel();
        extraCombobox = new javax.swing.JComboBox<>();
        nightLabel = new javax.swing.JLabel();
        nightCombobox = new javax.swing.JComboBox<>();
        extraLabel1 = new javax.swing.JLabel();
        mainmenuButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        String night = "$"+this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getNightlyCost()+"0 per night";
        pernightLabel = new javax.swing.JLabel();
        extrachargeLabel = new javax.swing.JLabel();
        this.extrachargeLabel.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        finaldetailsTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        finaldetailsTitle.setText("Final Details");

        extraCombobox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        extraCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        extraCombobox.setBorder(null);
        extraCombobox.setFocusable(false);
        extraCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraComboboxActionPerformed(evt);
            }
        });

        nightLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        nightLabel.setText("Nights Staying");

        nightCombobox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nightCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        nightCombobox.setBorder(null);
        nightCombobox.setFocusable(false);

        extraLabel1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        extraLabel1.setText("Add Extra People");

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

        pernightLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        pernightLabel.setForeground(new java.awt.Color(255, 153, 0));
        pernightLabel.setText(night);

        extrachargeLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        extrachargeLabel.setForeground(new java.awt.Color(255, 153, 0));
        extrachargeLabel.setText("Extra charges apply");

        javax.swing.GroupLayout finaldetailsPanelLayout = new javax.swing.GroupLayout(finaldetailsPanel);
        finaldetailsPanel.setLayout(finaldetailsPanelLayout);
        finaldetailsPanelLayout.setHorizontalGroup(
            finaldetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finaldetailsPanelLayout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addGroup(finaldetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finaldetailsPanelLayout.createSequentialGroup()
                        .addComponent(finaldetailsTitle)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finaldetailsPanelLayout.createSequentialGroup()
                        .addGroup(finaldetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(extraLabel1)
                            .addComponent(nightCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nightLabel)
                            .addComponent(extraCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pernightLabel)
                            .addComponent(extrachargeLabel))
                        .addGap(264, 264, 264))))
            .addGroup(finaldetailsPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        finaldetailsPanelLayout.setVerticalGroup(
            finaldetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finaldetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(finaldetailsTitle)
                .addGap(44, 44, 44)
                .addComponent(extraLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extraCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extrachargeLabel)
                .addGap(34, 34, 34)
                .addComponent(nightLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nightCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pernightLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(finaldetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainmenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        int extra = hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getMaxPeople();
        for(int i = 1; i < extra; ++i){
            this.extraCombobox.addItem(Integer.toString(i));
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(finaldetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(finaldetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void extraComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraComboboxActionPerformed
        if(!this.extraCombobox.getSelectedItem().toString().equalsIgnoreCase("none")){
            this.extrachargeLabel.setVisible(true);
        }
        else{
            this.extrachargeLabel.setVisible(false);
        }
    }//GEN-LAST:event_extraComboboxActionPerformed

    private void mainmenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuButtonActionPerformed
        this.dispose();
        new mainMenu().setVisible(true);
    }//GEN-LAST:event_mainmenuButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if(this.extraCombobox.getSelectedItem().toString().equals("None")){
            this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getCustInfo().addOtherInfo("1", this.nightCombobox.getSelectedItem().toString());
        }
        else{
            int extra = Integer.parseInt(this.extraCombobox.getSelectedItem().toString());
            ++extra;
            this.hotel.getHotelGrid(hotel.getUserFloor(), hotel.getUserRoom()).getCustInfo().addOtherInfo(Integer.toString(extra), this.nightCombobox.getSelectedItem().toString());
        }
        
        this.dispose();
        new Summary(hotel).setVisible(true);
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> extraCombobox;
    private javax.swing.JLabel extraLabel1;
    private javax.swing.JLabel extrachargeLabel;
    private javax.swing.JPanel finaldetailsPanel;
    private javax.swing.JLabel finaldetailsTitle;
    private javax.swing.JButton mainmenuButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JComboBox<String> nightCombobox;
    private javax.swing.JLabel nightLabel;
    private javax.swing.JLabel pernightLabel;
    // End of variables declaration//GEN-END:variables
}
