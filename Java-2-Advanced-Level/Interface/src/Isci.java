
public class Isci implements Calisan{
	double ucretSabiti;
	public double ucret() 
	 {
		return ucretSabiti * oran;
	 }
	 public void calisanBolumu() 
	 {
		System.out.println("Ucretli �al��an");
	 }
	 public void ucretBelirle(double ucretSabiti) 
	 {
		this.ucretSabiti = ucretSabiti;
	 }
}
