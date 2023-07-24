
package com.mycompany.minimarketla5ta.vista;

/**
 *
 * @author David
 */
public class ManejadorPantallas {
  
  private static VProducto pantallaProducto;
    
    
    public static void abrirPantallaProducto(){
        
    pantallaProducto = new VProducto();
    pantallaProducto.setVisible(true);
    pantallaProducto.setLocationRelativeTo(null);
        
    }
    
    public static void cerrarPantallaProducto(){
    pantallaProducto.setVisible(false);
    pantallaProducto=null;
    
    }
}
