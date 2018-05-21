import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SucukluTost  extends JFrame
{
	 
	public JTextField textField_1;
	
	
	JFrame frame = this;
    JPanel panel;
  
	public SucukluTost(AnaForm anaForm) {
	 
		super("Ýlk Pencerem");
		setBounds(900, 500, 450, 92);
        setVisible(true);
        panel = new JPanel();
        add(panel);
  
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 13, 116, 22);
		textField_1.setColumns(2);
		getContentPane().add(textField_1);
	
		
		JButton EkleBtn = new JButton("Ekle");
		EkleBtn.setBounds(248, 12, 97, 25);
		 
		getContentPane().add(EkleBtn);
		
		JLabel lblAdet = new JLabel("Adet :");
		lblAdet.setBounds(110, 55, 56, 16);
		getContentPane().add(lblAdet);
		 
		EkleBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				double fiyat = Double.parseDouble(textField_1.getText()) * 2.50;
				
				anaForm.toplam_Fiyat += fiyat;
				anaForm.paralistesi.add(fiyat);
				anaForm.model.addElement("Sucuklu Yumurta " + textField_1.getText()+ " adet =" + fiyat );
				anaForm.lblsonuc.setText(anaForm.toplam_Fiyat+"");
				frame.setVisible(false);
				 
				
			}
		});
	}
}
