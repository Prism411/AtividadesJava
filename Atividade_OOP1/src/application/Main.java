package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.triangle;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		triangle x = new triangle();
		triangle y = new triangle();
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("x1 %f%n", x.a);
		System.out.printf("x2 %f%n", x.b);
		System.out.printf("x3 %f%n", x.c);

		System.out.printf("y1 %f%n", y.a);
		System.out.printf("y2 %f%n", y.b);
		System.out.printf("y3 %f%n", y.c);

		System.out.printf("area 1 %f%n", x.area());
		System.out.printf("area 2 %f%n", y.area());

		boolean maior = med(x.area(), y.area());
		if (maior == true) {
			System.out.println("area X eh maior");
		}
		if (maior == false) {
			System.out.println("area Y eh maior");
		}

		sc.close();

	}

	public static boolean med(double x, double y) {
		boolean resultado;
		if ((boolean) (x > y))
			resultado = true;
		else
			resultado = false;
		return resultado;
	}

}
