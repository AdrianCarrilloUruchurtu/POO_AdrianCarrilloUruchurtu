/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author locoa
 */
public class Coche_Taxi extends Coche{
    
    private int numlicencia;

    public Coche_Taxi(int numlicencia, double precio, String marca, int anho, String placas, String modelo, int potencia) {
        super(precio, marca, anho, placas, modelo, potencia);
        this.numlicencia = numlicencia;
    }

    /**
     * @return the numlicencia
     */
    public int getNumlicencia() {
        return numlicencia;
    }

    /**
     * @param numlicencia the numlicencia to set
     */
    public void setNumlicencia(int numlicencia) {
        this.numlicencia = numlicencia;
    }
    
    
    
}
