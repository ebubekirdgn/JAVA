
public class satisElemani implements Calisan{
	double ucretSabiti;
	double komisyon;
	final double komisyonOran = 0.3;
	public double ucret() 
	 {
		return ((ucretSabiti * oran)+komisyon);
	 }
	 public void calisanBolumu() 
	 {
		System.out.println("Satýþ Elemaný");
	 }
	 public void ucretBelirle(double ucretSabiti) 
	 {
		this.ucretSabiti = ucretSabiti;
	 }
	 
	 public void satisKomisyonuBelirle(int adet)
	 {
		 komisyon = adet * komisyonOran;
	 }
}
