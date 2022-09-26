package patika_java101_odev1;

import java.util.Scanner;

public class daire_dilimi_alani {
	public static void main(String [] args) {
		int a, r;
		double pi = 3.14, alan;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz:");
		r = input.nextInt();
		System.out.println("Daire diliminin açısını giriniz:");
		a = input.nextInt();
		
		alan = (pi*a*r*r)/360;
		System.out.println("Daire diliminin alanı:" + alan);
		
	}

}
