class Insan2 {
	public Insan2(int par) 
	{
		System.out.println("Insan2 Yapilandiricisi " + par);
	}
}
class ZekiInsan2 extends Insan2 
{
	    public ZekiInsan2(int par) 
	    {
	    	super(par +1);
		System.out.println("ZekiInsan2 Yapilandiricisi " + par);
		//super(par+1); // 2. satira yaziliyor ! hata !
		}
}
 
public class Hacker2 extends ZekiInsan2 
{
	public Hacker2(int par) 
	{
		super(par+1);
		System.out.println("Hacker2 Yapilandiricisi " + par);
		//super(par+1); // 3. satira yaziliyor ! hata !
	}
		public static void main(String args[]) 
		{
		Hacker2 hck2 = new Hacker2(5);
		}
}



/*kal�t�m kavram� ne zaman kullan�l�r? Daha evvelden yaz�lm�� bir s�n�f�n, belli bir
problem i�in yeni versiyonunu yazma i�leminde, kal�t�m kavram� kullan�labilir. Fakat kal�t�m
konusunda t�retilen s�n�f ile t�reyen s�n�f aras�nda bir ili�ki olmal�d�r.*/