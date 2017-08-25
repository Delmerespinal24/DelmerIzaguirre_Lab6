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
public class Restaurante extends Lugar{
    private String categoria;
    private byte calificacion;

    public Restaurante() {
        super();
    }

    public Restaurante(String categoria, byte calificacion, String nombre, String direccion, int nivelSeguridad) {
        super(nombre, direccion, nivelSeguridad);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public byte getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(byte calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Restaurante";
    }
    
    
    
    
}
