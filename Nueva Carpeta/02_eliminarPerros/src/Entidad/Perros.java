/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;

public class Perros {
    
    private String nombre;
    private String raza;
    private Integer edad;
    private ArrayList perro; 

    public Perros() {
    }

    public Perros(String nombre,String raza,Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public ArrayList getPerro() {
        return perro;
    }

    public void setPerro(ArrayList perro) {
        this.perro = perro;
    }
    

    @Override
    public String toString() {
        return "Perros{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
}
