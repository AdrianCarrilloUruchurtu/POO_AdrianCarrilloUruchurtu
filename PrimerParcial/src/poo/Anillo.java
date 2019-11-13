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
public class Anillo {
    
    private String material;
    private double peso;
    private double diametro;
    public String marca;
    public String modelo;
    
    public Anillo(){
        material = "Desconocido";
        peso = 0;
        diametro = 0;
        marca = "";
        modelo = "Desconocido";    
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
    
    public double getDiametro(){
        return this.diametro;
    }
    
    public void setDiametro(double diametro){
         this.diametro=diametro;
        
    }
    
    
  /*public String getMarca(){
        return this.marca;
    }
      
    public String getModelo(){
        return this.modelo;
    }*/
   
    public Anillo(double peso, double diametro,String marca,String modelo,String material){
        this.peso = peso;
        this.diametro = diametro;
        this.marca = marca;
        this.modelo = modelo;
        this.material = material;    
    
}
}
