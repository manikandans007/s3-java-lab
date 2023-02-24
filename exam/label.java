import java.awt.*;
import javax.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.io.*;



public class label {

    public static void main(String[] args){
        JLabel jl = new JLabel();
        jl.setText("hello world ");
        
        JFrame jf = new JFrame();
        jf.setSize(555,555);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.add(jl);

    }
    
}
