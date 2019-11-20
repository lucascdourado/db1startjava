package com.db1.db1start;

public abstract class Pessoa {

	private String nome;
	private String emailId;

	public Pessoa() {

	}

	public Pessoa(String nome, String emailId) {
		super();
		this.nome = nome;
		this.emailId = emailId;
	}

	public String getNome() {
		return nome;
	}

	public String getEmailId() {
		return emailId;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", emailId=" + emailId + "]";
	}

}
