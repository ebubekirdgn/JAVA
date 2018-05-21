
public class mudur implements Calisan
{
	double ucretSabiti;
	public double ucret() 
	 {
		return ucretSabiti;
	 }
	 public void calisanBolumu() 
	 {
		System.out.println("Yönetici");
	 }
	 public void ucretBelirle(double ucretSabiti) 
	 {
		this.ucretSabiti = ucretSabiti;
	 }	

}
