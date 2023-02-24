import java.io.*;
import java.util.Scanner;
public class userinputchar {
    


	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		//File f=new File("stream.txt");
		try
		{
			
			FileOutputStream fout=new FileOutputStream("stream.txt");
			System.out.println("Enter string:");
			String str=s.nextLine();
			byte b[]=str.getBytes();
			fout.write(b);
			fout.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		}
		finally
		{
			
			System.out.println("Write done");
		}
		try
		{
			FileInputStream fin=new FileInputStream("stream.txt");
			int i=0;
			while(i!=-1)
			{
				i=fin.read();
				System.out.println((char)i);
			}
			fin.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
			//f.close();
			System.out.println("Read done");
		}
		
	}
}
    
