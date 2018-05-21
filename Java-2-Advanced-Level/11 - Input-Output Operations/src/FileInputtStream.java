import java.io.*;

public class FileInputtStream 
{
//Bu s�n�f ile dosya okuma byte bazl� olarak yap�l�r.
//Byte bazl� okumalarda karakter encoding olmaz
	//Bu s�n�f� kullanabilmek i�in  ilk olarak bu s�n�ftan bir nesne olustururuz
	//Daha sonra bu nesneye , okunacak File nesnesi parametre olarak verilir.
	
	public static void main(String[] args)
	{
		File f  = new File("D:\\workspace\\Input-Output Operations\\bos_dosya.txt");
		try {
			FileInputStream oku = new FileInputStream(f);
			byte dizi[] = new byte[(int) f.length()];
			oku.read(dizi);
			String okunan = new String(dizi);
			System.out.println(okunan);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (IOException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
		//Verileri byte olarak okur.
	}
}
