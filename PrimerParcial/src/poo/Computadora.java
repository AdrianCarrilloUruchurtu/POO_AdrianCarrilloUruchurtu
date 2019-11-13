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
public class Computadora {
        
    private String componentes;
    private double precio;
    private String tipo;
    public String marca;
    public String modelo;
    public int anho;
    
    public Computadora(){
        componentes = "Desconocido";
        precio = 0;
        tipo = "";
        marca = "";
        modelo = "Desconocido";   
        anho = 0;
    }

    public String getComponentes(){
        return this.componentes;
    }
    
    public void setComponentes(String componentes){
         this.componentes=componentes;  
    }
    
    public double getPrecio(){
        return this.precio;
    }
     
    public void setPrecio(double precio){
         this.precio=precio;  
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    
     public Computadora( String componentes,String tipo, String marca,  String modelo, double precio, int anho){
        this.componentes = componentes;
        this.precio = precio;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anho = anho;
        
    
    
}
    
  
     
}
