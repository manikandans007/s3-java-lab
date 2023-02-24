
import java.io.*;
import java.io.FileReader;
public class noofcharacter {
    public static void main(String args[]){
        try{
        FileReader fr = new FileReader("copy1.txt");
        BufferedReader bf = new BufferedReader(fr);
        int lc=0;
        int cc=0;
        int wc=0;
        String s;
        while((s=bf.readLine())!=null){
            lc++;
            cc=cc+s.length();
            wc=wc+s.split("\\s+").length;
        }
        System.out.println("line count:"+lc);
        System.out.println("character count:"+cc);
        System.out.println("word count:"+wc);

    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}
