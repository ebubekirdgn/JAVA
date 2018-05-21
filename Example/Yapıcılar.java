package kitap;

public class Yapýcýlar 
{
	String ad;
	String soyad;
	
	public Yapýcýlar() 
	{    //Yapýcý metodlarýn adý sýnýf adýyla ayný olmalýdýr
		System.out.println("Varsayýlan Yapýcý Metod Çaðrýldý");
	}
	
	public Yapýcýlar(String a, String b) {    //Ýki tane yapýcý metod oluþturuldu
		ad=a;
		soyad=b;
	}
	
	void yazdir() 
	{
		System.out.println("Adý:" + ad + "\nSoyadý:" + soyad);
	}
	
	public static void main(String[] args) {
		
//		Hiçbir iþlem yapýlmasa bile nesne oluþturulurken yapýcý metod çaðrýlýr	
		Yapýcýlar nesne1 = new Yapýcýlar();  //Parametre verilmezse varsayýlan metod;
										   //Parametre verilirse, parametre alan metod çaðrýlýr.
		Yapýcýlar nesne2 = new Yapýcýlar("Furkan","Iþýtan");
		nesne2.yazdir();

	}
	
}