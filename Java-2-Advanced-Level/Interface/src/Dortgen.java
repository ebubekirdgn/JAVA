
public class Dortgen implements AlanHesapla{
	int taban ,yukseklik,k3;
	@Override
	public int alan() {
		// TODO Auto-generated method stub
		return taban * yukseklik /2;
	}

	@Override
	public int cevre() {
		// TODO Auto-generated method stub
		return taban + yukseklik + k3;
	}
	public static void main(String[] args) {
		Dortgen d1 =new Dortgen();
		d1.taban =3;
		d1.yukseklik = 5;
		
		System.out.println(d1.alan());
	}
}
