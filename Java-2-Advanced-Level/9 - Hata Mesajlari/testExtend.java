import javax.swing.JOptionPane;

public class testExtend 
{
	public static void main(String[] args) 
	{
		double pay = Integer.parseInt(JOptionPane.showInputDialog("�lk Say�y� giriniz"));
		double payda = Integer.parseInt(JOptionPane.showInputDialog("�kinci Say�y� giriniz"));
		if (payda<=0)
		{
		 throw new IllegalArgumentException("Girilen say� pozitif de�il" + payda);	
		}
		System.out.println(pay/payda);
	}
}
