 import javax.swing.JFrame;
 import javax.swing.JPanel;
import java.awt.*;
import java.swing.*;
import java.awt.event.*;
import java.util.*;



public class panel {
    
    public static void main(String [] args){
        JPanel jpg = new JPanel();
        jpg.setBackground(Color.green);
        jpg.setBounds(0,255,255,255);

        JPanel jpy = new JPanel();
        jpy.setBackground(Color.yellow);
        jpy.setBounds(255,0,255,255);

        JPanel jpr = new JPanel();
        jpr.setBackground(Color.red);
        jpr.setBounds(8,255,255,255);




        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setLayout(null);
        
        jf.setSize(750,750);
        jf.setTitle("myFrame");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
       
        
        jf.add(jpg);
        jf.add(jpy);
        jf.add(jpr);

    }
}


 
    

