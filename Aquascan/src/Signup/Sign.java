package Signup;

import Login.window;
import java.awt.Color;
import javax.swing.*;
import java.awt.geom.RoundRectangle2D;

public class Sign extends javax.swing.JFrame {
     public Sign() {
        // Initialize components and set frame properties
        initComponents();

        // Set the frame to have rounded corners
        int arcWidth = 20; // Width of the rounded corners
        int arcHeight = 20; // Height of the rounded corners
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

        sidepane = new swing.Rounded();
        upperpane = new swing.GruPanel();
        quit = new javax.swing.JButton();
        notif = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        dashlab2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        header = new swing.Gradpanel();
        tab = new javax.swing.JTabbedPane();
        hometab = new swing.RundPane();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        triplecolored1 = new swing.triplecolored();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        logo = new swing.RoundPanel();
        iconplaced = new swing.RoundPanel();
        home = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        result = new javax.swing.JButton();
        conserved = new javax.swing.JButton();
        inbox = new javax.swing.JButton();
        setting = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(10, 100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1148, 610));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 27, 20, 490));

        upperpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/remove_5859923.png"))); // NOI18N
        quit.setBorder(null);
        quit.setBorderPainted(false);
        quit.setContentAreaFilled(false);
        quit.setIconTextGap(0);
        quit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/remove (2).png"))); // NOI18N
        quit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/remove (2).png"))); // NOI18N
        quit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                quitMouseDragged(evt);
            }
        });
        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitMouseClicked(evt);
            }
        });
        upperpane.add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1115, 0, 30, 40));

        notif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/notification.png"))); // NOI18N
        notif.setBorder(null);
        notif.setBorderPainted(false);
        notif.setContentAreaFilled(false);
        notif.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/notification (1).png"))); // NOI18N
        notif.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/notification (1).png"))); // NOI18N
        notif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifActionPerformed(evt);
            }
        });
        upperpane.add(notif, new org.netbeans.lib.awtextra.AbsoluteConstraints(1082, 5, 30, 30));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/menu_8634944.png"))); // NOI18N
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/menu.png"))); // NOI18N
        menu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/menu.png"))); // NOI18N
        menu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menuMouseDragged(evt);
            }
        });
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        upperpane.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 5, 30, 30));

        dashlab2.setFont(new java.awt.Font("Home Video", 2, 38)); // NOI18N
        dashlab2.setForeground(new java.awt.Color(255, 255, 255));
        dashlab2.setText("HOME");
        upperpane.add(dashlab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 330, 40));

        getContentPane().add(upperpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 960, 30));

        tab.setBackground(new java.awt.Color(0, 51, 51));

        hometab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setText("Details + picture");
        hometab.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 320, 90));

        jTextField3.setText("Details + picture");
        hometab.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 320, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/recycling_9284674-ezgif.com-resize (3).gif"))); // NOI18N
        hometab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, 180));

        jButton1.setText("jButton1");
        hometab.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, 110));

        jButton7.setText("jButton7");
        hometab.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 143, -1, 50));

        tab.addTab("home", hometab);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(triplecolored1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -15, 970, 530));

        tab.addTab("dashboard", jPanel1);

        jPanel3.setBackground(new java.awt.Color(12, 150, 156));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("jButton1");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 150, 220));

        tab.addTab("result", jPanel3);

        jPanel2.add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 74, 970, 540));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1050, 610));

        logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 70));

        iconplaced.setBackground(new java.awt.Color(0, 0, 0));
        iconplaced.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setFont(new java.awt.Font("Qilka", 0, 22)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/h2 (1).png"))); // NOI18N
        home.setText("home");
        home.setBorder(null);
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        home.setIconTextGap(5);
        home.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/house.png"))); // NOI18N
        home.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/house.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        iconplaced.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 50));

        dashboard.setFont(new java.awt.Font("Qilka", 0, 19)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/dsad.png"))); // NOI18N
        dashboard.setText("dashboard");
        dashboard.setBorder(null);
        dashboard.setBorderPainted(false);
        dashboard.setContentAreaFilled(false);
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dashboard.setIconTextGap(5);
        dashboard.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/DASSHHH (1).png"))); // NOI18N
        dashboard.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/DASSHHH (1).png"))); // NOI18N
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });
        iconplaced.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, 50));

        result.setFont(new java.awt.Font("Qilka", 0, 19)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/1013635131579590081-128 (1).png"))); // NOI18N
        result.setText("result");
        result.setBorder(null);
        result.setBorderPainted(false);
        result.setContentAreaFilled(false);
        result.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        result.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        result.setIconTextGap(5);
        result.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/NETWO (1).png"))); // NOI18N
        result.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/NETWO (1).png"))); // NOI18N
        result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultMouseClicked(evt);
            }
        });
        iconplaced.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 50));

        conserved.setFont(new java.awt.Font("Qilka", 0, 19)); // NOI18N
        conserved.setForeground(new java.awt.Color(255, 255, 255));
        conserved.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/cew.png"))); // NOI18N
        conserved.setText("conserved");
        conserved.setBorder(null);
        conserved.setBorderPainted(false);
        conserved.setContentAreaFilled(false);
        conserved.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        conserved.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        conserved.setIconTextGap(5);
        conserved.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/SAVEDDDDDD (1).png"))); // NOI18N
        conserved.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/SAVEDDDDDD (1).png"))); // NOI18N
        conserved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conservedMouseClicked(evt);
            }
        });
        iconplaced.add(conserved, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, 50));

        inbox.setFont(new java.awt.Font("Qilka", 0, 19)); // NOI18N
        inbox.setForeground(new java.awt.Color(255, 255, 255));
        inbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/9645877501606988091-128 (1).png"))); // NOI18N
        inbox.setText("inbox");
        inbox.setBorder(null);
        inbox.setBorderPainted(false);
        inbox.setContentAreaFilled(false);
        inbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inbox.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        inbox.setIconTextGap(5);
        inbox.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/MESSAGE (1).png"))); // NOI18N
        inbox.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/MESSAGE (1).png"))); // NOI18N
        inbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inboxMouseClicked(evt);
            }
        });
        iconplaced.add(inbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 110, 50));

        setting.setBackground(new java.awt.Color(102, 103, 255));
        setting.setFont(new java.awt.Font("Qilka", 1, 16)); // NOI18N
        setting.setForeground(new java.awt.Color(255, 255, 255));
        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/123123 (1).png"))); // NOI18N
        setting.setText("settings");
        setting.setBorder(null);
        setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting.setOpaque(true);
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });
        iconplaced.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 428, 130, 40));

        Logout.setBackground(new java.awt.Color(66, 191, 183));
        Logout.setFont(new java.awt.Font("Qilka", 1, 16)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/123123123 (1).png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setBorder(null);
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.setOpaque(true);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        iconplaced.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 472, 130, 40));

        info.setFont(new java.awt.Font("Qilka", 0, 14)); // NOI18N
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup/inf.png"))); // NOI18N
        iconplaced.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 50));

        getContentPane().add(iconplaced, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, 210, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
    int response = JOptionPane.showConfirmDialog(
        this, 
        "Are you sure you want to log out?", 
        "Logout Confirmation", 
        JOptionPane.YES_NO_OPTION
    );

    if (response == JOptionPane.YES_OPTION) {
        // Perform logout logic, e.g., navigate to a login screen
        new window().setVisible(true); // Assuming 'window' is your login screen
        this.dispose();
    }

    }//GEN-LAST:event_LogoutActionPerformed

    private void settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingActionPerformed
    JOptionPane.showMessageDialog(this, "Settings clicked!", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_settingActionPerformed

    private void resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseClicked
    dashlab2.setText("RESULT");
    dashlab2.setForeground(Color.WHITE); // Change the text color to green
    dashlab2.setFont(new java.awt.Font("Home Video", java.awt.Font.ITALIC, 38));
    }//GEN-LAST:event_resultMouseClicked

    private void conservedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conservedMouseClicked
dashlab2.setText("CONSERVED");
    dashlab2.setForeground(Color.WHITE); // Change the text color to green
    dashlab2.setFont(new java.awt.Font("Home Video", java.awt.Font.ITALIC, 38));        
    }//GEN-LAST:event_conservedMouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
    dashlab2.setText("DASHBOARD");
    dashlab2.setForeground(Color.WHITE); // Change the text color to green
    dashlab2.setFont(new java.awt.Font("Home Video", java.awt.Font.ITALIC, 38));
    }//GEN-LAST:event_dashboardMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
    dashlab2.setText("HOME");
    dashlab2.setForeground(Color.WHITE); // Change the text color to green
    dashlab2.setFont(new java.awt.Font("Home Video", java.awt.Font.ITALIC, 38)); // Update font
    }//GEN-LAST:event_homeMouseClicked

    private void inboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inboxMouseClicked
dashlab2.setText("INBOX");
    dashlab2.setForeground(Color.WHITE); // Change the text color to green
    dashlab2.setFont(new java.awt.Font("Home Video", java.awt.Font.ITALIC, 38));
    }//GEN-LAST:event_inboxMouseClicked

    private void quitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseDragged
    }//GEN-LAST:event_quitMouseDragged

    private void quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseClicked
       int response = JOptionPane.showConfirmDialog(
        this, 
        "Are you sure you want to exit?", 
        "Confirm Exit", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE
    );

    if (response == JOptionPane.YES_OPTION) {
        // Close the window and exit the program
        System.exit(0);
    }
    }//GEN-LAST:event_quitMouseClicked

    private void notifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notifActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

    }//GEN-LAST:event_menuActionPerformed

    private void menuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMouseDragged

     public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> { 
           new Sign().setVisible(true); 
       });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton conserved;
    private javax.swing.JButton dashboard;
    private javax.swing.JLabel dashlab2;
    private swing.Gradpanel header;
    private javax.swing.JButton home;
    private swing.RundPane hometab;
    private swing.RoundPanel iconplaced;
    private javax.swing.JButton inbox;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private swing.RoundPanel logo;
    private javax.swing.JButton menu;
    private javax.swing.JButton notif;
    private javax.swing.JButton quit;
    private javax.swing.JButton result;
    private javax.swing.JButton setting;
    private swing.Rounded sidepane;
    private javax.swing.JTabbedPane tab;
    private swing.triplecolored triplecolored1;
    private swing.GruPanel upperpane;
    // End of variables declaration//GEN-END:variables
}
