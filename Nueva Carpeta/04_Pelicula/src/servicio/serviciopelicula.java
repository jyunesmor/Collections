/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicio;

import entidad.pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import utilidades.comparadores;

public class serviciopelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<pelicula> p = new ArrayList();

    public void cargaPelicula() {
        System.out.println(" ---- Carga de Pelicula ----");
        System.out.println("");
        System.out.println(" Ingrese el nombre de la pelicula ");
        String titulo = leer.next();
        System.out.println(" Ingrese el nombre del director ");
        String director = leer.next();
        System.out.println(" Ingrese la duración de la Pelicula ");
        double duracion = leer.nextDouble();
        p.add(new pelicula(titulo, director, duracion));
    }

    public void mostrarPeliculas() {
        for (pelicula pe : p) {
            System.out.println(pe.toString());
        }
    }

    public void ordenarPorDuracionMayorHora() {
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getDuracion() > 1) {
                System.out.print(p.get(i));
            }
          System.out.println("");
        }
    }

    public void ordenarPorDuracionMayorMenor() {
// • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
        Collections.sort(p, comparadores.ordenarPorDuracionMayoraMenor);
        mostrarPeliculas();
    }

    public void ordenarPorDuracionMenorMayor() {
// • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
        Collections.sort(p, comparadores.ordenarPorDuracionMenoraMayor);
        mostrarPeliculas();
    }

    public void ordenarPorTitulo() {
// • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
        Collections.sort(p, comparadores.ordenarPorTitulo);
        mostrarPeliculas();
    }

    public void ordenarPorDirector() {
// • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
        Collections.sort(p, comparadores.ordenarPorDirector);
        mostrarPeliculas();
    }

    public void cargaGralPelicula() {
        String ops;
        int op;

        do {
            cargaPelicula();
            System.out.println(" Desea continuar la carga? S/N");
            ops = leer.next();
            System.out.println("");
        } while (ops.equalsIgnoreCase("s"));
        String opc = " ";
        int bandera = 4;
        System.out.println("");

        do {
            System.out.println("----------------------------");
            System.out.println(" -- Elija una opción -- ".toUpperCase());
            System.out.println("----------------------------");
            System.out.println("1. Mostrar Listado de Peliculas");
            System.out.println("2. Mostrar Listado de Peliculas de duración Mayor a 1 Hora");
            System.out.println("3. Mostrar Listado de Peliculas ordenadas de acuerdo a su duración de Mayor a Menor");
            System.out.println("4. Mostrar Listado de Peliculas ordenadas de acuerdo a su duración de Menor a Mayor");
            System.out.println("5. Mostrar Listado de Peliculas ordenadas por Titulo, de manera Alfabetica");
            System.out.println("6. Mostrar Listado de Peliculas ordenadas por Director de manera Alfabetica");
            System.out.println("7. Salir del Programa");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    mostrarPeliculas();
                    break;
                case 2:
                    ordenarPorDuracionMayorHora();
                    break;
                case 3:
                    ordenarPorDuracionMayorMenor();
                    break;
                case 4:
                    ordenarPorDuracionMenorMayor();
                    break;
                case 5:
                    ordenarPorTitulo();
                    break;
                case 6:
                    ordenarPorDirector();
                    break;
                case 7:
                    System.out.println(" ¿Usted Selecciono salir, Desea continuar? S/N");
                    opc = leer.next();
                    if (opc.equalsIgnoreCase("n")) {
                        bandera = 5;
                    }
                    break;
                default:
                    System.out.println(" La Opción elegida no s correcta, seleccione nuevamente");
            }
        } while (bandera != 5);

    } // Fin metodo Main Pelicula

} // Fin Clase Servicio
