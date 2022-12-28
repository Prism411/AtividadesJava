import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
	
		
		System.out.println("Hello World!");
		scan = new Scanner(System.in);
			
			System.out.println ("Entre com o Nome 1: "); 
			String nome1 = scan.nextLine();
			System.out.println ("Entre com o Nome 2: "); 
			String nome2 = scan.nextLine();
			System.out.println ("Entre com o Nome 3: "); 
			String nome3 = scan.nextLine();
			System.out.println ("Entre com o Nome 4: "); 
			String nome4 = scan.nextLine();
			System.out.println ("Entre com o Numero A: "); 
			int a = scan.nextInt();
			
			System.out.println (nome1); 
			System.out.println (nome2);
			System.out.println (nome3);
			System.out.println (nome4); 
			System.out.print ("Valor de A = ");
			System.out.print(a); 
			// Printar
		
		

	}

}
