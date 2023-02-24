import java.io.*;

class display{
public synchronized void print(String msg){
    System.out.print("["+msg);
    try{
    Thread.sleep(100);
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    System.out.println("]");
}

}
class SyncExample extends Thread{
 private   display d;
    private String msg;
    public SyncExample(display d,String msg){
        this.d=d;
        this.msg=msg;
    }
    public void run(){
       d.print(msg);
    }
}
class sync {
    public static void main(String args[]){
        display d = new display();
        SyncExample sy = new SyncExample(d,"hello");
        SyncExample se = new SyncExample(d,"world");
        sy.start();
        se.start();
        
        

    }
}
