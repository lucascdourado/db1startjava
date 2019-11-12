package com.db1.db1start;

import java.util.Scanner;

public class ExInteiro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Integer numero1, numero2, soma, subtracao;
		System.out.print("digite o valor do 1º número: ");
		numero1 = scan.nextInt();
		System.out.print("digite o valor do 2º número: ");
		numero2 = scan.nextInt();
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		System.out.println("a soma de " + numero1 + " + " + numero2 + " = " + soma);
		System.out.println("a subtração de " + numero1 + " - " + numero2 + " = " + subtracao);
	}
}
