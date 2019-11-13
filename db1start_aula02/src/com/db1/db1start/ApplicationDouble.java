package com.db1.db1start;

public class ApplicationDouble {

	public double menor2(double numero1, double numero2) {
		if (numero1 > numero2) {
			return numero2;
		}
		return numero1;
	}

	public double menor3(double numero1, double numero2, double numero3) {
		double menor = menor2(numero1, numero2);
		return menor2(menor, numero3);
	}

	public double media(double numero1, double numero2, double numero3) {
		return (numero1 + numero2 + numero3) / 3;
	}

	public double triangulo(double b, double h) {
		return (h * b) / 2;
	}

}
