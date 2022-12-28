import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x,y;
		System.out.println("Insira o valor de X");
		x = sc.nextDouble();
		System.out.println("Insira o valor de Y");
		y = sc.nextDouble();

		if ((x == 0) && (y == 0))
			System.out.println("Ponto Origem");
		if ((x > 0) && (y > 0))  // x e y para frente 
				System.out.println("Se encontra no quadrante Q1");
		if ((x < 0) && (y > 0))  // x para tras
				System.out.println("Se encontra no quadrante Q2");
		if ((x > 0) && (y < 0)) // y para baixo
			System.out.println("Se encontra no quadrante Q4");
		if ((x < 0) && (y < 0)) // x e y para trás
			System.out.println("Se encontra no quadrante Q3");
			System.out.printf("As cordenadas sao X: %.1f e Y: %.1f%n", x, y);
		
		
		
		sc.close();

	}

}
