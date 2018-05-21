import java.util.concurrent.CancellationException;

interface Calisan // arayuz
{ 
	public void calis() ;
}

class Mudur implements Calisan 
{
	public void calis() // iptal etti (override)
	{ 
		System.out.println("Mudur Calisiyor");
	}
}
class GenelMudur extends Mudur
{
	public void calis()  // iptal etti (override)
	{
		System.out.println("GenelMudur Calisiyor");
	}
	public void toplantiYonet() 
	{
		System.out.println("GenelMudur toplanti yonetiyor");
	}
}
class Programci implements Calisan
{
	@Override
	public void calis() 
	{	// TODO Auto-generated method stub
		System.out.println("Programci Calisiyor");
	}
}

class AnalizProgramci extends Programci 
{
	public void analizYap() 
	{
		System.out.println("Analiz Yapiliyor");
	}
 
	
}
class SistemProgramci extends Programci 
{
	public void sistemIncele() 
	{
		System.out.println("Sistem Inceleniyor");
	}
}
class Pazarlamaci implements Calisan 
{
	public void calis()  // iptal etti (override)
	{
		System.out.println("Pazarlamaci Calisiyor");
	}
}
class Sekreter implements Calisan 
{
	public void calis() // iptal etti (override)
	{
		System.out.println("Sekreter Calisiyor");
	}
}

public class BuyukIsYeri 
{
	public static void mesaiBasla(Calisan[] c) //Polimorfizm var
	{
		for (int i = 0 ; i < c.length ; i++) 
		{
			c[i].calis(); // ! Dikkat ! Geç baðlama
		}
	}
	public static void main(String[] args) {
		
		Calisan[] c = new Calisan[6];
		// c[0]=new Calisan(); ! Hata ! arayüz yaratýlamaz
		c[0]=new Programci(); // yukari cevirim (upcasting)
		c[1]=new Pazarlamaci();// yukari cevirim (upcasting)
		c[2]=new Mudur(); //yukari cevirim (upcasting)
		c[3]=new GenelMudur(); //yukari cevirim (upcasting)
		c[4]=new AnalizProgramci();//yukari cevirim //(upcasting)
		c[5]=new SistemProgramci();//yukari cevirim //(upcasting)
		mesaiBasla(c); //Polimorfizm
	}
}
