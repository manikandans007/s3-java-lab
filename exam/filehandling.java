import java.io.*;
public class filehandling {
  public static void main(String args[]){
    try{
    FileReader fr = new FileReader("testing.txt");
    BufferedReader bf = new BufferedReader(fr);
    FileWriter fw = new FileWriter("copy1.txt");
    String s;
        while((s=bf.readLine())!=null){
            System.out.println(s);
            fw.write(s);
        }
        fw.close();
        fr.close();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
  }  
}
