import java.io.*;
import java.util.Random;
 class RandonThread extends Thread {
public void run(){

for(int i=0;i<20;i++){
Random rm = new Random();
int n = rm.nextInt(100);
System.out.println("Random generated number"+n);
if((n%2)==0){
   SquareThread st = new SquareThread(n);
    st.start();
}
else{
    CubeThread ct = new CubeThread(n);
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

 class CubeThread extends Thread{
    int n1;
    CubeThread(int number){
        n1 = number;
       
    }
    public void run(){
        try{}catch(Exception e){}
        System.out.println("sqare of odd number"+(n1*n1));
    }

}
 class SquareThread extends Thread{
        int n1;
        SquareThread(int number){
            n1 = number;
           
        }
        public void run(){
            System.out.println("cube of number odd number"+(n1*n1*n1));
        }




    }

public class multithreading{
public static void main(String[] args){
    RandonThread rt = new RandonThread();
    rt.start();
}
}