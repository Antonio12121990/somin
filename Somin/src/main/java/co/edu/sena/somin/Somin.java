
package co.edu.sena.somin;

import co.edu.sena.somin.Modelo.Producto;
import co.edu.sena.somin.controlador.Conexion;
import co.edu.sena.somin.vista.ManejadorPantalla;

/**
 *
 * @author ahs43
 */
public class Somin {

    public static void main(String[] args) {
        
      Conexion.conectar();
       ManejadorPantalla.abrirPantallaProducto();
        
    }
}
