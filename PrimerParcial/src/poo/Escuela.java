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
public class Escuela {
        
    public String nombre;
    public int numcapacidad;
    public String tipo;
    public int numsalones;
    public String grado;
    public int anho;
    
    public Escuela(){
        nombre = "Desconocido";
        numcapacidad = 0;
        numsalones = 0;
        tipo = "";
        grado = "";   
        anho = 0;
    }

    
     public Escuela( String nombre,
                   String tipo, 
                   String grado,
                   int numcapacidad,
                   int numsalones,
                   int anho
                ){
        this.nombre = nombre;
        this.tipo = tipo;
        this.grado = grado;
        this.numcapacidad = numcapacidad;
        this.numsalones = numsalones;
        this.anho = anho;
        
    
    
}
    
  
     
}
