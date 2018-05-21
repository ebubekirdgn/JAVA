// Inner Class Example
//Bir sınıf diğer bir sınıfın içerisinde tanımlanabilir. böylece mantıksal bir bütünü olusturan bir cok sınıf tek bir çatı altında toplanır.

//3 e ayrılırlar.
//Dahili üye sınıflar
//Yerel Sınıflar
//İsimsiz Sınıflar

//Hesaplama sınıfının içerisinde tanımlanmıs Toplama sınınf dahili üye sınıfıdır.
class Hesaplama2
{ 
   public class Toplama2 
   { // Dahili uye sinif - public 
      public int toplamaYap(int a, int b)
      {
         return a + b ; 
      }
   } // class Toplama2

   protected class Cikartma2 
   { // Dahili uye sinif - protected 
      public int cikartmaYap(int a, int b) 
      {
         return a - b ; 
      }
   } // class Cikartma2

   class Carpma2 
   { // Dahili uye sinif - friendly
      public int carpmaYap(int a, int b)
      {
         return a * b ; 
      }
   } // class Carpma2

   private class Bolme2 
   { // Dahili uye sinif - private 
      public int bolmeYap(int a, int b) 
      {
         return a / b ; 
      }
   } // class Bolme2 

} // class Hesaplama2

public class Hesaplama2Kullan 
{
   public static void main(String args[]) {

      Hesaplama2.Toplama2 ht=new Hesaplama2().new Toplama2() ;
      Hesaplama2.Cikartma2 hck=new Hesaplama2().new Cikartma2() ;
      Hesaplama2.Carpma2 hcp = new Hesaplama2().new Carpma2() ;
      // Hesaplama2.Bolme3 hb = new Hesaplama2().new Bolme2() ;
      // ! Hata ! 

      int sonuc1 = ht.toplamaYap(10,5);
      int sonuc2 = hck.cikartmaYap(10,5);
      int sonuc3 = hcp.carpmaYap(10,5);
      // int sonuc4 = hb.bolmeYap(10,5); // ! Hata ! 

      System.out.println("Toplama Sonuc = " + sonuc1 );
      System.out.println("Cikartma Sonuc = " + sonuc2 );
      System.out.println("Carpma Sonuc = " + sonuc3 ); 
   }
}
/*
Hesaplama2 sınıfımız, toplam 4 adet olan dâhili üye sınıflarının çevreleyicisidir. Dâhili üye sınıfları ve onlara ait erişim belirleyicileri incelenirse: 

• Toplama2 sınıfı, public erişim belirleyicisine sahip olan dâhili üye sınıfıdır.
• Cikartma2 sınıfı, protected erişim belirleyicisine sahip olan dâhili üye sınıfıdır.
• Carpma2 sınıfı, friendly erişim belirleyicisine sahip olan dâhili üye sınıfıdır. 
• Bolme2 sınıfı, private erişim belirleyicisine sahip olan dâhili üye sınıfıdır. 

Hesaplama2Kullan sınıfının statik olan main() yordamının içerisinden, Hesaplama2 sınıfının içerisindeki dahili üye sınıflara erişilebilir mi? Erişilebilir ise hangi erişim belirleyicilerine sahip olan dahili üye sınıflara erişilebilir? 

Normalde bir sınıf private veya protected erişim belirleyicisine sahip olamaz ancak dahili sınıflar private veya protected erişim belirleyicisine sahip olabilir. Hesaplama2Kullan sınıfı, Hesaplama2 sınıfı ile aynı paket içerisinde olduğu için, Hesaplama2Kullan sınıfı, Hesapla2 sınıfının içerisinde tanımlanmış olan public, protected ve friendly erişim belirleyicilerine sahip olan dahili üye sınıflara erişebilir ama private erişim belirleyicisine sahip olan Bolme dahili üye sınıfına erişemez. Uygulamanın çıktısı aşağıdaki gibidir; 

Toplama Sonuc = 15
Cikartma Sonuc = 5
Carpma Sonuc = 50

*/
