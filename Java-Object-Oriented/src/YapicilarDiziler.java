
public class YapicilarDiziler {
static int sayi =0;
	public YapicilarDiziler()
	{
		sayi++;
	}
	public static void dongu(YapicilarDiziler nesnedizisi[])
	{
		for(int i =0; i<4;i++)
		{
			nesnedizisi[i]=new YapicilarDiziler();
			
		}
	}
	public static void main(String [] args)
	 {
		YapicilarDiziler nesne[] = new YapicilarDiziler[4];
		YapicilarDiziler.dongu(nesne);
		System.out.println(sayi + " adet oluþturuldu.");
 
	 
	 }
}
