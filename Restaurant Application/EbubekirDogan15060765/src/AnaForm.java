import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.text.AttributeSet.ParagraphAttribute;
import javax.swing.*;

public class AnaForm extends JFrame{
 
  
	public static double toplam_Fiyat=0;
	public static int sayac =0;
	ArrayList<Double> paralistesi = new ArrayList<Double>();
	static JList liste;
	
	JScrollPane  scroll;
	JComboBox masa_Sec;	
	static DefaultListModel<String> model = null;
	
	AnaForm benim = this;
	JTextField MasaNoTxt;
	JLabel lblMasaNo,lblMasaNo1,lblToplam;
	static JLabel lblsonuc;
	
	JButton btnEKle0,btnEKle1,btnEKle2,btnEKle3,btnEKle4,btnEKle5,btnEKle6,btnEKle7,btnEKle8,btnEKle9,btnEKle10,btnEKle11,btnEKle12,btnEKle13,
	btnEKle14,btnEKle15,btnEKle16,btnEKle17,SilBtn,FaturaBtn,Garson;
	 
	public  void  Aktiflestirme()
	{
		 Garson.setEnabled(false);
		 btnEKle0.setEnabled(true);
		 btnEKle1.setEnabled(true);
		 btnEKle2.setEnabled(true);
		 btnEKle3.setEnabled(true);
		 btnEKle4.setEnabled(true);
		 btnEKle5.setEnabled(true);
		 btnEKle6.setEnabled(true);
		 btnEKle7.setEnabled(true);
		 btnEKle8.setEnabled(true);
		 btnEKle9.setEnabled(true);
		 btnEKle10.setEnabled(true);
		 btnEKle11.setEnabled(true);
		 btnEKle12.setEnabled(true);
		 btnEKle13.setEnabled(true);
		 btnEKle14.setEnabled(true);
		 btnEKle15.setEnabled(true);
		 btnEKle16.setEnabled(true);
		 btnEKle17.setEnabled(true);
		 SilBtn.setEnabled(true);
		 FaturaBtn.setEnabled(true);
		 
		 liste.setEnabled(true);
		 masa_Sec.setEnabled(true);
	
	}
	public  void  pasiflestirme()
	{
		 Garson.setEnabled(true);
		 btnEKle0.setEnabled(false);
		 btnEKle1.setEnabled(false);
		 btnEKle2.setEnabled(false);
		 btnEKle3.setEnabled(false);
		 btnEKle4.setEnabled(false);
		 btnEKle5.setEnabled(false);
		 btnEKle6.setEnabled(false);
		 btnEKle7.setEnabled(false);
		 btnEKle8.setEnabled(false);
		 btnEKle9.setEnabled(false);
		 btnEKle10.setEnabled(false);
		 btnEKle11.setEnabled(false);
		 btnEKle12.setEnabled(false);
		 btnEKle13.setEnabled(false);
		 btnEKle14.setEnabled(false);
		 btnEKle15.setEnabled(false);
		 btnEKle16.setEnabled(false);
		 btnEKle17.setEnabled(false);
		 SilBtn.setEnabled(false);
		 FaturaBtn.setEnabled(false);
		 
		 liste.setEnabled(false);
		 masa_Sec.setEnabled(false);
	
	}
	
	
	public AnaForm() 
	{   
		 setBounds(100,100,1776,878);
		 setResizable(false);
	
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLayout(null);
		 model = new DefaultListModel<String>();
		 liste= new JList();
		 scroll = new JScrollPane(liste);
		 
		
		
///////////////////////////////// EKLE BUTONLARI ////////////////////////////////////////////////////////////////// 		
		
		btnEKle0 = new JButton("Ekle");
		btnEKle0.setEnabled(false);
		btnEKle0.setBounds(1240, 405, 83, 32);
		add(btnEKle0);
		
		btnEKle1 = new JButton("Ekle");
		btnEKle1.setEnabled(false);
		btnEKle1.setBounds(1240, 450, 83, 32);
		add(btnEKle1);
		
		btnEKle2 = new JButton("Ekle");
		btnEKle2.setEnabled(false);
		btnEKle2.setBounds(1240, 488, 83, 32);
		add(btnEKle2);
		
		btnEKle3 = new JButton("Ekle");
		btnEKle3.setEnabled(false);
		btnEKle3.setBounds(1240, 533, 83, 32);
		add(btnEKle3);
		
	    btnEKle4 = new JButton("Ekle");
		btnEKle4.setEnabled(false);
		btnEKle4.setBounds(1240, 610, 83, 32);
		add(btnEKle4);
		
		btnEKle5 = new JButton("Ekle");
		btnEKle5.setEnabled(false);
		btnEKle5.setBounds(1240, 695, 83, 32);
		add(btnEKle5);
		
		btnEKle6 = new JButton("Ekle");
		btnEKle6.setEnabled(false);
		btnEKle6.setBounds(1240, 736, 83, 32);
		add(btnEKle6);
	
		
		btnEKle7 = new JButton("Ekle");
		btnEKle7.setEnabled(false);
		btnEKle7.setBounds(1675, 113, 83, 32);
		add(btnEKle7);
		
		btnEKle8 = new JButton("Ekle");
		btnEKle8.setEnabled(false);
		btnEKle8.setBounds(1675, 158, 83, 32);
		add(btnEKle8);
		
		btnEKle9 = new JButton("Ekle");
		btnEKle9.setEnabled(false);
		btnEKle9.setBounds(1675, 214, 83, 32);
		add(btnEKle9);
		
		btnEKle10 = new JButton("Ekle");
		btnEKle10.setEnabled(false);
		btnEKle10.setBounds(1686, 552, 72, 32);
		add(btnEKle10);
		
		btnEKle11 = new JButton("Ekle");
		btnEKle11.setEnabled(false);
		btnEKle11.setBounds(1675, 260, 83, 32);
		add(btnEKle11);
		
	
		
		btnEKle12 = new JButton("Ekle");
		btnEKle12.setEnabled(false);
		btnEKle12.setBounds(1686, 626, 72, 32);
		add(btnEKle12);
		
		btnEKle13 = new JButton("Ekle");
		btnEKle13.setEnabled(false);
		btnEKle13.setBounds(1686, 660, 72, 32);
		add(btnEKle13);
		
		btnEKle14 = new JButton("Ekle");
		btnEKle14.setEnabled(false);
		btnEKle14.setBounds(1686, 699, 72, 28);
		add(btnEKle14);
		
		btnEKle15 = new JButton("Ekle");
		btnEKle15.setEnabled(false);
		btnEKle15.setBounds(1686, 736, 72, 28);
		add(btnEKle15);
		
		btnEKle16 = new JButton("Ekle");
		btnEKle16.setEnabled(false);
		btnEKle16.setBounds(1686, 767, 72, 32);
		add(btnEKle16);
		
		btnEKle17 = new JButton("Ekle");
		btnEKle17.setEnabled(false);
		btnEKle17.setBounds(1675, 65, 83, 32);
		add(btnEKle17);
		
		SilBtn = new JButton("");
		SilBtn.setIcon(new ImageIcon("img\\delete.png"));
		SilBtn.setEnabled(false);
		SilBtn.setBounds(570, 437, 72, 59);
		add(SilBtn);
		
		Garson = new JButton("Garson ");
		Garson.setIcon(new ImageIcon("img\\waiter_call.png"));
		Garson.setBounds(746, 437, 89, 59);
		add(Garson);
		
		FaturaBtn = new JButton("");
		FaturaBtn.setIcon(new ImageIcon("img\\bill.png"));
		FaturaBtn.setEnabled(false);
		FaturaBtn.setBounds(646, 437, 97, 59);
		add(FaturaBtn);
		
////////////////////////////////////////////////////////////////// EKLE BUTONLARI VE DIGER BUTONLAR SONU //////////////////////////////////////////////////////////////////		
		
		    lblMasaNo = new JLabel("Masa No :");
			lblMasaNo.setBounds(574, 534, 68, 16);
			lblMasaNo.setForeground(Color.WHITE);
		    add(lblMasaNo);
			
			MasaNoTxt = new JTextField();
			MasaNoTxt.setEnabled(false);
			
			MasaNoTxt.setBounds(646, 528, 45, 22);
			MasaNoTxt.setFont(new Font("Tahoma", Font.BOLD, 17)); 
			 MasaNoTxt.setBackground(Color.BLACK);
			 MasaNoTxt.setEnabled(false);
			 MasaNoTxt.setText("1");
			add(MasaNoTxt);
			 
		 
		masa_Sec = new JComboBox();
		masa_Sec.setBounds(607, 70, 209, 22);
		
		masa_Sec.setEnabled(false);
			for(int i =1; i<=1222;i++)
			{
				masa_Sec.addItem(i + "");
			}
		
		 add(masa_Sec);
		 
		 
		 masa_Sec.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 
				MasaNoTxt.setText((String)masa_Sec.getSelectedItem());
			}
		});
		 
		 
		 
		 
		
		lblMasaNo1 = new JLabel("Masa Seçiniz : ");
		lblMasaNo1.setForeground(Color.WHITE);
		lblMasaNo1.setBounds(512, 71, 85, 16);
		add(lblMasaNo1);
		
		lblToplam = new JLabel("Toplam :");
		lblToplam.setFont(new Font("Tahoma", Font.BOLD, 18)); 
		lblToplam.setBounds(569, 590, 80, 16);
		 add(lblToplam);
		
		 lblsonuc = new JLabel("...........");
		 lblsonuc.setBounds(670, 590, 56, 16);
		 add(lblsonuc);
		
		
		liste.setEnabled(false);
		liste.setVisibleRowCount(10);
		 add(scroll);
		 scroll.setBounds(571, 156, 264, 260);
		
		JLabel lblSipariListesi = new JLabel("Siparis Verilecek Liste : ");
		lblSipariListesi.setForeground(Color.WHITE);
		lblSipariListesi.setFont(new Font("Tahoma", Font.PLAIN, 17));
		//Bilgi 				    x     y  width,height
		lblSipariListesi.setBounds(621 , 129, 180,  16);
		 add(lblSipariListesi);
	 
///////////////////////////////// FÝYATLAR LABELS //////////////////////////////////////////////////////////////////
		
		JLabel lblTl = new JLabel("2.50 TL");
		lblTl.setBounds(1157, 410, 71, 16);
		add(lblTl);
		
		JLabel label = new JLabel("2.50 TL");
		label.setBounds(1157, 450, 71, 16);
	    add(label);
		
		JLabel label_1 = new JLabel("3.00 TL");
		label_1.setBounds(1157, 490, 71, 16);
		 add(label_1);
		
		JLabel label_2 = new JLabel("3.00 TL");
		label_2.setBounds(1157, 533, 71, 16);
		add(label_2);
		
		JLabel label_3 = new JLabel("3.00 TL");
		label_3.setBounds(1157, 615, 71, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel("3.50 TL");
		label_4.setBounds(1157, 695, 71, 16);
		add(label_4);
		
		JLabel label_5 = new JLabel("3.50 TL");
		label_5.setBounds(1157, 739, 71, 16);
		add(label_5);
		
		JLabel label_6 = new JLabel("6.50 TL");
		label_6.setBounds(1603, 553, 71, 16);
		add(label_6);
		
		JLabel label_7 = new JLabel("4.00 TL");
		label_7.setBounds(1603, 626, 71, 16);
		add(label_7);
		
		JLabel label_8 = new JLabel("4.00 TL");
		label_8.setBounds(1603, 668, 71, 16);
		add(label_8);
		
		JLabel label_9 = new JLabel("4.00 TL");
		label_9.setBounds(1603, 703, 71, 16);
		add(label_9);
		
		JLabel label_12 = new JLabel("4.00 TL");
		label_12.setBounds(1603, 736, 71, 16);
		add(label_12);
		
		JLabel label_13 = new JLabel("4.00 TL");
		label_13.setBounds(1603, 775, 71, 16);
		add(label_13);
		
		JLabel label_10 = new JLabel("2.00 TL");
		label_10.setBounds(1592, 65, 71, 16);
        add(label_10);
		
		JLabel label_14 = new JLabel("3.00 TL");
		label_14.setBounds(1592, 113, 71, 16);
		add(label_14);
		
		JLabel label_15 = new JLabel("6.00 TL");
		label_15.setBounds(1592, 165, 71, 16);
		 add(label_15);
		
		JLabel label_16 = new JLabel("3.00 TL");
		label_16.setBounds(1592, 214, 71, 16);
		add(label_16);
		
		JLabel label_18 = new JLabel("3.00 TL");
		label_18.setBounds(1592, 264, 71, 16);
	    add(label_18);
//////////////////////////////////////////////////////////////////LABELL FÝAYATLAR SONU/////////////////////////////////////
		
		
		// Background Resim buna baglandý.
		JLabel label1 = new JLabel("");
		label1.setIcon(new ImageIcon("img\\ana_parca.jpg"));
		label1.setBounds(0, 0, 1776, 878);
		add(label1);
		setVisible(true);
		
		
		
	
		btnEKle0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				toplam_Fiyat +=2.5;
				model.addElement("Kaþarlý Tost - 2.50 TL");
				paralistesi.add(2.5);
				liste.setModel(model);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				sayac++;
				if(sayac>1)
				{
					sayac=1;
				}
				else if(sayac==1)
				{
					new SucukluTost(benim);
				    liste.setModel(model);
				}
			}
		});
		btnEKle2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=3;
				model.addElement("Karýþýk Tost - 3.00 TL");
				paralistesi.add((double) 3);
				lblsonuc.setText(toplam_Fiyat+"");
				
			}
		});
		btnEKle3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				liste.setModel(model);
				toplam_Fiyat +=3;
				model.addElement("Klap Tost - 3.00 TL ");
				paralistesi.add((double) 3);
				lblsonuc.setText(toplam_Fiyat+"");
				
			}
		});
		btnEKle4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=3;
				model.addElement("Leyla ile Mecnun - 3.00 TL");
				paralistesi.add((double) 3);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=3.5;
				model.addElement("Sigara Böreði - 3.50 TL");
				paralistesi.add(3.5);
				lblsonuc.setText(toplam_Fiyat+"");
 
			}
		});
		btnEKle6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=3.5;
				model.addElement("Patates Cipsi - 3.50 TL");
				paralistesi.add(3.5);	
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=3.0;
				model.addElement("Cheeseburger - 3.00 TL");
				paralistesi.add((double) 3);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=6.0;
				model.addElement("Hamburger Menu - 6.00 TL");
				paralistesi.add((double) 6);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=3.0;
				model.addElement("Beyaz Peynirli Sandviç - 3.00 TL");
				paralistesi.add((double) 3);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=6.5;
				model.addElement("Diva Kahvaltý - 6.50 TL");
				paralistesi.add(6.5);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle11.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=3.0;
				model.addElement("Kaþarlý Salamlý Sandviç - 3.00 TL");
				paralistesi.add((double) 3);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle12.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=4.0;
				model.addElement("Menemen - 4.00 TL");
				paralistesi.add((double) 4);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle13.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				new Omlet(benim);
			}
		});
		btnEKle14.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=4.0;
				model.addElement("Sucuk Tabaðý - 4.00 TL");
				paralistesi.add((double) 4);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle15.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=4.0;
				model.addElement("Sosis Tabaðý - 4.00 TL");
				paralistesi.add((double) 4);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle16.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=4.0;
				model.addElement("Sigara Böreði - 4.00 TL");
				paralistesi.add((double) 4);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		btnEKle17.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				liste.setModel(model);
				toplam_Fiyat +=4.0;
				model.addElement("Tek Hamburger - 2.00 TL");
				paralistesi.add((double) 2);
				lblsonuc.setText(toplam_Fiyat+"");
			}
		});
		
		Garson.addActionListener(new ActionListener() 
		{
  			public void actionPerformed(ActionEvent e) 
  			{
  				 Aktiflestirme();
			}
		});

		FaturaBtn.addActionListener(new ActionListener() 
		{
 
			public void actionPerformed(ActionEvent arg0) 
			{ 
				
				int dialogButton = JOptionPane.showConfirmDialog (null, "Hesabý ödemek istediðinizden emin misiniz?","Uyarý",JOptionPane.YES_NO_OPTION);
				Garson.setEnabled(true);
				
				try{
					if(model.size() == 0 || paralistesi.size() == 0)
					{
						JOptionPane.showMessageDialog(null,"Lütfen Yemek Giriniz!");
						return;
					}
					   
				 
					if(dialogButton == JOptionPane.YES_OPTION)
					{
						pasiflestirme();
						File yol = new File("C:\\Users\\Dogan\\Desktop\\fatura.txt");
						String yazilacak_metin = "Masa Numarasi :" + masa_Sec.getSelectedItem() + "\n";
						if(!yol.exists())
							yol.createNewFile();
						System.out.println(model);
						for (int i = 0; i < model.size(); i++) 
						{
							 yazilacak_metin += model.get(i)+"\n";
						}
						 
						yazilacak_metin += "Toplam Fiyat : " + toplam_Fiyat;
						FileWriter yaz = new FileWriter(yol);
						yaz.write(yazilacak_metin);
						
						yaz.close();
						model.clear();
						MasaNoTxt.setText("1");
						
					    lblsonuc.setText("0");
					}
					else
					{
						Garson.setEnabled(false);
					}
				}
				catch(Exception ex)
				{	
					System.out.println("Hata Meydana Geldi" + ex.getMessage());
				}
			}
		});
		SilBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					if(model.size() == 0 || paralistesi.size() == 0)
					{
						JOptionPane.showMessageDialog(null,"Silinecek nesne yok.\n\n Lütfen menü seçimi yapýnýz.");
						return;
					}
					paralistesi.remove(liste.getSelectedIndex());
					model.remove(liste.getSelectedIndex());
					liste.setModel(model);
					System.out.println(paralistesi);
					toplam_Fiyat = 0;
					for (int i = 0; i < paralistesi.size(); i++) {
						toplam_Fiyat += paralistesi.get(i);
					}
					double sonuc = toplam_Fiyat-liste.getSelectedIndex();
					lblsonuc.setText(toplam_Fiyat +"");
	               System.out.println("Toplam : " + toplam_Fiyat);
				} 
				catch (Exception ex)
				{
					System.out.println("Hata Meydana Geldi" + ex.getMessage());
				}
			}
		});
	}
		public static void main(String[] args) 
		{
			AnaForm a  = new AnaForm();
		}
}
