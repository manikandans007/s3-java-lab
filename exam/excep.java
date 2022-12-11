import java.util.*;
import java.lang.Exception;
import java.util.Scanner;
class excep {
 void divide(int a,int b) throws ArithmeticException
 {
    if(b==0){
        throw new ArithmeticException();
    }
    else{
      int  c=a/b;
      System.out.println("Answeris "+c);

    }
}
public static void main(String[] args){
    excep exp = new excep();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    try{
exp.divide(a,b);
    } 
    catch(Exception e)
    {
System.out.println("you sholdn't enter valid number");
    }
    finally{
        System.out.println("exception has found");
    }
}





    
}
