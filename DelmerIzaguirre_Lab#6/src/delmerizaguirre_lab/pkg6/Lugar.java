/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delmerizaguirre_lab.pkg6;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public abstract class Lugar {
    private String nombre;
    private String direccion;
    private int nivelSeguridad;
    private ArrayList<Carretera> entradas = new ArrayList();
    private Carretera salida;

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, int nivelSeguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nivelSeguridad = nivelSeguridad;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNivelSeguridad() {
        return nivelSeguridad;
    }

    public void setNivelSeguridad(int nivelSeguridad) {
        this.nivelSeguridad = nivelSeguridad;
    }

    public ArrayList<Carretera> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<Carretera> entradas) {
        this.entradas = entradas;
    }

    public Carretera getSalida() {
        return salida;
    }

    public void setSalida(Carretera salida) {
        this.salida = salida;
    }
    
    public boolean TieneSalida(){
        return salida != null;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
 
}
