class Polis 
{
	private final void sucluYakala() 
	{ // eri�ilemez gizliyordam
	System.out.println("Polis.sucluYakala()");
	}
}
	public class SivilPolis extends Polis 
	{
		public void sucluYakala() //iptal etme s�z konusu de�ildir
		{ 
		System.out.println("SivilPolis.sucluYakala()");
		}
	}