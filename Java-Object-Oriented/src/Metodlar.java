
public class Metodlar {
	int carp(int s1,int s2)
	{
		return s1*s2;
				
	}
	int topla(int s1,int s2)
	{
		return s1+s2;
				
	}
	
	public static void main(String [] args)
	 {
		  Metodlar islem1= new Metodlar();
		  Metodlar islem2= new Metodlar();
		  
		  int sonuc1 = islem1.carp(5, 6);
		  int sonuc2 = islem1.topla(5, 6);
		  System.out.println("Carpma Sonucu : " + sonuc1);
		  System.out.println("Toplama Sonucu : " + sonuc2);
	 }
}
