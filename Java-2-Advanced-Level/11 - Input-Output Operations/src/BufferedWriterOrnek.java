import java.io.*;

public class BufferedWriterOrnek 
{
	//Writer sınıfından türeyen bu sınıf , karakter bazlı işlem yapar.
	//Buffer kullanıldıgı icin flush() metodu ile buffer içerisinde bulunan verilerin dosyaya
	//yazdırılması gerekir.
	
	
	public static void main(String[] args) throws IOException 
	{
		File f  = new File("D:\\workspace\\Input-Output Operations\\bos_dosya.txt");
		FileWriter fw = new FileWriter(f,false);
		BufferedWriter yaz = new BufferedWriter(fw);
		yaz.write("This is example text...");
		yaz.flush();
		yaz.close();		
	}
}
