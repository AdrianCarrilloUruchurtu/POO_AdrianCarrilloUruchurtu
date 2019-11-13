/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author locoa
 */
public class ListasImplem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Lista: 
    String[] letras = {"a","b","c","f"};
    List<String> Listaletras = Arrays.asList(letras);
    
    System.out.println(Listaletras);

    //Array List:    
    ArrayList<String> coches = new ArrayList<String>();
    
    coches.add("Nissan");
    coches.add("Ford");
    coches.add("Kia");
    System.out.println(coches);
        
    coches.get(2);  
        
     coches.set(0,"Opel");
     coches.remove(1);
       System.out.println(coches.toString());
      
    ArrayList<Object> listilla = new ArrayList<>();
    
    listilla.add(12);
    listilla.add(54);
    listilla.add(154);
    listilla.add(23);
    listilla.add(2);
    listilla.add(new Casas("Dos pisos",1235));
    listilla.add("Holita");
    
    
     System.out.println("Ejemplillo");
      
     System.out.println(listilla.toString());
      
    
//    for(Object aux:listilla){
//    if(aux instanceof Integer)
//    {
//        Integer aux2=(Integer)aux;
//    }
//    else
//    {
//        String aux3 =(String)aux;
//    }
 
    
    
    
    }
    
    //Listas enlazadas: 
//    LinkedList<String> object = new LinkedList<String>();
//    object.addFirst("H");
//    object.add("O");
//    object.add("L");
//    object.addLast("A");
//    System.out.println("Lista enlazada: " + object);
//    
//    }
    
}
