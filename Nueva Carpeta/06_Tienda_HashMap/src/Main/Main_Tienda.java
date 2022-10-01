
package Main;

import Entidad.productos;
import Servicio.servicioProducto;

public class Main_Tienda {

    public static void main(String[] args) {
       
        
        productos p = new productos();
        servicioProducto sp = new servicioProducto();
        
        
        sp.mainTienda(p);
        

    }
    
}
