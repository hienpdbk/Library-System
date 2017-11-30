/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.views.borrowers;

import static com.library.utils.Utils.WINDOW_HEIGHT;
import static com.library.utils.Utils.WINDOW_WIDTH;
import java.awt.Component;
import java.awt.PopupMenu;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hpd
 */
public class ListBookView extends javax.swing.JFrame {

    /**
     * Creates new form ListBookView
     */
    public ListBookView() {
        initComponents();
        this.setTitle("ListBookView");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        hustLabel = new javax.swing.JLabel();
        underPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        

        headerPanel.setBackground(new java.awt.Color(23, 240, 203));
        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        hustLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        hustLabel.setText("HUST LIBRARY SYSTEM");
        headerPanel.add(hustLabel);

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        underPanel.setLayout(new java.awt.BorderLayout());

        searchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 7, 2)));
        searchPanel.setPreferredSize(new java.awt.Dimension(800, 50));

        backBtn.setText("Back");

        searchInput.setText("input");

        searchBtn.setText("Search");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backBtn)
                .addGap(68, 68, 68)
                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addContainerGap())
        );

        underPanel.add(searchPanel, java.awt.BorderLayout.PAGE_START);

        contentPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));
//        bookTable = new JTable();
        contentPanel.add(new JScrollPane(bookTable));
        
        underPanel.add(contentPanel, java.awt.BorderLayout.CENTER);
        underPanel.add(createBtnPane());
        this.add(underPanel, java.awt.BorderLayout.CENTER);

        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }// </editor-fold>                                                              

    public void setTable(JTable contentTable) {
        this.bookTable = contentTable;
    }

    private JPanel createBtnPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            java.util.logging.Logger.getLogger(ListBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListBookView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel underPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel contentPanel;
    
    private javax.swing.JLabel hustLabel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    
    private javax.swing.JTable bookTable;
    
    // End of variables declaration                   

    
}
