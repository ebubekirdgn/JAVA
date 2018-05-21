package kitap;

public class Yap�c�lar 
{
	String ad;
	String soyad;
	
	public Yap�c�lar() 
	{    //Yap�c� metodlar�n ad� s�n�f ad�yla ayn� olmal�d�r
		System.out.println("Varsay�lan Yap�c� Metod �a�r�ld�");
	}
	
	public Yap�c�lar(String a, String b) {    //�ki tane yap�c� metod olu�turuldu
		ad=a;
		soyad=b;
	}
	
	void yazdir() 
	{
		System.out.println("Ad�:" + ad + "\nSoyad�:" + soyad);
	}
	
	public static void main(String[] args) {
		
//		Hi�bir i�lem yap�lmasa bile nesne olu�turulurken yap�c� metod �a�r�l�r	
		Yap�c�lar nesne1 = new Yap�c�lar();  //Parametre verilmezse varsay�lan metod;
										   //Parametre verilirse, parametre alan metod �a�r�l�r.
		Yap�c�lar nesne2 = new Yap�c�lar("Furkan","I��tan");
		nesne2.yazdir();

	}
	
}