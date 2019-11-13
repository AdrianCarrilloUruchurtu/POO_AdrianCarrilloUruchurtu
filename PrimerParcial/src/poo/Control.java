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
public class Control {
        
    public String material;
    public String tipo;
    public String marca;
    public String modelo;
    public String methemis;
    
    public Control(){
        material = "Desconocido";
        tipo = "";
        marca = "";
        modelo = "Desconocido";   
        methemis = "";
    }

    
     public Control( String material,
                     String tipo, 
                     String marca,
                     String modelo,
                     String methemis
                ){
        this.material = material;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.methemis = methemis;
        
    
    
}
    
  
     
}
