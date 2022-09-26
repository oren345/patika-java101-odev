package patika_java101_odev1;

import java.util.Scanner;

public class not {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int mat, kim, fiz, tar, tur, muz, ort;
		String sonuc, a = "Sınıfı geçti.", b = "Sınıfta kaldı.";
		
		System.out.println("Matematik notunuzu giriniz:");
		mat = input.nextInt();
		System.out.println("Kimya notunuzu giriniz:");
		kim = input.nextInt();
		System.out.println("Fizik notunuzu giriniz:");
		fiz = input.nextInt();
		System.out.println("Tarih notunuzu giriniz:");
		tar = input.nextInt();
		System.out.println("Türkçe notunuzu giriniz:");
		tur = input.nextInt();
		System.out.println("Müzik notunuzu giriniz:");
		muz = input.nextInt();
		
		ort = (mat+kim+fiz+tar+tur+muz)/6;
		System.out.println("Ortalamanız:" + ort);
		
		sonuc = (ort > 60) ? a : b ;
		System.out.println(sonuc);
	
	}

}
