import javax.swing.JFrame;
import java.awt.*;
import java.swing.*;
import java.awt.event.*;
import java.util.*;



public class jframe {
    
    public static void main(String [] args){
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(420,420);
        jf.setTitle("myFrame");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.getContentPane().setBackground(new Color(255,0,0));
    }
}
