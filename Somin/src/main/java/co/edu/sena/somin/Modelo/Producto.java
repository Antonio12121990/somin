
package co.edu.sena.somin.Modelo;


public class Producto {
    
    private int Id;
    private String Nombre;
    private int Valor;
    private int Existencias;

    public Producto(int Id, String Nombre, int Valor, int Existencias) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Valor = Valor;
        this.Existencias = Existencias;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public int getExistencias() {
        return Existencias;
    }

    public void setExistencias(int Existencias) {
        this.Existencias = Existencias;
    }
    
    
    
    public void informar()
            
    {
       
    }
}
