/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu.bonita;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
//import sun.awt.im.InputMethodJFrame;

/**
 * @author SI
 */
public class CalcuBonita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrameCalculadora calcu = new JFrameCalculadora();
       calcu.setSize(500, 500);
       calcu.setVisible(true);
               
    }
    
}
