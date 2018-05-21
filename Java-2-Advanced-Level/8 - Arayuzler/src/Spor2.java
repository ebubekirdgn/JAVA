interface BuzUstundeKayabilme 
{
	public void buzUstundeKay();
}
interface SutAtabilme 
{
	public void sutAt();
}
class SportmenMehmet implements BuzUstundeKayabilme,SutAtabilme 
{
public void buzUstundeKay() 
{
	System.out.println("SportmenMehmet buz ustunde kayiyor");
}

@Override
public void sutAt() {
	// TODO Auto-generated method stub
	System.out.println("SportmenMehmet sut atabiliyor.");
}

}

public class Spor2 
{
	public static void main(String[] args)
	{
		SportmenMehmet s = new SportmenMehmet();
		s.buzUstundeKay();
		s.sutAt();
	}
}
