package com.db1.db1start;

import java.util.Scanner;

public class ExTxt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("digite uma palavra/texto: ");
		String txt;
		txt = scan.nextLine();
		System.out.println("em minusculo '" + txt.toLowerCase() + "'");
		System.out.println("em maiusculo '" + txt.toUpperCase() + "'");
	}
}
