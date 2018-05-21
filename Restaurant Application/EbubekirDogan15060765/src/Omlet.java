import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Omlet extends JFrame
{
	JCheckBox c1, c2, c3;
	JPanel panel, panel2;
	JButton btn;
	JFrame frame = this;
	public Omlet(AnaForm benim)
	{
	 
		setLayout(new GridLayout(2, 1));
		panel = new JPanel(new FlowLayout());
		panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		setLocationRelativeTo(null);
		setSize(300, 125);
		c1 = new JCheckBox("Sucuklu");
		c2 = new JCheckBox("Salamlý");
		c3 = new JCheckBox("Kaþarlý");
		btn = new JButton("Ekle");
		panel2.add(btn);
		
		panel.add(c1);
		panel.add(c2);
		panel.add(c3);
 
		add(panel);
		
		add(panel2);
	
		
		setVisible(true);
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				 if(c1.isSelected())
				 {
					 
					 AnaForm.toplam_Fiyat += 4;
					 AnaForm.lblsonuc.setText(AnaForm.toplam_Fiyat+"");
					 AnaForm.model.addElement(c1.getText() + " omlet =" + "4.00 TL" );
				 }
				 if(c2.isSelected())
				 {
					 AnaForm.toplam_Fiyat += 4;
					 AnaForm.lblsonuc.setText(AnaForm.toplam_Fiyat+"");
					 AnaForm.model.addElement(c2.getText()+ " omlet =" + "4.00 TL" );
				 }
				 if(c3.isSelected())
				 {
					 AnaForm.toplam_Fiyat += 4;
					 AnaForm.lblsonuc.setText(AnaForm.toplam_Fiyat+"");
					 AnaForm.model.addElement(c3.getText()+ " omlet  =" + "4.00 TL" );
				 }
		
				 AnaForm.liste.setModel(AnaForm.model);
			 
				 
				 frame.setVisible(false);
			}
		});
		
	}
}
