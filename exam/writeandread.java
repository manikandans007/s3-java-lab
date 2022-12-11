import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.Writer;
import java.io.FileWriter;
class writeandread{
   
    public static void main(String args[]){
        try{
            Reader r = new FileReader("D:/java/exam/hello.txt");
            int ch;
            ch = r.read();
            while(ch!=-1){
                System.out.println((char)ch);
                ch=r.read();
            }
            System.out.println(" ");
            r.close();
        }
        catch(Exception e){
        System.out.println("program is executed sucessfully");
        }
    
        try{
            Writer w = new FileWriter("D:/java/exam/hello.txt");
            String s = "this is changed file";
            w.write(s);
            w.close();
        }
        catch(Exception e){
            System.out.println("file is modified");
        }
    }
}


