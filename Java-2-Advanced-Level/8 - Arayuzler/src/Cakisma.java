interface A1 
{
	public void hesapla();
}
interface A2 
{
	public void hesapla(int d);
}
interface A3 
{
	public int hesapla1();
}
class S1 implements A1,A2,A3 // sorunsuz
{
	public void hesapla() //adas yordamlar(overloaded)
	{ 
		System.out.println("S1.hesapla");
	}
	public void hesapla(int d) //adas yordamlar(overloaded)
	{ 
		System.out.println("S1.hesapla " + d );
	}
	public int hesapla1() //adas yordamlar(overloaded)
	{ 
		System.out.println("S1.hesapla");
		return 0;
	}
}
/*! Hatali !, adas yordamlar (overloaded)
donus tiplerine gore ayirt edilemez
*/
  

public class Cakisma 
{
	 public static void main(String[] args) 
	 {		 
		 S1 s = new S1();
		 s.hesapla();
		 s.hesapla(5);
	 }
}
