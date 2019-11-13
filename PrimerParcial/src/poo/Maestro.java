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
public class Maestro extends Persona {
  
    String rfc;
    double sueldo;
    int matricula;
    private String carrera;
    private boolean academia;
   

    
      public Maestro() {
        
       this.matricula = 0;
        this.carrera = "";
        this.academia = false;
        
    }

    public Maestro(String nombre, int edad, double estatura, double peso, String sexo, int matricula, String carrera, boolean academia) {
        //super(nombre, edad, estatura, peso, sexo);
        super(nombre, edad, estatura, peso, sexo);
        this.matricula = matricula;
        this.carrera = carrera;
        this.academia = academia;
        
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the academia
     */
    public boolean isAcademia() {
        return academia;
    }

    /**
     * @param academia the academia to set
     */
    public void setAcademia(boolean academia) {
        this.academia = academia;
    }

    
    
    
}
