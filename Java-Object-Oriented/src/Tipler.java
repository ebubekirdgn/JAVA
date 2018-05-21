
public class Tipler {
	public static void main(String [] args)
	 {
	  int x =5;
	  System.out.println("Eski x degeri = " + x );
	  degistir(x);
	  System.out.println("Yeni x degeri = " + x );
	 
	 }
	 static void degistir(int x)
	 {
		x +=10;
	 }
}
