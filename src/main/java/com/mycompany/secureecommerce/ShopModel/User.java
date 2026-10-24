/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secureecommerce.ShopModel;

/**
 *
 * @author Alexb
 */
public class User {
    
    private String userId;
    private String name;
    private String passwordHash;
    
    public User(String userId, String name, String passwordHash){   
        this.userId = userId;
        this.name = name;
        this.passwordHash = passwordHash;
    }
    
    public String getUserId(){
        return userId;
    }
    
     public String getName(){
        return name;
    }
     
      public String getPasswordHash(){
        return passwordHash;
    }
      
      public String getUserDetails(){
          return "UserID"+userId+"\n name"+name;
      }
    
    
}
