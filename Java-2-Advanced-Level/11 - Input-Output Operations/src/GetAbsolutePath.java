import java.io.File;


//Bu metot bize dosyam�z�n yolunu verir.
public class GetAbsolutePath 
{
	public static void main(String[] args) 
	{
		File f = new File("D:\\workspace\\Input-Output Operations\\ornek.txt");
		System.out.println(f.getAbsolutePath());
	}
}
