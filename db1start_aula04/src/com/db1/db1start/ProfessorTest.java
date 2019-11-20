package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class ProfessorTest {

	@Test
	public void deveCriarProfessorPorMeioDoConstrutor() {
		String nome = "Fake";
		String emailId = "fake@fake.com";
		Double salario = 1500.0;

		Professor professor = new Professor(nome, emailId, salario);

		Assert.assertEquals(nome, professor.getNome());
		Assert.assertEquals(emailId, professor.getEmailId());
		Assert.assertEquals(salario, professor.getSalario());
	}

}
