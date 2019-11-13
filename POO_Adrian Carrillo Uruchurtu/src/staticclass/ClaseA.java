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
public class ClaseA <S>{
   private S gen;
    
    public ClaseA(){
        
    }
    public ClaseA(S x){
        gen=x;
    }

    public void setGen(S gen) {
        this.gen = gen;
    }

    public S getGen() {
        return gen;
    }
    
    public void classType(){
        System.out.println(this.gen.toString());
    }
}
