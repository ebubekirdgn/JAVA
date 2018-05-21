import java.io.*;

public class FileReaderSinifi 
{
	public static void main(String[] args) 
	{
		File f = new File("D:\\workspace\\Input-Output Operations\\ornek.txt");
		char veriler[] = new char[(int) f.length()];
		try {
			FileReader f2 = new FileReader(f);
			f2.read(veriler);
			String okunan = new String(veriler);
			System.out.println(okunan);
			
		} 
		catch (FileNotFoundException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//Bos dosya okundugunda -1 sonucu dönmektedir.
	
}
