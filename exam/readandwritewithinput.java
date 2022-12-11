import java.util.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
class readandwritewithinput{
    public static void main(String args[]){
    try{
        FileInputStream fi = new FileInputStream("D:/java/exam/hello1.txt");
        int ch;
        ch=fi.read();
        while(ch!=-1){
            System.out.println((char)ch);
            ch=fi.read();
        }
        System.out.println(" ");
        fi.close();
    }
    catch(Exception e){
        System.out.println("pgm executed");
    }
    try{
    FileOutputStream fo = new FileOutputStream("D:/java/exam/hello1.txt");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the element you want");
    String s = sc.nextLine();
    byte [] b = s.getBytes();
    fo.write(b);
    System.out.println("file is updated");
    fo.close();
}
catch(Exception e){
    System.out.println("inputed into file");
}
}
}
