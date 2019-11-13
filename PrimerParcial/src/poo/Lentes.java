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
public class Lentes {
        
    public String material;
    public double graduacion;
    public String tipo;
    public String marca;
    public String modelo;
    
    
    public Lentes(){
        material = "Desconocido";
        graduacion = 0;
        tipo = "";
        marca = "";
        modelo = "Desconocido";   
  
    }

    
     public Lentes( String material,
                   String tipo, 
                   String marca,
                   String modelo,
                   double graduacion
                
                ){
        this.material = material;
        this.graduacion = graduacion;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
     
        
    
    
}
    
  
     
}
