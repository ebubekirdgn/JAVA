
//Karakter tabanlý veri iletimi ,Writer ve Reader sýnýflarý ile yapýlýrlar.
//Reader sýnýfýnýn alt sýnýflarý

/*
 * InputStreamReader
 * BufferedReader
 * FileReader
 * FilterReader
 * StringReader
 * 
 * */


//Writer sýnýfýnýn alt sýnýflarý

/*
 * OutputStreamWriter
 * BufferedWriter
 * FileWriter
 * FilterWriter
 * StringWriter
 * PrintWriter
 * 
 * */

import java.io.*;
public class IO 
{
	public static void main(String[] args) 
	{
		File f = new File("D:\\workspace\\Input-Output Operations\\ornek.txt");
		try 
		{
			f.createNewFile();	
		} catch (Exception e)
		{
          e.printStackTrace();
		 // TODO: handle exception
		}
	}
}
