import java.io.File;

public class RenameTo 
{
	//Dosya ismini de�i�tirmek i�in kullan�r�z.
		public static void main(String[] args) 
		{
			File f1 = new File("D:\\workspace\\Input-Output Operations\\Example_File_Dogan");
			File f2 = new File("D:\\workspace\\Input-Output Operations\\Example_File_Ebubekir");
			f1.renameTo(f2);
		 //Example_File_Dogan adl� dosya ad�n� Example_File_Ebubekir olarak de�i�tiriyor.
			
		}
}
