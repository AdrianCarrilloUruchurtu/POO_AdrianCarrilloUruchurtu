/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 * Crear objetos
 * @author 
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private double estatura;
    public double peso;
    public String sexo;
    
    /*public Persona(){
        nombre = "Desconocido";
        edad = 0;
        estatura = 0;
        peso = 0;
        sexo = "Desconocido";    
    }*/

    
     public Persona(String nombre, int edad, double estatura, double peso, String sexo ){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.sexo = sexo;    
    }
    
    
    
    public  void saludar(){
        System.out.println("Hola mundo");
    } 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    
    
    
}
