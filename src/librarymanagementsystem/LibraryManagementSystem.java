/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibraryManagementSystem {
    
 
    public static void main(String[] args) {
      
    
        
        /* Create and display the login form*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }
    
    
}
