package kitap;

public class Overloading {
	
	static int metod1(int s1)
	{
		return s1;
	}
	
	static int metod1(int s1,int s2)
	{
		return s2;
	}
	public static void main(String [] args)
	 {
		 System.out.println(metod1(5));
		 System.out.println(metod1(5,7));
	 }
}
