 interface Faktoriyel
	 {
		 public double hesap();
	 }
public class isimsizSinifOrnegi 
{
	
	public Faktoriyel faktoriyel(final double sayi)
	{
		
		return new Faktoriyel()
		{
		   public double hesap()
		   {
			   double x =1;
			   
			   for (int i = 1; i <= sayi ; i++) 
				x *=i;
				
			   
			   return x; 
		   }
		};
	}
	public static void main(String[] args) 
	{
		isimsizSinifOrnegi i = new isimsizSinifOrnegi();
		Faktoriyel f = i.faktoriyel(7);
		
		System.out.println("7 'nin faktoriyeli : " + f.hesap());
	}
}
