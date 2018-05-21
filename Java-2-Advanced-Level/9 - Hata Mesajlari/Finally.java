import javax.swing.JOptionPane;

public class Finally extends RuntimeException  // Miras alýndý
{
	//Seçimlik var yani olmak zorunda deðildir.
	//Ne olursa olsun hata olsun yada olmasýn bu finally blogu yapýlmak zorunda býrakýlýr.
	//finally o blogun zorunlu alanýdýr.
	//
	/*
	 * 
	 *  try
	 *  {
	 *  
	 *  }
	 *  catch (Exception ex1)
	 *  {
	 *  
	 *  }
	 *   catch (Exception ex2)
	 *  {
	 *  
	 *  }
	 *   finally
	 *  {
	 *   Her ne olursa olsun yapýlacak iþlemler
	 *  }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
      
	 public void testExtend(String a)
	 {
		 super(a);
	 }

 
		public static void main(String[] args) 
		{
			double pay = Integer.parseInt(JOptionPane.showInputDialog("Ýlk Sayýyý giriniz"));
			double payda = Integer.parseInt(JOptionPane.showInputDialog("Ýkinci Sayýyý giriniz"));
			if (payda<=0)
			{
			 throw new IllegalArgumentException("Girilen sayý pozitif deðil" + payda);	
			}
			System.out.println(pay/payda);
		}
  
}
