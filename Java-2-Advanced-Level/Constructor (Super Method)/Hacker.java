 class Insan {

	public Insan(int par) {
		// TODO Auto-generated constructor stub
		System.out.println("Insan Yap�land�r�c�s� " + par);
	}
	 
}

class ZekiInsan extends Insan
{

	public ZekiInsan(int par) {
		super(par+1);
	    System.out.println("Zeki insan Yap�land�r�c�"+par);
	}
	
}
class Hacker extends ZekiInsan
{
	public Hacker(int par) {
		 
		super(par+1); // buray� silersek sayet s�rekli bir �st s�n�ftan miras aldg� i�in parametre istiyor.
	    System.out.println("Hacker  Yap�land�r�c�"+par);
	}
	
	public static void main(String args[])
	{
		Hacker hck = new Hacker(5);
	}
}