/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.views.librarians;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;

/**
 *
 * @author Viet
 */
public class RegisterNewBookView extends javax.swing.JFrame {

    /**
     * Creates new form RegisterNewBookView
     */
    public RegisterNewBookView() {
       initComponents();
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(800, 500));
        //pnCardManageFunction.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNameBook = new javax.swing.JTextField();
        tfAuthor = new javax.swing.JTextField();
        cbbNxb = new javax.swing.JComboBox<>();
        tfBookID = new javax.swing.JTextField();
        btnOKRegister = new javax.swing.JButton();
        btnHuyRegister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfISBN = new javax.swing.JTextField();
        cbbSoLuong = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tfGiaTien = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thư viện Bách Khoa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Đăng kí sách mới");

        jLabel3.setText("Tên sách");

        jLabel4.setText("tác giả");

        jLabel5.setText("nhà xuất bản");

        jLabel6.setText("số lượng");

        jLabel7.setText("BookID");

        tfNameBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameBookActionPerformed(evt);
            }
        });

        tfAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAuthorActionPerformed(evt);
            }
        });

        cbbNxb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NXB Văn Học", " NXB Lao Động", "NXB Trẻ", "NXB Mỹ Thuật", " NXB Văn Hóa - Văn Nghệ", "NXB Lao Động Xã Hội", "NXB Hồng Đức", "NXB Tổng hợp TP.HCM", "NXB Hội Nhà Văn", "NXB Dân Trí", "NXB Thế Giới", "NXB Tri thức", "NXB Giáo Dục" }));
        cbbNxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNxbActionPerformed(evt);
            }
        });

        tfBookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookIDActionPerformed(evt);
            }
        });

        btnOKRegister.setText("OK");
        btnOKRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKRegisterActionPerformed(evt);
            }
        });

        btnHuyRegister.setText("Hủy");
        btnHuyRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyRegisterActionPerformed(evt);
            }
        });

        jLabel8.setText("Mã vạch");

        tfISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfISBNActionPerformed(evt);
            }
        });

        cbbSoLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cbbSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSoLuongActionPerformed(evt);
            }
        });

        jLabel9.setText("giá tiền");

        tfGiaTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGiaTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbbSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNameBook)
                                    .addComponent(tfAuthor)
                                    .addComponent(cbbNxb, 0, 192, Short.MAX_VALUE)
                                    .addComponent(tfBookID)
                                    .addComponent(tfISBN)
                                    .addComponent(tfGiaTien)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnOKRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnHuyRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNameBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbbNxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOKRegister)
                    .addComponent(btnHuyRegister))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameBookActionPerformed

    private void btnHuyRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyRegisterActionPerformed

    private void btnOKRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOKRegisterActionPerformed

    private void tfAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAuthorActionPerformed

    private void tfBookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBookIDActionPerformed

    private void tfISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfISBNActionPerformed

    private void cbbNxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNxbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbNxbActionPerformed

    private void cbbSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbSoLuongActionPerformed

    private void tfGiaTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGiaTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGiaTienActionPerformed
    private void SpSoLuongActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    public void addButtonOKRegisterNewBookListener(ActionListener listener){
        btnOKRegister.addActionListener(listener);
    }
    public void addButtonbtnHuyRegisterNewBookListener(ActionListener listener){
        btnHuyRegister.addActionListener(listener);
    }
    public String getGiaTien(){
        return tfGiaTien.getText();
    }
    public String getNameBook(){
        return tfNameBook.getText();
    }
    public String getAuthor(){
        return tfAuthor.getText();
    }
    public String getBookID(){
        return tfBookID.getText();
    }
    public String getMaVach(){
        return tfISBN.getText();
    }
    public String getNXB(){
        return cbbNxb.getSelectedItem().toString();
    }
    public String getSoLuong(){
        return cbbSoLuong.getSelectedItem().toString();
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
            java.util.logging.Logger.getLogger(RegisterNewBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterNewBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterNewBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterNewBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterNewBookView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyRegister;
    private javax.swing.JButton btnOKRegister;
    private javax.swing.JComboBox<String> cbbNxb;
    private javax.swing.JComboBox<String> cbbSoLuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfBookID;
    private javax.swing.JTextField tfGiaTien;
    private javax.swing.JTextField tfISBN;
    private javax.swing.JTextField tfNameBook;
    // End of variables declaration//GEN-END:variables
}
