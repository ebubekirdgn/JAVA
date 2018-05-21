import java.io.*;
import java.util.Scanner;

public class ScannerClass 
{
	public static void main(String[] args) 
	{
		File f  = new File("D:\\workspace\\Input-Output Operations\\bos_dosya.txt");
		
		try 
		{
		Scanner s = new Scanner(f);
		while(s.hasNextLine())
		{
			String veri = s.nextLine();
			System.out.println(veri);
				
		}
		
		
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Error! File not found.");
			// TODO: handle exception
		}
	}

}
