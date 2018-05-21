import java.io.File;

public class CanReadandCanWrite 
{
   public static void main(String[] args) 
   {
	   File f1 = new File("D:\\workspace\\Input-Output Operations\\ornek.txt");
	   if(f1.canRead() == true && f1.canWrite() == true)
	   {
		   System.out.println("Hem yazýlabilir hemde okunabilir bir dosyaniz var.");
	   }
   }
}
