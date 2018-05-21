//Dâhili Üye Sınıflar ve Bunları Çevreleyen Sınıflar Arasındaki İlişki
/*
Dâhili üye sınıflar, içerisinde bulundukları çevreleyici sınıfların
tüm alanlarına (statik veya değil private dâhil) 
ve yordamlarına (statik veya değil-private dâhil) erişebilirler.
*/
public class Hesaplama3 
{
   private int sabit1 = 2 ; 
   private static int sabit2 = 1 ;

   public class Toplama3 { //Uye dahili sinif 
      public int toplamaYap(int a, int b) 
      {
      return (a+b) + sabit1 ; // dikkat
      }
} // class Toplama3

public class Cikartma3 
{ //Uye dahili sinif 
   public int cikartmaYap(int a, int b) 
   {
      dekontBilgileriGoster(); // dikkat
      return (a-b) - sabit2 ; // dikkat
   }
} // class Cikartma3

private void dekontBilgileriGoster() 
{
   System.out.println("Dekont Bilgileri Gosteriliyor");
}

public void ekranaBas(int a , int b ) 
{
   int sonuc = new Toplama3().toplamaYap(a,b);
   System.out.println("Sonuc = " + a + " + " + b + " + sabit1 = "+ sonuc);
}

public static void main(String args[])
{
   Hesaplama3 h3 = new Hesaplama3();
   h3.ekranaBas(10,5);

   // Toplama islemi
   Hesaplama3.Toplama3 ht3 = h3.new Toplama3() ;
   int sonuc = ht3.toplamaYap(11,6);
   System.out.println("Sonuc = 11 + 6 + sabit1 = " + sonuc );

   // Cikartma islemi 
   Hesaplama3.Cikartma3 hc3 = h3.new Cikartma3();
   int sonuc1 = hc3.cikartmaYap(10,5);
   System.out.println("Sonuc = 10 - 5 - sabit2 = " + sonuc1);
   }
} // class Hesaplama3
/*
Hesaplama3 sınıfının içerisinde iki adet dâhili üye sınıf bulunmaktadır. Bunlar Toplama3 ve Cikartma3 sınıflarıdır. Toplama3 dahili üye sınıfı, Hesaplama3 sınıfı içerisinde global olarak tanımlanmış ilkel (primitive) int tipindeki ve private erişim belirleyicisine sahip olan sabit1 alanına erişebilmektedir. Toplama3 dahili üye sınıfı, Hesaplama3 sınıfı içerisinde tanımlanmış olan sabit1 alanını kullanırken sanki kendi içerisinde tanımlanmış bir alanmış gibi, hiç bir belirteç kullanmamaktadır.
Aynı şekilde Cikartma3 dâhili üye sınıfı, Hesaplama3 sınıfının içerisinde statik olarak tanımlanmış, private erişim belirleyicisine sahip ilkel int tipindeki sabit2 alanını ve private erişim belirleyicisine sahip dekontBilgileriGoster() yordamına direk olarak erişebilmektedir.
Hesaplama3 sınıfının, nesne yordamı olan (-bu yordamın kullanılabilmesi için Hesaplama3 sınıfına ait bir nesne oluşturmak gerekir) ekranaBas(), iki adet parametre alıp, geriye hiçbirşey döndürmez (void). Bu yordamın içerinde Toplama3 dahili üye sınıfına ait nesne oluşturularak, bu dahili üye sınıfın toplamaYap() yordamı çağrılmaktadır. Toplama3 dâhili üye sınıfının toplamaYap() yordamından dönen cevap, ekranaBas() yordamının içerisinde ekrana bastırılır.
Dikkat edilmeye değer diğer bir husus ise sadece bir adet çevreleyici sınıfa ait nesne oluşturup, Bu nesneye bağlı referansı kullanarak, çevreleyici sınıf içerisindeki diğer dâhili üye sınıflara ait nesnelerin oluşturulmasıdır. Olaylara daha yakından bakılırsa;
*/
