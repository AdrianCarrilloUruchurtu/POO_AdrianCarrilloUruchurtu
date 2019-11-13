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
public class Cama {
    
    private String material;
    private double precio;
    private double area;
    public String marca;
    public String tipo;
    
    public Cama(){
        material = "Desconocido";
        precio = 0;
        area = 0;
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
      
    public double getArea(){
         return this.area;  
    }   
     
    public void setArea(double area){
         this.area=area;  
    }
     public Cama(   String material,double precio,double area,String marca,String tipo ){
        this.material = material;
        this.precio = precio;
        this.marca = marca;
        this.tipo = tipo;
        this.material = material;    
    
    
}
    
    
    
}
