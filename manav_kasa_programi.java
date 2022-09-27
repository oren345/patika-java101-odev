package patika_java101_odev1;

import java.util.Scanner;

public class manav_kasa_programi {
	public static void main(String [] args) {
		Double armut, elma, domates, muz, patlican, kilo, toplam;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Armut kaç kilo? :");
		kilo = input.nextDouble();
		armut = kilo*2.14;
		System.out.println("Elma kaç kilo? :");
		kilo = input.nextDouble();
		elma = kilo*3.67;
		System.out.println("Domates kaç kilo? :");
		kilo = input.nextDouble();
		domates = kilo*1.11;
		System.out.println("Muz kaç kilo? :");
		kilo = input.nextDouble();
		muz = kilo*0.95;
		System.out.println("Patlıcan kaç kilo? :");
		kilo = input.nextDouble();
		patlican = kilo*5.00;
		
		toplam = armut+elma+domates+muz+patlican;
		
		System.out.println("Toplam tutar : " + toplam);

	}

}
