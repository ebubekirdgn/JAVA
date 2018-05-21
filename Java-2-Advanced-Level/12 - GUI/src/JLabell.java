import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabell extends JFrame
{
	
	//Bilesenleri yapilandiran method
		public JLabell() 
		{
			super("JLabel Ornegi");
			Container con = getContentPane();
			con.setLayout(new GridLayout());
			
			JLabel lblnewLabel1 = new JLabel("JLabel kullanimi ornegi");
			con.add(lblnewLabel1);
			
			JLabel lblnewLabel12 = new JLabel("Ýlk Swing bileseni ornegi"); 
			con.add(lblnewLabel12);
			setSize(400,200);
			setVisible(true);
			
			
			// TODO Auto-generated constructor stub
		}

	
	
	
	public static void main(String[] args) 
	{
	EventQueue.invokeLater(new Runnable() 
	{
		@Override
		public void run() 
		{
			 try 
			 {
				 JLabell frame = new JLabell();
				 frame.setVisible(true);
				 
			 } 
			 catch (Exception e) 
			 {
				e.printStackTrace();
			 }
			
		}
	});	
	}
	
	
}
