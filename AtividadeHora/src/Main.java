import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int diferenca = 0;
		int hora = 24;
		
		System.out.println("insira hora inicial");
		x = sc.nextInt();
		System.out.println("insira hora final");
		y = sc.nextInt();
		
		
	   if (x > y) {
		diferenca = hora - x;
		diferenca = diferenca + y;
	   }
	   
	   if (y > x) {
			diferenca = y - x;
			
	   }
	   if (diferenca < 1) {
		   System.out.println("a diferença precisa ser maior que 1 hora!");
	   }
	   System.out.printf("A reunião durou: %d Horas", diferenca);
		sc.close();

	}

}
