/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Models.User;

/**
 *
 * @author fahadxhussain
 */
public class DeleteCourse extends javax.swing.JFrame {
    User user;
    /**
     * Creates new form DeleteCourse
     */
    public DeleteCourse() {
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

        DoneButton = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DeleteCourseHeader = new javax.swing.JLabel();
        crossButton = new javax.swing.JButton();
        courseCodeInput = new javax.swing.JTextField();
        courseCodeLabel = new javax.swing.JLabel();
        DoneBtn = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 600));
        setMinimumSize(new java.awt.Dimension(400, 600));
        setPreferredSize(new java.awt.Dimension(400, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));

        DeleteCourseHeader.setBackground(new java.awt.Color(0, 102, 102));
        DeleteCourseHeader.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        DeleteCourseHeader.setForeground(new java.awt.Color(255, 255, 255));
        DeleteCourseHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteCourseHeader.setText("Delete Course");
        DeleteCourseHeader.setOpaque(true);
        DeleteCourseHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteCourseHeaderMouseClicked(evt);
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

        courseCodeInput.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        courseCodeInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        courseCodeLabel.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        courseCodeLabel.setForeground(new java.awt.Color(0, 102, 102));
        courseCodeLabel.setText("Enter Course Code");

        DoneBtn.setBackground(new java.awt.Color(0, 102, 102));
        DoneBtn.setFont(new java.awt.Font("Kefa", 1, 18)); // NOI18N
        DoneBtn.setForeground(new java.awt.Color(255, 255, 255));
        DoneBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DoneBtn.setText("Done");
        DoneBtn.setOpaque(true);
        DoneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(DeleteCourseHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(crossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(DoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(DeleteCourseHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(crossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(135, 135, 135)
                .addComponent(courseCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(courseCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(DoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 81, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteCourseHeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteCourseHeaderMouseClicked

    }//GEN-LAST:event_DeleteCourseHeaderMouseClicked

    private void crossButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_crossButtonActionPerformed

    private void DoneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtonMouseClicked

        
    }//GEN-LAST:event_DoneButtonMouseClicked

    private void DoneBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneBtnMouseClicked

        String courseCode = courseCodeInput.getText();
        if(courseCode.equals(""))
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please fill the required field", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            user.deleteCourse(courseCode);
            this.dispose();
        }
    }//GEN-LAST:event_DoneBtnMouseClicked

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
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeleteCourseHeader;
    private javax.swing.JLabel DoneBtn;
    private javax.swing.JLabel DoneButton;
    private javax.swing.JTextField courseCodeInput;
    private javax.swing.JLabel courseCodeLabel;
    private javax.swing.JButton crossButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}