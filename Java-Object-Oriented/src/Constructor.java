
public class Constructor {
	int d1,d2;
	
	public Constructor()
	{
		d1=5;	
	}
	public Constructor(int sayi)
	{
		d2=sayi;
	}
	public static void main(String [] args)
	 {
		 
		Constructor nesne1 = new Constructor();
		Constructor nesne2 = new Constructor(10);
		
		System.out.println("�lk nesnenin degeri : " + nesne1.d1);
		System.out.println("�kinci nesnenin degeri : " + nesne2.d2);
	 
	 }
}
