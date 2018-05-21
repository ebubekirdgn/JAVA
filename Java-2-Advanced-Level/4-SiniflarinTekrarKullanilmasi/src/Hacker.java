class Insan 
{
	public Insan(int par) 
	{
	System.out.println("Insan Yapilandiricisi " + par);
	}
}
class ZekiInsan extends Insan 
{
	public ZekiInsan(int par) 
	{
		super(par*2); //dikkat
		System.out.println("ZekiInsan Yapilandiricisi " + par);
	}
}
public class Hacker extends ZekiInsan
{
	public Hacker(int par) {
		super(par * 2);
		System.out.println("Hacker Yapilandiricisi " + par);
	}
	public static void main(String[] args) 
	{
		Hacker hck = new Hacker(2);
	}

}

//////////////// Ekran cýktýsý ////////////////////////

/*
Insan Yapilandiricisi 8
ZekiInsan Yapilandiricisi 4
Hacker Yapilandiricisi 2
*/







