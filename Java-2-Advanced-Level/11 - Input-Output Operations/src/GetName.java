
// Bu metod ise verilen dizindeki dosya adýnýn ogrenilmesini saglar.
import java.io.*;
public class GetName 
{  
	public static void main(String[] args) 
	{
		File f = new File("D:\\workspace\\Input-Output Operations\\ornek.txt");
		System.out.println(f.getName());
	}		
}
