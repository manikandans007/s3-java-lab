import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Tlight extends JPanel implements ActionListener{
JRadioButton r1;
JRadioButton r2;
JRadioButton r3;

    

 Color c_red;
 Color c_green;
Color c_yellow;
public Tlight()
{
    setBounds(0,0,480,650);
     r1 = new JRadioButton("Red");
 
     r2 = new JRadioButton("yellow");
    r3 = new JRadioButton("white");

    ButtonGroup gp = new ButtonGroup();
    gp.add(r1);
    gp.add(r2);
    gp.add(r3);


    r1.setSelected(true);
    c_red=Color.red;
    c_green=getBackground();
    c_yellow=getBackground();


    add(r1);
    add(r2);
    add(r3);

    r1.addActionListener(this);
    r2.addActionListener(this);
    r3.addActionListener(this);


}
 
    public void actionPerformed(ActionEvent e){
        if(r1.isSelected()==true){
            c_red=Color.red;
            c_green=getBackground();
            c_yellow=getBackground();
        }
        else if(r2.isSelected()==true){
            c_red=getBackground();
            c_green=Color.yellow;
            c_yellow=getBackground();
        }
        else if(r3.isSelected()==true){
            c_red=getBackground();
            c_green=getBackground();
            c_yellow=Color.green;
        }
        repaint();

    }

public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawOval(50, 50, 50, 50);
    g.drawOval(50, 50, 50, 50);
    g.drawOval(50, 50, 50, 50);

    g.setColor(c_red);
    g.fillOval(50,50,50,50);
    g.setColor(c_yellow);
    g.fillOval(50,110,50,50);

    g.setColor(c_green);
    g.fillOval(50,170,50,50);


}

    public static void main(String[] args){
    JFrame jf = new JFrame();
    jf.setLayout(null);
    jf.setVisible(true);
    jf.setSize(640,480);
    Tlight tf = new Tlight();
    jf.add(tf);
    }
}


