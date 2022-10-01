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
    HashMap<Integer,productos> tienda = new HashMap();

    public void mainTienda(productos p) {
        boolean flag = false;
        do {
           
            System.out.println("MENU PRODUCTOS");
            System.out.println("");
            System.out.println("1. Ingresar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Mostrar listado de productos");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Salir");

            int ops = leer.nextInt();
            switch (ops) {
                case 1:
                    do {
                        System.out.println("");
                        cargaProductos(p);
                        System.out.println("");
                    } while (!continuarCarga() == false);
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    eliminarProducto();
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("");
                    System.out.println(" Decidiste Salir, Gracias".toUpperCase());
                    flag = true;
                    break;
                default:
                    System.out.println(" La opcion ingresada es incorrecta, ingresela nuevamente");
            }
        } while (flag == false);

    } // Fin Main Tienda

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

    public void modificarPrecio() {
        
        System.out.println(" Menu Modificar Precio ".toUpperCase());
       
        System.out.println("");
        System.out.println(" Ingrese Codigo del Producto a Modificar ");
        Integer cod = leer.nextInt();
        System.out.println(" Ingrese el nuevo valor del producto ");
        Integer nval = leer.nextInt();

        for (Map.Entry<Integer, productos> aux : tienda.entrySet()) {
            if (aux.getKey() == cod) {
               aux.getValue().setValorProd(nval);
            }
        }

    }
    
    public void eliminarProducto() {
        System.out.println("");
        System.out.println(" Ingrese Codigo del Producto a Eliminar ");
        Integer cod = leer.nextInt();

        for (Map.Entry<Integer, productos> aux : tienda.entrySet()) {
            if (aux.getKey().equals(cod)) {
                tienda.remove(aux.getKey());
            }
        }

    }
    
} // Fin Main Tienda

