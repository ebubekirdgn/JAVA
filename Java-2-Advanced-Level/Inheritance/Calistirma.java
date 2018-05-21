class Telefon
{
	public Telefon()
	{
		System.out.println("Telefon sýnýfýnýn yapýcýsý");
	}
}



class AkilliTelefon extends Telefon
{
 public AkilliTelefon()
 {
	 System.out.println("Akilli telefon sýnýfýnýn yapýcýsý");
 }
}
class CepTelefonu extends Telefon
{
 public CepTelefonu()
 {
	 System.out.println("Cep Telefonu sýnýfýnýn yapýcýsý");
 }
}
class Nokia extends CepTelefonu
{
 public Nokia()
 {
	 System.out.println("Nokia sýnýfýnýn yapýcýsý");
 }
}

public class Calistirma extends Telefon
{
	public static void main(String args[])
	{
		Nokia n1 = new Nokia();
		
	}
}




