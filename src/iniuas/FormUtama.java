package iniuas;
import java.sql.*;
import javax.swing.JOptionPane;

public class FormUtama extends javax.swing.JFrame {

    public FormUtama() {
        initComponents();
        menuUtama.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formTentangPembuat = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        menuLogin = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        tombolLogin = new javax.swing.JButton();
        tombolKeluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        menuUtama = new javax.swing.JMenuBar();
        menuBarFile = new javax.swing.JMenu();
        menuDataWarga = new javax.swing.JMenuItem();
        menuBayarIuranBulanan = new javax.swing.JMenuItem();
        menuKeluar = new javax.swing.JMenuItem();
        menuBarBantuan = new javax.swing.JMenu();
        menuTentangPembuat = new javax.swing.JMenuItem();

        formTentangPembuat.setMinimumSize(new java.awt.Dimension(500, 450));

        jLabel2.setText("SISTEM INFORMASI ( SIF B )");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Who Make This?");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Andi Muhammad Nauval Ramadhan");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("2023081039");

        jLabel9.setText("Kontak : ");

        jLabel10.setText("Instagram : @andimnrz");

        jLabel11.setText("Facebook : thisisandimnrz");

        jLabel12.setText("Whatsapp : +62 821 6700 4112");

        jLabel13.setText("Github rep : SummerFHD");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iniuas/FotoWibu.jpg"))); // NOI18N

        javax.swing.GroupLayout formTentangPembuatLayout = new javax.swing.GroupLayout(formTentangPembuat.getContentPane());
        formTentangPembuat.getContentPane().setLayout(formTentangPembuatLayout);
        formTentangPembuatLayout.setHorizontalGroup(
            formTentangPembuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formTentangPembuatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formTentangPembuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(25, 25, 25))
        );
        formTentangPembuatLayout.setVerticalGroup(
            formTentangPembuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formTentangPembuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formTentangPembuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formTentangPembuatLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addComponent(jLabel14))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bayar Iuran Warga");
        setPreferredSize(new java.awt.Dimension(760, 660));

        menuLogin.setTitle("Login From");
        menuLogin.setPreferredSize(new java.awt.Dimension(252, 450));
        menuLogin.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Password");

        tombolLogin.setBackground(new java.awt.Color(255, 255, 51));
        tombolLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tombolLogin.setText("Login");
        tombolLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolLoginActionPerformed(evt);
            }
        });

        tombolKeluar.setBackground(new java.awt.Color(51, 255, 51));
        tombolKeluar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tombolKeluar.setText("Keluar");
        tombolKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKeluarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("WELCOME TO IURAN WARGA ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textUsername)
                    .addComponent(passwordField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tombolLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLoginLayout = new javax.swing.GroupLayout(menuLogin.getContentPane());
        menuLogin.getContentPane().setLayout(menuLoginLayout);
        menuLoginLayout.setHorizontalGroup(
            menuLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLoginLayout.setVerticalGroup(
            menuLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        desktopPane.setLayer(menuLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
        );

        menuBarFile.setText("File");

        menuDataWarga.setText("Data Warga");
        menuDataWarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDataWargaActionPerformed(evt);
            }
        });
        menuBarFile.add(menuDataWarga);

        menuBayarIuranBulanan.setText("Bayar Iuran Bulanan");
        menuBayarIuranBulanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBayarIuranBulananActionPerformed(evt);
            }
        });
        menuBarFile.add(menuBayarIuranBulanan);

        menuKeluar.setText("Keluar");
        menuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKeluarActionPerformed(evt);
            }
        });
        menuBarFile.add(menuKeluar);

        menuUtama.add(menuBarFile);

        menuBarBantuan.setText("Bantuan");

        menuTentangPembuat.setText("Tentang Pembuat");
        menuTentangPembuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTentangPembuatActionPerformed(evt);
            }
        });
        menuBarBantuan.add(menuTentangPembuat);

        menuUtama.add(menuBarBantuan);

        setJMenuBar(menuUtama);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuKeluarActionPerformed

    private void menuTentangPembuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTentangPembuatActionPerformed
        formTentangPembuat.setLocationRelativeTo(this);
        formTentangPembuat.setVisible(true);
    }//GEN-LAST:event_menuTentangPembuatActionPerformed

    private void menuDataWargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDataWargaActionPerformed
        desktopPane.removeAll();
        FormDataWarga FormDataWarga = new FormDataWarga();
        desktopPane.add(FormDataWarga).setVisible(true);
    }//GEN-LAST:event_menuDataWargaActionPerformed

    private void menuBayarIuranBulananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBayarIuranBulananActionPerformed
        desktopPane.removeAll();
        FormBayarIuranBulanan FormBayarIuranBulanan = new FormBayarIuranBulanan();
        desktopPane.add(FormBayarIuranBulanan).setVisible(true);
    }//GEN-LAST:event_menuBayarIuranBulananActionPerformed

    private void tombolLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolLoginActionPerformed

        String cekUsername = textUsername.getText();
        String cekPassword = String.valueOf(passwordField.getPassword());

        DataLogin db = new DataLogin();

        db.cek(cekUsername, cekPassword);

        try {

            if (db.hasil.next()) {

                menuUtama.setVisible(true);

//                db.hasil.close();
//                db.koneksi.close(); //--

                menuLogin.dispose();
            }

            else {
                
                JOptionPane.showMessageDialog(this, "Username atau Password yang kamu masukan salah");
                
            }
        }

        catch (Exception ex){}

    }//GEN-LAST:event_tombolLoginActionPerformed

    private void tombolKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_tombolKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JDialog formTentangPembuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuBarBantuan;
    private javax.swing.JMenu menuBarFile;
    private javax.swing.JMenuItem menuBayarIuranBulanan;
    private javax.swing.JMenuItem menuDataWarga;
    private javax.swing.JMenuItem menuKeluar;
    private javax.swing.JInternalFrame menuLogin;
    private javax.swing.JMenuItem menuTentangPembuat;
    private javax.swing.JMenuBar menuUtama;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textUsername;
    private javax.swing.JButton tombolKeluar;
    private javax.swing.JButton tombolLogin;
    // End of variables declaration//GEN-END:variables
}
