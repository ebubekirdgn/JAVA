abstract class Calisan 
{
	public String pozisyon="Calisan" ;
	public abstract void calis() ;// soyut yordam
	public void zamIste() // soyut olmayan yordam
	{ 
		System.out.println("Calisan zamIste");
	}
}

class Mudur extends Calisan 
{
	public Mudur () // yap�land�r�c�
	{ 
		pozisyon = "Mudur" ;
	}
	
	public void calis() // iptal etme (override) ZORUNLU !
	{ 
		System.out.println("Mudur Calisiyor");
	}
	
	public void zamIste() 
	{ // iptal etme (override)
		System.out.println("Mudur Zam Istiyor");
	}
}
class Programci extends Calisan 
{
	public Programci() 
	{ // yap�land�r�c�
		pozisyon = "Programci" ;
	}
	public void calis()	// iptal etme (override) ZORUNLU !
	{ 
		System.out.println("Programci Calisiyor");
	}
	public void zamIste() 
	{ // iptal etme (override)
		System.out.println("Programci Zam Istiyor");
	}
	
}
class Pazarlamaci extends Calisan 
{
	public Pazarlamaci() 
	{ // yap�land�r�c�
		pozisyon = "Pazarlamaci" ;
	}
	public void calis()// iptal etme (override) ZORUNLU !
	{ 
		System.out.println("Pazarlamaci Calisiyor");
	}
}
public class AbIsYeri 
{
	public static void mesaiBasla(Calisan[] c ) 
	{
		for (int i = 0 ; i < c.length ; i++) 
		{
			c[i].calis(); // !Dikkat!
		}
	}
	public static void main(String args[]) 
	{
		Calisan[] c = new Calisan[3];
		// c[0] = new Calisan(); // soyut s�n�flar new iledirek olu�turulamazlar
		c[0] = new Programci(); // yukar� cevirim (upcasting)
		c[1] = new Pazarlamaci();// yukar� cevirim (upcasting)
		c[2] = new Mudur(); // yukari cevirim (upcasting)
		mesaiBasla(c);
	}
}
 