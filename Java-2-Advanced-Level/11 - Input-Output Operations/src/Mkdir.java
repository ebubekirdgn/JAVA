import java.io.*;

public class Mkdir 
{
	//Bu metod verilen yola belirtilen isimdeki klasoru olusturur.
	public static void main(String[] args) 
	{
		File f = new File("D:\\workspace\\Input-Output Operations\\Example_File_Dogan");
		f.mkdir();
	}
}
