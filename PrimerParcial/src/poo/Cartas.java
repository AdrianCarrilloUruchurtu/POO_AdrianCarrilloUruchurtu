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
public class Cartas {
    
    private String material;
    private double precio;
    private double tamanho;
    public String marca;
    public String tipo;
    
    public Cartas(){
        material = "Desconocido";
        precio = 0;
        tamanho = 0;
        marca = "";
        tipo = "Desconocido";    
    }

        public String getMaterial(){
        return this.material;
    }
    
    public void setMaterial(String material){
         this.material=material;  
    }
    
    public double getPrecio(){
        return this.precio;
    }
     
    public void setPrecio(double precio){
         this.precio=precio;  
    }
    
    public double getTamanho(){
        return this.tamanho;
    }
    
    public void setTamanho(double tamanho){
        this.tamanho=tamanho;
    }
    
    
     public Cartas( String material,double precio,double tamanho,String marca,String tipo){
        this.material = material;
        this.precio = precio;
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;    
    
    
}
    
  
    
    
}
