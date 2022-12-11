import java.io.*;
import java.util.Scanner;
public class quick{
    public static int partition(int a[],int low,int high){
    int pivot = a[high];
    int i = low-1;
    for(int j=low;j<high;j++){
        if(a[j]<pivot){
        i++;
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[i];
        a[i]=pivot;
        a[high]= temp;
        return i;
    }

public static void quicksort(int a[],int low,int high){
if(low<high){
    int pidx = partition(a,low,high);
    quicksort(a,low,pidx-1);
    quicksort(a,pidx+1,high);
}
}
public static void main(String[] args){
    int n;
    System.out.println("Enter the number of terms u want");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    int a[]= new int[n];
    System.out.println("Enter "+n+" elements ");
for( int i=0; i<n; i++)
{
a[i] = sc.nextInt();
}
    quicksort(a,0,n-1);
    System.out.println("resulted sort is:");
    for(int i=0;i<n;i++){
        
        System.out.print(a[i]+" ");
    }
    System.out.println(" ");

}
}
