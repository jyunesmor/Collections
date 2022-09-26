package Main;

import Entidad.Alumno;
import Servicio.servicioAlumno;

public class mainAlumnos {

    public static void main(String[] args) {
     
        Alumno a = new Alumno();
        servicioAlumno sa = new servicioAlumno();
        

        sa.cargarNotasAlumnos(a);
        
    }
    
}
