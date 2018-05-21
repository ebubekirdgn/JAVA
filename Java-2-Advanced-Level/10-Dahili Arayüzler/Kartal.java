class Hayvan 
{
     abstract class Kus 
     { 
      public abstract void uc ();
      public abstract void kon();
     }

      public void avlan() 
      {
         System.out.println("Hayvan avlaniyor...");
      }
}

class Kartal extends Hayvan.Kus 
{
   public void uc() 
   {
      System.out.println("Kartal Ucuyor...");
   }
   public void kon() 
   {
      System.out.println("Kartal Konuyor...");
   }

   // public Kartal() { } // ! Hata !

   public Kartal(Hayvan hv) 
   { 
      hv.super(); //Dikkat
   }
   public static void main(String args[]) 
   {
      Hayvan h = new Hayvan(); //Dikkat
      Kartal k = new Kartal(h);
      k.uc();
      k.kon();
   }
}
/*
 Kartal sınıfının içerisinde, soyut dahili üye sınıf olan Kus sınıfının, 
 gövdesiz olan iki yordamı iptal edilmiştir. Olayları sırası ile inceleyelim, 
 Kartal sınıfına ait bir nesne oluşturulmak istense bunun öncesinde 
 Kus sınıfına ait bir nesnenin oluşturulması gerekir çünkü 
 Kartal sınıfı Kus sınıfından türetilmiştir. Buraya kadar sorun yok, 
 fakat asıl kritik nokta Kus sınıfının dâhili üye sınıf olmasıdır. 
 Daha açık bir ifade ile, eğer Kus sınıfına ait bir nesne oluşturulacaksa, 
 bunun öncesinde elimizde Kus sınıfının çevreleyici sınıfı olan Hayvan sınıfına 
 ait bir nesne bulunması zorunluluğudur. Kus sınıfı statik dahili üye sınıf olmadığından, 
 Hayvan sınıfına bağımlıdır. Uygulamanın çıktısı aşağıdaki gibidir; 

Kartal Ucuyor...
Kartal Konuyor...

Kartal sınıfının statik olarak tanımlanmış main() yordamının 
içerisine dikkat edersek, önce Hayvan sınıfına ait bir nesne 
sonrada Kartal sınıfına ait bir nesne oluşturduk. Daha sonra 
Hayvan sınıfı tipinde parametre kabul eden, Kartal sınıfının 
yapılandırıcısına, bu referansı pasladık. Kartal sınıfına ait
 yapılandırıcının içerisinde super() anahtar kelimesi ile Hayvan 
 sınıfının varsayılan yapılandırıcısını çağrılmıştır.
 */
