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
}
