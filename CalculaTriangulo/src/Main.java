import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


public class Main {

	public static void main(String[] args) {
  	Locale.setDefault(Locale.US);
  Scanner sc = new Scanner(System.in);
 double a, b, c, d;
 double pi = 3.14159;
 double triangulo=0;
 double retangulo=0;
 double circulo=0;
 double quadrado=0;

 
 System.out.println("Digite o valor A, de area");
 a = sc.nextDouble();
 System.out.println("Digite o valor B, de base");
 b = sc.nextDouble();
 System.out.println("Digite o valor H, de altura");
 c = sc.nextDouble();

 
triangulo = (a*c)/2;
 System.out.printf("%n o valor do triangulo - retangulo eh %.2f %n",triangulo);
 
 circulo = (Math.pow(c,2))*pi;
 System.out.printf("%n o valor do circulo eh %.2f %n",circulo);
 
 quadrado = Math.pow(b, 2);
 retangulo = a*b;
 System.out.printf("%n o valor do quadrado eh %.2f %n",quadrado);
 System.out.printf("%n o valor do retangulo eh %.2f %n",retangulo);


 //Resolver Bhaskara
 double Delta;
 double b_2;
 b_2 = Math.pow(b, 2);
 Delta = b_2-(4*a*c);
 if (Delta != 1){
	Delta = Math.sqrt(Delta);
	System.out.println("Valor de delta eh" + Delta);
 }
 else {
 System.out.println("Valor de delta eh" + Delta);
 }
 double x1;
 double x2;
 
 System.out.println(b);
 System.out.println(a);
 
x1 = ((-b + Delta)/(2*a));
 //x1 = -b +Math.sqrt((Math.pow(b,2)-(4*a*c))/2*a);
x2 = ((-b + Delta)/(2*a));
      
System.out.println(x1);
System.out.println(x2);
  
  sc.close();
	}

	private static double pow(double pi, int i) {

		return 0;
	}

}
