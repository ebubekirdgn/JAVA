import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Containerr extends JFrame
{
	//Container nesneleri , bilesenleri �zerlerinde tutmaya yararlar.
	//Container bile�eni , bile�enlerin durumunu ozellestirmek icin kullanabiliriz.
	public Containerr() 
	{
	   super("--- > Formumuz < --- ");
	   Container con = getContentPane();//container bileseni olustu ve formumuzun modelini icine aktard�k.
	   con.setLayout(new BorderLayout());//Bilesenin yerlesimini belirledik.
	   con.add(new JLabel("Label1  "));//Bilesen icerisine etiket ekledik.
	   
	   
	   Container con2 = getContentPane(); //2. container bileseni olusturduk ve formumuzun modelini ald�k
	   con2.setLayout(new GridLayout());//Bilesenin yerlesimini belirledik.
	   con2.add(new JLabel("Label2")); //Bilesen icerisine etiket ekledik.
	   setVisible(true);
	   setSize(300, 300);//Formumuzun �zelliklerini ayarladik.	   
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		Containerr c = new Containerr();
	}
}
