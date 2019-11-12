package com.db1.db1start;

import java.util.Scanner;

public class ExMat1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double numero1, numero2;
		System.out.print("Insira o 1º número: ");
		numero1 = scan.nextInt();
		System.out.print("Insira o 2º número: ");
		numero2 = scan.nextInt();

		if (numero1 > numero2) {
			System.out.println("O menor número é o 2º: " + numero2);
		} else {
			System.out.println("O menor número é o 1º: " + numero1);
		}
	}
}
