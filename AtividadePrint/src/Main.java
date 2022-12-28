import java.util.Locale;



public class Main {

	public static void main(String[] args) {
		String Produto1 = "Computador"; 
		String Produto2 = "Mesa";
		int codigo = 3231;
		int idade = 33;
		char genero = 'M';
		double preco1 = 2100.0;
		double preco2 = 750.0;
		double medicao = 53.234567;

		System.out.printf("%nProdutos: %n %s, que o preco eh %.2f %n %s, que o preco eh %.2f",Produto1, preco1,Produto2,preco2);
		System.out.printf("%n%nCliente: tem  %d anos , o codigo eh: %d, genero: %c%n%n", idade, codigo, genero);
		System.out.printf("Medicao com todos numeros decimais: %f%n", medicao);
		System.out.printf("Medicao com apenas 2 numeros decimais: %.2f%n", medicao);
		Locale.setDefault(Locale.US);
		System.out.printf("Medicao com Numeros Americanos (US): %f %n", medicao);
	}

}
