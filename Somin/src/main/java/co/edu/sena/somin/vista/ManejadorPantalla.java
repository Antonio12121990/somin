
package co.edu.sena.somin.vista;


public class ManejadorPantalla {
    
    private static Vproducto pantallaProducto;
    
    public static void abrirPantallaProducto(){
     
        pantallaProducto = new Vproducto();
        pantallaProducto.setVisible(true);
        pantallaProducto.setLocation(null);
    }
    
    public static void cerrarPantallaProducto(){
        pantallaProducto.setvisible(false);
        pantallaProducto = null;
        
    }
    
    
}
