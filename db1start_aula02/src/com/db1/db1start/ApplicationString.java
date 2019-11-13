package com.db1.db1start;

public class ApplicationString {

	public String upper(String txt) {
		return txt.toUpperCase();
	}

	public String lower(String txt) {
		return txt.toLowerCase();
	}

	public Integer totalLetras(String txt) {
		Integer numero = 0;
		Integer total = (txt.trim()).length();
		for (Integer i = 0; i < total; i++) {
			if (txt.charAt(i) == '0' | txt.charAt(i) == '1' | txt.charAt(i) == '2' | txt.charAt(i) == '3'
					| txt.charAt(i) == '4' | txt.charAt(i) == '5' | txt.charAt(i) == '6' | txt.charAt(i) == '7'
					| txt.charAt(i) == '8' | txt.charAt(i) == '9') {
				numero++;
			}
		}
		return (total - numero);
	}

	public Integer totalLetrasEspaco(String txt) {
		Integer numero = 0;
		Integer total = (txt.trim()).length();
		for (Integer i = 0; i < total; i++) {
			if (txt.charAt(i) == '0' | txt.charAt(i) == '1' | txt.charAt(i) == '2' | txt.charAt(i) == '3'
					| txt.charAt(i) == '4' | txt.charAt(i) == '5' | txt.charAt(i) == '6' | txt.charAt(i) == '7'
					| txt.charAt(i) == '8' | txt.charAt(i) == '9') {
				numero++;
			}
		}
		return (total - numero);
	}

	public String palavraSemEspaco(String txt) {
		return txt.trim();
	}

	public String nome4PrimeirasLetras(String txt) {
		txt.trim();
		return txt.substring(0, 4);
	}

	public String nomePartir3Letra(String txt) {
		txt.trim();
		return txt.substring(2);
	}

	public String SepararPalavras(String txt) {
		String[] txtseparado = txt.split(", ");
		return (txtseparado[0] + " \n" + txtseparado[1] + " \n" + txtseparado[2]);
	}

	public String ultimas4Letras(String txt) {
		return (txt.substring(txt.length() - 4));
	}

	public String aluno(String txt) {
		Integer i = txt.indexOf(' ');
		String nome = txt.substring(i + 1, txt.length());
		String aluno = "Aluno " + nome;
		return aluno;
	}

	public Integer vogais(String txt) {
		Integer consoante = 0;
		Integer total = txt.length();
		txt.toLowerCase();
		for (Integer i = 0; i < total; i++) {
			if (txt.charAt(i) == 'a' | txt.charAt(i) == 'e' | txt.charAt(i) == 'i' | txt.charAt(i) == 'o'
					| txt.charAt(i) == 'u') {
				consoante++;
			}
		}
		return (total - consoante);
	}

	public String inverterTexto(String txt) {
		String invertido = new StringBuilder(txt).reverse().toString();
		return invertido;
	}
}
