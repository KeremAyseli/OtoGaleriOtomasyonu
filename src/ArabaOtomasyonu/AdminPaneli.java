/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArabaOtomasyonu;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author CENE
 */
public class AdminPaneli extends javax.swing.JFrame {

    /**
     * Creates new form AdminPaneli
     */
    public AdminPaneli() {
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
        ıs_al_butonu = new javax.swing.JButton();
        ıs_kov_butonu = new javax.swing.JButton();
        yetki_butonu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IstenCikarmaId = new javax.swing.JTextField();
        İslemİd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        YeniYetki = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(38, 67, 72));

        ıs_al_butonu.setText("İşe Al");
        ıs_al_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ıs_al_butonuActionPerformed(evt);
            }
        });

        ıs_kov_butonu.setText("İşten Kov");
        ıs_kov_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ıs_kov_butonuActionPerformed(evt);
            }
        });

        yetki_butonu.setText("Yetkilendir");
        yetki_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yetki_butonuActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(38, 67, 72));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Paneli");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ad", "Soyad", "Yetki", "admin id", "admin tipi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("İşten çıkarılcak kişi id'si");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("İşlem yapılacak id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(72, 72, 72))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Yeni yetki alanı");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IstenCikarmaId, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(ıs_al_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ıs_kov_butonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yetki_butonu)
                    .addComponent(jLabel4)
                    .addComponent(YeniYetki, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(İslemİd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IstenCikarmaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ıs_al_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ıs_kov_butonu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(İslemİd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YeniYetki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yetki_butonu)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yetki_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yetki_butonuActionPerformed
       try{
        VeriTabaniIslemleri veriTabanı = new VeriTabaniIslemleri();
        veriTabanı.Guncelle("Hesap_tipi","admin_tip",Integer.parseInt(İslemİd.getText()),YeniYetki.getText());
           JOptionPane.showMessageDialog(null,"İşlem başarılı"
                   ,"İşlem Başarılı"
                   ,JOptionPane.INFORMATION_MESSAGE);
       }
       catch (Exception e){
           JOptionPane.showMessageDialog(null,"Hatalı giriş yaptınız,lütfen girdiğiniz bilgileri kontrol edip yine deneyin."
                   ,"Hatalı giriş"
                   ,JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_yetki_butonuActionPerformed

    private void ıs_kov_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ıs_kov_butonuActionPerformed
        VeriTabaniIslemleri veriTabanı = new VeriTabaniIslemleri();
        try {
            veriTabanı.Sil("Hesap_tipi", Integer.parseInt(IstenCikarmaId.getText()));
            JOptionPane.showMessageDialog(null,
                "İşlem Başarıyla yapıldı."
                ,"İşlem Başarılı"
                ,JOptionPane.INFORMATION_MESSAGE);
            TabloSilme();
            TabloDoldurma();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Hatalı giriş yaptınız,lütfen girdiğiniz bilgileri kontrol edip yine deneyin."
                ,"Hatalı giriş"
                ,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ıs_kov_butonuActionPerformed

    private void ıs_al_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ıs_al_butonuActionPerformed
        KullanıcıKayıt elemanAl = new KullanıcıKayıt();
        elemanAl.setVisible(true);
        TabloSilme();
        TabloDoldurma();
    }//GEN-LAST:event_ıs_al_butonuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        TabloDoldurma();

    }//GEN-LAST:event_formWindowOpened
public void TabloDoldurma(){
    DefaultTableModel tablo =(DefaultTableModel)jTable1.getModel();
    VeriTabaniIslemleri veriTabanı = new VeriTabaniIslemleri();
    try{
        ArrayList<HesapTipi>elemanlar =veriTabanı.VeriGetirHesapTipi();
        Object[] tabloSırası = new Object[6];
        for (int i=0;i<elemanlar.size();i++){
            tabloSırası[0]=elemanlar.get(i).id;
            tabloSırası[1]=elemanlar.get(i).personel_isim;
            tabloSırası[2]=elemanlar.get(i).personel_sifre;
            tabloSırası[3]=elemanlar.get(i).personel_tip;
            tabloSırası[4]=elemanlar.get(i).admin_id;
            tabloSırası[5]=elemanlar.get(i).admin_tip;
            tablo.addRow(tabloSırası);
        }
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null,"Veri tabanıyla bağlantı kurulamadı.Lütfen bağlantınızı kontrol edip deneyin."+e.getMessage()
                ,"Bağlantı Hatası"
                ,JOptionPane.INFORMATION_MESSAGE);
    }
}
    public void TabloSilme(){
        DefaultTableModel tablo =(DefaultTableModel)jTable1.getModel();
        for(int i=0;i<tablo.getRowCount();i++){
            tablo.removeRow(i);
        }
    }
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
            java.util.logging.Logger.getLogger(AdminPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPaneli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IstenCikarmaId;
    private javax.swing.JTextField YeniYetki;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton yetki_butonu;
    private javax.swing.JTextField İslemİd;
    private javax.swing.JButton ıs_al_butonu;
    private javax.swing.JButton ıs_kov_butonu;
    // End of variables declaration//GEN-END:variables
}
