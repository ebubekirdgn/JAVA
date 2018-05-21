import javax.swing.JOptionPane;

public class testExtend 
{
	public static void main(String[] args) 
	{
		double pay = Integer.parseInt(JOptionPane.showInputDialog("Ýlk Sayýyý giriniz"));
		double payda = Integer.parseInt(JOptionPane.showInputDialog("Ýkinci Sayýyý giriniz"));
		if (payda<=0)
		{
		 throw new IllegalArgumentException("Girilen sayý pozitif deðil" + payda);	
		}
		System.out.println(pay/payda);
	}
}
