package Genericas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author locoa
 */
public class GenericaA <S>{
      private S gen;
    
    public GenericaA(){
        
    }
    public GenericaA(S x){
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

