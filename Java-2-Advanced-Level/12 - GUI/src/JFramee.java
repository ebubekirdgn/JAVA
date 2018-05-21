import javax.swing.JFrame;

public class JFramee extends JFrame
{
	/*
	 * JFrame nesnesi , üzerinde  GUI bileþenlerini tutar ve temel pencere metodlarý ile pencere
	 * olaylarýnýn gerçekleþtirilmesini saðlar.Bütün görsel nesneler bu bileþen üzerinde konumlanacaktir. 
	 * 
	 * */
	public JFramee() //Constructor metodu
	{
		super("Pencere Bileþenimiz"); //üst sinifimizin yapilandiricisini cagirdik
		this.setSize(500,600); // Penceremizin boyutu
		this.setAlwaysOnTop(true); //Pencerenin her zaman en üstte olmasini saglar.
		this.setVisible(true); //Pencerenin gorunur olmasini sagladik.
		this.setResizable(false);//Pencerenin olceklendirmesini engelledik.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Kapatma butonuna basildiginda pencerenin durumunu belirliyoruz.
		 		
	}
	
	
  public static void main(String[] args)
  {
    JFramee j= new JFramee();	
  }
}
