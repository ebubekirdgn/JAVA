
//Karakter tabanl� veri iletimi ,Writer ve Reader s�n�flar� ile yap�l�rlar.
//Reader s�n�f�n�n alt s�n�flar�

/*
 * InputStreamReader
 * BufferedReader
 * FileReader
 * FilterReader
 * StringReader
 * 
 * */


//Writer s�n�f�n�n alt s�n�flar�

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
