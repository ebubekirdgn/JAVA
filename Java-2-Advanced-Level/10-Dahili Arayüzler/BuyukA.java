
public class BuyukA 
{
	  //D�hili �ye s�n�flar�n yap�land�r�c�lar� olabilir.	
	  public class B 
	  {
	      public B()// yapilandirici
	      {
	         System.out.println("Ben B sinifi ");
	      }
	   } // class B
	   public BuyukA() 
	   {
	      System.out.println("Ben BuyukA sinifi ");
	   }
	   public static void main(String args[]) 
	   {
		      BuyukA ba_nesnesi = new BuyukA();
		      BuyukA.B b_nesnesi = new BuyukA().new B();
	   }
}

//Ekran c�kt�s� : 
/*
 * Ben BuyukA sinifi 
 Ben BuyukA sinifi 
 Ben B sinifi 
*/