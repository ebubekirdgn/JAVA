abstract class Sporcu 
{
	public abstract void calis();
	
	public Sporcu() // yapýlandýrýcý yordam
	{ 
		System.out.println("calis() cagrilmadan evvel");
		calis(); // ! Dikkat !
		System.out.println("calis() cagrildiktan sonra");
	}
}
class Futbolcu extends Sporcu
{
	int antraman_sayisi = 4 ;

	public void calis()  // ZORUNLU
	{
		System.out.println("Futbolcu calis() ->>>>>>>>>>>>> = " + antraman_sayisi ); 
	}
	public Futbolcu() // yapýlandýrýcý yordam
	{ 
		System.out.println("Futbolcu yapilandirici" );
		calis();
	}
}
public class Spor 
{
	public static void main( String args[] ) 
	{
	Futbolcu f = new Futbolcu();
	// Sporcu s = new Sporcu(); // ! Hata soyut sýnýf !
	}
}