import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RandomGame extends JFrame
{
   int randomNum,guess;
   private JButton button;
   private JTextField textField;
   private JLabel promptlabel;
   private JLabel resultlabel;
   private JLabel randomlabel;
   
   public RandomGame() 
   {
	    setLayout(new FlowLayout());
	    
	    promptlabel = new JLabel("Sayi Giriniz : ");
	    add(promptlabel);
	    
	    textField = new JTextField(5);
	    add(textField);
	    
	    button = new JButton("Tahmin : ");
	    add(button);
	    
	    resultlabel = new JLabel("");
	    add(resultlabel);
	    
	    randomlabel = new JLabel("");
	    add(randomlabel);
	    
	    
	    event e = new event();
	    button.addActionListener(e);
	   
   }
   public class event implements ActionListener
   {

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		 randomNum =(int)(Math.random()*10+1);
		 try 
		 {
			 guess = (int)(Double.parseDouble(textField.getText()));
			 if(guess == randomNum)
			 {
				 resultlabel.setText("Tebrikler Bildiniz");
			 }
			 else if (guess != randomNum)
			 {
				 resultlabel.setText("Bilemediniz.");
			 }
		 } 
		 catch (Exception ex) 
		 {
			randomlabel.setText("Lütfen sadece sayi giriþi yapýnýz."); 
		 }
		
	}
   	
   }
   
   public static void main(String[] args)
   {
	   RandomGame rg = new RandomGame();
	   rg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   rg.setVisible(true);
	   rg.setSize(300,150);
	   rg.setTitle("Rastgele Sayi Oyunu");
   }
}
