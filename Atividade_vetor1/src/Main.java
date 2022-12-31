import java.util.Locale;
import java.util.Scanner;

import entities.calc;

public class Main {

	public static void main(String[] args) {

		double altura;
		double total=0;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao medidas?");
		
		int n = sc.nextInt();
		
		calc[] x = new calc[n];
		int i;
		for (i = 0; i<x.length; i++) {
			System.out.println("Insira aqui a altura");
			altura = sc.nextDouble();
			x[i] = new calc(altura);
		}

		for (i = 0; i<x.length; i++) {
			System.out.printf("%nAltura nº%d mede: %.2f%n", i, x[i].getAltura());
			total += x[i].getAltura();
		}
		
		System.out.printf("a media de %d pessoas eh %.2f", n, x[n-1].media(n, total));
		sc.close();
	}

}
