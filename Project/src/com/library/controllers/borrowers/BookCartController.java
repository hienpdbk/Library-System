/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.controllers.borrowers;

import com.library.models.BookCartModel;
import com.library.models.BookModel;
import static com.library.utils.Utils.*;
import com.library.views.borrowers.BookCartView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hpd
 */
public class BookCartController {
    private BookCartView bookCartView;
    
    public BookCartController() {
        bookCartView = new BookCartView();
        setDataTable();
        bookCartView.setBookCartViewListener(new BookCartViewAction());
    }
    
    private void setDataTable() {
        bookCartView.setTable(getDataTable());
    }
    
    private JTable getDataTable() {
        JTable dataTable = new JTable();
        DefaultTableModel model;
        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;//This causes all cells to be not editable
            }
        };
        ResultSet rs; 
        rs = BookCartModel.getBookInCart();
        try {
            
            ResultSetMetaData rsMD = rs.getMetaData();
            int colNumber = rsMD.getColumnCount();
            String[] arr = new String[colNumber];
            for (int i = 0; i < colNumber; i++) {
                arr[i] = rsMD.getColumnName(i+1);
            }
            model.setColumnIdentifiers(arr);
            while(rs.next()) {
                for (int i = 0; i < colNumber; i++) {
                    arr[i] = rs.getString(i+1);
                }
                model.addRow(arr);
            }
            
            
        } catch (SQLException e) {
            
        }
        dataTable.setModel(model);
        
        
        return dataTable;
    }
    
    
    private class BookCartViewAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch(e.getActionCommand()) {
                case BACK_BTN: {
                    
                } break;
                case REMOVE_BTN: {
                    
                } break;
                case SUBMIT_BTN: {
                    
                } break;
                case ADD_MORE_BTN: {
                    
                } break;
                default: break;
            }
        }
        
    }
}