package patika_java101_odev1;

import java.util.Scanner;

public class ucgen_alan {

		public static void main(String []args) {
			Scanner input = new Scanner(System.in);
			int a, b, c, u, alan;
			
			System.out.println("Üçgenin 1.kenar uzunluğunu giriniz:");
			a = input.nextInt();
			System.out.println("Üçgenin 2.kenar uzunluğunu giriniz:");
			b = input.nextInt();
			System.out.println("Üçgenin 3.kenar uzunluğunu giriniz:");
			c = input.nextInt();
			
			u = (a + b + c)/2;
			
			alan = (u*(u-a)*(u-b)*(u-c));
			System.out.println("Üçgenin alanı:"+ Math.sqrt(alan));
		}
	}


