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
public class Dado {
        
    public String material;
    public int numlados;
    
    public Dado(){
        material = "Desconocido";
        numlados = 0;
  
    }

    
     public Dado( String material,
                  int numlados
                ){
        this.material = material;
         this.numlados = numlados;
    
}
    
}
