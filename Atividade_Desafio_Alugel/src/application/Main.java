package application;

import java.util.Scanner;

import entities.quarto;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		String a = "a";
		System.out.println("Quantas pessoas vao alugar quartos?");
		n = sc.nextInt();
		while ((n >= 10) || (n < 0))
		{System.out.println("Quartos (0-9) !!"); n =sc.nextInt();}
		quarto[] x = new quarto[10];
		int[] roompick = new int[n];
		for (i=0; i<x.length; i++) {
			
			x[i] = new quarto(a, a);
		}
		int quarto;
		int j;
		for (i=0; i<n; i++) {

			System.out.println("Qual o nome do estudante?");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Qual o e-mail do estudante?");
			String email = sc.nextLine();
			
			System.out.println("Que Quarto o estudante deseja alugar? (0-9) ");
			quarto = sc.nextInt();
			for (j=0; j<roompick.length; j++) {
			while ((quarto >= 10) || (quarto < 0) || (quarto == roompick[j]))
			{System.out.println("Numero de quarto invalido ou ja esta ocupado!"); quarto =sc.nextInt();}}
				
			roompick[i] = quarto;
			x[quarto] = new quarto(name, email);
		}
		int cont = 0;
		for (i=0; i<x.length; i++) {
			if (x[i].getName() == "a") {
			} else { cont ++;
			System.out.printf("%nQuarto %d%n Numero do Quarto: %d%n Nome %s || Email: %s%n", i, cont, x[i].getName(), x[i].getEmail()); }
		}

		}
	}
	


