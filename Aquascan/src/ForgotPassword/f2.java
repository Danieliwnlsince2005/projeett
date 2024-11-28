package ForgotPassword;

import Login.window;
import Realsignuppage.Signuppp;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;


public class f2 extends javax.swing.JFrame {

    public f2() {
        initComponents();
    pas.setEnabled(false);
    pass.setEnabled(false);
    con1.setEnabled(false);
    eye1.setEnabled(false);
    eye.setEnabled(false);
    
        // Set the frame to have rounded corners
        int arcWidth = 30; // Width of the rounded corners
        int arcHeight = 30; // Height of the rounded corners
        this.setShape(new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), arcWidth, arcHeight));

        // Add a window listener to handle resizing
        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                // Adjust the rounded shape when the frame is resized
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), arcWidth, arcHeight));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        us = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        Login1 = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        eye1 = new javax.swing.JCheckBox();
        eye = new javax.swing.JCheckBox();
        con = new javax.swing.JButton();
        con1 = new javax.swing.JButton();
        pas = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        En = new javax.swing.JLabel();
        last = new javax.swing.JLabel();
        last1 = new javax.swing.JLabel();
        En1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 10));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 590));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        us.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ForgotPassword/user (1).png"))); // NOI18N
        getContentPane().add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 222, 40, 60));

        em.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ForgotPassword/email.png"))); // NOI18N
        em.setIconTextGap(1);
        getContentPane().add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, 50));

        Login1.setBackground(new java.awt.Color(102, 51, 255));
        Login1.setFont(new java.awt.Font("Home Video", 1, 16)); // NOI18N
        Login1.setForeground(new java.awt.Color(255, 255, 255));
        Login1.setText("signup");
        Login1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login1ActionPerformed(evt);
            }
        });
        getContentPane().add(Login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 100, 30));

        Login.setBackground(new java.awt.Color(51, 204, 255));
        Login.setFont(new java.awt.Font("Home Video", 1, 16)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 90, 30));

        eye1.setBackground(new java.awt.Color(255, 255, 255));
        eye1.setBorder(null);
        eye1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ForgotPassword/eye.png"))); // NOI18N
        eye1.setIconTextGap(1);
        eye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye1MouseClicked(evt);
            }
        });
        getContentPane().add(eye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, 40));

        eye.setBackground(new java.awt.Color(255, 255, 255));
        eye.setBorder(null);
        eye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ForgotPassword/eye.png"))); // NOI18N
        eye.setIconTextGap(1);
        eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeMouseClicked(evt);
            }
        });
        getContentPane().add(eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 230, 30, 40));

        con.setFont(new java.awt.Font("Home Video", 0, 20)); // NOI18N
        con.setText("continue");
        con.setBorder(null);
        con.setContentAreaFilled(false);
        con.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        con.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conMouseClicked(evt);
            }
        });
        con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActionPerformed(evt);
            }
        });
        getContentPane().add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 130, 30));

        con1.setFont(new java.awt.Font("Home Video", 0, 18)); // NOI18N
        con1.setText("Reset my Password");
        con1.setBorder(null);
        con1.setContentAreaFilled(false);
        con1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        con1.setFocusPainted(false);
        con1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                con1MouseClicked(evt);
            }
        });
        con1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con1ActionPerformed(evt);
            }
        });
        getContentPane().add(con1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 200, 30));

        pas.setFont(new java.awt.Font("Home Video", 0, 19)); // NOI18N
        pas.setBorder(null);
        getContentPane().add(pas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 227, 194, 49));

        pass.setFont(new java.awt.Font("Home Video", 0, 19)); // NOI18N
        pass.setBorder(null);
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 315, 197, 49));

        email.setFont(new java.awt.Font("Home Video", 0, 20)); // NOI18N
        email.setBorder(null);
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 326, 192, 53));

        username.setFont(new java.awt.Font("Home Video", 0, 20)); // NOI18N
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 225, 192, 53));

        En.setFont(new java.awt.Font("Home Video", 0, 20)); // NOI18N
        En.setText("Re-enter new password..");
        getContentPane().add(En, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        last.setFont(new java.awt.Font("Home Video", 0, 20)); // NOI18N
        last.setText("Enter Email");
        getContentPane().add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        last1.setFont(new java.awt.Font("Home Video", 0, 20)); // NOI18N
        last1.setText("Enter username");
        getContentPane().add(last1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        En1.setFont(new java.awt.Font("Home Video", 0, 20)); // NOI18N
        En1.setText("Enter new password...");
        getContentPane().add(En1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ForgotPassword/We received a request to reset your password. Don’t worry, we are here to help you. (2).png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void conMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conMouseClicked

    }//GEN-LAST:event_conMouseClicked

    private void conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conActionPerformed
     String USER = username.getText().trim();
        String EMAIL = email.getText().trim();

        // Validate that fields are not empty
        if (USER.isEmpty() || EMAIL.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill up all the fields.", "ERROR", JOptionPane.WARNING_MESSAGE);
            pas.setEnabled(false);
            pass.setEnabled(false);
            con1.setEnabled(false);
        } else {
            // If credentials are valid, proceed to password reset
            boolean validUser = validateUserCredentials(USER, EMAIL);

            if (validUser) {
                JOptionPane.showMessageDialog(this, "Credentials validated. \nYou may now enter a new password.", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                // Enable the password fields for entering a new password
                pas.setEnabled(true);
                pass.setEnabled(true);
                con1.setEnabled(true);
                eye1.setEnabled(true);
                eye.setEnabled(true);

                // Lock the username and email fields so they cannot be edited anymore
                username.setEnabled(false);
                email.setEnabled(false);
                con.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or email.", "ERROR", JOptionPane.ERROR_MESSAGE);

                // Disable password fields and reset button again if credentials are invalid
                pas.setEnabled(false);
                pass.setEnabled(false);
                con1.setEnabled(false);
            }
        }
    }//GEN-LAST:event_conActionPerformed
private boolean validateUserCredentials(String username, String email) {
     try (BufferedReader br = new BufferedReader(new FileReader("userDatabase.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length == 3 && userData[0].trim().equals(username) && userData[2].trim().equals(email)) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error accessing the user database", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    private void con1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_con1MouseClicked

    }//GEN-LAST:event_con1MouseClicked

    private void con1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con1ActionPerformed
    String newPassword = new String(pas.getPassword());
        String confirmPassword = new String(pass.getPassword());

        // Check if passwords match
        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords don't match", "ERROR!", JOptionPane.ERROR_MESSAGE);
        } else if (newPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in both password fields.", "ERROR!", JOptionPane.WARNING_MESSAGE);
        } else {
            // Update password in the file
            boolean success = updatePasswordInFile(newPassword);

            if (success) {
                JOptionPane.showMessageDialog(this, "Password successfully updated", "SUCCESS", JOptionPane.PLAIN_MESSAGE);
                // Redirect back to login page
                this.dispose();
                new window().setVisible(true);  // Assuming you want to go back to the login page
            } else {
                JOptionPane.showMessageDialog(this, "Error updating password.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_con1ActionPerformed
private boolean updatePasswordInFile(String newPassword) {
    String USER = username.getText().trim();
    String EMAIL = email.getText().trim();
    File tempFile = new File("userDatabase.txt");
    File originalFile = new File("userDatabase.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(originalFile));
         PrintWriter pw = new PrintWriter(new FileWriter(tempFile))) {

        String line;
        boolean userFound = false;
        while ((line = br.readLine()) != null) {
            String[] userData = line.split(",");
            if (userData.length == 3 && userData[0].trim().equals(USER) && userData[2].trim().equals(EMAIL)) {
                // Update password for the correct user
                pw.println(userData[0] + "," + userData[1] + "," + userData[2] + "," + newPassword);
                userFound = true;
            } else {
                pw.println(line); // Write unchanged user data to temp file
            }
        }

        // If the user was found and updated, replace the old file with the new file
        if (userFound) {
            if (originalFile.exists()) {
                if (originalFile.delete()) {
                    JOptionPane.showMessageDialog(this, "Original file deleted successfully.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    if (tempFile.renameTo(originalFile)) {
                        JOptionPane.showMessageDialog(this, "Temporary file renamed successfully.", "SUCCESS", JOptionPane.PLAIN_MESSAGE);
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(this, "Error renaming the temporary file.", "SUCCESS", JOptionPane.PLAIN_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error deleting the original file.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Original file does not exist.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "User not found in the file.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error while updating the password in the database", "ERROR", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();  // This will help log the specific exception
    }
    return false;
}
    private void eyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeMouseClicked
        if (eye.isSelected()){
             pas.setEchoChar((char )0);
        } else {
            pas.setEchoChar('•');
        }                                     
    }//GEN-LAST:event_eyeMouseClicked

    private void eye1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye1MouseClicked
        if (eye1.isSelected()){
             pass.setEchoChar((char )0);
        } else {
            pass.setEchoChar('•');}
            
    }//GEN-LAST:event_eye1MouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        window nextWindow = new window(); // Ensure 'Window' class name starts with an uppercase letter
        nextWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginActionPerformed

    private void Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login1ActionPerformed
        Signuppp nextWindow = new Signuppp();
        nextWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Login1ActionPerformed
private boolean updatePassword(String newPassword) {
        // Here you would implement the logic to update the password in your database
        try {
            // Example: Update password in the database (simulated)
            System.out.println("Password updated to: " + newPassword);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel En;
    private javax.swing.JLabel En1;
    private javax.swing.JButton Login;
    private javax.swing.JButton Login1;
    private javax.swing.JLabel background;
    private javax.swing.JButton con;
    private javax.swing.JButton con1;
    private javax.swing.JLabel em;
    private javax.swing.JTextField email;
    private javax.swing.JCheckBox eye;
    private javax.swing.JCheckBox eye1;
    private javax.swing.JLabel last;
    private javax.swing.JLabel last1;
    private javax.swing.JPasswordField pas;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel us;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
