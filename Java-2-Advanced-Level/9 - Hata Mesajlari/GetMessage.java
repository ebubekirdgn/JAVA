
public class GetMessage 
{
	 public void oku () throws Exception
	 {
		 throw new Exception("Ýstisna Fýrlatýldý."); // dikkat
	 }
	 
	 public static void main(String[] args) {
		 
		 GetMessage a = new GetMessage();
		 try 
		 {
			 a.oku(); 
		 } 
		 catch (Exception e) 
		 {
			System.out.println("Hata -e.Message : " + e.getMessage());
			System.out.println("Hata -e.toString : " + e.toString());
		 }
 
		 
	}
}
