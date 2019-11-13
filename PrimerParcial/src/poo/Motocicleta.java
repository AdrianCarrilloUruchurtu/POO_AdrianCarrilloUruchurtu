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
public class Motocicleta extends Vehiculo {
        
    private String modoignicion;
    private double precio;
    private String tipo;
    private int anho;

    public Motocicleta(String modoignicion, double precio, String tipo, int anho, String placas, String modelo, int potencia) {
        super(placas, modelo, potencia);
        this.modoignicion = modoignicion;
        this.precio = precio;
        this.tipo = tipo;
        this.anho = anho;
    }

    /**
     * @return the modoignicion
     */
    public String getModoignicion() {
        return modoignicion;
    }

    /**
     * @param modoignicion the modoignicion to set
     */
    public void setModoignicion(String modoignicion) {
        this.modoignicion = modoignicion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
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
     * @return the anho
     */
    public int getAnho() {
        return anho;
    }

    /**
     * @param anho the anho to set
     */
    public void setAnho(int anho) {
        this.anho = anho;
    }
    

    
  

}
