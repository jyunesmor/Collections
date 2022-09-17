/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ServicePerros;

import Entidad.Perros;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPerros {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Perros p = new Perros();  // Drear Objeto Perro
    
public void cargaPerros(Perros p) {
     
    System.out.println(" Ingrese el Nombre del Perro ");
    p.setNombre(leer.next());
    
    System.out.println(" Ingrese la Raza de ");
    p.setRaza(leer.next());
    
    System.out.println(" Ingrese la Edad ");
    p.setEdad(leer.nextInt());
    
    p.getPerro().add(p);
   
} // Fin Metodo Carga Perros
    
public void mostrarPerros(Perros p){
  
        for (Object perro : p.getPerro()) {
            System.out.println(perro);
        }
  
} // Fin Metodo Mostrar Lista Perros

public void carga(){
    
    boolean flag = false; 
    String bandera = "";
    do{
        System.out.println(" Ingreso de Perros ");
        System.out.println("-----------------");
        
        cargaPerros(p);
       
        System.out.println("-----------------");
        System.out.println(" ¿Desea continuar con la carga? ");
        bandera = leer.next();
        if (bandera.equalsIgnoreCase("n")) {
            flag = true;
            System.out.println(" Decidio Salir ");
            System.out.println(" La Lista de Perros ingresados es: ");
            mostrarPerros(p);
        } 

    } while (flag == false);

} // Fin Clase Carga
  



} // Fin Clase Servicio
