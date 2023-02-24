import java.io.*;
import java.util.Scanner;
 class except {
    public void operation(int a,int b)throws ArithmeticException,IOException{
if(b==0){
    throw new ArithmeticException("not vali number");
}
else{
    System.out.println("rseult is"+a/b);
}
    }







    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
       try{ 
        
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of a");
        int b = sc.nextInt();
       except t = new except();
       t.operation(a,b);
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
     

        
    }
}
