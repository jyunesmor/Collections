package entidad;

import java.util.Objects;
import java.util.TreeSet;

public class paises implements Comparable<paises> {

    private String paises;

    public paises() {
    }

    public paises(String paises) {
        this.paises = paises;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.paises);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final paises other = (paises) obj;
        if (!Objects.equals(this.paises, other.paises)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " El Pais Ingresado es [ " + paises + " ]";
    }

    
    // ordenar Nombres de Paises
    @Override
    public int compareTo(paises t) {
        return this.paises.compareTo(t.getPaises());
    }



} // Fin Clase Paises


