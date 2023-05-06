/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appFrames;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.print.attribute.standard.JobOriginatingUserName;
import com.mysql.cj.jdbc.Driver;
import databaseConnection.MySQLConnection;


/**
 *
 * @author Nikola
 */
public class polazniciLP extends javax.swing.JFrame {
    private boolean validateUser(String localUsername, String password) {
    boolean isValid = false;
    Connection conn = MySQLConnection.getInstance().getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null; 

      try {
        String query = "SELECT * FROM logintable WHERE username = ? AND password = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, localUsername);
        stmt.setString(2, password);
        rs = stmt.executeQuery();
        if (rs.next()) {
            String rank = rs.getString("ranking");
            if (rank.equals("polaznik")) {
                System.out.println("Welcome, " + localUsername + "! You are logged in as a Polaznik.");
                isValid = true;
            } else {
                System.out.println("Sorry, only users with rank Polaznik are allowed to log in.");
            }
        } else {
            System.out.println("Invalid username or password.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try { if (rs != null) rs.close(); } catch (SQLException e) { /* ignored */ }
        try { if (stmt != null) stmt.close(); } catch (SQLException e) { /* ignored */ }
        try { if (conn != null) conn.close(); } catch (SQLException e) { /* ignored */ }
    }    
    return isValid;
}

   
     
    public polazniciLP() {
        initComponents();
        
        
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
        jLabelslika1 = new javax.swing.JLabel();
        jLabelLogo2 = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jTextUSERNAME2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextSingup = new javax.swing.JTextField();
        jButtonSingup = new javax.swing.JButton();
        jButtonSingin1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 768));

        jLabelslika1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/image00051.jpg"))); // NOI18N
        jLabelslika1.setText("jLabel1");

        jLabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cfk-district-logo.png"))); // NOI18N

        jTextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsernameActionPerformed(evt);
            }
        });

        jTextUSERNAME2.setBackground(new java.awt.Color(0, 0, 102));
        jTextUSERNAME2.setForeground(new java.awt.Color(255, 255, 255));
        jTextUSERNAME2.setText("USERNAME:");
        jTextUSERNAME2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("PASSWORD:");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextSingup.setBackground(new java.awt.Color(0, 0, 102));
        jTextSingup.setForeground(new java.awt.Color(255, 255, 255));
        jTextSingup.setText("Nisi deo tima? Pridruzi se odmah!");
        jTextSingup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButtonSingup.setBackground(new java.awt.Color(70, 73, 75));
        jButtonSingup.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSingup.setText("Napravi nalog");
        jButtonSingup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSingupActionPerformed(evt);
            }
        });

        jButtonSingin1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSingin1.setText("Log In");
        jButtonSingin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSingin1ActionPerformed(evt);
            }
        });

        jButton1.setText("Start meni");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(725, 725, 725)
                        .addComponent(jTextSingup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(783, 783, 783)
                        .addComponent(jButtonSingin1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(783, 783, 783)
                        .addComponent(jButtonSingup))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelslika1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabelLogo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextUSERNAME2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextUsername)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogo2)
                    .addComponent(jButton1))
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextUSERNAME2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButtonSingin1)
                .addGap(26, 26, 26)
                .addComponent(jTextSingup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonSingup, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelslika1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsernameActionPerformed

    private void jButtonSingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSingupActionPerformed
    polazniciNalog pnn = new polazniciNalog();
    pnn.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonSingupActionPerformed

    private void jButtonSingin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSingin1ActionPerformed
        
    String localUsername = jTextUsername.getText();    
    String password = jPasswordField1.getText();
  
    if (validateUser(localUsername, password)) {
      
    } else {
        JOptionPane.showMessageDialog(this, "Invalid username or password");
    }
    
    String username = null;
        try {
            username = getUsernameFromDatabase(jTextUsername.getText(), new String(jPasswordField1.getPassword()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (username != null) {
            polazniciMenu polaznikMenu = new polazniciMenu();
            polaznikMenu.setUsername(username);
            polaznikMenu.polaznicitabela();
            polaznikMenu.setVisible(true);
             dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }
    
    }//GEN-LAST:event_jButtonSingin1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     start st = new start();        
     st.setVisible(true);
     setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
     //   /* Set the Nimbus look and feel */
    //    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       // try {
          //  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
       //         if ("Nimbus".equals(info.getName())) {
                 //   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                 //   break;
           //  /   }
          //  }
       // } catch (ClassNotFoundException ex) {
        //    java.util.logging.Logger.getLogger(polazniciLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (InstantiationException ex) {
       //     java.util.logging.Logger.getLogger(polazniciLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (IllegalAccessException ex) {
        //    java.util.logging.Logger.getLogger(polazniciLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        //    java.util.logging.Logger.getLogger(polazniciLP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // }
      //  //</editor-fold>

       // /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
       //     public void run() {
          //      new polazniciLP().setVisible(true);
         //   }
      //  });
   // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSingin1;
    private javax.swing.JButton jButtonSingup;
    private javax.swing.JLabel jLabelLogo2;
    private javax.swing.JLabel jLabelslika1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextSingup;
    private javax.swing.JTextField jTextUSERNAME2;
    private javax.swing.JTextField jTextUsername;
    // End of variables declaration//GEN-END:variables

public String getUsernameFromDatabase(String username, String password) throws SQLException {
   
    PreparedStatement stmt = null;
    ResultSet rs = null;
    String result = null;
    

    try {
        Connection conn = MySQLConnection.getInstance().getConnection();
        String sql = "SELECT username FROM polaznici WHERE username = ? AND password = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);
        rs = stmt.executeQuery();
        

        if (rs.next()) {
            result = rs.getString("username");
        }
    } finally {
        if (rs != null) {
            rs.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        }
    return result;
}}