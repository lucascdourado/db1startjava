package com.db1.db1start;

import java.util.Scanner;

public class ExMat2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double numero1, numero2, numero3;
		System.out.print("Insira o 1º número: ");
		numero1 = scan.nextInt();
		System.out.print("Insira o 2º número: ");
		numero2 = scan.nextInt();
		System.out.print("Insira o 3º número: ");
		numero3 = scan.nextInt();

		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("O menor número é o 1º: " + numero1);
		} else if (numero2 < numero3) {
			System.out.println("O menor número é o 2º: " + numero2);
		} else {
			System.out.println("O menor número é o 3º: " + numero3);
		}
	}
}