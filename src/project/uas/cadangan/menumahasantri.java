/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.uas.cadangan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author str5
 */
public class menumahasantri extends javax.swing.JFrame {

    /**
     * Creates new form menumahasantri
     */
    public menumahasantri() {
        initComponents();
    }
    
    String nama1,nokamar1,jurusan1,nim1;
    
    public String getnama1(){
    return nama1;
    }
    public void setnama1(String nama1){
    this.nama1=nama1;
    }
    
    public String getnim1(){
        return nim1;
    }
    public void setnim1(String nim1){
    this.nim1=nim1;
    }
    
    public String getpass1(){
        return nim1;
    }
    public void setpass1(String nim1){
    this.nim1=nim1;
    }
    
    public String nokamar1(){
        return nokamar1;
    }
    public void setkamar1(String nokamar1){
    this.nokamar1=nokamar1;
    }
    
    public String jurusan1(){
        return jurusan1;
    }
    public void setjurusan1(String jurusan1){
    this.jurusan1=jurusan1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gantipass = new javax.swing.JButton();
        newpass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nim = new javax.swing.JLabel();
        jurusan = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gantipass.setText("Ganti Password");
        gantipass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gantipassActionPerformed(evt);
            }
        });
        getContentPane().add(gantipass, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, -1, -1));

        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        getContentPane().add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 140, -1));

        jLabel3.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. Kamar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password Baru");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        jButton2.setText("Cek rincian iqob");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Daftar Sanksi Iqob");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 850, 210));

        nama.setBackground(new java.awt.Color(0, 51, 51));
        nama.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 180, 20));
        getContentPane().add(nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 200, 20));
        getContentPane().add(jurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 200, 20));
        getContentPane().add(nokamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 140, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/uas/cadangan/newpackage/Copy of Police Recruitment Flyer - Made with PosterMyWall.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gantipassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gantipassActionPerformed
        String newPass = this.newpass.getText();
      
//        String kelasValue = ComboGrup.getSelection().getActionCommand();

        try {
            String sql = "UPDATE menumahasantri SET "
                    + "pass = '" + newPass+"'";
            
            

            Connection conn = (Connection) conect.konekdb();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update");

//            this.componentForm("edit");
//            kosongForm();
//            tampilData();
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal di Update");
            System.out.println(e);
        }     
        
               

           
    }//GEN-LAST:event_gantipassActionPerformed

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

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
            java.util.logging.Logger.getLogger(menumahasantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menumahasantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menumahasantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menumahasantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menumahasantri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gantipass;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jurusan;
    public static final javax.swing.JLabel nama = new javax.swing.JLabel();
    private javax.swing.JTextField newpass;
    private javax.swing.JLabel nim;
    public static final javax.swing.JLabel nokamar = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
