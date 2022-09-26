
package utilidades;

import entidad.pelicula;
import java.util.Comparator;

public class comparadores {

    
    public static Comparator<pelicula> ordenarPorDuracionMayoraMenor = new Comparator<pelicula> () {
        @Override
        public int compare(pelicula t, pelicula t1) {
              return Double.compare(t1.getDuracion(),t.getDuracion());
        }
    };
    
    public static Comparator<pelicula> ordenarPorDuracionMenoraMayor = new Comparator<pelicula> () {
        @Override
        public int compare(pelicula t, pelicula t1) {
                return Double.compare(t.getDuracion(),t1.getDuracion());
        }
    };
    
    public static Comparator<pelicula> ordenarPorTitulo = new Comparator<pelicula> () {
        @Override
        public int compare(pelicula t, pelicula t1) {
                return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<pelicula> ordenarPorDirector = new Comparator<pelicula> () {
        @Override
        public int compare(pelicula t, pelicula t1) {
                return t.getDirector().compareToIgnoreCase(t1.getDirector());
        }
    };

}
