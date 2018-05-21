/*
Dâhili üye sınıflar, aynı normal sınıflar gibi başka sınıflardan türetilebilirler. 
Böylece diğer dillerde olan çoklu kalıtım desteğinin bir benzerini Java programlama dilinde de bulabiliriz.
Dâhili sınıfların varoluş sebeplerini biraz sonra detaylı bir şekilde inceleyeceğiz.
 */
class Motor 
{
   public void calis() 
   {
      System.out.println("Motor Calisiyor");
   }
   public void dur() 
   {
      System.out.println("Motor Durdu");
   }
}

/*Dâhili üye sınıf olan SuperMotor sınıfı, Motor sınıfından türetilmiştir. 
 UML diyagramını Java uygulamasını dönüştürüp, olayları daha somut bir şekilde incelersek.
 */bx

public class YarisArabasi 
{
   public void hizYap() 
   {
      System.out.println("YarisArabasi hiz yapiyor");
   }
   public class SuperMotor extends Motor 
   {
      public void calis() 
      { // iptal etti (override)
         System.out.println("SuperMotor Calisiyor");
      }
      public void dur() 
      { // iptal etti (override)
         System.out.println("SuperMotor Durdu");
      }
   }
   public static void main(String[] args) {
	   YarisArabasi.SuperMotor b = new YarisArabasi().new SuperMotor();
}
}
// Dâhili üye sınıflar, başka sınıflardan türetilebildiği gibi arayüzlere erişip, bunların içlerindeki gövdesiz yordamları iptal edebilir, aynı normal sınıflar gibi... 
