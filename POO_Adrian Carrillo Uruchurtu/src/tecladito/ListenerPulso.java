/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladito;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

/**
 *
 * @author locoa
 */
public class ListenerPulso implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonTec aux = (JButtonTec) e.getSource();
        
        
        
    }
    
    public void keyPressed(KeyEvent e){
        JButton aux =(JButton)e.getSource();
    System.out.println(e.getKeyChar()+"");
    if (aux.equals("G")){
        aux.setBackground(Color.red);
    }
    
    }
    
}
