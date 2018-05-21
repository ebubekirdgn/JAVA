import java.io.*;

public class FileOutputStreamSinifi
{

	// FileOutputStreamm ile verileri dosyaya yazd�rman�n FileWriter s�n�f�ndan bir fark� , byte tabanl� oldugu icin
	//dosyaya veri yazd�rmak i�in bir byte dizisi olusturmamizdir.
	//Byte tabanml� i�lemler bloklar halinde yap�l�r.Byte tabanl� oldugunu, sonundaki OutputStream ifadesinden anl�yoruz.
	//Kod olarak �ok bir fark yoktur.
	
	public static void main(String[] args) 
	{
		File yol  = new File("D:\\workspace\\Input-Output Operations\\bos_dosya.txt");
		try 
		{
			FileOutputStream yazdir = new FileOutputStream(yol);
			String metin = "FileOutputStream ile yazdirma";
			byte veriler [] = metin.getBytes();
			//String tipindeki verimizi byte tipindeki diziye atan metottur.
			//Cunku bu s�n�f�n getBytes() metodu yaln�zca byte tipinde parametre al�r.Dogrudan String ifademizi veremiyoruz.
			yazdir.write(veriler);
			yazdir.close();//Dosya kapatildi.
			//Okuma islemleri
			char okunacak[] = new char[(int) yol.length()];
			FileReader f2 = new FileReader(yol);
			f2.read(okunacak);//dizi dolduruldu.
			String okunan = new String(okunacak);
			System.out.println(okunan);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
