package patika_java101_odev1;

import java.util.Scanner;

public class taksimetre {
	public static void main(String []args) {
		int km;
		double ucret = 2.20, baslangic = 10, toplam;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Km bilgisi giriniz:");
		km = input.nextInt();
		
		toplam = (km * ucret);
		toplam += baslangic;
		
		if (toplam <= 20) {
			toplam = 20;
			System.out.println("Ödenecek tutar " + toplam + "'dır.");
		}
		else {
			System.out.println("Ödenecek tutar " + toplam + "'dır.");
		}
		
	}
	
}
