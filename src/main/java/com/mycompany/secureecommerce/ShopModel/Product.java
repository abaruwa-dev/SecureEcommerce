/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secureecommerce.ShopModel;

/**
 *
 * @author Alexb
 */
public class Product {
    private String productId;
    private String name;
    private double price;


    public Product(String productId, String name, double price){
             this.productId = productId;
             this.name = name;
             this.price = price;
    }
    
    
    public String getProductId(){
        return productId;
    }
    
     public String getName(){
        return name;
    }
     
      public double getPrice(){
        return price;
    }
      
      public String getProductDetails(){
          return "PRODUCT CODE "+productId+"\n NAME "+name+"\n PRICE "+price;
      }
    




}


