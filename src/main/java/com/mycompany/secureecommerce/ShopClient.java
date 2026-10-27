/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secureecommerce;

import com.mycompany.secureecommerce.Service.UserManager;
import com.mycompany.secureecommerce.ShopUI.LoginUI;

/**
 *
 * @author Alexb
 */
public class ShopClient {

    public static void main(String[] args) {
    UserManager userManager = new UserManager();

     {
        LoginUI loginUI = new LoginUI(userManager);
        loginUI.setVisible(true);
    }
}
}
