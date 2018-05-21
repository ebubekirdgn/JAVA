
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
  //Overloading oldu ayný iþi yapýyor fakat cok yükleniliyor 
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
  
  
  
  //Aþýrý yükleme olayý var burada methodlarý overriding iþlemi
  void yemek()
  {
	    kilo = kilo+2; // Insan sýnýfýný extends ettiðimiz için otomatik geliyor.
  }
  void yemek(int kilo)
  {
	  this.kilo += kilo;
  }

}
