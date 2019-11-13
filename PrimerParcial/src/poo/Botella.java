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
public class Botella {
    private String material;
    private double peso;
    private double capacidad;
    public String marca;
    public String tipotapa;
    
    public Botella(){
        material = "Desconocido";
        peso = 0;
        capacidad = 0;
        marca = "";
        tipotapa = "Desconocido";    
    }

    public String getMaterial(){
        return this.material;
    }
    
    public void setMaterial(String material){
         this.material=material;  
    }
    
    public double getPeso(){
        return this.peso;
    }
     
    public void setPeso(double peso){
         this.peso=peso;  
    }
    
    public double getCapacidad(){
        return this.capacidad;
    }
    
    public void setCapacidad(double capacidad){
        this.capacidad=capacidad;
    }
    
     public Botella(double peso,double capacidad,String marca,String tipotapa,String material){
        this.peso = peso;
        this.capacidad = capacidad;
        this.marca = marca;
        this.tipotapa = tipotapa;
        this.material = material;    
    
    
}

  
    
}