/*
Statik Dâhili Üye Sınıflar
Statik (static) olarak tanımlanmış dâhili üye sınıflar, normal dahili üye sınıflardan farklıdırlar. Bu farklılıklar şöyledir:

• Statik dâhili üye sınıfına ait nesne oluşturmak için, onu çevreleyen sınıfa ait bir nesne oluşmak zorunda değilizdir)
• Statik dâhili üye sınıflar, kendilerini çevreleyen sınıfa ait bağlantıyı (-this-) kaybederler. 
Statik dahili üye sınıflar, onları çevreleyen üst sınıfa ait global alanlara (statik veya değil) ve yordamlara (statik veya değil) direk ulaşım şansını kaybeder. Bunun sebebi, kendisini çevreleyen sınıf ile arasındaki bağı kopartmış olmasıdır. Buraya kadar ifade edilenleri örnek üzerinde inceleyelim, ama öncesinde UML diyagramı çizilirse... 

*/

public class Hesaplama4
{
   int sabit = 2; 
   private int ozelsabit = 1 ;
   public static class Toplama4
   { // Statik uye dahili sinif 
      static int toplam ; // dogru
      int sonuc ; // dogru
      public int toplamaYap(int a, int b) 
      {
         // return (a+b) + sabit ; ! Hata ! 
         sonuc = toplam = a+b;
         return sonuc; 
      }

      public void dekontOlustur() 
      {
         /* -sabit- alanina ve 
         -ekranaBas() yordamına ulasabilmek icin
         Hesaplama4 sinifina ait nesne olusturmamiz gerekir. 
         */
         Hesaplama4 hs4 = new Hesaplama4(); //dikkat
         int a = hs4.ozelsabit ; // dogru
         hs4.ekranaBas() ; //dogru
         System.out.println("Dekont olusturuyor = " +
         hs4.sabit + " - " +a );
      }
   } // class Toplama4

   public class Cikartma4 
   { //Uye dahili sinif 

      int sonuc ;
      // static int sonuc1 ; // ! hata! 
      public int cikartmaYap(int a, int b) 
      {
         ekranaBas(); // dikkat
         sonuc = (a-b) - ozelsabit;
         return sonuc ; // dikkat
      }
   } // class Cikartma4

   private void ekranaBas()
   {
      System.out.println("Hesaplama4.ekranaBas()");
   }

   public static void main(String args[]) 
   {
      // ! Hata ! 
      // Hesaplama4.Toplama4 ht=new Hesaplama4().new Toplama4(); 
      Toplama4 tp4 = new Toplama4();
      tp4.dekontOlustur();
      int sonuc = tp4.toplamaYap(10,5);
      System.out.println("Sonuc = 10 + 5 = " + sonuc );
   }

} // class Hesaplama4

class Hesaplama4Kullan 
{
   public static void main(String args[]) 
   {
       // ! Hata! 
      // Hesaplama4.Toplama4 ht=new Hesaplama4().new Toplama4() ;
      Hesaplama4.Toplama4 tp4 = new Hesaplama4.Toplama4();
      int sonuc = tp4.toplamaYap(10,5);
      System.out.println("Sonuc = 10 + 5 = " + sonuc );
   }

} // class Hesaplama4Kullan
/*
Statik dâhili üye sınıf olan Toplama4 sınıfını yakın takibe alıp, neleri nasıl yaptığını inceleyelim. Toplama4 statik dahili sınıfının içerisinde statik global alan tanımlayabiliriz. Statik olmayan dahili üye sınıfların içerisinde statik global alan tanımlanamaz.

Toplama4 statik dahili üye sınıfının, toplamaYap() yordamının içerisinde, Hesaplama4 sınıfına ait global olarak tanımlamış ilkel (primitive) int tipindeki sabit alanına direk erişilemez. Statik dâhili üye sınıflar ile bunları çevreleyen sınıflar arasında this bağlantısı yoktur. Eğer statik dâhili üye sınıfın içerisinden, onu çevreleyen sınıfa ait bir alan (statik olmayan) veya yordam (statik olmayan) çağrılmak isteniyorsa, bu bizzat ifade edilmelidir. Aynı Toplama4 statik dâhili üye sınıfına ait dekontOlustur() yordamının içerisinde yapıldığı gibidir. 

dekontOlustur() yordamının içerisinde, Hesaplama4 sınıfına ait nesne oluşturulmadan, sabit, ozelsabit alanlarına ve ekranaBas() yordamına ulaşamazdık. Buradaki önemli nokta, dâhili üye sınıf statik olsa bile, kendisine çevreleyen sınıfın private erişim belirleyicisi sahip olan alanlarına (statik veya değil) ve yordamlarına (statik veya değil) erişebilmesidir.

Hesaplama4 sınıfının statik olan main() yordamının içerisinde, Toplama4 statik dâhili üye sınıfına ait nesnenin nasıl oluşturulduğuna dikkat edelim. Toplama4 statik dâhili üye sınıfına ait nesne oluştururken, onu çevreleyen sınıfa ait herhangi bir nesne oluşturmak zorunda kalmadık.

Son olarak Hesaplama4Kullan sınıfında statik olarak tanımlanan main() yordamının içerisindeki olayları inceleyelim. Başka bir sınıfın içerisinde statik dâhili üye sınıfı ulaşmak için, sadece tanımlama açısından, dahili üye sınıfı çevreleyen sınıfın ismi kullanılmıştır. Mantıklı olanda budur, statik de olsa sonuçta ulaşılmak istenen dâhili üye bir sınıfıdır. 

Elimizde iki adet çalıştırılabilir sınıf mevcutur (-main() yordamı olan). Hesaplama4 sınıfını çalıştırdığımızda (java Hesaplama4), sonuç aşağıdaki gibi olur; 

Hesaplama4.ekranaBas()
Dekont olusturuyor = 2 – 1
Sonuc = 10 + 5 = 15

Eğer Hesaplama4Kullan sınıfı çalıştırılırsa (java Hesaplama4Kullan), sonuç aşağıdaki gibi olur; 

Sonuc = 10 + 5 = 15

*/
