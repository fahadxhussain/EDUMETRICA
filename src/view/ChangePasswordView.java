/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import Models.User;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author fahadxhussain
 */
public class ChangePasswordView extends javax.swing.JFrame {
    User user;
    /**
     * Creates new form ChangePasswordView
     */
    public ChangePasswordView() {
        initComponents();
        user = new User();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ChangePasswordHeader = new javax.swing.JLabel();
        crossButton = new javax.swing.JButton();
        newPasswordInput = new javax.swing.JTextField();
        newPasswordLabel = new javax.swing.JLabel();
        DoneButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 600));
        setMinimumSize(new java.awt.Dimension(400, 600));
        setPreferredSize(new java.awt.Dimension(400, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel1.setSize(new java.awt.Dimension(400, 600));

        ChangePasswordHeader.setBackground(new java.awt.Color(0, 102, 102));
        ChangePasswordHeader.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        ChangePasswordHeader.setForeground(new java.awt.Color(255, 255, 255));
        ChangePasswordHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChangePasswordHeader.setText("Change Password");
        ChangePasswordHeader.setOpaque(true);
        ChangePasswordHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePasswordHeaderMouseClicked(evt);
            }
        });

        crossButton.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        crossButton.setForeground(new java.awt.Color(0, 102, 102));
        crossButton.setText("x");
        crossButton.setBorder(null);
        crossButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossButtonActionPerformed(evt);
            }
        });

        newPasswordInput.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        newPasswordInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        newPasswordLabel.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        newPasswordLabel.setForeground(new java.awt.Color(0, 102, 102));
        newPasswordLabel.setText("Enter password here");

        DoneButton.setBackground(new java.awt.Color(0, 102, 102));
        DoneButton.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        DoneButton.setForeground(new java.awt.Color(255, 255, 255));
        DoneButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DoneButton.setText("Done");
        DoneButton.setOpaque(true);
        DoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(crossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(newPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(ChangePasswordHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(DoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(ChangePasswordHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(DoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChangePasswordHeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordHeaderMouseClicked

    }//GEN-LAST:event_ChangePasswordHeaderMouseClicked

    private void crossButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_crossButtonActionPerformed

    private void DoneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtonMouseClicked
        
        String newPassword = newPasswordInput.getText();
    
    // Check if the password is empty
    if(newPassword.isEmpty()) {
        JOptionPane.showMessageDialog(new JFrame(), "Please enter a new password", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if the password meets minimum length requirement
    if(newPassword.length() < 8) {
        JOptionPane.showMessageDialog(new JFrame(), "Password should be at least 8 characters long", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if the password contains at least one digit
    if(!newPassword.matches(".*\\d.*")) {
        JOptionPane.showMessageDialog(new JFrame(), "Password should contain at least one digit", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if the password contains at least one uppercase letter
    if(!newPassword.matches(".*[A-Z].*")) {
        JOptionPane.showMessageDialog(new JFrame(), "Password should contain at least one uppercase letter", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if the password contains at least one lowercase letter
    if(!newPassword.matches(".*[a-z].*")) {
        JOptionPane.showMessageDialog(new JFrame(), "Password should contain at least one lowercase letter", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // If all checks pass, change the password
    user.changePssword(newPassword);
    this.dispose();
    }//GEN-LAST:event_DoneButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChangePasswordHeader;
    private javax.swing.JLabel DoneButton;
    private javax.swing.JButton crossButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newPasswordInput;
    private javax.swing.JLabel newPasswordLabel;
    // End of variables declaration//GEN-END:variables
}