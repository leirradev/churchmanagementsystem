/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lester.sad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Registration extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet res;
    PreparedStatement pre;
    int rawRandomNumber;

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        dbconnect();
        generate();
        empno.setText(String.valueOf(rawRandomNumber));
    }

    public void dbconnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sad", "root", "");
            System.out.println("Connected...");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getNextException());
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        empno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rmale = new javax.swing.JRadioButton();
        rfemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        position = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CHURCH RESERVATION SYSTEM");
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PERSONAL INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 20), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("First Name: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(550, 90, 180, 40);

        mname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        mname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mname.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        mname.setOpaque(false);
        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        jPanel1.add(mname);
        mname.setBounds(770, 130, 200, 40);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Middle Name: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(780, 90, 180, 40);

        fname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        fname.setOpaque(false);
        jPanel1.add(fname);
        fname.setBounds(540, 130, 200, 40);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("    Last Name : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 90, 180, 40);

        lname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        lname.setOpaque(false);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname);
        lname.setBounds(310, 130, 200, 40);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setText("   Employee Number : ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 250, 280, 40);

        empno.setEditable(false);
        empno.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        empno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empno.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        empno.setEnabled(false);
        empno.setOpaque(false);
        empno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empnoActionPerformed(evt);
            }
        });
        jPanel1.add(empno);
        empno.setBounds(310, 250, 260, 40);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("       Gender :  ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 310, 170, 31);

        gender.add(rmale);
        rmale.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        rmale.setText("Male");
        rmale.setOpaque(false);
        jPanel1.add(rmale);
        rmale.setBounds(330, 310, 90, 31);

        gender.add(rfemale);
        rfemale.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        rfemale.setText("Female");
        rfemale.setOpaque(false);
        jPanel1.add(rfemale);
        rfemale.setBounds(420, 310, 110, 31);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Position:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(810, 240, 180, 50);

        contact.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        contact.setOpaque(false);
        jPanel1.add(contact);
        contact.setBounds(310, 350, 260, 40);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setText("Contact Number :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(70, 350, 240, 40);

        position.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        position.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Administrator", "Secretary" }));
        position.setBorder(new javax.swing.border.MatteBorder(null));
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });
        jPanel1.add(position);
        position.setBounds(810, 290, 190, 50);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText(" *");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1000, 290, 40, 50);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText(" *");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(970, 130, 40, 40);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText(" *");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(740, 130, 30, 40);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText(" *");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(510, 130, 30, 40);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText(" *");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(570, 350, 30, 40);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Required Fields * ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(920, 390, 160, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(120, 170, 1090, 430);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/churchreservationmanagementsystem/Rgistration.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 370, 100);

        btnadd.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnadd.setForeground(new java.awt.Color(0, 102, 204));
        btnadd.setText("ADD USER");
        btnadd.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 204)));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd);
        btnadd.setBounds(920, 620, 290, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/churchreservationmanagementsystem/Backgrounds.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1330, 750);

        setSize(new java.awt.Dimension(1347, 884));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameActionPerformed

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionActionPerformed

    public void generate() {
        int min = 1;
        int max = 29999;
        for (int i = 0; i < 29998; i++) {
            rawRandomNumber = (int) (Math.random() * (max - min + 1)) + min;
        }
    }

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        try {
            stmt = conn.createStatement();
            String emp = empno.getText().trim(),
                    firstname = fname.getText().trim(),
                    middlename = mname.getText().trim(),
                    lastname = lname.getText().trim(),
                    gen = "",
                    num = contact.getText().trim(),
                    type = "";
            if (rmale.isSelected() == true) {
                gen = "male";
            }  if (rfemale.isSelected() == true) {
                gen = "female";
            }  if (position.getSelectedItem() == "Administrator"){
                type = "Administrator";
            } if (position.getSelectedItem() == "Secretary"){
                type = "Secretary";
            }
            String sql = "INSERT INTO emp"
                    + " VALUES('" + emp + "','" + firstname + "','" + middlename + "','" + lastname +
                    "','" + gen + "','" + num + "','" + type + "')";
            pre = conn.prepareStatement(sql);
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully registered!");
            this.setVisible(false);
            new Home().setVisible(true);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void empnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empnoActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField empno;
    private javax.swing.JTextField fname;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JComboBox position;
    private javax.swing.JRadioButton rfemale;
    private javax.swing.JRadioButton rmale;
    // End of variables declaration//GEN-END:variables
}
