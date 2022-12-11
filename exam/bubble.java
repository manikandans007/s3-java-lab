import java.io.*;
import java.util.Scanner;

public class bubble {
    public static void bubblesort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[i]>a[i+1]){
                    //Swap
                    int temp= a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
    }
    public static void print(int a[]){
        System.out.println("Sorted array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nunber of elemrnys");
        int n = sc.nextInt();

        int a[] = new int [n];
        System.out.println("enter "+n+ " elements" );
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        bubblesort(a);
        print(a);
    }
}
