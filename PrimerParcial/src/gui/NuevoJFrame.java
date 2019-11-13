/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author locoa
 */
public class NuevoJFrame extends JFrame {
    
 public NuevoJFrame (String tiutlo, int w, int h){
     super(tiutlo);
     setSize(new Dimension(w,h));
     setVisible(true);
     setBackground( Color.YELLOW);
 }  
    
    
    
}
