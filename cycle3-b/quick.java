import java.io.*;
import java.util.Scanner;




public class quick {

    String names[];
    int length;

    public static void main(String[] args) {
        quick obj = new quick();
        Scanner s = new Scanner(System.in);
       System.out.println("Enter the length of the array:");
      int length = s.nextInt();
      String [] stringsList = new String[length];
      System.out.println("Enter the elements of the array:");

      for(int i=0; i<=length; i++ ) {
         stringsList[i] = s.nextLine();
      }
        obj.sort(stringsList);

        for (String i : stringsList) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}
