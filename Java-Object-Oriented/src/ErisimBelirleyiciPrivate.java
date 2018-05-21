
public class ErisimBelirleyiciPrivate {
	
	private void kasa()
	{
		System.out.println("Gizli Kasaya ulaşıldı");
	}
 
	private String Belge ="Gizli Belge";
	
	public static void main(String [] args)
	 {
		ErisimBelirleyiciPrivate anne = new ErisimBelirleyiciPrivate();
		anne.kasa();
		System.out.println("Anne ->" + anne.Belge + "<- ye ulaştı");
	 
	 }
}
