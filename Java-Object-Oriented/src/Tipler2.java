
public class Tipler2 {
	
	int x;
	public static void main(String [] args)
	 {
		Tipler2 t1 = new Tipler2();
		t1.x =5;
  	    System.out.println("Eski x degeri = " + t1.x );
  	    t1.degistir(t1);
	    System.out.println("Yeni x degeri = " + t1.x );
	 
	 }
	  void degistir(Tipler2 t1)
	 {
		  t1.x = t1.x+10;
	 }
}
