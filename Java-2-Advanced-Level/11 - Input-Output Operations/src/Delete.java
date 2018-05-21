import java.io.*;
public class Delete 
{
	public static void main(String[] args) 
	{
		File f = new File("D:\\workspace\\Input-Output Operations\\ornek.txt");
		System.out.println(f.delete());
		System.out.println(f.exists()); // dosyanýn varligi sorgulaniyor.
	}
}
