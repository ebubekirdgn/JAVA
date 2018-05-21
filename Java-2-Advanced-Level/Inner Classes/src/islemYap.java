
public class islemYap 
{

	  public class DahiliUyeSinifi
	  {
		  public void method1()
		  {
			  System.out.println("Dahili üye sinifinin methodu");
		  }
		  public void method2(int a,int b,int c)
		  {
			  System.out.println("Carpim sonucu : " + a*b*c);
		  } 
	  }
	  public static void main(String[] args) {
		islemYap.DahiliUyeSinifi n1 = new islemYap().new DahiliUyeSinifi();
		n1.method1();
		n1.method2(2,4,5);
		
	}

}
