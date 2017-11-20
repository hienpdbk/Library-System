/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.controllers;
import com.library.views.LibrarianManageView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Ronaldo Hanh
 */
public class LibrarianManageController implements BaseController {
    private LibrarianManageView cardManageView;
    
    public LibrarianManageController(){
        this.cardManageView = new LibrarianManageView();
        cardManageView.addCardManageListener(new CardManageListener());  
    }
    
    @Override
    public void hideGUI(){
        cardManageView.setVisible(false);
    }
    
    public void showGUI(){
        cardManageView.setVisible(true);
    }
    
    class CardManageListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            MainController.redirect_to(LibrarianManageController.class, CardManageController.class);
            
        }
    }
}
