interface ArayuzA
{
	public interface DahiliArayuz1
	{
		public void isyap1();
	}
	//Hata
	/*protected interface DahiliArayuz2
	{
		
	}*/
	public interface DahiliArayuz3
	{
		public void isyap3();
	}
	public interface DahiliArayuz4
	{
		public void isyap4();
	}
}

class Erisim1 implements ArayuzA.DahiliArayuz1
{
	 public  void isyap1()
	 {
		 System.out.println("Erisim1.isyap1()");
	 }	 
}
class Erisim2 implements ArayuzA.DahiliArayuz3
{
	 public  void isyap3()
	 {
		 System.out.println("Erisim1.isyap3()");
	 }	 
}

public class DahiliArayuzTest {

	//Ýç içe arayüz oluþturma iþlemine denmektedir.
	//interface protected olamaz.
	public static void main(String[] args) 
	{
		Erisim1 e1 = new Erisim1();
		Erisim2 e2 = new Erisim2();
		e1.isyap1();
		e2.isyap3();
		
		  
	}

}
