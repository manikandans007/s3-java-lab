import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
class tokenizer{
    public static void main(String []args){
        System.out.println("enter the limit");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println("enter the "+n+ "numer with space");
        
        String stl = sc.nextLine();
        StringTokenizer st = new StringTokenizer(stl," ");
        int sum=0;
        while(st.hasMoreTokens()){
         sum =sum+Integer.parseInt(st.nextToken());
        }
        System.out.println("sum of terms"+sum);
    }
}