import java.util.ArrayList;

public class DahiliSinifOrnegi {
	 
	 //1. dahili sýnýfý
	 public class AsalSayi
	 {
		  public boolean AsalSayi(int AsalSayi)
		  {
			  int bolen =0;
			  boolean kontrol;
			  
			  for (int i = 2; i < AsalSayi; i++) {
				 if(AsalSayi % i ==0)
				 {
					bolen++; 
				 }
			}
			  
			  if(bolen ==0) kontrol = true;
			  else kontrol = false;
	 
			  return kontrol;
		  }
	 }
	 
	 //2. dahili sýnýfý
	 protected  class MukemmelSayi 
	 {
		 protected boolean mukemmelSayi(int mukemmelSayi)
		 {
			 int bolenToplam =0;
			 boolean kontrol;
			 
			 for (int i = 1; i < mukemmelSayi; i++) {
				if(mukemmelSayi %i == 0)
				{
					bolenToplam += i ;
				}
			}
			 if(bolenToplam == mukemmelSayi)kontrol = true;
			  else kontrol = false;
			
			 return kontrol;
			 
		 }
	 }
	 
	//3. dahili sýnýfý
	 private  class FibonacciSerisi 
	 {
		  private ArrayList fibonacciSerisi(int elemanSayisi)
		  {
			  ArrayList<Integer> fibonacci = new ArrayList<Integer>();
			  fibonacci.add(0,1);
			  fibonacci.add(1,1);
			  // ilk iki indise 1 deðeri eklendi.
			  
			  for(int i=0;i<elemanSayisi-2 ; i++)
			  {
				 fibonacci.add(i+2 , fibonacci.get(i) + fibonacci.get(i+1));
				  //bir sonraki indise ardýsýk indise sahip dizilerin elemanlarý toplanarak ekleniyor.
			  }
			  
			  return fibonacci;
		  }
	 }
		
	 public static void main(String[] args)
		 {
			DahiliSinifOrnegi.AsalSayi asal = new DahiliSinifOrnegi().new AsalSayi();
			DahiliSinifOrnegi.FibonacciSerisi fibonacci = new DahiliSinifOrnegi().new FibonacciSerisi();
			DahiliSinifOrnegi.MukemmelSayi  mukemmel = new DahiliSinifOrnegi().new MukemmelSayi();
			
			System.out.println(asal.AsalSayi(5));
			System.out.println(asal.AsalSayi(413));
			System.out.println(mukemmel.mukemmelSayi(6));
			System.out.println(mukemmel.mukemmelSayi(12));
			System.out.println(fibonacci.fibonacciSerisi(7));
			System.out.println(fibonacci.fibonacciSerisi(11));
		 }
}
