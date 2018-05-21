package kitap;

import java.util.Scanner;

public class DonguileHarfliortasibos 
{
	 public static void main(String [] args)
	 {
		 int sayi;
		 System.out.println("Sayi Giriniz :");
		 Scanner giris = new Scanner(System.in);
		 sayi =4;
		 sayi = giris.nextInt();
		 for(int sutun=0;sutun<sayi;sutun++)
		 {
			 
		    if(sutun==0 || sutun ==sayi-1)
		    	for(int satir=0;satir<sayi+1;satir++)
		    		System.out.print("a");
		    else
		    {
		    	for(int satir=0;satir<sayi;satir++)
				 {
		    		if(satir==0 || satir==sayi-1)
		    			System.out.print("a"); 
		    		else
		    			System.out.print("");
		    		System.out.print(" "); 	
				 }	
		      	
		    }
		    System.out.println("");
		 }
	 }
}
