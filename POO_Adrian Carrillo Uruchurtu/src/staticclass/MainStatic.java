/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticclass;

/**
 *
 * @author locoa
 */
public class MainStatic {

    int x;
    static int aux = 0;
public MainStatic(int x, int b){
        this.x=x;
        aux=aux+1;
        //aux=b;
    }

    /**
     * @param args the command line arguments
    */
public static void main(String[] args) {
//    MainStatic aux = new MainStatic();
MainStatic a = new MainStatic(4,100);    
MainStatic b = new MainStatic(14,78);    



System.out.println(aux);
    
    }
    
}
