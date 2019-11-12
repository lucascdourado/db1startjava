package com.db1.db1start;

public class ExMat2 {
	public static double menor1(double numero1, double numero2, double numero3) {
		double menor1;
		menor1 = ExMat1.menor(numero1, numero2);
		return ExMat1.menor(menor1, numero3);
	}
}