import java.io.*;

import java.io.FileInputStream;

public class filehandlingwithinputstream {
    public static void main(String []args){
        try{
        FileInputStream fm = new FileInputStream("testing.txt");
        FileOutputStream fn = new FileOutputStream("copy.txt");
        int i;
        while((i=fm.read())!=-1){
    System.out.println((char)i);   
    fn.write(i);
    }
    fm.close();
    fn.close();
}
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
