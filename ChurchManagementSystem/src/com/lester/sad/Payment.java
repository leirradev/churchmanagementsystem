/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lester.sad;

/**
 *
 * @author user
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
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

        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CHURCH RESERVATION SYSTEM");
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("  Time :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(730, 480, 100, 40);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(840, 480, 300, 40);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("  Client No : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(670, 260, 160, 40);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField2.setOpaque(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(840, 260, 300, 40);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField3.setOpaque(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(840, 320, 300, 40);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setText(" Client Name :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(640, 320, 190, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/churchreservationmanagementsystem/Pyment.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 370, 100);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "COMPUTATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("TOTAL :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 380, 90, 50);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setText("250.00");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(320, 380, 90, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(120, 220, 430, 440);

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 204));
        jButton1.setText("Print Receipt");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 255)));
        getContentPane().add(jButton1);
        jButton1.setBounds(930, 610, 260, 50);

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 204));
        jButton3.setText("HOME");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 204)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(650, 610, 260, 50);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setText("  Category :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(670, 370, 160, 40);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField4.setOpaque(false);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(840, 370, 300, 40);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField6.setOpaque(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(840, 430, 300, 40);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel13.setText("          Date : ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(670, 430, 160, 40);

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/churchreservationmanagementsystem/Backgrounds.png"))); // NOI18N
        jLabel9.setText("jLabel1");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1330, 750);

        jLabel12.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date: ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(430, 210, 90, 30);

        jTextField5.setEditable(false);
        jTextField5.setOpaque(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(490, 210, 130, 30);

        setSize(new java.awt.Dimension(1343, 787));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
