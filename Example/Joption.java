package kitap;
import javax.swing.JOptionPane;
public class Joption {
	public static void main(String args[])
    {
		 String sayi =  JOptionPane.showInputDialog(null, "Say� Giriniz", "Sonu�" , JOptionPane.INFORMATION_MESSAGE);
		
		 /*long sayi1= Long.parseLong(sayi);
		 long kare,sonuc;
		 kare = (long) Math.sqrt(sayi1);
		 sonuc = kare*kare;
		 JOptionPane.showMessageDialog(null,sonuc);
		 */
		 
		 int sayi1 = Integer.parseInt(sayi);
		 
		 if(sayi1>18)
		 {
			 JOptionPane.showMessageDialog(null,"Oy Kullanabilir","Sonu�" ,3); 
		 }
		 else
		 {
			 JOptionPane.showMessageDialog(null,"Oy Kullanamaz","Sonu�" , JOptionPane.INFORMATION_MESSAGE); 
		 }
		 
		 
		 
		 
		 
		 
    }
}
