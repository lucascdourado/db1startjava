package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class AlunoTest {

	@Test
	public void deveCriarAlunoPorMeioDoConstrutor() {
		String nome = "Fake";
		String emailId = "fake@fake.com";

		Aluno aluno = new Aluno(nome, emailId, null);

		Assert.assertEquals(nome, aluno.getNome());
		Assert.assertEquals(emailId, aluno.getEmailId());
	}

}
