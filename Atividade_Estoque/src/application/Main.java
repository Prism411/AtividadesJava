package application;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

import prod.produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		produto x;
		x = new produto();
		System.out.println("Insira o nome do Produto");
		x.name = sc.nextLine();
		System.out.println("Insira o preco do Produto");
		x.price = sc.nextDouble();
		System.out.println("insira a quantidade do Produto");
		x.quant = sc.nextInt();
		
		System.out.println("Mostrar os dados do Produto: ");
		System.out.println("Nome do Produto: " + x.name);
		System.out.println("Preco do Produto: " + x.price);
		
		System.out.println("Insira o valor que quer adicionar no produto  " + x.name);
		int add = sc.nextInt();
		x.addStock(add);
		System.out.printf("valor do quant eh %d", x.quant);
		System.out.printf("%nvalor total no estque eh %f%n", x.totalStock());
		System.out.println("Insira o valor que deseja remover no produto " + x.name);
		int remove = sc.nextInt();
		x.removeStock(remove);
		
		
		System.out.println(x); //ToString execucao
		
		
		
		//system.println("Quantidade do Produto: " + produto.totalStock());
		//system.out.println("Quantidade do Produto: " + addStock() );
		//system.out.println("Quantidade do Produto: " + removeStock() );
		
		
		
		
		sc.close();

	}
	}


