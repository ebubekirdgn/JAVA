
public class Araba {
String marka,renk;
void gazaBas()
{
	System.out.println("Araba H�zlan�yor");
}
void freneBas()
{
	System.out.println("Araba Yava�l�yor");
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
