class Kitap
{
	public int sayfaSayisi()
		{
			System.out.println("Kitap - sayfasayiis()");
			return 440;
		}
	
	public double fiyatOgren()
	{
		System.out.println("Kitap - fiyatOgren()");
		return 2520000;
		
	}
	
	public String yazaIsmıOgren()
	{
		System.out.println("Kitap - fiyatOgren()");
		return "xy";
	}
}


public class Roman extends Kitap {
	
	public int sayfaSayisi()
	{
		System.out.println("Kitap - sayfasayiis()");
		return 440;
	}

	public double fiyatOgren()
	{
		System.out.println("Kitap - fiyatOgren()");
		return 2520000;
		
	}
 
	public static void main(String[] args) {

Roman r2 = new Roman();
int sayfasayisi = r2.sayfaSayisi();
double fiyat =r2.fiyatOgren();
String yazar = r2.yazaIsmıOgren();

System.out.println(sayfasayisi);
System.out.println(fiyat);
System.out.println(yazar);

	}

}
