class Asker 
{
	public void selamVer() 
	{
	System.out.println("Asker Selam verdi");
	}
}

class Er extends Asker 
{
	public void selamVer()
	{
	System.out.println("Er Selam verdi");
	}
}

class Yuzbasi extends Asker
{
	public void selamVer() 
	{
	System.out.println("Yuzbasi Selam verdi");
	}
}
public class PolimorfizmOrnekBir 
{
	public static void hazirOl(Asker a) 
	{
	     a.selamVer(); // ! Dikkat !
	}
	public static void main(String args[]) 
	{
		Asker a = new Asker();
		Er e = new Er();
		Yuzbasi y = new Yuzbasi();
		hazirOl(a); // yukarý cevirim ! yok !
		hazirOl(e); // yukarý cevirim (upcasting)
		hazirOl(y); // yukarý cevirim (upcasting)
	}
}