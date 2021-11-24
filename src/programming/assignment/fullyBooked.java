package programming.assignment;

/**
 *
 * @author Sukhman Singh & Vaughn Carroll
 */
public class fullyBooked extends javax.swing.JFrame {

    public fullyBooked() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fullybookedLabel = new javax.swing.JPanel();
        fullybookedTitle = new javax.swing.JLabel();
        noroomsLabel = new javax.swing.JLabel();
        informationLabel = new javax.swing.JLabel();
        dismissButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));

        fullybookedLabel.setMaximumSize(new java.awt.Dimension(500, 300));
        fullybookedLabel.setMinimumSize(new java.awt.Dimension(500, 300));

        fullybookedTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        fullybookedTitle.setText("Fully Booked");

        noroomsLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        noroomsLabel.setText("Unfortunately no rooms are available ");

        informationLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        informationLabel.setForeground(new java.awt.Color(255, 153, 0));
        informationLabel.setText("For more information, visit staff at the front desk");

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

        javax.swing.GroupLayout fullybookedLabelLayout = new javax.swing.GroupLayout(fullybookedLabel);
        fullybookedLabel.setLayout(fullybookedLabelLayout);
        fullybookedLabelLayout.setHorizontalGroup(
            fullybookedLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullybookedLabelLayout.createSequentialGroup()
                .addGroup(fullybookedLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fullybookedLabelLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(fullybookedTitle))
                    .addGroup(fullybookedLabelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(noroomsLabel))
                    .addGroup(fullybookedLabelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(informationLabel)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fullybookedLabelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dismissButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        fullybookedLabelLayout.setVerticalGroup(
            fullybookedLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullybookedLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullybookedTitle)
                .addGap(57, 57, 57)
                .addComponent(noroomsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(dismissButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fullybookedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fullybookedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dismissButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dismissButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_dismissButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dismissButton;
    private javax.swing.JPanel fullybookedLabel;
    private javax.swing.JLabel fullybookedTitle;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JLabel noroomsLabel;
    // End of variables declaration//GEN-END:variables
}
