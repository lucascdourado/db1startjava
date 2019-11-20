package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class MateriaTest {

	@Test
	public void deveCriarMateriaPorMeioDoConstrutor() {

		String nome = "fake";
		String descricao = "descricao";
		Double cargaHoraria = 10.0;
		Integer quantidadeAula = 5;
		Professor professor = new Professor();

		Materia materia = new Materia(nome, descricao, cargaHoraria, quantidadeAula, professor);

		Assert.assertEquals(nome, materia.getNome());
		Assert.assertEquals(descricao, materia.getDescricao());
		Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
		Assert.assertEquals(quantidadeAula, materia.getQuantidadeAula());
		Assert.assertEquals(professor, materia.getProfessor());
	}

}
