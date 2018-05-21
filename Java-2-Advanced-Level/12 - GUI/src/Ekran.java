import javax.swing.*;
import java.awt.*;
public class Ekran extends JFrame
{
	private JLabel label;
	private JButton button;
	private JTextField textField;
	
	public Ekran() 
	{
		 setLayout(new FlowLayout());
		 
		 label  = new JLabel("Sayi :");
		 add(label);
		 
		 textField  = new JTextField(15); 
		 add(textField);
		 
		 button  = new JButton("Gonder"); 
		 add(button);
		 
	}
 
	 public static void main(String[] args) 
	 {
    Ekran ekran = new Ekran();
    ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ekran.setSize(400,130);
    ekran.setVisible(true);
    ekran.setTitle("Restorant Uygulamasi");
    
    
    
    
 	 }
}
