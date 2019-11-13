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



public class Alumno  {

    @Override
    public String toString() {
           //return "Alumno{" + "boleta=" + boleta + ", regular=" + regular + ", promedioGral=" + promedioGral + ", carrera=" + carrera + '}';
           return getClass().getName() + "@" + hashCode();
    }
     
    private int boleta;
    private boolean regular;
    private double promedioGral;
    private String carrera;

 

    public Alumno( int boleta, boolean regular, double promedioGral, String carrera) {
         
        
        this.boleta = boleta;
        this.regular = regular;
        this.promedioGral = promedioGral;
        this.carrera = carrera;
    }


   
    public int getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the regular
     */
    public boolean isRegular() {
        return regular;
    }

    /**
     * @param regular the regular to set
     */
    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    /**
     * @return the promedioGral
     */
    public double getPromedioGral() {
        return promedioGral;
    }

    /**
     * @param promedioGral the promedioGral to set
     */
    public void setPromedioGral(double promedioGral) {
        this.promedioGral = promedioGral;
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
    
    
    
    
    
}
