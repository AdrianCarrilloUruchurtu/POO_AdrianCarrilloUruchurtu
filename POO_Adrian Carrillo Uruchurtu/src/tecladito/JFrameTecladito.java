/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladito;

import tecladito.JButtonTec;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author locoa
 */
public class JFrameTecladito extends JFrame {

    public JFrameTecladito() {
    inicializarComp();
    }
    
    public void inicializarComp(){
        
        
        
        JPanel panelNorte = new JPanel(new GridLayout(1,10));
        JPanel panelCentral = new JPanel(new GridLayout(3,10));
        JPanel panelFlechas = new JPanel(new GridLayout(2,2));
        ListenerPulso a = new ListenerPulso();
        
        
        Dimension dimnum = new Dimension(2,2);
        Dimension dimlet = new Dimension(5,5);
        
        
        JButtonTec btn1 = new JButtonTec("1", dimnum, Color.GRAY);
        JButtonTec btn2 = new JButtonTec("2", dimnum, Color.GRAY);
        JButtonTec btn3 = new JButtonTec("3", dimnum, Color.GRAY);
        JButtonTec btn4 = new JButtonTec("4", dimnum, Color.GRAY);
        JButtonTec btn5 = new JButtonTec("5", dimnum, Color.GRAY);
        JButtonTec btn6 = new JButtonTec("6", dimnum, Color.GRAY);
        JButtonTec btn7 = new JButtonTec("7", dimnum, Color.GRAY);
        JButtonTec btn8 = new JButtonTec("8", dimnum, Color.GRAY);
        JButtonTec btn9 = new JButtonTec("9", dimnum, Color.GRAY);
        JButtonTec btn0 = new JButtonTec("0", dimnum, Color.GRAY);
        
        btn1.addKeyListener((KeyListener) a);
        btn2.addKeyListener((KeyListener) a);
        btn3.addKeyListener((KeyListener) a);
        btn4.addKeyListener((KeyListener) a);
        btn5.addKeyListener((KeyListener) a);
        btn6.addKeyListener((KeyListener) a);
        btn7.addKeyListener((KeyListener) a);
        btn8.addKeyListener((KeyListener) a);
        btn9.addKeyListener((KeyListener) a);
        btn0.addKeyListener((KeyListener) a);
        
        panelNorte.add(btn1);
        panelNorte.add(btn2);
        panelNorte.add(btn3);
        panelNorte.add(btn4);
        panelNorte.add(btn5);
        panelNorte.add(btn6);
        panelNorte.add(btn7);
        panelNorte.add(btn8);
        panelNorte.add(btn9);
        panelNorte.add(btn0);
        
        setLayout(new BorderLayout());
        add(panelNorte,BorderLayout.NORTH);
        
        JButtonTec btnQ = new JButtonTec("Q", dimlet, Color.GRAY);
        JButtonTec btnW = new JButtonTec("W", dimlet, Color.GRAY);
        JButtonTec btnE = new JButtonTec("E", dimlet, Color.GRAY);
        JButtonTec btnR = new JButtonTec("R", dimlet, Color.GRAY);
        JButtonTec btnT = new JButtonTec("T", dimlet, Color.GRAY);
        JButtonTec btnY = new JButtonTec("Y", dimlet, Color.GRAY);
        JButtonTec btnU = new JButtonTec("U", dimlet, Color.GRAY);
        JButtonTec btnI = new JButtonTec("I", dimlet, Color.GRAY);
        JButtonTec btnO = new JButtonTec("O", dimlet, Color.GRAY);
        JButtonTec btnP = new JButtonTec("P", dimlet, Color.GRAY);
        JButtonTec btnA = new JButtonTec("A", dimlet, Color.GRAY);
        JButtonTec btnS = new JButtonTec("S", dimlet, Color.GRAY);
        JButtonTec btnD = new JButtonTec("D", dimlet, Color.GRAY);
        JButtonTec btnF = new JButtonTec("F", dimlet, Color.GRAY);
        JButtonTec btnG = new JButtonTec("G", dimlet, Color.GRAY);
        JButtonTec btnH = new JButtonTec("H", dimlet, Color.GRAY);
        JButtonTec btnJ = new JButtonTec("J", dimlet, Color.GRAY);
        JButtonTec btnK = new JButtonTec("K", dimlet, Color.GRAY);
        JButtonTec btnL = new JButtonTec("L", dimlet, Color.GRAY);
        JButtonTec btnÑ = new JButtonTec("Ñ", dimlet, Color.GRAY);
        JButtonTec btnZ = new JButtonTec("Z", dimlet, Color.GRAY);
        JButtonTec btnX = new JButtonTec("X", dimlet, Color.GRAY);
        JButtonTec btnC = new JButtonTec("C", dimlet, Color.GRAY);
        JButtonTec btnV = new JButtonTec("V", dimlet, Color.GRAY);
        JButtonTec btnB = new JButtonTec("B", dimlet, Color.GRAY);
        JButtonTec btnN = new JButtonTec("N", dimlet, Color.GRAY);
        JButtonTec btnM = new JButtonTec("M", dimlet, Color.GRAY);
        JButtonTec btnUp = new JButtonTec("↑", dimlet, Color.blue);
        JButtonTec btnDo = new JButtonTec("↓", dimlet, Color.blue);
        JButtonTec btnLe = new JButtonTec("←", dimlet, Color.blue);
        JButtonTec btnRi = new JButtonTec("→", dimlet, Color.blue);
        
        btnQ.addKeyListener((KeyListener) a);
        btnW.addKeyListener((KeyListener) a);
        btnE.addKeyListener((KeyListener) a);
        btnR.addKeyListener((KeyListener) a);
        btnT.addKeyListener((KeyListener) a);
        btnY.addKeyListener((KeyListener) a);
        btnU.addKeyListener((KeyListener) a);
        btnI.addKeyListener((KeyListener) a);
        btnO.addKeyListener((KeyListener) a);
        btnP.addKeyListener((KeyListener) a);
        btnA.addKeyListener((KeyListener) a);
        btnS.addKeyListener((KeyListener) a);
        btnD.addKeyListener((KeyListener) a);
        btnF.addKeyListener((KeyListener) a);
        btnG.addKeyListener((KeyListener) a);
        btnH.addKeyListener((KeyListener) a);
        btnJ.addKeyListener((KeyListener) a);
        btnK.addKeyListener((KeyListener) a);
        btnL.addKeyListener((KeyListener) a);
        btnÑ.addKeyListener((KeyListener) a);
        btnZ.addKeyListener((KeyListener) a);
        btnX.addKeyListener((KeyListener) a);
        btnC.addKeyListener((KeyListener) a);
        btnV.addKeyListener((KeyListener) a);
        btnB.addKeyListener((KeyListener) a);
        btnN.addKeyListener((KeyListener) a);
        btnM.addKeyListener((KeyListener) a);
        btnUp.addKeyListener((KeyListener) a);
        btnDo.addKeyListener((KeyListener) a);
        btnLe.addKeyListener((KeyListener) a);
        btnRi.addKeyListener((KeyListener) a);
        
        
        
        panelCentral.add(btnQ);
        panelCentral.add(btnW);
        panelCentral.add(btnE);
        panelCentral.add(btnR);
        panelCentral.add(btnT);
        panelCentral.add(btnY);
        panelCentral.add(btnU);
        panelCentral.add(btnI);
        panelCentral.add(btnO);
        panelCentral.add(btnP);
        panelCentral.add(btnA);
        panelCentral.add(btnS);
        panelCentral.add(btnD);
        panelCentral.add(btnF);
        panelCentral.add(btnG);
        panelCentral.add(btnH);
        panelCentral.add(btnJ);
        panelCentral.add(btnK);
        panelCentral.add(btnL);
        panelCentral.add(btnÑ);
        panelCentral.add(btnZ);
        panelCentral.add(btnX);
        panelCentral.add(btnC);
        panelCentral.add(btnV);
        panelCentral.add(btnB);
        panelCentral.add(btnN);
        panelCentral.add(btnM);
        panelFlechas.add(btnUp);
        panelFlechas.add(btnDo);
        panelFlechas.add(btnLe);
        panelFlechas.add(btnRi);
        
   
        add(panelCentral,BorderLayout.CENTER);
        add(panelFlechas,BorderLayout.EAST);

        
//        btn1.addKeyListener(new java.awt.event.KeyAdapter(){
//       public void keyPressed(java.awt.event.KeyEvent evt){
//           btn1KeyPressed(evt);
//       } 
//    });
//                                              
        
 
    }
    
//     public void keyPressed(KeyEvent l){
//    if(l.getKeyCode() == KeyEvent.VK_1)
//    {
//    }
//    }
//    
//    
//    private void keybtn1(java.awt.event.KeyEvent evt) {                                     
//   btn1.setBackground(Color.red); 
//    }    
    
}
