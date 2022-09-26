/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class servicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Integer> n = new ArrayList();
    ArrayList <Alumno> al = new ArrayList();
    
    public void cargaAlumno(Alumno a) {

        System.out.println(" ---- Carga Notas Alumnos ----".toUpperCase());
        System.out.println("");
        System.out.println("Ingrese el Nombre del Alumno");
        a.setNombre(leer.next());
        System.out.println("");
        String opc= " ";
        int x = 0;
        do {
            x++;
            System.out.println("Ingrese la Nota "+ x +" del Alumno " + a.getNombre());
            Integer no =leer.nextInt();
            n.add(no);
            System.out.println("Desea Cargar otra Nota del Alumno " + a.getNombre());
            opc = leer.next();
            a.setNotas(n);
            al.add(new Alumno(a.getNombre(),a.getNotas()));
        } while (opc.equalsIgnoreCase("s"));


    } // Fin metodo Carga Alumno
    
    public void mostrarAlumnos(Alumno a){
        for (Alumno aux : al) {
            System.out.println(aux.getNombre());
            System.out.println(aux.getNotas());
        }
    } // Fin metodo Mostrar Alumno
    
    public void consultarAlumno(Alumno a){
        System.out.println(" ");
        System.out.println(" Ingrese el Alumno a consultar su Promedio Final");
        
    } // Fin metodo Consultar Alumno

    public void cargarNotasAlumnos(Alumno a){
        String opc = " ";
        do {
            cargaAlumno(a);
            System.out.println("Desea Cargar otro Alumno");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));

            mostrarAlumnos(a);
    } // Fin metodo Carga Notas Alumno
    
    
} // Fin Clase Servicio Alumno
