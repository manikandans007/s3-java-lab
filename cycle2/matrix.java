import java.util.*;
import java.util.Scanner;
public class matrix {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("enter number of row & column of matrix A :");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    System.out.print("enter number of row & column of matrix B :");
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
   int a[][] = new int[r1][c1];
   int b[][] = new int[r2][c2];
   int c[][] = new int[r1][c2];



    if(r1!=c2){
        System.out.print("enter valid row and column :");
    }
    if(r1==c2){
        System.out.print("enter the elements of matrix a :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
          a[i][j] = sc.nextInt();
            }
        }
        System.out.print("enter the elements of matrix b :");
        for(int k=0;k<r2;k++){
            for(int j=0;j<c2;j++){
           b[k][j] = sc.nextInt();
    }
}
}

System.out.print("product ofthe matrix is :");
for(int i=0;i<r1;i++){
for(int j=0;j<c2;j++){
c[i][j] += a[i][j]*b[j][i];
System.out.print(c[i][j]+" ");
}
System.out.println();
}

}
}








   