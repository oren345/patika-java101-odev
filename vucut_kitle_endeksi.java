package patika_java101_odev1;

import java.util.Scanner;

public class vucut_kitle_endeksi {
	public static void main(String [] args) {
		Double boy, kilo, endeks; 
		
		Scanner input = new Scanner(System.in);
		System.out.println("lütfen boyunuzu (metre cinsinde) giriniz:");
		boy = input.nextDouble();		
		
		System.out.println("lütfen kilonuzu giriniz:");
		kilo = input.nextDouble();
		
		endeks = kilo/ (boy*boy);
		System.out.println("vücut kitle endeksiniz:" +endeks);
	}

}
