/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secureecommerce.Service;
import at.favre.lib.crypto.bcrypt.BCrypt;
import javax.crypto.SecretKey;

/**
 *
 * @author Alexb
 */
public class SecurePayments {
    
    private SecretKey aesKey;
    
    
    public  SecurePayments(SecretKey aesKey){
        this.aesKey = aesKey;
    }
    
    
    
    public String hashPassword(String password){
      // Generate a salt and return the complete encoded bcrypt hash.
        return BCrypt.withDefaults()
            .hashToString(12, password.toCharArray());

    }
                       
    
     public static boolean verifyPassword(String password, String storedHash){
      // Check the password using the salt and settings in storedHash.
        BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), storedHash);

            return result.verified;
            
        }
            
                
            
     
     
      public boolean verifyToken(String token, String storedTokenHash){
                        return verifyPassword(token, storedTokenHash);
      }
     
         //   public String encrypt(String message){}
            
         //   public String decrypt(String message){}
    
     
      //   public byte[] generateNonce(){ }
    
}
