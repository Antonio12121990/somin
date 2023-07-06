
package co.edu.sena.somin.controlador;

import co.edu.sena.somin.Modelo.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class cProducto {

    
    public void registrarProducto(Producto a){
    
        try {
            Statement st = Conexion.getConect().createStatement();
             st.execute("insert into producto values('"+a.getId()+"','"+a.getNombre()+"','"+a.getValor()+"','"+a.getExistencias()+"')");
             JOptionPane.showMessageDialog(null,"Registrado");
                    } catch (SQLException ex) {
            Logger.getLogger(cProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No Registrado");
        }
    
    
    }
    public ResultSet consultarProducto(){
    ResultSet rs=null;
        try {
            Statement st = Conexion.getConect().createStatement(); 
            rs =  st.executeQuery("select * from producto ");
           
        } catch (SQLException ex) {
            Logger.getLogger(cProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet consultarProductoPorId(int id){
    
    ResultSet rs=null;
        try {
            Statement st = Conexion.getConect().createStatement(); 
            rs =  st.executeQuery("select * from producto where id_producto = '"+id+"'");
           
        } catch (SQLException ex) {
            Logger.getLogger(cProducto.class.getName()).log(Level.SEVERE, null, ex);
        }  
     
        return rs;
   
    }
    
    
    public void modificarProducto(Producto a){
        
        try {
            Statement st = Conexion.getConect().createStatement();
            st.execute("update producto set nombre='"+a.getNombre()+"',valor='"+a.getValor()+"',existencias='"+a.getExistencias()+"'where id_producto='"+a.getId()+"'");
             JOptionPane.showMessageDialog(null,"Modificado");
        } catch (SQLException ex) {
            Logger.getLogger(cProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No modificado, error");
        }
    }
    
    public void eliminarProducto(int id){
    
     try {
            Statement st = Conexion.getConect().createStatement();
             st.execute("delete from producto where id_producto = '"+id+"'"); 
             JOptionPane.showMessageDialog(null,"Eliminado");
                    } catch (SQLException ex) {
            Logger.getLogger(cProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No Eliminado");
        }
    
    }
    
    public void  pintarTabla(JTable tabla, ResultSet rs){
    
        
        
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("Id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Valor");
            modelo.addColumn("Existencias");
            
            
        try {
            while (rs.next()) {
                String[]fila={rs.getString("id_producto"),rs.getString("nombre"),rs.getString("valor"),rs.getString("existencias")};
                modelo.addRow(fila);
                   
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(cProducto.class.getName()).log(Level.SEVERE, null, ex); 
    } 
}
} 