
public class Public {
	
	int devir_sayisi;
	public String model = "2002 model" ;
	
	public int degerAl() 
	{
	return devir_sayisi;
	}
	
	public void degerAta(int deger) 
	{
		this.devir_sayisi = deger;
		calis();
	}
	void calis() 
	{
		for (int i = 0 ; i < devir_sayisi ; i++)
		{
		  System.out.println("devir_sayisi=" +i);
		}
    }
	public static void main(String[] args) 
	{
		Public pb = new Public();
		pb.degerAta(5);
	}
}
