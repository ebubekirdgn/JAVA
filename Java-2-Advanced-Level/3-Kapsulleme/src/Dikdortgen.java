
public class Dikdortgen  
{
   private double en,boy;
   
   public double getEn() 
   {
	return en;
   }

	public void setEn(double en) 
	{
		this.en = en;
	}
	
	public double getBoy() 
	{
		return boy;
	}
	
	public void setBoy(double boy) 
	{
		this.boy = boy;
	}

   double dikdortgen()
   {
	   double alan = en * boy;
	   return alan;
   }
   
   public static void main(String[] args) 
   {
	   Dikdortgen da = new Dikdortgen();
	    if(da.en <0 && da.boy <0)
	    {
	    	da.setBoy(0);
	    	da.setEn(0);
	    }
	    else
	    {
	    	da.setBoy(5);
	    	da.setEn(7);
	    }
	   System.out.println("Alan : " + da.dikdortgen());
   }
}
 