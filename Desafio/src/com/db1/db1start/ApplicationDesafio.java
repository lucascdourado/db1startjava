package com.db1.db1start;

public class ApplicationDesafio {

	public Integer impar(Integer numero1) {
		if ((numero1 % 2) == 1) {
			Integer resto;
			resto = (numero1 - 1) / 2;
			Integer resp;
			resp = resto + 1;
			return resp;
		}
		return numero1 / 2;
	}
}
