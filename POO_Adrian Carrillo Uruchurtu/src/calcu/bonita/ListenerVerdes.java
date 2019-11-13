/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu.bonita;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class ListenerVerdes implements ActionListener{

    private Display display;

    public ListenerVerdes(Display display) {
        this.display = display;
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
       JButtonC aux = (JButtonC) e.getSource();
       

       if(!"+/-".equals(aux.getText())){
           display.concatenar(aux.getText());
      }
       
       if (aux.getText().equals("+/-")){
        
          if(display.getNumero().isNegativo()){
              display.getNumero().setNegativo(false);
          }else{
              display.getNumero().setNegativo(true);
              
          }
         display.setText(display.getNumero().getValue()+"");
         //System.out.println(display.getNumero().getValue());
       }else{
           
//display.concatenar(aux.getText());
            //display.setText(display.getNumero().getValue()+"");
           //display.concatenar(aux.getText());
       }

    }
    
}
