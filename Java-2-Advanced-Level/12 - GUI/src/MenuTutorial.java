import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuTutorial extends JFrame
{
  JMenuBar menubar;
  JMenu file;
  JMenuItem exit;
   
   public MenuTutorial() 
   {
	// TODO Auto-generated constructor stub
   setLayout(new FlowLayout());
   
   menubar = new JMenuBar();
   setJMenuBar(menubar);
   
   file = new JMenu("Dosya");
   menubar.add(file);
   
   exit = new JMenuItem("Cýkýs");
   file.add(exit);
   
   event e = new event();
   exit.addActionListener(e);
   
   }
   public class event implements ActionListener
   {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	   
   }
   public static void main(String[] args) {
	MenuTutorial mt = new MenuTutorial();
	mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mt.setSize(500,500);
	mt.setVisible(true);
	
}
}
