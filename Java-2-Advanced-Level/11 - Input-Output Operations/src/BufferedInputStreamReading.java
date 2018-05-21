import java.io.*;
 

public class BufferedInputStreamReading {
	public static void main(String[] args) throws IOException 
	{
		File f  = new File("D:\\workspace\\Input-Output Operations\\bos_dosya.txt");
		byte dizi[] = new byte[1000];
		try 
		{
		FileInputStream f2 = new FileInputStream(f);
		BufferedInputStream bf = new BufferedInputStream(f2);
		int okunan=0;
			while ((okunan = bf.read(dizi))!=-1)
			{
				 	String veriler = new String(dizi, 0, okunan);
				 	System.out.println(veriler);
			}
		bf.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
 		
	}
}
