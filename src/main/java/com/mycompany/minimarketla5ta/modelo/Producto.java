
package com.mycompany.minimarketla5ta.modelo;

import java.util.Date;

/**
 *
 * @author David
 */
public class Producto {
    
    private int idProducto;
    private String nombreProducto;
    private int cantidad;
    private int precio;

    public Producto(int idProducto, String nombreProducto, int cantidad, int precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
        public String toString(){
            return "Producto{"+"idProducto="+idProducto+",nombreProducto="+nombreProducto+",camtidad="+cantidad+",precio="+precio+'}';
        }

    
}
