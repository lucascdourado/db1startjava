package com.db1.db1start;

public class ApplicationDesafio {

	public Integer impar(Integer numero1) {
		if ((numero1) % 2 == 1) {
			Integer resto;
			resto = (numero1 - 1) / 2;
			Integer resposta;
			resposta = resto + 1;
			return resposta;
		}
		return numero1 / 2;
	}
}
