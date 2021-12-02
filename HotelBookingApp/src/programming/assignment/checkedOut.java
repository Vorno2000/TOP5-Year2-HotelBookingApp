package programming.assignment;

/**
 *
 * @author Sukhman Singh & Vaughn Carroll
 */
public class checkedOut extends javax.swing.JFrame {

    public checkedOut() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkedoutPanel = new javax.swing.JPanel();
        checkedoutTitle = new javax.swing.JLabel();
        checkedoutLabel = new javax.swing.JLabel();
        enjoyedLabel = new javax.swing.JLabel();
        dismissButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        checkedoutPanel.setMaximumSize(new java.awt.Dimension(500, 300));
        checkedoutPanel.setMinimumSize(new java.awt.Dimension(500, 300));

        checkedoutTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        checkedoutTitle.setText("Checked Out");

        checkedoutLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        checkedoutLabel.setText("Check-Out was successful");

        enjoyedLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        enjoyedLabel.setForeground(new java.awt.Color(255, 153, 0));
        enjoyedLabel.setText("We hope you enjoyed your stay");

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

        javax.swing.GroupLayout checkedoutPanelLayout = new javax.swing.GroupLayout(checkedoutPanel);
        checkedoutPanel.setLayout(checkedoutPanelLayout);
        checkedoutPanelLayout.setHorizontalGroup(
            checkedoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkedoutPanelLayout.createSequentialGroup()
                .addGap(0, 185, Short.MAX_VALUE)
                .addComponent(checkedoutTitle)
                .addGap(177, 177, 177))
            .addGroup(checkedoutPanelLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(dismissButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkedoutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(checkedoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkedoutPanelLayout.createSequentialGroup()
                        .addComponent(enjoyedLabel)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkedoutPanelLayout.createSequentialGroup()
                        .addComponent(checkedoutLabel)
                        .addGap(99, 99, 99))))
        );
        checkedoutPanelLayout.setVerticalGroup(
            checkedoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkedoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkedoutTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(checkedoutLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enjoyedLabel)
                .addGap(56, 56, 56)
                .addComponent(dismissButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkedoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkedoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dismissButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dismissButtonActionPerformed
        this.dispose();
        new mainMenu().setVisible(true);
    }//GEN-LAST:event_dismissButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkedoutLabel;
    private javax.swing.JPanel checkedoutPanel;
    private javax.swing.JLabel checkedoutTitle;
    private javax.swing.JButton dismissButton;
    private javax.swing.JLabel enjoyedLabel;
    // End of variables declaration//GEN-END:variables
}
