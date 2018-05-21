
public class arayuzOrnegi 
{	
	public static void main(String[] args) 
	{
		System.out.println("------------ >  Ýþçi <-------------");
		isci ucretliCalisan = new isci();
		ucretliCalisan.calisanBolumu();
		ucretliCalisan.ucretBelirle(1500);
		System.out.println("Maaþý : " + ucretliCalisan.ucret());

		
		System.out.println("------------ >  Müdür <-------------");
		mudur yonetici = new mudur();
		yonetici.calisanBolumu();
		yonetici.ucretBelirle(5655);
		System.out.println("Maaþý : " + yonetici.ucret());
		
		System.out.println("------------ >  SatisElemani <-------------");
	 
		SatisElemani s_Eleman = new SatisElemani();
		s_Eleman.calisanBolumu();
		s_Eleman.ucretBelirle(5655);
		s_Eleman.satisKomisyonuBelirle(250);
		System.out.println("Komisyon : " + s_Eleman.komisyon);
		System.out.println("Maaþý : " + s_Eleman.ucret());
	}
}
