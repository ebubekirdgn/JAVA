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
		System.out.println("Nefes Alýyor.");
	}

	@Override
	public void Avlan() {
		// TODO Auto-generated method stub
		System.out.println("Avlanýyor");
	}
	 
 }
 
 class Timsah implements Surungen
 {

	@Override
	public void Avlan() {
		// TODO Auto-generated method stub
		System.out.println("Avlanýyor");
	}

	@Override
	public void NefesAl() {
		// TODO Auto-generated method stub
		System.out.println("Nefes Alýyor.");
	}

	@Override
	public void surun() {
		// TODO Auto-generated method stub
		System.out.println("Sürünüyor.");
	}
	 
 }
 