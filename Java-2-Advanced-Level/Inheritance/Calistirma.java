class Telefon
{
	public Telefon()
	{
		System.out.println("Telefon s�n�f�n�n yap�c�s�");
	}
}



class AkilliTelefon extends Telefon
{
 public AkilliTelefon()
 {
	 System.out.println("Akilli telefon s�n�f�n�n yap�c�s�");
 }
}
class CepTelefonu extends Telefon
{
 public CepTelefonu()
 {
	 System.out.println("Cep Telefonu s�n�f�n�n yap�c�s�");
 }
}
class Nokia extends CepTelefonu
{
 public Nokia()
 {
	 System.out.println("Nokia s�n�f�n�n yap�c�s�");
 }
}

public class Calistirma extends Telefon
{
	public static void main(String args[])
	{
		Nokia n1 = new Nokia();
		
	}
}




