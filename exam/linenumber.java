import java.io.*;

public class linenumber {
    public static void main(String args[]){
        try{
        FileReader fr = new FileReader("copy1.txt");
        BufferedReader bf = new BufferedReader(fr);
        int i=0;
        String s;
        while((s=bf.readLine())!=null){
            System.out.println(+i+":"+s);
            i++;
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }

    }
}
