import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class tokesn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want");
        String input = sc.next();
        StringTokenizer st = new StringTokenizer(input, ",");
        int sum = 0;
        while(st.hasMoreTokens())
        {
            int n;
            n = Integer.parseInt(st.nextToken());
            System.out.println("number is "+n);
            sum +=n;

        } 
        System.out.println("sum of number is" +sum);

    }
}
