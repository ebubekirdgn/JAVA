import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;


class benimException extends Exception
{
	
}


class denemeException 
{
	void f(int x) throws benimException
	{
		 throw new benimException();
	}
}


public class FileNotFoundExceptionn 
{
	public static void main(String[] args)
	{
			File f  = new File("a.txt");
			try 
			{
			  BufferedReader br = new BufferedReader(new FileReader(f));	
			  int dizi_boy =10;
			  int dizi[] = new int[dizi_boy];
			  System.out.println("dizi :" + dizi[25]);
			} 
			catch (FileNotFoundException ex) 
			{
				System.out.println("Dosya Bulunamadý");
			}
			catch (ArrayIndexOutOfBoundsException ex) 
			{
				System.out.println("Boyut Aþým Hatasý");
			}
			denemeException d = new denemeException();
			d.f(2);
	}
}
