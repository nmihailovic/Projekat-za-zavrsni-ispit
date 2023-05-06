/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appFrames;

import databaseConnection.MySQLConnection;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Nikola
 */
public class polazniciNalog extends javax.swing.JFrame {
    
   
    String fileName =  null;
    byte[] person_image = null;
    String pol = "";
    String grupa = "";
    String trener = "";
   
   

    /**
     * Creates new form polazniciNalog
     */
    public polazniciNalog() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextIme = new javax.swing.JTextField();
        jTextPrezime = new javax.swing.JTextField();
        jTextBrojTelefona = new javax.swing.JTextField();
        jComboVrstaTreninga = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jCheckMuski = new javax.swing.JCheckBox();
        jCheckZenski = new javax.swing.JCheckBox();
        jRadioIndividualni = new javax.swing.JRadioButton();
        jRadioGrupni = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextUsername2 = new javax.swing.JTextField();
        jTextPassword = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButtonNapraviAkaunt = new javax.swing.JButton();
        lbl_img = new javax.swing.JLabel();
        jButtonSlika = new javax.swing.JButton();
        jLabelEmptyUsername = new javax.swing.JLabel();
        jLabelEmptyPassword = new javax.swing.JLabel();
        jusernameeror = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jComboVrstaTreninga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Crossfit", "BodyBuilding", "Yoga", "Kardio" }));

        jTextField1.setBackground(new java.awt.Color(0, 0, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Ime:");
        jTextField1.setBorder(null);

        jTextField2.setBackground(new java.awt.Color(0, 0, 102));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Prezime:");
        jTextField2.setBorder(null);

        jTextField3.setBackground(new java.awt.Color(0, 0, 102));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Pol:");
        jTextField3.setBorder(null);

        jTextField4.setBackground(new java.awt.Color(0, 0, 102));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Broj telefona:");
        jTextField4.setBorder(null);

        jTextField5.setBackground(new java.awt.Color(0, 0, 102));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("Grupa:");
        jTextField5.setBorder(null);

        jTextField6.setBackground(new java.awt.Color(0, 0, 102));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("Vrsta treninga:");
        jTextField6.setBorder(null);

        buttonGroup1.add(jCheckMuski);
        jCheckMuski.setForeground(new java.awt.Color(255, 255, 255));
        jCheckMuski.setText("Muski");
        jCheckMuski.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckMuskiActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckZenski);
        jCheckZenski.setForeground(new java.awt.Color(255, 255, 255));
        jCheckZenski.setText("Zenski");
        jCheckZenski.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckZenskiActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioIndividualni);
        jRadioIndividualni.setForeground(new java.awt.Color(255, 255, 255));
        jRadioIndividualni.setText("Individualni");
        jRadioIndividualni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioIndividualniActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioGrupni);
        jRadioGrupni.setForeground(new java.awt.Color(255, 255, 255));
        jRadioGrupni.setText("Grupni");
        jRadioGrupni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGrupniActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cfk-district-logo.png"))); // NOI18N

        jTextUsername2.setBackground(new java.awt.Color(0, 0, 102));
        jTextUsername2.setForeground(new java.awt.Color(255, 255, 255));
        jTextUsername2.setText("Username:");
        jTextUsername2.setBorder(null);

        jTextPassword.setBackground(new java.awt.Color(0, 0, 102));
        jTextPassword.setForeground(new java.awt.Color(255, 255, 255));
        jTextPassword.setText("Password:");
        jTextPassword.setBorder(null);

        jTextField7.setBackground(new java.awt.Color(0, 0, 102));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("Izaberite svoj username i password za logovanje:");
        jTextField7.setBorder(null);

        jButtonNapraviAkaunt.setForeground(new java.awt.Color(0, 0, 0));
        jButtonNapraviAkaunt.setText("Sacuvaj");
        jButtonNapraviAkaunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNapraviAkauntActionPerformed(evt);
            }
        });

        jButtonSlika.setBackground(new java.awt.Color(0, 0, 102));
        jButtonSlika.setForeground(new java.awt.Color(0, 0, 102));
        jButtonSlika.setBorder(null);
        jButtonSlika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSlikaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datum polazka:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEmptyPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEmptyUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckMuski)
                                    .addComponent(jRadioIndividualni)
                                    .addComponent(jTextIme, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jTextPrezime))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioGrupni)
                                    .addComponent(jCheckZenski)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboVrstaTreninga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(164, 164, 164))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jusernameeror)
                                .addComponent(jButtonSlika))
                            .addGap(115, 115, 115)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButtonNapraviAkaunt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckMuski)
                            .addComponent(jCheckZenski))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioIndividualni)
                            .addComponent(jRadioGrupni))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboVrstaTreninga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelEmptyUsername)
                        .addGap(40, 40, 40)
                        .addComponent(jLabelEmptyPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonSlika))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jusernameeror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonNapraviAkaunt)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNapraviAkauntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNapraviAkauntActionPerformed
   if(jTextUsername.getText().trim().isEmpty() && jPasswordField1.getText().trim().isEmpty()){
    jLabelEmptyUsername.setText("Username is Empty");
    jLabelEmptyPassword.setText("Password is Empty");
    return;
}else if(jTextUsername.getText().trim().isEmpty()){
    jLabelEmptyUsername.setText("Username is Empty");
    return;
}else if(jPasswordField1.getText().trim().isEmpty()){
    jLabelEmptyPassword.setText("Password is Empty");
    return;
}else if(proveraUsername()){
    jLabelEmptyUsername.setText("Username already exists");
    return;
}else{
    JOptionPane.showMessageDialog(null, "Succes!");
}      
   { 


try{
Connection conn = MySQLConnection.getInstance().getConnection();
PreparedStatement stmt = null;

String query = "INSERT INTO polaznici (ime,prezime,pol,broj_telefona,grupa,trener,vrsta_treninga,images,username,password,date)VALUES(?,?,?,?,?,?,?,?,?,?,?)";        
stmt = conn.prepareStatement(query);


stmt.setString(1, jTextIme.getText());
stmt.setString(2, jTextPrezime.getText());

if (jCheckMuski.isSelected()){
    pol = "Muski";
}
if (jCheckZenski.isSelected()){
    pol = "Zenski";
}

stmt.setString(3, pol);
stmt.setString(4, jTextBrojTelefona.getText());

if (jRadioIndividualni.isSelected()){
    grupa = "individualni";
}
if (jRadioGrupni.isSelected()){
    grupa = "grupni";   
}
stmt.setString(5, grupa);

if (jRadioIndividualni.isSelected()){
    trener = "Djordje Stojkovic";
}
if (jRadioGrupni.isSelected()){
    trener = "Zarko Vidovic";
}

stmt.setString(6, trener);
stmt.setString(7, jComboVrstaTreninga.getSelectedItem().toString());

stmt.setBytes(8, person_image);
stmt.setString(9, jTextUsername.getText());
stmt.setString(10, jPasswordField1.getText());

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String date = sdf.format(jDateChooser1.getDate());

stmt.setString(11, date);

stmt.executeUpdate();

String query2 = "INSERT INTO logintable (username,password,ranking)VALUES(?,?,?)";

PreparedStatement stmt2 = null;
stmt2 = conn.prepareStatement(query2);

stmt2.setString(1, jTextUsername.getText());
stmt2.setString(2, jPasswordField1.getText());
stmt2.setString(3, "polaznik");

stmt2.executeUpdate();

conn.close();

 JOptionPane.showMessageDialog(null, "Registered Sucessfully!");
            polazniciLP plp = new polazniciLP();
            plp.setVisible(true);
            setVisible(false);

            
}catch(Exception e){
    System.out.println("Greska!" + e.getLocalizedMessage());

      
}}
            
    }//GEN-LAST:event_jButtonNapraviAkauntActionPerformed

    private void jRadioIndividualniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioIndividualniActionPerformed

    }//GEN-LAST:event_jRadioIndividualniActionPerformed

    private void jRadioGrupniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGrupniActionPerformed
 
    }//GEN-LAST:event_jRadioGrupniActionPerformed

    private void jButtonSlikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSlikaActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if(f == null){
            maleOrFemale(); 
        return;
        }else{
        fileName = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(fileName).getImage()
                .getScaledInstance
                (lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH ));
        lbl_img.setIcon(imageIcon); 
        try {
            File image = new File (fileName);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum ; (readNum=fis.read(buf)) != -1;){
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }}
        
    }//GEN-LAST:event_jButtonSlikaActionPerformed

    private void jCheckMuskiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckMuskiActionPerformed
        maleOrFemale();
    }//GEN-LAST:event_jCheckMuskiActionPerformed

    private void jCheckZenskiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckZenskiActionPerformed
 maleOrFemale();     
    }//GEN-LAST:event_jCheckZenskiActionPerformed
        
    /**
     * @param args the command line arguments
     */
  //  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see// http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
      //      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
         //       if ("Nimbus".equals(info.getName())) {
                  //  javax.swing.UIManager.setLookAndFeel(info.getClassName());
             //       break;
            //    }
         //   }
     //   } catch (ClassNotFoundException ex) {
       //     java.util.logging.Logger.getLogger(polazniciNalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     //   } catch (InstantiationException ex) {
       //     java.util.logging.Logger.getLogger(polazniciNalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      //  } catch (IllegalAccessException ex) {
        //    java.util.logging.Logger.getLogger(polazniciNalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      //  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
       //     java.util.logging.Logger.getLogger(polazniciNalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     //   }
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
        //        new polazniciNalog().setVisible(true);
       //     }
   //     });
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonNapraviAkaunt;
    private javax.swing.JButton jButtonSlika;
    private javax.swing.JCheckBox jCheckMuski;
    private javax.swing.JCheckBox jCheckZenski;
    private javax.swing.JComboBox<String> jComboVrstaTreninga;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmptyPassword;
    private javax.swing.JLabel jLabelEmptyUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioGrupni;
    private javax.swing.JRadioButton jRadioIndividualni;
    private javax.swing.JTextField jTextBrojTelefona;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextIme;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextPrezime;
    private javax.swing.JTextField jTextUsername;
    private javax.swing.JTextField jTextUsername2;
    private javax.swing.JLabel jusernameeror;
    private javax.swing.JLabel lbl_img;
    // End of variables declaration//GEN-END:variables
    

public boolean proveraUsername() {
 String username = jTextUsername.getText(); 
boolean exists = false;
PreparedStatement statement = null;
ResultSet resultSet = null;
Connection conn = MySQLConnection.getInstance().getConnection();

if (conn == null) {
    System.out.println("Connection is null");
    return false;
}

try {
    statement = conn.prepareStatement("SELECT * FROM logintable WHERE username = ?");
    statement.setString(1, username);
    resultSet = statement.executeQuery();

    if (resultSet.next()) {
        exists = true;
    }
} catch (Exception e) {
    System.out.println("Greska"+ e.getLocalizedMessage());
} finally {
    try {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

return exists; 
    
}

private void maleOrFemale(){
      if(jCheckMuski.isSelected()){
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/Images/Man.png")).getImage()
                        .getScaledInstance
                        (lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH ));
                lbl_img.setIcon(imageIcon);
                String path = getClass().getResource("/Images/Man.png").getFile();
                File fi = new File(path);
                try {
                    person_image = Files.readAllBytes(fi.toPath());
                            } catch (IOException ex) {
                    Logger.getLogger(polazniciNalog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/Images/Women.png")).getImage()
                        .getScaledInstance
                        (lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH ));
                lbl_img.setIcon(imageIcon); 
                String path = getClass().getResource("/Images/Women.png").getFile();
                File fi = new File(path);
                try {
                    person_image = Files.readAllBytes(fi.toPath());
                            } catch (IOException ex) {
                    Logger.getLogger(polazniciNalog.class.getName()).log(Level.SEVERE, null, ex);
                
                            }
      }
}


}




    


    



    
 





