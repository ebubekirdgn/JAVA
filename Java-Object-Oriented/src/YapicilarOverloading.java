
public class YapicilarOverloading {
	void metod1()
	{
		System.out.println("Parametre Almayan metod çaðýrýldý.");
	}
	void metod2(int s1)
	{
		System.out.println("Parametre alan metod çaðýrýldý.");
	}
	
	public YapicilarOverloading()
	{
		metod1();
	}
	public YapicilarOverloading(int sayi)
	{
		metod2(sayi);
	}
	public static void main(String [] args)
	 {	
		YapicilarOverloading n1 = new  YapicilarOverloading();
		YapicilarOverloading n2 = new  YapicilarOverloading(10);
		
	 }
}
