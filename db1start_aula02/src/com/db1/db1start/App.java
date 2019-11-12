package com.db1.db1start;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Soma e Sub
		System.out.print("numero 1: ");
		Integer numero1 = scan.nextInt();
		scan.nextLine();
		System.out.print("numero 2: ");
		Integer numero2 = scan.nextInt();
		scan.nextLine();
		System.out.println(
				"numero 1 (" + numero1 + ") + numero 2 (" + numero2 + ") = " + ExInteiro.soma(numero1, numero2));
		System.out.println(
				"numero 1 (" + numero1 + ") + numero 2 (" + numero2 + ") = " + ExInteiro.sub(numero1, numero2));
		System.out.println("______________________");

		// Menor com 2 números
		System.out.print("Insira o 1º número: ");
		numero1 = scan.nextInt();
		scan.nextLine();
		System.out.print("Insira o 2º número: ");
		numero2 = scan.nextInt();
		scan.nextLine();
		System.out.println("O menor número é " + ExMat1.menor(numero1, numero2));
		System.out.println("______________________");

		// Menor com 3 números
		System.out.print("Insira o 1º número: ");
		numero1 = scan.nextInt();
		scan.nextLine();
		System.out.print("Insira o 2º número: ");
		numero2 = scan.nextInt();
		scan.nextLine();
		System.out.print("Insira o 3º número: ");
		Integer numero3 = scan.nextInt();
		scan.nextLine();
		System.out.println("O menor número é " + ExMat2.menor1(numero1, numero2, numero3));
		System.out.println("______________________");

		// ToUpper e ToLower
		System.out.print("digite uma palavra/texto: ");
		String txt;
		txt = scan.nextLine();
		System.out.println("Em maiusculo: " + ExTxt.Upper(txt));
		System.out.println("Em minusculo: " + ExTxt.Lower(txt));
		scan.nextLine();

	}

}
