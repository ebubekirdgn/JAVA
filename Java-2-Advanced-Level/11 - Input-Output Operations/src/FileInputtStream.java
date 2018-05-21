import java.io.*;

public class FileInputtStream 
{
//Bu sýnýf ile dosya okuma byte bazlý olarak yapýlýr.
//Byte bazlý okumalarda karakter encoding olmaz
	//Bu sýnýfý kullanabilmek için  ilk olarak bu sýnýftan bir nesne olustururuz
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
