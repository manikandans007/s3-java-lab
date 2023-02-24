import java.io.*;
import java.util.Scanner.*;

import java.util.Random;
 class  check extends Thread {
    Scanner sc = new Scanner(System.in);
public void run(){

for(int i=0;i<20;i++){


System.out.println("Random generated number"+n);
if((n%2)==0){
   even st = new even(n);
    st.start();
}
else{
    odd ct = new odd(n);
    ct.start();
}
try{
Thread.sleep(1000);
}catch(Exception e){
System.out.println(e);
}
}
}   
}

 class odd extends Thread{
    int n1;
    odd(int number){
        n1 = number;
        System.out.println("Random generated number is odd"+n1);
    }
    public void run(){
        try{
            FileWriter fi =new FileWriter("odd.txt");
            fi.write(n1);
            fi.close();
        }
        catch(Exception e){
System.out.println(e.getMessage());
        }

}
 }
 class even extends Thread{
        int n1;
        even(int number){
            n1 = number;
            System.out.println("Random generated number is even"+n1);
        }
        public void run(){
            try{
                FileWriter fi =new FileWriter("even.txt");
                fi.write(n1);
                fi.close();
            }
            catch(Exception e){
System.out.println(e.getMessage());
            }
        }
        }
class check{
public static void main(String[] args){
    RandonThread rt = new RandonThread();
    rt.start();
}
}