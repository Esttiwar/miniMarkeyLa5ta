/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minimarketla5ta.modelo.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author David
 */
public class Conexion {
    
    private static Connection conect;
    
    public static void conectar(){
    
        String url= "jdbc:mysql://localhost:3306/productos";
        String usr= "root";
        String ctr= "Jose.0508";
                
        try {
            conect= DriverManager.getConnection(url, usr,ctr );
            JOptionPane.showMessageDialog(null, "Si Conectó");
            
            
        }  catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
             JOptionPane.showMessageDialog(null, "No Conectó");
            
        }
    }

    public static Connection getConect() {
        return conect;
    }
    
}
