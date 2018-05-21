 class Insan {

	public Insan(int par) {
		// TODO Auto-generated constructor stub
		System.out.println("Insan Yapılandırıcısı " + par);
	}
	 
}

class ZekiInsan extends Insan
{

	public ZekiInsan(int par) {
		super(par+1);
	    System.out.println("Zeki insan Yapılandırıcı"+par);
	}
	
}
class Hacker extends ZekiInsan
{
	public Hacker(int par) {
		 
		super(par+1); // burayı silersek sayet sürekli bir üst sınıftan miras aldgı için parametre istiyor.
	    System.out.println("Hacker  Yapılandırıcı"+par);
	}
	
	public static void main(String args[])
	{
		Hacker hck = new Hacker(5);
	}
}