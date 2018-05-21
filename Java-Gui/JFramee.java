import javax.swing.JFrame;

public class JFramee extends JFrame
{
	/*
	 * JFrame nesnesi , �zerinde  GUI bile�enlerini tutar ve temel pencere metodlar� ile pencere
	 * olaylar�n�n ger�ekle�tirilmesini sa�lar.B�t�n g�rsel nesneler bu bile�en �zerinde konumlanacaktir. 
	 * 
	 * */
	public JFramee() //Constructor metodu
	{
		super("Pencere Bile�enimiz"); //�st sinifimizin yapilandiricisini cagirdik
		this.setSize(500,600); // Penceremizin boyutu
		this.setAlwaysOnTop(true); //Pencerenin her zaman en �stte olmasini saglar.
		this.setVisible(true); //Pencerenin gorunur olmasini sagladik.
		this.setResizable(false);//Pencerenin olceklendirmesini engelledik.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Kapatma butonuna basildiginda pencerenin durumunu belirliyoruz.
		 		
	}
	
	
  public static void main(String[] args)
  {
    JFramee j= new JFramee();	
  }
}
