package programming.assignment;

/**
 *
 * @author Sukhman Singh & Vaughn Carroll
 */
public class checkedIn extends javax.swing.JFrame {

    public checkedIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkedinPanel = new javax.swing.JPanel();
        checkedoutTitle = new javax.swing.JLabel();
        checkedinLabel = new javax.swing.JLabel();
        enjoyLabel = new javax.swing.JLabel();
        dismissButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        checkedoutTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        checkedoutTitle.setText("Checked In");

        checkedinLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        checkedinLabel.setText("Booking was successful");

        enjoyLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        enjoyLabel.setForeground(new java.awt.Color(255, 153, 0));
        enjoyLabel.setText("Enjoy your stay");

        dismissButton.setBackground(new java.awt.Color(255, 153, 0));
        dismissButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dismissButton.setForeground(new java.awt.Color(255, 255, 255));
        dismissButton.setText("Dismiss");
        dismissButton.setBorderPainted(false);
        dismissButton.setFocusPainted(false);
        dismissButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dismissButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checkedinPanelLayout = new javax.swing.GroupLayout(checkedinPanel);
        checkedinPanel.setLayout(checkedinPanelLayout);
        checkedinPanelLayout.setHorizontalGroup(
            checkedinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkedinPanelLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(checkedinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkedinPanelLayout.createSequentialGroup()
                        .addComponent(checkedoutTitle)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkedinPanelLayout.createSequentialGroup()
                        .addComponent(checkedinLabel)
                        .addGap(117, 117, 117))))
            .addGroup(checkedinPanelLayout.createSequentialGroup()
                .addGroup(checkedinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkedinPanelLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(dismissButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(checkedinPanelLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(enjoyLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        checkedinPanelLayout.setVerticalGroup(
            checkedinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkedinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkedoutTitle)
                .addGap(56, 56, 56)
                .addComponent(checkedinLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enjoyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(dismissButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkedinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkedinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dismissButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dismissButtonActionPerformed
        this.dispose();
        new mainMenu().setVisible(true);
    }//GEN-LAST:event_dismissButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkedinLabel;
    private javax.swing.JPanel checkedinPanel;
    private javax.swing.JLabel checkedoutTitle;
    private javax.swing.JButton dismissButton;
    private javax.swing.JLabel enjoyLabel;
    // End of variables declaration//GEN-END:variables
}
