
public class ErisimBelirleyiciPublic {
	
	public void Adres()
	{
		System.out.println("Ev adresi");
	}
	public int katsayisi=4;
	
	
	public static void main(String [] args)
	 {
		ErisimBelirleyiciPublic herkes = new ErisimBelirleyiciPublic();
		herkes.Adres();
		System.out.println(herkes.katsayisi);
	 
	 }
}
