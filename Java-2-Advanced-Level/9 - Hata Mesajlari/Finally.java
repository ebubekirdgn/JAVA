import javax.swing.JOptionPane;

public class Finally extends RuntimeException  // Miras al�nd�
{
	//Se�imlik var yani olmak zorunda de�ildir.
	//Ne olursa olsun hata olsun yada olmas�n bu finally blogu yap�lmak zorunda b�rak�l�r.
	//finally o blogun zorunlu alan�d�r.
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
	 *   Her ne olursa olsun yap�lacak i�lemler
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
			double pay = Integer.parseInt(JOptionPane.showInputDialog("�lk Say�y� giriniz"));
			double payda = Integer.parseInt(JOptionPane.showInputDialog("�kinci Say�y� giriniz"));
			if (payda<=0)
			{
			 throw new IllegalArgumentException("Girilen say� pozitif de�il" + payda);	
			}
			System.out.println(pay/payda);
		}
  
}
