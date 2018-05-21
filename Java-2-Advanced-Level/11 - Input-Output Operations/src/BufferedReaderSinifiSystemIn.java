import java.io.*;

public class BufferedReaderSinifiSystemIn 
{
	public static void main(String[] args)
	{
	   try 
	   {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br =  new BufferedReader(is);
		
		System.out.println("Something write :");
		String text= br.readLine();
		System.out.println("Enter the text : "  + text);
		br.close();
	   }
	   catch (Exception e) 
	   {
		   e.printStackTrace();
		// TODO: handle exception
	   }	
	}

}
