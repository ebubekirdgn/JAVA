
public class Araba {
String marka,renk;
void gazaBas()
{
	System.out.println("Araba Hızlanıyor");
}
void freneBas()
{
	System.out.println("Araba Yavaşlıyor");
}

	
	public static void main(String [] args)
	 {
		Araba a1= new Araba();
		a1.marka ="Mercedes";
		a1.renk = "Siyah";
		a1.gazaBas();
		a1.freneBas();
	 }
}
