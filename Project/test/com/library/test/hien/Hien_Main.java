/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.test.hien;

import com.library.controllers.*;
import com.library.controllers.borrowers.BorrowerMenuController;
import com.library.controllers.librarians.SearchRegisterBorrowedController;
import com.library.helpers.Session;
import com.library.models.*;

/**
 *
 * @author hpd
 */
public class Hien_Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
//        Session.add("username", "hien");
//        Session.add("password", "11111111");
//        Session.add("role", "2");
//        Session.add("userID", "6");
//        Session.add("cardID", "4");
        
        MainController.redirect_to(null, LoginController.class);

    }
}
