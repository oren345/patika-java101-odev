package patika_java101_odev1;

import java.util.Scanner;

public class kdv {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double tutar, kdvli;
		
		System.out.println("tutarı giriniz:");
		tutar = input.nextDouble();
		if (tutar >= 0 && tutar <= 1000) {
			kdvli = (tutar*0.18) + tutar;
			System.out.println("KDV'li tutar:" + kdvli);
		}
		if(tutar > 1000 ) {
			kdvli = (tutar*0.08) + tutar;
			System.out.println("KDV'li tutar:" + kdvli);
		}
	}

}
