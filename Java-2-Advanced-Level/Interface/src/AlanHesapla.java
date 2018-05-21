
public interface AlanHesapla 
{
 
    int alan() ;
    int cevre();
 
}

class Ucgen implements AlanHesapla
{
    int taban ,yukseklik,k3;
	@Override
	public int alan() {
		return taban * yukseklik /2;
	}

	@Override
	public int cevre() {
		 
		return taban + yukseklik + k3;
	}
	
	public static void main(String [] args)
	{
		
		Ucgen ucgen = new Ucgen();
		ucgen.taban = 5;
		ucgen.yukseklik=4;
		System.out.println(ucgen.alan());
		System.out.println(ucgen.cevre());
	}
}


 