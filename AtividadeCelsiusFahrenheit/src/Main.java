import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double f;
		double c;
		char rep;

		do {
			System.out.println("digite o valor em Celsius");
			c = sc.nextDouble();
			f = (9 * c) / 5 + 32;
			System.out.printf("Valor em Celsius: %.2f%n", f);
			System.out.println("Deseja Continuar? (s/n): ");
			rep = sc.next().charAt(0);
			if ((rep != 's') && (rep != 'n')) {
				System.out.println("Invalido!");
			}
		} while (rep == 's');

		sc.close();

	}

}
