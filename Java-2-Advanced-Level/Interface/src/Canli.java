    interface Canli   
	{
	public void NefesAl();	
	}

 
 interface Hayvan extends Canli
 {
	 public void Avlan();	
 }
 
 interface Surungen extends Hayvan
 {
	 public void surun();	
 }
 
 class Tavsan implements Hayvan
 {

	@Override
	public void NefesAl() {
		// TODO Auto-generated method stub
		System.out.println("Nefes Al�yor.");
	}

	@Override
	public void Avlan() {
		// TODO Auto-generated method stub
		System.out.println("Avlan�yor");
	}
	 
 }
 
 class Timsah implements Surungen
 {

	@Override
	public void Avlan() {
		// TODO Auto-generated method stub
		System.out.println("Avlan�yor");
	}

	@Override
	public void NefesAl() {
		// TODO Auto-generated method stub
		System.out.println("Nefes Al�yor.");
	}

	@Override
	public void surun() {
		// TODO Auto-generated method stub
		System.out.println("S�r�n�yor.");
	}
	 
 }
 