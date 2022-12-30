package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class main {

	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor em reais que voce deseja converter: ");
		cc.dolar_bought = sc.nextDouble();
		cc.converte(cc.dolar_bought);
		System.out.println(cc);
	}

}
