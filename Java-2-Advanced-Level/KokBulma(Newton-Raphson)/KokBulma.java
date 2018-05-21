//f(x) = (e^(-x)) - x;

public class KökBulma {

	public static double f(double x){	//Fonsiyon
		return Math.pow(Math.E, -x)-x;
	}
	public static double f_(double x){	//Fonksiyonun türevi
		return -Math.pow(Math.E, -x)-1;
	}
	public static double hata(double eski,double yeni){
		return Math.abs((yeni-eski)/yeni)*100;
	}
	public static boolean yakınsama(double x1,double x2,double x3){
		
		if (Math.abs(x3-x2)<Math.abs(x2-x1))
			return true;
		else
			return false;
	}
	
	public static void menu(){
		System.out.format("%-16s","İterasyon");
		System.out.format("%-16s","xi");
		System.out.format("%-16s","xi_1");
		System.out.format("%-16s","f(xi)");
		System.out.format("%-16s","f'(xi)");
		System.out.format("%-16s","Hata");
		System.out.format("%-16s%n","Durum");
	}
	public static void yazdir(double n){
		System.out.format("%-16.8f",n);
	}
	public static void yazdir(int n){
		System.out.format("%-16d",n);
	}
	public static void main(String[] args) {

		double eski,xi=0,xi_1,hata=0.001;
		int iterasyon=0;
		eski=xi;
		menu();
		while (true){
			iterasyon++;
			
			xi_1 = xi - (f(xi)/f_(xi));
			
			yazdir(iterasyon);	yazdir(xi);	yazdir(xi_1);
			yazdir(f(xi));	yazdir(f_(xi));	yazdir(hata(xi,xi_1));
			
			if(iterasyon>1){
				System.out.format("%-16s", yakınsama(eski,xi,xi_1) ? "Yakınsama" : "Iraksama");
			}
			
			if (iterasyon>20 || hata(xi,xi_1) < hata)
				break;
			eski=xi;
			xi=xi_1;
			System.out.println();
			
		}
		
	}


}
