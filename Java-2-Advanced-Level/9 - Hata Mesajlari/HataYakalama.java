import java.io.IOException;
import java.io.*;

public class HataYakalama 
{
	////////////////////////////// 1.ornek ////////////////////////////////////////////
	/*public static void main(String[] args)
	{
		int sayilar[] = {1,2,3,4};
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("--> " + sayilar[i]);	
		}
		System.out.println("Bitti");
	}*/
///////////////////////////// 2.ornek ////////////////////////////////////////////
	
	/*public void calis()
	{
		int sayilar[] = {1,2,3,4};
		for (int i = 0; i < 5; i++) 
		{
			try 
			{
				System.out.println("--> " + sayilar[i]);		
			}
			catch (ArrayIndexOutOfBoundsException e1) 
			{
				System.out.println("Hata Mesajı"  + e1);
			}
		}
	}
	
	 public static void main(String[] args)
	 {
		System.out.println("Basla");
		HataYakalama h1 = new HataYakalama();
		h1.calis();
		System.out.println("Bitti");
		
	}*/
	
///////////////////////////// 3.ornek ////////////////////////////////////////////
	
	//Throws İfadesi
	
	/*public void cokcalis() throws IOException
	{
	  File f = new File("dgn.txt");
	  BufferedReader bf = new BufferedReader(new FileReader(f));
	  System.out.println(bf.readLine());
	}
	public void calis()
	{
		try 
		{
				cokcalis();
				System.out.println("calis() yordamı");
		}
		catch (IOException ex) 
		{
			 System.out.println("Hata Yakalandı.-calis() = " + ex);
		}
	
		
	}
	 public static void main(String[] args)
	 {
		System.out.println("Basla");
		HataYakalama h1 = new HataYakalama();
		 h1.calis();
		 System.out.println();
 
		
	}*/
	////////////////////////////////////////// 4.ornek /////////////////////////////
	/*public void cokcalis() throws IOException
	{
	  File f = new File("dgn.txt");
	 
	BufferedReader bf = new BufferedReader(new FileReader(f));
	  System.out.println(bf.readLine());
	}
	public void calis() throws IOException
	{
				cokcalis();
				System.out.println("calis() yordamı");
	
	}
	 public static void main(String[] args)
	 {
		 try 
		 {
			 HataYakalama h1 = new HataYakalama();	
			 h1.calis();
		 } 
		 catch (Exception ex) 
		 {
			 System.out.println("Hata Yakalandi-main() = " + ex);
		 }
	}
	*/
//////////////////////////////////////////5.ornek /////////////////////////////
}
