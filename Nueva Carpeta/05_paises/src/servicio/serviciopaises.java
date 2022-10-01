/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
    usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
    conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
    si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
    los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    al usuario.
 */
package servicio;

import entidad.paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class serviciopaises {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TreeSet<paises> pais = new TreeSet();

    public void servicioMain() {

        Character letra;
        do {
//            limpiarpantalla();
            cargarPaises();
            System.out.println("");
            System.out.println(" ¿Desea cargar otro Pais? ");
            letra = leer.next().charAt(0);

        } while (letra.equals('s') || letra.equals('S'));
        System.out.println("");
//        limpiarpantalla();
        mostrarPaisesOrdenados(); // For Each para mostrarlos ordenados
        System.out.println("");
//        limpiarpantalla();
        verificacionPalabra(); // Metodo de verificacion y eliminacion
        System.out.println("");
//        limpiarpantalla();
        mostrarPaisesOrdenados(); // For Each para mostrarlos ordenados

    }  // Fin Metodo Gral

    public void cargarPaises() {

        System.out.println("");
        System.out.println(" Ingrese un Pais a su elección ");
        System.out.println("");
        String paises = leer.next().toUpperCase();

        pais.add(new paises(paises)); //Creacion Objeto Pais
    } // Fin metodo Carga Paises

    public void mostrarPaisesOrdenados() {

        for (paises pai : pais) {
            System.out.println(pai);
        }

    } // Fin Metodo Mostrar Lista

    public void verificacionPalabra() {
        int flag = 2;
          
        Iterator<paises> it = pais.iterator();
        System.out.println("");
        System.out.println(" Ingrese un Pais a verificar ");
        System.out.println("");
        String opc = leer.next().toUpperCase();
        System.out.println("");
        while (it.hasNext()) {
            String aux = it.next().getPaises();
            if (aux.equalsIgnoreCase(opc)) {
                System.out.println(" El Pais se encuentra en el Listado, ¿Desea Eliminarlo?");
                String l = leer.next();
                if (l.equalsIgnoreCase("s")) {
                    it.remove();
                    System.out.println(" El Pais fue eliminado correctamente");
                }
                flag = 3;
            }else{
                flag = 1;
            }
        }

        if (flag == 3) {
            System.out.println(" El Pais Ingresado no se elimino de la Lista");
        } 
         if (flag == 1) {
            System.out.println(" El Pais Ingresado no se encuentra en la Lista");
        } 
        

    }  // Fin Metodo control si el Pais esta o no

   
//    public void limpiarpantalla() {
//       System.out.print("\033[H\033[2J");
//       System.out.flush();
//       
//    }

} // Fin Clase Servicio Paises
