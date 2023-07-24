
package com.mycompany.minimarketla5ta.modelo.controlador;

import com.mycompany.minimarketla5ta.modelo.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author David
 */
public class CProductos {

    public ResultSet consulta;
    
    public void resgistrarProducto(Producto p){
    
        try {
            Statement st= Conexion.getConect().createStatement();
            st.execute("insert into producto values ('"+p.getIdProducto()+"','"+p.getNombreProducto()+"', '"+p.getCantidad()+"', '"+p.getPrecio()+"')");
            JOptionPane.showMessageDialog(null,"Registrado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CProductos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Problemas, No Registro");
        }
    
    }
    public ResultSet consultarProducto(){
         ResultSet rs=null;
        try {
            Statement st= Conexion.getConect().createStatement();
             rs =st.executeQuery("select * from producto ");
            
        } catch (SQLException ex) {
            Logger.getLogger(CProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    return  rs;
    }
    
    public ResultSet consultarProductoPorId(int idProducto){
    
            ResultSet rs=null;
        try {
            Statement st= Conexion.getConect().createStatement();
             rs =st.executeQuery("select * from producto where id_pro='"+idProducto+"' ");
            
        } catch (SQLException ex) {
            Logger.getLogger(CProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    return  rs;
    
    
    }
    public void modificarProducto(Producto p){
        try {
            Statement st= Conexion.getConect().createStatement();
            st.execute("update producto set nombre_pro='"+p.getNombreProducto()+"', cantidad_pro='"+p.getCantidad()+"', precio_pro='"+p.getPrecio()+"' where id_pro='"+p.getIdProducto()+"'");
            JOptionPane.showMessageDialog(null,"Actualizado");
        } catch (SQLException ex) {
            Logger.getLogger(CProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    
    public void eliminarProducto(int idProducto){
    
       try {
            Statement st= Conexion.getConect().createStatement();
            st.execute("delete from producto where id_pro='"+idProducto+"' ");
            JOptionPane.showMessageDialog(null,"Eliminado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CProductos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Problemas, No Elimino");
        }
    
    }
    
    
    
    public void pintarTabla(JTable tabla, ResultSet rs) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("IdProducto");
        modelo.addColumn("NombreProducto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");

        if (rs != null) {
            try {
                while (rs.next()) {
                    String[] fila = {rs.getString("id_pro"), rs.getString("nombre_pro"), rs.getString("cantidad_pro"), rs.getString("precio_pro")};
                    modelo.addRow(fila);
                }
            } catch (SQLException ex) {
            Logger.getLogger(CProductos.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                rs.close(); // Cerrar el ResultSet
            } catch (SQLException ex) {
                Logger.getLogger(CProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    tabla.setModel(modelo);
    }

            
}
