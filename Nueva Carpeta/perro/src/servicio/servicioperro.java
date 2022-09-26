
package servicio;

import entidad.perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class servicioperro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <perro> p = new ArrayList();
    
        
    public void cargaPerro(perro pe){
        System.out.println("---- Cargar Nombre y Raza ----".toUpperCase());
        System.out.println(" Ingrese el Nombre del Perro ".toUpperCase());
        pe.setNombre(leer.nextLine());
        System.out.println(" Ingrese la raza del Perro".toUpperCase());
        pe.setRaza(leer.nextLine());
         
        p.add(new perro(pe.getNombre(),pe.getRaza()));
    }
    
    public void mostrarPerro(perro pe){
        System.out.println(" Los Perros Ingresados son: ");
        for (perro aux : p) {
            System.out.println(aux.toString());
        }
    }
   
    public boolean comparacionPerro(perro pe){
        boolean flag = false;
        System.out.println(" Ingrese el Nombre a Comparar y Eliminar de encontrarse");
        String nombre = leer.next();
        Iterator <perro> it = p.iterator();
        while (it.hasNext()) {
            String aux = it.next().getNombre();
            if (aux.equalsIgnoreCase(nombre) ) {
               it.remove();
               flag = true;
            }
        }
        return flag;
//        for (int i = 0; i < p.size(); i++) {
//            if (p.get(i).getNombre().equalsIgnoreCase(nombre) ) {
//                p.remove(i);
//            }
//        }
    }
    
    public void gralPerro(perro pe){
        
        String ops = " ";
        do{
            cargaPerro(pe);
                 
            System.out.println("");
            System.out.println(" ¿Desea Cargar un nuevo Perro? S/N");
            ops = leer.nextLine();
        } while(ops.equalsIgnoreCase("s"));
   
            mostrarPerro(pe);
            System.out.println("");
            System.out.println(" La Cantidad de Perros Ingresados son: "+ p.size());
            System.out.println("");
            
            if (comparacionPerro(pe) == true ) {
                System.out.println("");
                System.out.println("El Nombre estaba en la Lista".toUpperCase());
                System.out.println("se elimino correctamente".toUpperCase());
                mostrarPerro(pe);
             } else {
                System.out.println("");
                System.out.println(" El Nombre no estaba en la Lista".toUpperCase());
                mostrarPerro(pe);
            }
            System.out.println("");
           
    }
    
  
} // Fin Clase Servicio Perro
