import java.io.*;
import java.util.Scanner;

public class quicker {
    public static int partition(int a[],int l,int h){
    int  pivot = a[h];
        int i = l-1;
        for(int j=l;j<h;j++){
            if(a[j]<pivot){
                i++;
                //swap
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp = a[i];

        a[i]=pivot;
        a[h]=temp;
        return i;

    }

public static void quicksort(int a[],int l,int h){
    if(l<h){
        int pindx = partition(a,l,h);
        quicksort(a,0,pindx-1);
        quicksort(a,pindx+1,h);
    }
}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms");
    int s = sc.nextInt();
    int a[] = new int[s];
System.out.println("enter" +s+ "elements");
    for(int i=0;i<s;i++){
        a[i]=sc.nextInt();
    }
    quicksort(a,0,s-1);
    System.out.println("sorted list");

    for(int i=0;i<s;i++){
        System.out.println(a[i]+" ");
    }
    System.out.println(" ");

}
}
