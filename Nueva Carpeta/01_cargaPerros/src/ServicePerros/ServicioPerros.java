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
    ArrayList <Perros> perro = new ArrayList();
    
public void cargaPerros() {
     
    System.out.println(" Ingrese el Nombre del Perro ");
    String nombre = leer.next();
    
    System.out.println(" Ingrese la Raza de ");
    String raza = leer.next();
    
    System.out.println(" Ingrese la Edad ");
    Integer edad = leer.nextInt();
    
    perro.add(new Perros(nombre,raza,edad));
   
} // Fin Metodo Carga Perros
    
public void mostrarPerros(){
        for (Perros list : perro) {
           System.out.println(list.getNombre());
        }
          
} // Fin Metodo Mostrar Lista Perros

public void carga(){
    String bandera = " ";
    do{
        System.out.println(" ----- Ingreso de Perros ---- ");
        System.out.println(" ");
        
        cargaPerros();// Metodo para Cargar el ArrayList
       
        System.out.println("-----------------");
        System.out.println(" ¿Desea continuar con la carga? ");
        bandera = leer.next();

    } while (bandera.equalsIgnoreCase("s"));
    System.out.println("");
        System.out.println(" La Lista de Perros ingresados es: ");
        mostrarPerros(); // Metodo para Mostrar el ArrayList
        System.out.println("");
   
} // Fin Clase Carga
  



} // Fin Clase Servicio
