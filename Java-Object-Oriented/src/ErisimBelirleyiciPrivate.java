
public class ErisimBelirleyiciPrivate {
	
	private void kasa()
	{
		System.out.println("Gizli Kasaya ula��ld�");
	}
 
	private String Belge ="Gizli Belge";
	
	public static void main(String [] args)
	 {
		ErisimBelirleyiciPrivate anne = new ErisimBelirleyiciPrivate();
		anne.kasa();
		System.out.println("Anne ->" + anne.Belge + "<- ye ula�t�");
	 
	 }
}
