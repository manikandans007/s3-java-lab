import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

JFrame jf;
JTextField tf;

JButton addb,subb,mulb,divb;
JButton decb,equb,delb,clrb,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
JPanel panel; 
double num1=0,num2=0,result=0;
char operator;

Calculator(){
jf = new JFrame("Calculator");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setSize(350,500);
jf.setLayout(null);

jf.setVisible(true);


tf = new JTextField();
tf.setBounds(50,25,250,50);
tf.setEditable(true);




addb = new JButton("+");
subb = new JButton("-");
mulb = new JButton("*");
divb = new JButton("/");
decb = new JButton(".");
equb = new JButton("=");
delb = new JButton("Delete");
clrb = new JButton("Clear");


b1 = new JButton("1");
b2 = new JButton("2");
b3 = new JButton("3");
b4 = new JButton("4");
b5 = new JButton("5");
b6 = new JButton("6");
b7 = new JButton("7");
b8 = new JButton("8");
b9 = new JButton("9");
b0 = new JButton("0");




b7.setBounds(40,100,50,40);
b8.setBounds(110,100,50,40);
b9.setBounds(180,100,50,40);
divb.setBounds(250,100,50,40);
b4.setBounds(40,170,50,40);
b5.setBounds(110,170,50,40);
b6.setBounds(180,170,50,40);
mulb.setBounds(250,170,50,40);
b3.setBounds(40,250,50,40);
b2.setBounds(110,250,50,40);
b1.setBounds(180,250,50,40);
subb.setBounds(250,250,50,40);
decb.setBounds(40,310,50,40);
b0.setBounds(110,310,50,40);
addb.setBounds(180,310,50,40);
equb.setBounds(250,310,50,40);





delb.setBounds(40,410,100,50);
clrb.setBounds(205,410,100,50);

jf.add(b0);
jf.add(b1);
jf.add(b2);
jf.add(b3);
jf.add(b4);
jf.add(b5);
jf.add(b6);
jf.add(b7);
jf.add(b8);
jf.add(b9);
jf.add(addb);
jf.add(mulb);
jf.add(subb);
jf.add(divb);
jf.add(equb);
jf.add(decb);
jf.add(delb);
jf.add(clrb);
jf.add(tf);
jf.setVisible(true);



b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
addb.addActionListener(this);
subb.addActionListener(this);
mulb.addActionListener(this);
divb.addActionListener(this);
equb.addActionListener(this);
decb.addActionListener(this);
delb.addActionListener(this);
clrb.addActionListener(this);

}


   
@Override
public void actionPerformed(ActionEvent e){
  if(e.getSource() == b1){
        tf.setText(tf.getText().concat("1"));
        
    }
    if(e.getSource() == b2){
        tf.setText(tf.getText().concat("2"));
        
    }
    if(e.getSource() == b3){
        tf.setText(tf.getText().concat("3"));
        
    }
    if(e.getSource() == b4){
        tf.setText(tf.getText().concat("4"));
        
    }
    if(e.getSource() == b5){
        tf.setText(tf.getText().concat("5"));
        
    }
    if(e.getSource() == b6){
        tf.setText(tf.getText().concat("6"));
        
    }
    if(e.getSource() == b7){
        tf.setText(tf.getText().concat("7"));
        
    }
    if(e.getSource() == b8){
        tf.setText(tf.getText().concat("8"));
        
    }
    if(e.getSource() == b9){
        tf.setText(tf.getText().concat("9"));
        
    }
    if(e.getSource() == b0){
        tf.setText(tf.getText().concat("0"));
        
    }

 if(e.getSource() == decb){
        tf.setText(tf.getText().concat("."));
   } 
 if(e.getSource() == addb){
    num1 = Double.parseDouble(tf.getText());
    operator = '+';
    tf.setText("");

} 
if(e.getSource() == subb){
    num1 = Double.parseDouble(tf.getText());
    operator = '-';
    tf.setText("");
} 
if(e.getSource() == mulb){
    num1 = Double.parseDouble(tf.getText());
    operator = '*';
    tf.setText("");
} 
if(e.getSource() == divb){
    num1 = Double.parseDouble(tf.getText());
    operator = '/';
    tf.setText("");
} 

if(e.getSource() == equb){
    num2 = Double.parseDouble(tf.getText());
    switch(operator){
        case'+':
        result=num1+num2;
        break;
        case'-':
        result=num1-num2;
        break;
        case'*':
        result=num1*num2;
        break;
        case'/':
        result=num1/num2;
        break;
    }
    tf.setText(""+result);
}
if(e.getSource() == clrb){
   
    tf.setText("");
}
if(e.getSource() == delb){
   String string = tf.getText();
   tf.setText("");
   for(int i=0;i<string.length()-1;i++){
    tf.setText(tf.getText()+string.charAt(i));
   }



}
}
public static void main(String[] args){

    Calculator calc = new Calculator();
}
}


    

