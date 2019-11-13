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
public class Helicoptero extends Vehiculo{
        
  
    private int numaspas;
    private String tipo;
    private String marca;
    

    public Helicoptero(int numaspas, String tipo, String marca, String placas, String modelo, int potencia) {
        super(placas, modelo, potencia);
        this.numaspas = numaspas;
        this.tipo = tipo;
        this.marca = marca;
        
    }

    /**
     * @return the numaspas
     */
    public int getNumaspas() {
        return numaspas;
    }

    /**
     * @param numaspas the numaspas to set
     */
    public void setNumaspas(int numaspas) {
        this.numaspas = numaspas;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    

    
  
     
}
