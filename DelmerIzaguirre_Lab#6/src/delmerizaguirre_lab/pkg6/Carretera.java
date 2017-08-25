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
public class Carretera {
    private int numero;
    private double distancia;
    private Lugar Inicio;
    private Lugar Final;

    public Carretera(int numero, double distancia, Lugar Inicio, Lugar Final) {
        this.numero = numero;
        this.distancia = distancia;
        this.Inicio = Inicio;
        this.Final = Final;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Lugar getInicio() {
        return Inicio;
    }

    public void setInicio(Lugar Inicio) {
        this.Inicio = Inicio;
    }

    public Lugar getFinal() {
        return Final;
    }

    public void setFinal(Lugar Final) {
        this.Final = Final;
    }

    @Override
    public String toString() {
        return "Carretera: Inicio=" + Inicio;
    }
    
    
    
    
}
