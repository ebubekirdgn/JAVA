interface Hayvan
{
	public void avlan();
	
}

/*soyut olan Kedi s�n�f�, Hayvan aray�z�ne (interface) ait g�vdesiz (soyut) avlan() yordam�n� iptal etmek zorunda de�ildir.*/

abstract class Kedi implements Hayvan
{
	public abstract void TakipEt();
}
class Kaplan extends Kedi
{

	@Override
	public void avlan() {
		// TODO Auto-generated method stub
		System.out.println("Kaplan avlaniyor...");
	}

	@Override
	public void TakipEt() {
		// TODO Auto-generated method stub
		System.out.println("Kaplan takip ediyor...");
	}
	
}


public class AnimalFamily 
{
	public static void main(String[] args) {
		
	}
}
