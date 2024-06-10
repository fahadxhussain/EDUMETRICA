/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Database.DatabaseConnection;
import Models.CurrentUser;
import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author fahadxhussain
 */
public class SignupView extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    private Connection connection;
    private User user;
    
    public SignupView() {
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
        rightSide = new javax.swing.JPanel();
        mainLogo = new javax.swing.JLabel();
        leftSide = new javax.swing.JPanel();
        signupHeader = new javax.swing.JLabel();
        nameHead = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        usernameHead = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        passwordHead = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        signupButton = new javax.swing.JButton();
        passwordHead1 = new javax.swing.JLabel();
        loginButtonInSignup = new javax.swing.JButton();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(null);

        rightSide.setBackground(new java.awt.Color(0, 102, 102));
        rightSide.setMaximumSize(new java.awt.Dimension(560, 800));
        rightSide.setMinimumSize(new java.awt.Dimension(560, 800));
        rightSide.setPreferredSize(new java.awt.Dimension(400, 500));
        rightSide.setSize(new java.awt.Dimension(560, 800));

        mainLogo.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        mainLogo.setForeground(new java.awt.Color(255, 255, 255));
        mainLogo.setText("EduMetrica");
        mainLogo.setPreferredSize(new java.awt.Dimension(278, 72));

        javax.swing.GroupLayout rightSideLayout = new javax.swing.GroupLayout(rightSide);
        rightSide.setLayout(rightSideLayout);
        rightSideLayout.setHorizontalGroup(
            rightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSideLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        rightSideLayout.setVerticalGroup(
            rightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSideLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(533, Short.MAX_VALUE))
        );

        jPanel1.add(rightSide);
        rightSide.setBounds(0, 0, 560, 800);

        leftSide.setBackground(new java.awt.Color(255, 255, 255));
        leftSide.setPreferredSize(new java.awt.Dimension(400, 500));
        leftSide.setSize(new java.awt.Dimension(640, 800));

        signupHeader.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        signupHeader.setForeground(new java.awt.Color(0, 102, 102));
        signupHeader.setText("Sign Up");

        nameHead.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        nameHead.setForeground(new java.awt.Color(0, 102, 102));
        nameHead.setText("Name");

        name.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        usernameHead.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        usernameHead.setForeground(new java.awt.Color(0, 102, 102));
        usernameHead.setText("Username");

        username.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        passwordHead.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        passwordHead.setForeground(new java.awt.Color(0, 102, 102));
        passwordHead.setText("Password");

        password.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        signupButton.setBackground(new java.awt.Color(0, 102, 102));
        signupButton.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Sign Up");
        signupButton.setBorder(null);
        signupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupButton.setDoubleBuffered(true);
        signupButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signupButton.setMixingCutoutShape(null);
        signupButton.setOpaque(true);
        signupButton.setVerifyInputWhenFocusTarget(false);
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        passwordHead1.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        passwordHead1.setForeground(new java.awt.Color(0, 102, 102));
        passwordHead1.setText("Already have an account");

        loginButtonInSignup.setBackground(new java.awt.Color(0, 102, 102));
        loginButtonInSignup.setFont(new java.awt.Font("Kefa", 1, 14)); // NOI18N
        loginButtonInSignup.setForeground(new java.awt.Color(255, 255, 255));
        loginButtonInSignup.setText("Login");
        loginButtonInSignup.setBorder(null);
        loginButtonInSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButtonInSignup.setDoubleBuffered(true);
        loginButtonInSignup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginButtonInSignup.setMixingCutoutShape(null);
        loginButtonInSignup.setOpaque(true);
        loginButtonInSignup.setVerifyInputWhenFocusTarget(false);
        loginButtonInSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonInSignupActionPerformed(evt);
            }
        });

        confirmPasswordLabel.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(0, 102, 102));
        confirmPasswordLabel.setText("Confirm Password");

        confirmPassword.setFont(new java.awt.Font("Al Nile", 0, 14)); // NOI18N
        confirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        javax.swing.GroupLayout leftSideLayout = new javax.swing.GroupLayout(leftSide);
        leftSide.setLayout(leftSideLayout);
        leftSideLayout.setHorizontalGroup(
            leftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(signupHeader)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSideLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginButtonInSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSideLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(leftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSideLayout.createSequentialGroup()
                        .addComponent(passwordHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSideLayout.createSequentialGroup()
                        .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))))
            .addGroup(leftSideLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(leftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameHead, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameHead, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordHead, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        leftSideLayout.setVerticalGroup(
            leftSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSideLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(signupHeader)
                .addGap(52, 52, 52)
                .addComponent(nameHead, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(usernameHead, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(passwordHead, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(passwordHead1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButtonInSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jPanel1.add(leftSide);
        leftSide.setBounds(560, 0, 640, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        String name = this.name.getText();
        String username = this.username.getText();
        CurrentUser.setUsername(username);
        String password = this.password.getText();
        String confirmPassword = this.confirmPassword.getText();
        
        if(name.equals(""))
        {
            JOptionPane.showMessageDialog(new JFrame(), "Full name is required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(username.equals(""))
        {
            JOptionPane.showMessageDialog(new JFrame(), "Username is required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else if(password.equals(""))
        {
            JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else if(confirmPassword.equals(""))
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please confirm your Password", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!(confirmPassword.equals(password)))
        {
            JOptionPane.showMessageDialog(new JFrame(), "Password and confirm password do not match", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else if(password.length() < 8) {
        JOptionPane.showMessageDialog(new JFrame(), "Password should be at least 8 characters long", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // At least one digit check
        else if(!password.matches(".*\\d.*")) {
        JOptionPane.showMessageDialog(new JFrame(), "Password should contain at least one digit", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // At least one uppercase letter check
        else if(!password.matches(".*[A-Z].*")) {
        JOptionPane.showMessageDialog(new JFrame(), "Password should contain at least one uppercase letter", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // At least one lowercase letter check
        else if(!password.matches(".*[a-z].*")) {
        JOptionPane.showMessageDialog(new JFrame(), "Password should contain at least one lowercase letter", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        else
            {
                boolean usernameTaken = user.isUsernameTaken(username);
                if(usernameTaken)
                {
                    JOptionPane.showMessageDialog(new JFrame(), "Username already taken", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    user.registerUser(name, username, password);
                    DashboardView dashboard = new DashboardView();
                    CurrentUser.setUsername(username);
                    dashboard.setVisible(true);
                    this.dispose();
                    
                }
                
            }
        
    try {
        this.connection = DatabaseConnection.getConnection();
    } catch (SQLException ex) {
        Logger.getLogger(SignupView.class.getName()).log(Level.SEVERE, null, ex);
        return;  // Exit the method if the connection fails
    }
    
    
       
    }//GEN-LAST:event_signupButtonActionPerformed

    private void loginButtonInSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonInSignupActionPerformed
        LoginView loginFrame = new LoginView();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_loginButtonInSignupActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmPassword;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel leftSide;
    private javax.swing.JButton loginButtonInSignup;
    private javax.swing.JLabel mainLogo;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameHead;
    private javax.swing.JTextField password;
    private javax.swing.JLabel passwordHead;
    private javax.swing.JLabel passwordHead1;
    private javax.swing.JPanel rightSide;
    private javax.swing.JButton signupButton;
    private javax.swing.JLabel signupHeader;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameHead;
    // End of variables declaration//GEN-END:variables
}