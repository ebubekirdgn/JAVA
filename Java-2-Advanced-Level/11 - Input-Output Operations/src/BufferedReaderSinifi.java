import java.io.*;


public class BufferedReaderSinifi
{
	public static void main(String[] args)
	{
		//Reader s�n�f�ndan t�reyen bu s�n�f, karakter tabanl� i�lem yapar.
		//Dosyadan okuma i�lemleri buffer kullan�larak yap�l�r ve performans� fazlad�r.
		
		try 
		{
			File f  = new File("D:\\workspace\\Input-Output Operations\\bos_dosya.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String satir = br.readLine();
			while(satir != null)
			{
				System.out.println(satir);
				satir = br.readLine();
			}
			br.close();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}	
	}

}
