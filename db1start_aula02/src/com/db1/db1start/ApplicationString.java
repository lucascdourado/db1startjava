package com.db1.db1start;

public class ApplicationString {

	public String upper(String txt) {
		return txt.toUpperCase();
	}

	public String lower(String txt) {
		return txt.toLowerCase();
	}

	public Integer totalLetras(String txt) {
		txt = txt.trim();
		Integer txt1 = txt.length();
		return txt1;
	}

	public Integer totalLetrasEspaco(String txt) {
		return txt.length();
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

//	public Integer vogais(String txt) {
//		String vogal;
//		txt.trim();
//		vogal = txt.replace("aeiouà-ú","");
//		Integer totaltxt = txt.length();
//		Integer totalvogal = vogal.length();
//		Integer total = totaltxt - totalvogal;
//		return total;
//	}
//	
//	public String[] SepararPalavras(String txt) {
//		String[] txtseparado = txt.split(",");
//		return txtseparado;
//	}

	public String aluno(String nomecompleto) {
		Integer i = nomecompleto.indexOf(' ');
		String nome = nomecompleto.substring(i + 1, nomecompleto.length());
		String aluno = "Aluno " + nome;
		return aluno;
	}
}
