
package main;

import entidad.perro;
import servicio.servicioperro;

public class NewMain {

 
    public static void main(String[] args) {
       
        perro p = new perro();
        servicioperro sp = new servicioperro();
        
        sp.gralPerro(p);
    }
    
}
