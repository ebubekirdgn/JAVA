package kitap;

import java.sql.Array;
import java.util.Arrays;

public class Diziler 
{
 public static void main(String [] args)
 {
///////////////////////////////////Ornek -1//////////////////////////////////////////
	/* int dizi[] ={1,2,3,4,5};
	 
	 for(int i=0;i<5;i++)
	 {
		 System.out.println(dizi[i]);
	 }*/
///////////////////////////////////Ornek -2//////////////////////////////////////////
	/* int array[] = {11,22,33,44};
	 for(int i:array)
	 {
		 System.out.println(i);
	 }
	 String array2 [] = {"Ebubekir","Dogan","Microsoft"};
	 for(String i:array2)
	 {
		 System.out.println(i);
	 }*/
///////////////////////////////////Ornek-3//////////////////////////////////////////
	 /*int dizi [] = {1,'3',4};
	 System.out.println(dizi[1]);*/
///////////////////////////////////Ornek-4//////////////////////////////////////////
	 
	 /*Object dizi [] = new Object[3];
	 dizi[0]="Ebubekir";
	 dizi[1]=2;
	 dizi[2]=444.2;
	 for(int i = 0;i<3;i++)
	 {
		 System.out.println((i+1)+ ". eleman = " + dizi[i]);
	 } */
///////////////////////////////////Ornek-5 Dizi Kopyalama//////////////////////////////////////////
  
	 /*int [] dizi1= {12,3,3,45,5,9};
	 int [] dizi2= {122,34,3,55,5,9};
	 System.arraycopy(dizi1, 0, dizi2, 0, 6);
	 for(int i=0;i<dizi2.length;i++)
		 System.out.println("Yeni dizinin(dizi2) " + i + ". elemaný : " + dizi2[i]);*/
	 
	 
///////////////////////////////////Ornek-5 Dizilerde Sýralama//////////////////////////////////////////
	
	 /* int [] dizi1= {12,3,3,45,5,9};
	 Arrays.sort(dizi1);
	 for(int i=0;i<dizi1.length;i++)
		 System.out.println(dizi1[i]);*/
	 
///////////////////////////////////Ornek-5 Dizilerde Arama(Binary Search)////////////////////////////////////////// 
	 
	/* int [] dizi1= {12,3,45,5,9};
	 Arrays.sort(dizi1);
	 int aranan =12;
	 int deger = Arrays.binarySearch(dizi1,aranan);
	 for(int i=0;i<dizi1.length;i++)
		 System.out.println((i) + " . indisi " + dizi1[i]);
	 if(deger>0) System.out.println("Bulundu ve indisi :" + deger);
	 
	 else System.out.println("Deger dizide bulunamadi");*/
///////////////////////////////////Ornek-5 Dizilerde Eþitlik Kontrolü////////////////////////////////////////// 
	 int [] dizi1= {12,3,45,5,9};
	 int [] dizi2= {12,3,45,5,9};
	 for(int i=0;i<dizi1.length;i++)
	 {
		 for(int j=0;j<dizi1.length;j++)
		 {
			 if(dizi1[i]==dizi2[j])
			 { 
				 System.out.println(dizi1[i]);
			 }
		 }
	 }
 }
	 
}
