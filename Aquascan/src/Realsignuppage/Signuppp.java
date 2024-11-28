package Realsignuppage;

import Login.window;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Signuppp extends javax.swing.JFrame {

    // Constructor
    public Signuppp() {
        initComponents();
    }

    // Method to save user data
    private void saveUserData(String username, String password, String email) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("userDatabase.txt", true))) {
            writer.write(username + "," + password + "," + email);
            writer.newLine();
            JOptionPane.showMessageDialog(this, "Sign up successful!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving user data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JButton();
        AQUASYNC = new javax.swing.JLabel();
        Logoaqua = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        Welcome1 = new javax.swing.JLabel();
        Welcome2 = new javax.swing.JLabel();
        Welcome3 = new javax.swing.JLabel();
        Welcome4 = new javax.swing.JLabel();
        Welcome5 = new javax.swing.JLabel();
        Hello = new javax.swing.JLabel();
        Passlogo = new javax.swing.JLabel();
        Userlogo = new javax.swing.JLabel();
        Emaillogo = new javax.swing.JLabel();
        Signupbutton = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Hello1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mainwin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 132));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setBackground(new java.awt.Color(153, 255, 255));
        Login.setFont(new java.awt.Font("Qilka", 1, 16)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 80, 23));

        AQUASYNC.setBackground(new java.awt.Color(204, 204, 204));
        AQUASYNC.setFont(new java.awt.Font("Cinzel SemiBold", 1, 26)); // NOI18N
        AQUASYNC.setForeground(new java.awt.Color(255, 255, 255));
        AQUASYNC.setText("AquaSync");
        getContentPane().add(AQUASYNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 160, 50));

        Logoaqua.setFont(new java.awt.Font("Laisha", 0, 22)); // NOI18N
        Logoaqua.setForeground(new java.awt.Color(255, 255, 255));
        Logoaqua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Realsignuppage/Watier (2).png"))); // NOI18N
        Logoaqua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Logoaqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, -30, 180, 260));

        Welcome.setFont(new java.awt.Font("Laisha", 1, 22)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("AquaSync.");
        getContentPane().add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 120, 30));

        Welcome1.setFont(new java.awt.Font("Laisha", 0, 22)); // NOI18N
        Welcome1.setForeground(new java.awt.Color(255, 255, 255));
        Welcome1.setText("Track, save, and manage ");
        getContentPane().add(Welcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 300, 30));

        Welcome2.setFont(new java.awt.Font("Laisha", 0, 22)); // NOI18N
        Welcome2.setForeground(new java.awt.Color(255, 255, 255));
        Welcome2.setText("Sign  up  to ");
        getContentPane().add(Welcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 130, 30));

        Welcome3.setFont(new java.awt.Font("Laisha", 0, 22)); // NOI18N
        Welcome3.setForeground(new java.awt.Color(255, 255, 255));
        Welcome3.setText("and lower your bills today!");
        getContentPane().add(Welcome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 300, 30));

        Welcome4.setFont(new java.awt.Font("Laisha", 0, 22)); // NOI18N
        Welcome4.setForeground(new java.awt.Color(255, 255, 255));
        Welcome4.setText("your  water  usage  with");
        getContentPane().add(Welcome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 270, 30));

        Welcome5.setFont(new java.awt.Font("Laisha", 0, 22)); // NOI18N
        Welcome5.setForeground(new java.awt.Color(255, 255, 255));
        Welcome5.setText("start   conserving  water");
        getContentPane().add(Welcome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 270, 30));

        Hello.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Hello.setForeground(new java.awt.Color(255, 255, 255));
        Hello.setText("Already have an account?");
        getContentPane().add(Hello, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, 20));

        Passlogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Passlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Realsignuppage/lock (1).png"))); // NOI18N
        Passlogo.setText(" ");
        Passlogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Passlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 80, 70));

        Userlogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Userlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Realsignuppage/user (1).png"))); // NOI18N
        Userlogo.setText("\n");
        getContentPane().add(Userlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 80, 60));

        Emaillogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Emaillogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Realsignuppage/email.png"))); // NOI18N
        Emaillogo.setText(" ");
        Emaillogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Emaillogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 200, 260));

        Signupbutton.setFont(new java.awt.Font("Qilka", 0, 21)); // NOI18N
        Signupbutton.setForeground(new java.awt.Color(51, 153, 255));
        Signupbutton.setText("Signup");
        Signupbutton.setBorder(null);
        Signupbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signupbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupbuttonMouseClicked(evt);
            }
        });
        Signupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Signupbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 140, 40));

        Username.setFont(new java.awt.Font("Nostalgic Whispers", 0, 24)); // NOI18N
        Username.setBorder(null);
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 210, 230, 43));

        Email.setFont(new java.awt.Font("Nostalgic Whispers", 0, 24)); // NOI18N
        Email.setBorder(null);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 220, 44));

        Password.setFont(new java.awt.Font("Nostalgic Whispers", 0, 24)); // NOI18N
        Password.setBorder(null);
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 356, 220, 40));

        Hello1.setFont(new java.awt.Font("Anastasia", 0, 50)); // NOI18N
        Hello1.setForeground(new java.awt.Color(255, 255, 255));
        Hello1.setText("HELLO!");
        getContentPane().add(Hello1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 120, 60));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 340, 160));

        mainwin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Realsignuppage/Untitled (1).jpeg"))); // NOI18N
        getContentPane().add(mainwin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupbuttonActionPerformed

    }//GEN-LAST:event_SignupbuttonActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
    String username = Username.getText();
    String password = new String(Password.getPassword());
    String email = Email.getText();

    // Email validation (must include '@' and '.com')
    if (!email.contains("@") || !email.contains(".com")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid Email address.", "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Write user data to a text file
    try (FileWriter writer = new FileWriter("userDatabase.txt", true)) {
        writer.write(username + "," + password + "," + email + "\n");
        JOptionPane.showMessageDialog(this, "Sign up successful!", "SUCCESS", JOptionPane.PLAIN_MESSAGE);

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving user data.");
    }
    }//GEN-LAST:event_EmailActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
    window loginWindow = new window();
    loginWindow.setVisible(true);

    this.dispose();
    }//GEN-LAST:event_LoginActionPerformed

    private void SignupbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupbuttonMouseClicked
    String username = Username.getText().trim();
    String password = Password.getText().trim();
    String email = Email.getText().trim();

    // Validate that fields are not empty
    if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill up all the fields.", "ERROR", JOptionPane.WARNING_MESSAGE);
        return;
        
    }

    // Validate email format (must include '@' and '.com')
    if (!email.contains("@") || !email.contains(".com")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid Email address.", "ERROR", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Save user data
    saveUserData(username, password, email);

    // Navigate back to the login window
    window loginWindow = new window();
    loginWindow.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_SignupbuttonMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signuppp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            new Signuppp().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AQUASYNC;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Emaillogo;
    private javax.swing.JLabel Hello;
    private javax.swing.JLabel Hello1;
    private javax.swing.JButton Login;
    private javax.swing.JLabel Logoaqua;
    private javax.swing.JLabel Passlogo;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Signupbutton;
    private javax.swing.JLabel Userlogo;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel Welcome1;
    private javax.swing.JLabel Welcome2;
    private javax.swing.JLabel Welcome3;
    private javax.swing.JLabel Welcome4;
    private javax.swing.JLabel Welcome5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mainwin;
    // End of variables declaration//GEN-END:variables
}
