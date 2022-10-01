
package Entidad;

import java.util.HashMap;

public class productos {
    private String nombreProd;
    private Integer codProd;
    private Integer valorProd;
    

    public productos() {
    }

    public productos(String nombreProd, Integer valorProd) {
        this.nombreProd = nombreProd;
        this.valorProd = valorProd;
    }

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

    public Integer getValorProd() {
        return valorProd;
    }

    public void setValorProd(Integer valorProd) {
        this.valorProd = valorProd;
    }

    
    @Override
    public String toString() {
        return " " + " Producto \n [" + " Producto: " + nombreProd + ", Precio: $ " + valorProd + " ]";
    }





}
