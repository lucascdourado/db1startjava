package com.db1.db1start;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class AulaTest {

	@Test
	public void deveCriarAulaPorMeioDoConstrutor() {

		Date dataId = new Date();
		Materia materia = new Materia();
		List<Aluno> aluno = new ArrayList<Aluno>();

		Aula aula = new Aula(dataId, materia, aluno);

		Assert.assertEquals(dataId, aula.getDataId());
		Assert.assertEquals(materia, aula.getMateria());
		Assert.assertEquals(aluno, aula.getAluno());
	}

}