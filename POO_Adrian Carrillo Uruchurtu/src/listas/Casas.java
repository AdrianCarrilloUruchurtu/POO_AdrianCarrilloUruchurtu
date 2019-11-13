/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author locoa
 */
public class Casas {
 
    private String tipo;
    private double area;

    public Casas(String tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }

    Casas() {
        }

    public String getTipo() {
        return tipo;
    }

    public double getArea() {
        return area;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}
