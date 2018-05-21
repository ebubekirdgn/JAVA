
public class Muhendis extends Insan 
{
 int maas;
   public Muhendis()
   {
	   this(7000); 
   }
   public Muhendis(int maas)
   {
	   if(maas >0)
	   {
		   this.maas = maas;  
	   }
   else
	   {
	   this.maas = 7000;
	   }
   }
   
   public Muhendis(int maas , int boy, int kilo)
   {
	   super(boy,kilo);
   }
   
   
   
  int zam()
  {
	  maas++;
	  return maas;
  }
  //Overloading oldu ayn� i�i yap�yor fakat cok y�kleniliyor 
  int zam(int zamMiktari)
  {
 	 maas +=zamMiktari;
 	 return maas;
 	 
  }

  int zam(float zamOrani)
  {
	  float artis = zamOrani * maas;
	  this.zam((int)artis);
 	  return maas;
 	 
  }
  
  
  
  //A��r� y�kleme olay� var burada methodlar� overriding i�lemi
  void yemek()
  {
	    kilo = kilo+2; // Insan s�n�f�n� extends etti�imiz i�in otomatik geliyor.
  }
  void yemek(int kilo)
  {
	  this.kilo += kilo;
  }

}
