import java.io.File;

public class FileSinifi 
{
	public static void main(String[] args) 
	{
		File f = new File("D:\\workspace\\Input-Output Operations\\ornek.txt");
		if(f.exists())
		{
			System.out.println("Dosya Adi : " + f.getName());
			System.out.println("Dosya Yolu : " + f.getAbsolutePath());
			System.out.println("Dosya Boyutu : " + f.getTotalSpace());
			System.out.println("Dosya okunabilir mi ? : " + f.canRead());
		}
	}
}
