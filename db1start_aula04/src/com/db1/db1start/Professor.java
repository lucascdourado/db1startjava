package com.db1.db1start;

public class Professor extends Pessoa {

	private Double salario;

	public Professor() {

	}

	public Professor(String nome, String emailId, Double salario) {
		super(nome, emailId);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return super.toString() + "Professor [salario=" + salario + "]";
	}

}
