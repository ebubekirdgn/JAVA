
public class Insan 
{
	int boy;
	int kilo;
	public Insan()
	{
		//this is a default constructor
	}
	public Insan(int boy, int kilo)
	{
		if(boy >0 && kilo >0)
		{
			this.boy = boy;
			this.kilo= kilo;
		}
	System.out.println("Yeni bir insan oluþtu.");
		
	}
	void yemek()
	{
		kilo++;
	}
}
