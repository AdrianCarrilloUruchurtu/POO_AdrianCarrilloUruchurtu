/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author locoa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NuevaClase aux = new NuevaClase() {
            @Override
            void metodo2() {
                System.out.println("Hola");
            }
        };
        aux.metodo2();
    }
    
}
