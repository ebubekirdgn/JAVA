class Polis 
{
	private final void sucluYakala() 
	{ // eriþilemez gizliyordam
	System.out.println("Polis.sucluYakala()");
	}
}
	public class SivilPolis extends Polis 
	{
		public void sucluYakala() //iptal etme söz konusu deðildir
		{ 
		System.out.println("SivilPolis.sucluYakala()");
		}
	}