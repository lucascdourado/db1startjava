package com.db1.db1start;

public class ApplicationInteger {

	public Integer soma(Integer numero1, Integer numero2) {
		return numero1 + numero2;
	}

	public Integer sub(Integer numero1, Integer numero2) {
		return numero1 - numero2;
	}

	public Integer multi(Integer numero1, Integer numero2) {
		return numero1 * numero2;
	}

	public Integer div(Integer numero1, Integer numero2) {
		return numero1 / numero2;
	}

	public Boolean par(Integer numero1) {
		if (numero1 % 2 == 0) {
			return true;
		}
		return false;
	}

	public Integer maior(Integer numero1, Integer numero2) {
		if (numero1 < numero2) {
			return numero2;
		}
		return numero1;
	}

	public Integer qntdimpar(Integer numero1) {
		Integer i = 0;
		Integer i2 = 1;
		while (i2 <= numero1) {
			if ((i2 % 2) != 0) {
				i++;
			}
			i2++;
		}
		return i;
	}
}
