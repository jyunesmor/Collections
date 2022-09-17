/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;

public class Perros {
    
    private String nombre;
    private String raza;
    private int edad;
    private ArrayList perro; 

    public Perros() {
    }

    public Perros(String nombre, String raza, int edad) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
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
