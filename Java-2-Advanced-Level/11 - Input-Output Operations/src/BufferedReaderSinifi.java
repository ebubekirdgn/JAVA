import java.io.*;


public class BufferedReaderSinifi
{
	public static void main(String[] args)
	{
		//Reader sýnýfýndan türeyen bu sýnýf, karakter tabanlý iþlem yapar.
		//Dosyadan okuma iþlemleri buffer kullanýlarak yapýlýr ve performansý fazladýr.
		
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
