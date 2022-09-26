
package Entidad;

import java.util.HashMap;

public class productos {
//    private HashMap <Integer,String> producto;
    private String nombreProd;
    private Integer codProd;
    private Integer valorProd;
    

    public productos() {
    }

    public productos(String nombreProd, Integer valorProd) {
        this.nombreProd = nombreProd;
        this.valorProd = valorProd;
    }


//    public productos(HashMap<Integer, String> producto, Integer valorProd) {
//        this.producto = producto;
//        this.valorProd = valorProd;
//    }

//    public HashMap<Integer, String> getProducto() {
//        return producto;
//    }
//
//    public void setProducto(HashMap<Integer, String> producto) {
//        this.producto = producto;
//    }
    
    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public Integer getCodProd() {
        return codProd;
    }

    public void setCodProd(Integer codProd) {
        this.codProd = codProd;
    }

    @Override
    public String toString() {
        return " Productos \n [" + " Producto: " + nombreProd + "\n Precio: " + valorProd + " ]";
    }





}
