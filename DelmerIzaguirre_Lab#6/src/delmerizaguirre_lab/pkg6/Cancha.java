/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delmerizaguirre_lab.pkg6;

/**
 *
 * @author Owner
 */
public class Cancha extends Lugar{
    private String Categoria;
    private String Estado;

    public Cancha() {
        super();
    }

    public Cancha(String Categoria, String Estado, String nombre, String direccion, int nivelSeguridad) {
        super(nombre, direccion, nivelSeguridad);
        this.Categoria = Categoria;
        this.Estado = Estado;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    
    
    
    
    
}
