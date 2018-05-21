import java.io.*;

public class FileOutputStreamSinifi
{

	// FileOutputStreamm ile verileri dosyaya yazdýrmanýn FileWriter sýnýfýndan bir farký , byte tabanlý oldugu icin
	//dosyaya veri yazdýrmak için bir byte dizisi olusturmamizdir.
	//Byte tabanmlý iþlemler bloklar halinde yapýlýr.Byte tabanlý oldugunu, sonundaki OutputStream ifadesinden anlýyoruz.
	//Kod olarak çok bir fark yoktur.
	
	public static void main(String[] args) 
	{
		File yol  = new File("D:\\workspace\\Input-Output Operations\\bos_dosya.txt");
		try 
		{
			FileOutputStream yazdir = new FileOutputStream(yol);
			String metin = "FileOutputStream ile yazdirma";
			byte veriler [] = metin.getBytes();
			//String tipindeki verimizi byte tipindeki diziye atan metottur.
			//Cunku bu sýnýfýn getBytes() metodu yalnýzca byte tipinde parametre alýr.Dogrudan String ifademizi veremiyoruz.
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
