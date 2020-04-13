package project.uas.cadangan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class homeadmin extends javax.swing.JFrame {

    private DefaultTableModel model;
    private int id_sanksi;

    public homeadmin() {
        initComponents();
        setLocation(200, 200);
        //menampilkan data tabel
        getData();
        awal();
        kategori() ;
        this.componentForm("id");
        tabelMhs.setEnabled(true);//nampilin dan tidak bisa di click
    }
        public void awal() {
        divisi.removeAllItems();
        try {
//            String nadiv=divisi.getSelectedItem().toString();
            Connection conn = (Connection) conect.konekdb();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("Select * from divis");

            while (result.next()) {
                String wow = result.getString("nama_divisi");
                divisi.addItem(wow);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    public void kategori() {
        kategori.removeAllItems();
        try {
//            String nadiv=divisi.getSelectedItem().toString();
            Connection conn = (Connection) conect.konekdb();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("Select * from kategori_iqob");

            while (result.next()) {
                String wow = result.getString("nama_kategori");
                kategori.addItem(wow);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public void getData() {
        Object[] baris = {"ID Sanksi", "NIM", "Nama Mahasiswa", "No. Kamar", "Kategori Iqob", "Divisi",
            "Status", "Bulan", "Tahun"};
        model = new DefaultTableModel(null, baris);
        tabelMhs.setModel(model);

        try {
            Statement stat = (Statement) conect.konekdb().createStatement();
            String sql = "SELECT REKAP.id AS ID, MHS.nim AS NIM, MHS.nama AS Nama,  "
                    + "MHS.nokamar AS No_Kamar, MHS.jurusan AS "
                    + "Jurusan, K.nama_kategori AS Kategori, "
                    + "D.nama_divisi AS Divisi, REKAP.bulan AS Bulan, "
                    + "REKAP.tahun AS Tahun, REKAP.status AS Status "
                    + "FROM tabeladmin AS REKAP, menumahasantri AS MHS, "
                    + "kategori_iqob AS K, divis AS D "
                    + "WHERE REKAP.mahasantri_nim = MHS.nim "
                    + "AND REKAP.kategori_iqob_id = K.id AND REKAP.divisi_id = D.id ";
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                String ID = res.getString("ID");
                String NIM = res.getString("NIM");
                String Nama = res.getString("Nama");
                String No_Kamar = res.getString("No_Kamar");
                String Kategori = res.getString("Kategori");
                String Divisi = res.getString("Divisi");
                String Status = res.getString("Status");
                String Bulan = res.getString("Bulan");
                String Tahun = res.getString("Tahun");

                String[] data = {ID, NIM, Nama, No_Kamar, Kategori, Divisi, Status, Bulan, Tahun};
                model.addRow(data);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kategori = new javax.swing.JComboBox<>();
        divisi = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bulan = new javax.swing.JComboBox<>();
        txttahun = new javax.swing.JTextField();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtkamar = new javax.swing.JTextField();
        txtjurusan = new javax.swing.JTextField();
        btsimpan = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMhs = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        auto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        idmenu = new javax.swing.JTextField();
        iddiv = new javax.swing.JTextField();
        idkategori = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMOR INDUK MAHASISWA (nim)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 360, -1));

        jLabel2.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA MAHASANTRI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NO. KAMAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JURUSAN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ringan", "Sedang", "Berat" }));
        getContentPane().add(kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 300, 150, -1));

        divisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "talim afkar", "talim quran", "talim bahasa arab", "talim bahasa inggris" }));
        divisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisiActionPerformed(evt);
            }
        });
        getContentPane().add(divisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 350, 150, -1));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selesai", "belum selesai" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 390, 150, -1));

        jLabel5.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KATEGORI IQOB");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DIVISI");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STATUS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 400, -1, -1));

        jButton1.setText("Cari");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 70, 30));

        jLabel8.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BULAN");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TAHUN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 100, 20));

        bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        getContentPane().add(bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 200, 120, -1));
        getContentPane().add(txttahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 100, -1));
        getContentPane().add(txtnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 180, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 180, -1));

        txtkamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkamarActionPerformed(evt);
            }
        });
        getContentPane().add(txtkamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 180, -1));
        getContentPane().add(txtjurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 180, -1));

        btsimpan.setText("SIMPAN");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, -1, -1));

        bthapus.setText("HAPUS");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });
        getContentPane().add(bthapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, -1, -1));

        tabelMhs.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMhsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelMhs);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 880, 110));

        jLabel10.setFont(new java.awt.Font("Bebas Neue Bold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("/YYYY");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, -1, 18));
        getContentPane().add(auto, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 825, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bebas Neue Bold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SANKSI");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 150, 40));

        jLabel12.setFont(new java.awt.Font("Bebas Neue Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DIVISI");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 50, 60));

        jLabel13.setFont(new java.awt.Font("Bebas Neue Bold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("IQOB");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, 60));

        jLabel14.setFont(new java.awt.Font("Bebas Neue Bold", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MAHASANTRI");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, -1, 60));

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));
        getContentPane().add(idmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 740, 50, -1));
        getContentPane().add(iddiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 740, 40, -1));
        getContentPane().add(idkategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 740, 60, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/uas/cadangan/newpackage/Copy of Salsa Dance Night Poster - Made with PosterMyWall.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void divisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisiActionPerformed

    }//GEN-LAST:event_divisiActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        String nim = this.txtnim.getText();
        int tahun = Integer.parseInt(this.txttahun.getText());

        int kategori_iqob = this.kategori.getSelectedIndex() + 1;
        int divisi = this.divisi.getSelectedIndex() + 1;
        String status = this.status.getSelectedItem().toString();
        String bulan = this.bulan.getSelectedItem().toString();

//        
        try {
            PreparedStatement gass2 = conect.konekdb().prepareStatement(""
                    + "INSERT INTO tabeladmin (mahasantri_nim, kategori_iqob_id, divisi_id,  bulan, tahun, status ) values(?,?,?,?,?,?)");

            gass2.setString(1, nim);
            gass2.setInt(2, kategori_iqob);
            gass2.setInt(3, divisi);
            gass2.setString(4, bulan);
            gass2.setInt(5, tahun);
            gass2.setString(6, status);
            gass2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            getData();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Data gagal disimpan");
        }

        txtnama.setText("");
        txtjurusan.setText("");
        txtkamar.setText("");
        txtnim.setText("");
        txttahun.setText("");
        // TODO add your handling code here:

    }//GEN-LAST:event_btsimpanActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin menghapus data sanksi ?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0) {
            try {
                String del = "delete from tabeladmin  where id=?";
                PreparedStatement st = conect.konekdb().prepareStatement(del);
                st.setInt(1, id_sanksi);
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Delete Data Sukses");
                getData();

//                this.componentForm("awal");
//            kosongForm();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Delete Data Gagal");
                System.out.println(e);
            }
        }
        txtnama.setText("");
        txtjurusan.setText("");
        txtkamar.setText("");
        txtnim.setText("");
        txttahun.setText("");
    }//GEN-LAST:event_bthapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nimValue = txtnim.getText();
        try {
            Connection conn = (Connection) conect.konekdb();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM menumahasantri"
                    + " WHERE menumahasantri.nim = " + nimValue);
            if (result.next()) {
                String namaResult = result.getString("menumahasantri.nama");
                String kamarResult = result.getString("menumahasantri.nokamar");
                String jurusanResult = result.getString("menumahasantri.jurusan");

                txtnama.setText(namaResult);
                txtkamar.setText(kamarResult);
                txtjurusan.setText(jurusanResult);
//                btedit.setEnabled(true);
                bthapus.setEnabled(true);
                btsimpan.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
//                kosongForm();
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
//                this.componentForm("cari");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMhsMouseClicked
        int row = tabelMhs.getSelectedRow();

        if (row > -1) {
            id_sanksi = Integer.parseInt(tabelMhs.getValueAt(row, 0).toString());
            System.out.println(id_sanksi);
            txtnim.setText(tabelMhs.getValueAt(row, 1).toString());
            txtnama.setText(tabelMhs.getValueAt(row, 2).toString());
            txtkamar.setText(tabelMhs.getValueAt(row, 3).toString());
            kategori.setSelectedItem(tabelMhs.getValueAt(row, 4).toString());
            divisi.setSelectedItem(tabelMhs.getValueAt(row, 5).toString());
            status.setSelectedItem(tabelMhs.getValueAt(row, 6).toString());
            bulan.setSelectedItem(tabelMhs.getValueAt(row, 7).toString());
            txttahun.setText(tabelMhs.getValueAt(row, 8).toString());

        }
    }//GEN-LAST:event_tabelMhsMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new homeadmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new menu_divisi().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new menuiqob().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new mahasantri().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtkamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkamarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new loginadmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(homeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeadmin().setVisible(true);
            }
        });
    }

    private void componentForm(String action) {
        switch (action) {
            case "id":
                txtkamar.setEnabled(false);
                txtnama.setEnabled(false);
                txtjurusan.setEnabled(false);

            case "cari":
                txtnim.setEnabled(true);
                break;

            default:
                return;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel auto;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btsimpan;
    private javax.swing.JComboBox<String> bulan;
    private javax.swing.JComboBox<String> divisi;
    private javax.swing.JTextField iddiv;
    private javax.swing.JTextField idkategori;
    private javax.swing.JTextField idmenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabelMhs;
    private javax.swing.JTextField txtjurusan;
    private javax.swing.JTextField txtkamar;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txttahun;
    // End of variables declaration//GEN-END:variables
}
