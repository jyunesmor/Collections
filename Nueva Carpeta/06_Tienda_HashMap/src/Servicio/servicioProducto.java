/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import Entidad.productos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class servicioProducto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, productos> tienda = new HashMap();

    public void mainTienda(productos p) {
        do {
            System.out.println("");
            cargaProductos(p);
            System.out.println("");
        } while (!continuarCarga() == false);
        System.out.println("");
        mostrarProductos();

    }

    public boolean continuarCarga() {
        String letra;
        boolean flag = false;
        System.out.println("¿Desea Continuar con la Carga de Productos?");
        letra = leer.next().toUpperCase();
        if (letra.length() <= 1 && letra.equals("S")) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public void cargaProductos(productos p) {

        System.out.println(" Ingrese el Producto ");
        String nombre = leer.next();
        System.out.println(" Ingrese el Codigo del mismo ");
        p.setCodProd(leer.nextInt());
        System.out.println(" Ingrese Precio del Producto ");
        Integer vprod = leer.nextInt();

        tienda.put(p.getCodProd(), new productos(nombre, vprod));

    } // Fin metodo cargar Lista Map

    public void mostrarProductos() {
        for (Map.Entry<Integer, productos> aux : tienda.entrySet()) {
            System.out.println(aux.toString());
        }
    } // Fin metodo mostrar Lista Map

} // Fin Main Tienda

