package mianpaises;

import entidad.paises;
import servicio.serviciopaises;

public class mainPaises {

    public static void main(String[] args) {
           
        
        paises p = new paises();
        serviciopaises sp = new serviciopaises();
        
        sp.servicioMain();
        System.out.println("");
    }
    
}
