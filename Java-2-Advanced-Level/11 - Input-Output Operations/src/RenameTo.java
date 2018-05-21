import java.io.File;

public class RenameTo 
{
	//Dosya ismini deðiþtirmek için kullanýrýz.
		public static void main(String[] args) 
		{
			File f1 = new File("D:\\workspace\\Input-Output Operations\\Example_File_Dogan");
			File f2 = new File("D:\\workspace\\Input-Output Operations\\Example_File_Ebubekir");
			f1.renameTo(f2);
		 //Example_File_Dogan adlý dosya adýný Example_File_Ebubekir olarak deðiþtiriyor.
			
		}
}
