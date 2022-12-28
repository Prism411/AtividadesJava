import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = 0;
		int i;
		int n;
		System.out.println("Insira o valor de N");
		N = sc.nextInt();
		
		int i2;
		int i3;
		
		n = N +1;
		
		for (i=1; i<n; i++) {
			i2 = (int) Math.pow(i, 2); 
			i3 = (int) Math.pow(i, 3);
			System.out.printf("%d, %d, %d%n", i, i2 , i3);

			
			
		}
		
		
		
		
		
		sc.close();

	}

}
