 
public class Polimorphism 
{
	public static void main(String args[]) 
	{
	    Insan ali = new Insan();
	    Muhendis veli = new Muhendis(20000,180,80);
	    
	    veli.boy = 180;
	    veli.kilo = 90;
	    System.out.println(veli.boy);
	    veli.yemek();
	    System.out.println(veli.kilo);
	    veli.maas = 10000;
	    veli.zam((float)0.50); // + 2000 yaptýk
	    System.out.println(veli.maas);
	    ali.kilo =80;
	    ali.yemek();
	    System.out.println(ali.kilo);
	    //ali.maas = 5000; //Insan sýnýfý mühendis sýnýfýný extends etmedik
	   // System.out.println(ali.maas);insanýn mühendisin özelliklerinden haberi yok
	}
}
