package com.db1.db1start;

public class ApplicationString {
	
	public String Upper(String txt) {
		return txt.toUpperCase();
	}
	
	public String Lower(String txt) {
		return txt.toLowerCase();
	}

	public Integer TotalLetras(String txt) {
		txt = txt.trim();
		Integer txt1 = txt.length();
		return txt1;
	}
	
	public Integer TotalLetrasEspaco(String txt) {
		return txt.length();
	}
	
	public String PalavraSemEspaco(String txt) {
		return txt.trim();
	}
	
	public String Nome4PrimeirasLetras(String txt) {
		txt.trim();
		return txt.substring(0, 4);
	}
	
	public String NomePartir3Letra(String txt) {
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
	
	public String Aluno(String nomecompleto) {
		Integer i = nomecompleto.indexOf(' ');
	    String nome = nomecompleto.substring(i+1, nomecompleto.length());
	    String aluno = "Aluno "+nome;
	    return aluno;
	}
}

