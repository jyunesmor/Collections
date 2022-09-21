/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ServicePerros;

import Entidad.Perros;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPerros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perros> perro = new ArrayList();

    public void cargaPerros() {

        System.out.println(" Ingrese el Nombre del Perro ");
        String nombre = leer.next().toLowerCase();

        System.out.println(" Ingrese la Raza de ");
        String raza = leer.next().toLowerCase();

        System.out.println(" Ingrese la Edad ");
        Integer edad = leer.nextInt();

        perro.add(new Perros(nombre, raza, edad));

    } // Fin Metodo Carga Perros

    public void encontrarPerro() {
        int c = 0;
        System.out.println(" Ingrese el Nombre del Perro a encontrar");
        String nom = leer.next().toLowerCase();
        for (Perros aux : perro) {
            if (aux.getNombre().equals(nom)) {
                  perro.remove(aux);
                  c++;
            }             
        }
        if (c == 1) {
             System.out.println(" El Perro Ingresado se encontro en la Lista, y se Elimino");
        } else {
            System.out.println(" El Perro Ingresado no se encontro en la Lista");
        }
    } // Fin Metodo Encontrar Perro

    public void mostrarPerros() {
        for (Perros list : perro) {
            System.out.println(list.getNombre());
        }

    } // Fin Metodo Mostrar Lista Perros

    public void carga() {

        boolean flag = false;
        String bandera = "";
        do {
            System.out.println(" Ingreso de Perros ");
            System.out.println("-----------------");

            cargaPerros();

            System.out.println("-----------------");
            System.out.println(" ¿Desea continuar con la carga? ");
            bandera = leer.next();
            if (bandera.equalsIgnoreCase("n")) {
                flag = true;
                System.out.println(" Decidio Salir ");
                System.out.println(" La Lista de Perros ingresados es: ");
                mostrarPerros();
                System.out.println("");
            }
        } while (flag == false);
        
        encontrarPerro();
        System.out.println("");
        mostrarPerros();
        System.out.println("");
    } // Fin Clase Carga

} // Fin Clase Servicio
