import java.io.*;

public class FileWriterSinifi 
{
	public static void main(String[] args)
	{
		File f = new File("D:\\workspace\\Input-Output Operations\\bos_dosya.txt");
		
		try 
		{
			FileWriter yazdir = new FileWriter(f);
			String yazilacak = "Ebubekir Dogan";
			yazdir.write(yazilacak );
			yazdir.close();
			//okuma iþlemleri
			
			char veriler[] = new char[(int) f.length()];
			FileReader f2 = new FileReader(f);
			f2.read(veriler);
			String okunan = new String(veriler);
			System.out.println(okunan);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
