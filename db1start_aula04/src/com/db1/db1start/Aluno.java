package com.db1.db1start;

public class Aluno extends Pessoa {

	public Double nota;

	public Aluno() {

	}

	public Aluno(String nome, String emailId, Double nota) {
		super(nome, emailId);
		this.nota = nota;
	}

	@Override
	public String toString() {
		return super.toString() + "Aluno [nota=" + nota + "]";
	}

}
