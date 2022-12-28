import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double pontoA;
		double pontoB;
		double Resultado = 0;
		scan = new Scanner(System.in); 
		System.out.printf("%nInsira o valor do ponto A:%n ");
		pontoA = scan.nextDouble();
		System.out.printf("%nInsira o valor do Ponto B:%n ");
		pontoB = scan.nextDouble();
		
		Resultado = pontoA - pontoB;
		
		
		System.out.printf("%.2f%n",pontoA);
		System.out.printf("%.2f%n",pontoB);
		System.out.printf("O Resultado eh %.4f Metros %n", Resultado);



	} 

} 