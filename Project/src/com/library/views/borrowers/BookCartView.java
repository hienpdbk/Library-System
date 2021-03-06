/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.views.borrowers;

import java.awt.BorderLayout;
import javax.swing.*;

import static com.library.utils.Utils.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author hpd
 */
public class BookCartView extends javax.swing.JFrame {

    /**
     * Creates new form BookCartView
     */
    
    public BookCartView() {
        initComponents();
        this.setTitle("BookCartView");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        JPanel masterPane = new JPanel(new BorderLayout());
        this.add(masterPane);

        headerPanel = new javax.swing.JPanel();
        hustLabel = new javax.swing.JLabel();
        underPanel = new javax.swing.JPanel();
        backPanel = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel(new GridLayout(1, 1));

        headerPanel.setBackground(new java.awt.Color(23, 240, 203));
        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        hustLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        hustLabel.setText("HUST LIBRARY SYSTEM");
        headerPanel.add(hustLabel);

        masterPane.add(headerPanel, java.awt.BorderLayout.PAGE_START);

        underPanel.setLayout(new java.awt.BorderLayout());

        backPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 7, 2)));
        backPanel.setPreferredSize(new java.awt.Dimension(800, 50));

        backBtn.setText("Back");
       
        backPanel.setLayout(new BorderLayout());
        backPanel.setBorder(new EmptyBorder(5, 10, 5, 10));
        backPanel.add(backBtn, java.awt.BorderLayout.LINE_START);
        contentPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        contentTable = new JTable();
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 40, 20, 40));
        contentPanel.add(new JScrollPane(contentTable));
        
        underPanel.add(backPanel, java.awt.BorderLayout.PAGE_START);
        underPanel.add(contentPanel, java.awt.BorderLayout.CENTER);
        underPanel.add(createBtnPane(), java.awt.BorderLayout.PAGE_END);
        masterPane.add(underPanel, java.awt.BorderLayout.CENTER);
        
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }// </editor-fold>        
    
    private JPanel createBtnPane() {
        JPanel btnPane = new JPanel(new GridLayout(1, 3, 50, 50));
        btnPane.setBorder(BorderFactory.createEmptyBorder(20, 200, 10, 200));
        removeBtn = new JButton(REMOVE_BTN);
        submitBtn = new JButton(SUBMIT_BTN);
        addMoreBtn = new JButton(ADD_MORE_BTN);
        btnPane.add(removeBtn);
        btnPane.add(submitBtn);
        btnPane.add(addMoreBtn);
        return btnPane;
    }
    
    public void setTable(DefaultTableModel tableModel) {
        this.contentTable.removeAll();
        this.contentTable.setModel((TableModel)tableModel);
        this.contentTable.repaint();
    }
    
    public int getSelectedRow() {
        return contentTable.getSelectedRow();
    }
    
    public String getSelectedCopyID(int row) {
        if(row == -1) return null;
        String result = contentTable.getModel().getValueAt(row, 0).toString();
        return result;
    }
    
    public DefaultTableModel getTableModel() {
        return (DefaultTableModel) contentTable.getModel();
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
            java.util.logging.Logger.getLogger(BookCartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookCartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookCartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookCartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookCartView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel hustLabel;
    private javax.swing.JPanel backPanel;
    private javax.swing.JPanel underPanel;
    // content table
    private JTable contentTable;
    //btnPanel
    private JButton removeBtn;
    private JButton submitBtn;
    private JButton addMoreBtn;
    // End of variables declaration        
    
    public void setBookCartViewListener(ActionListener act) {
        backBtn.addActionListener(act);
        backBtn.setActionCommand(BACK_BTN);
        removeBtn.addActionListener(act);
        removeBtn.setActionCommand(REMOVE_BTN);
        submitBtn.addActionListener(act);
        submitBtn.setActionCommand(SUBMIT_BTN);
        addMoreBtn.addActionListener(act);
        addMoreBtn.setActionCommand(ADD_MORE_BTN);
    }

    
}
