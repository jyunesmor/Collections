/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package PerrosMain;

import Entidad.Perros;
import ServicePerros.ServicioPerros;

public class MainPerros {

    public static void main(String[] args) {
    
        ServicioPerros sp = new ServicioPerros();
        
      sp.carga();

    }
    
}
