import java.util.*;
import java.util.Scanner;
class tokenizer{
   
    public static void main(String args[]){
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a line of numbers");
        String input = s.next();
       
  StringTokenizer t = new StringTokenizer(input, ",");
        int sum=0;
        
    while(t.hasMoreTokens())
    {
        int n=0;
        n = Integer.parseInt(t.nextToken());
        System.out.println("Number is"+n);
        sum +=n;
    }
    System.out.println("Sum of the number is" +sum);
    
    }
}
