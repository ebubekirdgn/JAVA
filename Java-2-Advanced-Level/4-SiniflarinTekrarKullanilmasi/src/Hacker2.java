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



/*kalıtım kavramı ne zaman kullanılır? Daha evvelden yazılmış bir sınıfın, belli bir
problem için yeni versiyonunu yazma işleminde, kalıtım kavramı kullanılabilir. Fakat kalıtım
konusunda türetilen sınıf ile türeyen sınıf arasında bir ilişki olmalıdır.*/