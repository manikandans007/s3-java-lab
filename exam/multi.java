import java.io.*;
import java.util.Random;
class Randon extends Thread{
    public void run(){
        for(int i=0;i<20;i++){

            Random rm = new Random();
            int sm = rm.nextInt(100);
            System.out.println("Random numbers created are:"+sm);
            if((sm%2)==0)
            {
SquareThread st = new SquareThread(sm);
st.start();
            }
            else{
                CubeThread ct = new CubeThread(sm);
ct.start();
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }





        }
    }
}
class SquareThread extends Thread{
int n1;
SquareThread(int sm){
    n1=sm;
}
public void run(){
    System.out.println("Square of the number:"+n1*n1);
}
}
class CubeThread extends Thread{
    int n1;
    CubeThread(int sm){
        n1=sm;
    }
    public void run(){
        System.out.println("Cube of the number:"+n1*n1*n1);
    }
    }
public class multi {
    public static void main(String args[] ){
        Randon r = new Randon();
        r.start();
    }
}
