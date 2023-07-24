
package com.mycompany.minimarketla5ta;

import com.mycompany.minimarketla5ta.modelo.controlador.Conexion;
import com.mycompany.minimarketla5ta.vista.ManejadorPantallas;

/**
 *
 * @author David
 */
public class MinimarketLa5ta {

    public static void main(String[] args) {
        
        Conexion.conectar();
        ManejadorPantallas.abrirPantallaProducto();
    }
}
