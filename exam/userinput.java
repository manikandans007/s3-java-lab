import java.util.*;
import java.io.*;
import java.io.DataOutputStream;
public class userinput
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		//File f=new File("stream.txt");
		try
		{
			
			FileOutputStream fout=new FileOutputStream("stream.txt");
            DataOutputStream fd=new DataOutputStream(fout);

			System.out.println("Enter string:");
			int str=s.nextInt();
			//byte b[]=str.getBytes();
			fd.writeInt(str);
			fd.close();
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
            DataInputStream fd=new DataInputStream(fin);
            int i=0;
			while(i!=-1)
			{
				i=fd.readInt();
				System.out.println(i);
			}
			fin.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not found");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			
			//f.close();
			System.out.println("Read done");
		}
		
	}
}