package kitap;

public class Fibonacci {
	 public static void main(String [] args)
	 {
		 int gecici=0,deger=1,toplam,i,count=10;    
		 System.out.print(gecici+" "+deger);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  toplam=gecici+deger;    
		  System.out.print(" "+ toplam);    
		  gecici=deger;    
		  deger=toplam;    
		 }    
		  
	 }
}
