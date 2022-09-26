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

import entidad.alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<alumno> a = new ArrayList();

    public alumno cargaAlumno() {
        ArrayList<Integer> al = new ArrayList();
        System.out.println(" Ingrese el Nombre del Alumno");
        String nombre = leer.next();
        System.out.println(" Ingrese notas del Alumno");
        Integer n1 = leer.nextInt();
        Integer n2 = leer.nextInt();
        Integer n3 = leer.nextInt();
        al.add(n1);
        al.add(n2);
        al.add(n3);
        a.add(new alumno(nombre, al)); // Completamos la Lista Alumnos
        return new alumno(nombre, al); // Devolvemos el Alumno 
    }

    public void mostrarAlumos() {
        for (alumno aux : a) {
            System.out.println(aux.toString());
        }
    }

    public void notaFinal() {
        ArrayList<Integer> s = new ArrayList();
        int sum = 0;
        System.out.println(" ¿Ingrese el Alumno que desea calcular su Nota Final?");
        String alum = leer.next();       // Extraemos del ArrayList las notas del Alumno deseado
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getNombre().equalsIgnoreCase(alum)) {
                s = a.get(i).getNotas();
            }
        }
        // Sumatoria de las notas por Alumno
        for (int i = 0; i < s.size(); i++) {
            sum = sum + s.get(i);
        }
        double prom = (double) sum / s.size();
        System.out.println(" El Promedio del Alumno " + alum + " es de " + String.format("%.2f", prom) + "%");

    }

    public void alumnoGral() {
        String ops = " ";
        do {
            cargaAlumno();
            System.out.println("¿Desea Ingresar un nuevo Alumno? S/N");
            ops = leer.next();
        } while (ops.equalsIgnoreCase("s"));
        mostrarAlumos();

        notaFinal();

    }

}