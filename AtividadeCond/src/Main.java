import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira o numero que você deseja saber que é par: ");
		numero = sc.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("O numero eh par");
		}else {System.out.println("O numero eh impar");}
		

		sc.close();
	}}
	
