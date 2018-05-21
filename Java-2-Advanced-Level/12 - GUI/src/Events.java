import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Events extends JFrame
{   
	private JLabel label1;
	private JButton button;
	private JLabel label2;
	private JButton button2;
 
   public Events()
   {
	 setLayout(new FlowLayout());
	 
	 button = new JButton("Tikla");
	 add(button);
	 label1 = new JLabel("");
	 add(label1);
	 
	 
	 button2 = new JButton("Daha fazlasi icin Tikla");
	 add(button2);
	 label2 = new JLabel("");
	 add(label2);
    
	 Event e = new Event();
	 button.addActionListener(e);
	 
	 Event2 e2 = new Event2();
	 button2.addActionListener(e2);
	 
   }
   
   public class Event implements ActionListener
   {

	@Override
	public void actionPerformed(ActionEvent e)
	{ 
	 
			label1.setText("Text Changed Let him go :)(:");
		 
		 
	 
	}
	   
   }
   public class Event2 implements ActionListener
   {

	@Override
	public void actionPerformed(ActionEvent e)
	{
	  label2.setText("Text adsfsdfsdf");
	}
	   
   }
   
   public static void main(String[] args) {
	  Events e = new Events();
	  e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  e.setTitle("Event Program");
	  e.setSize(300,300);
	  e.setVisible(true);
	   
	    
}
}
