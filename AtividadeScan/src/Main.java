import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		char b;
		String c;
		
		double x;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextDouble();
		sc.nextLine();
		b = sc.nextLine().charAt(0);
		c = sc.nextLine();
		
		System.out.println(x);
		System.out.println(b);
		System.out.println(c);
		sc.close();

	}

}
