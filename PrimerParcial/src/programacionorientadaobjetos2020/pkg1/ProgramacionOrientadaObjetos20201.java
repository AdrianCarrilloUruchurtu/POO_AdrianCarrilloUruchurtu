/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;

import poo.Persona;
import poo.Anillo;
import poo.Botella;
import poo.Cama;
import poo.Vehiculo;
import poo.Alumno;
import poo.Coche;
import poo.Coche_Taxi;
import gui.NuevoJFrame;
import javax.swing.JFrame;
/**
 *
 * @author CRUZLEIJA
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)3 {
        
/*--------------------Clase 1---------------------------------------*/        
        
        int x = 6;
        Persona beto = new Persona("Juan Alberto",
                18, 1.9, 2.1, "Prefiero no decirlo");
      
/*-----------------------------------------------------------*/        
 

/*--------------------------Tarea 2---------------------------------*/        
//        
//        Anillo aniyo = new Anillo();
//        Botella botella1 = new Botella();
//        Cama camita = new Cama();
//        
//        
//        aniyo.setMaterial("Oro");
//        System.out.println("El anillo es de: "+ aniyo.getMaterial());
//        
//        aniyo.setPeso(0.2);
//        System.out.println("El anillo pesa: "+ aniyo.getPeso() + "gr");
//        
//        aniyo.setDiametro(1.2);
//        System.out.println("El anillo tiene un diametro de: "+ aniyo.getDiametro() + "cm");
//        
//        botella1.setMaterial("Plastico duro");
//        System.out.println("La botella está hecha de: "+ botella1.getMaterial());
//        
//        
//        
//        camita.setArea(12);
//        System.out.println("El area de la cama es de: "+ camita.getArea());
        
 /*--------------------------Clase 2---------------------------------*/        
 
 /*Alumno roberto = new Alumno();
 roberto.setBoleta(2019670000);*/
       
 /*--------------------------Tarea Herencia---------------------------------*/        
     
 
            Coche focus = new Coche(45000, "Ford", 2005, "YXG-75-66", "Focus", 109);
 
            System.out.println(focus.getMarca() +" " +focus.getModelo()+ " " + focus.getAnho() + " tiene un precio de: " + focus.getPrecio());
            
            Coche_Taxi tsuru = new Coche_Taxi(012740, 30000, "Nissan", 1982, "ZXD-24-34", "Tsuru", 82);
            
            
            /* Persona beto = new Persona("Juan Alberto",
                18, 1.9, 2.1, "Prefiero no decirlo");
        beto.nombre = "Roberto";*/
        System.out.println(beto.toString());
        /*beto.setNombre("Juan Martin");
        System.out.println(beto.getNombre());
        Alumno roberto = new Alumno();
        Alumno roberto2 = new Alumno("Beto",23,1.90,80,"Masculino",200, true, 8.9, "Arte y Costura");
        System.out.println();*/
 
/*-------------------------toString(), object---------------------------------*/



/*-------------------------Clase 3---------------------------------*/
Persona a = new Persona("Juan Alberto", 18, 1.9, 2.1, "No");
//Alumno b = new Alumno("Beto", 23, 1.90, 80, "Masculino", 200, true, 8.9, "Sistemas" );


/*------------------------JFrame-----------------------------------*/

//NuevoJFrame aux = new NuevoJFrame("Mi nuevo frame 1", 400, 600);
//JFrame aux2 = new JFrame("Mi nuevo frame 2");
//aux2.setSize(1000,1000);
//aux2.setVisible(true);
//JFrame aux3 = new JFrame("Mi nuevo frame 3");
//aux3.setSize(1,2);
//aux3.setVisible(true);
//JFrame aux4 = new JFrame("Mi nuevo frame 4");
//aux4.setSize(300,300);
//aux4.setVisible(true);
JFrame aux5 = new JFrame();   
aux5.setVisible(true);
}
    
}
