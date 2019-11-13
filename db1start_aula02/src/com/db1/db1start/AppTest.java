package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {

	// EXERCICIO INTEGER
	@Test
	public void deveSomar() {
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 8;
		Integer response = application.soma(5, 3);
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveSubtrair() {
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 2;
		Integer response = application.sub(5, 3);
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveMultiplicar() {
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 9;
		Integer response = application.multi(3, 3);
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveDividir() {
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 5;
		Integer response = application.div(10, 2);
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveVerPar() {
		ApplicationInteger application = new ApplicationInteger();
		Boolean expected = true;
		Boolean response = application.par(8);
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveVerMaior() {
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 9;
		Integer response = application.maior(9, 5);
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveVerQntdImpares() {
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 14;
		Integer response = application.qntdimpar(27);
		Assert.assertEquals(expected, response);
	}

	// ------------------------------------------------------------------------------------------------//
	// EXERCICIOS STRING
	@Test
	public void deveRetornarMaiusculo() {
		ApplicationString application = new ApplicationString();
		String expected = "TESTE";
		String response = application.upper("teste");
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveRetornarMinusculo() {
		ApplicationString application = new ApplicationString();
		String expected = "teste";
		String response = application.lower("TESTE");
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveRetornarTotalDeLetras() {
		ApplicationString application = new ApplicationString();
		Integer expected = 8;
		Integer response = application.totalLetras("DB1START");
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveRetornarTotalDeLetrasEspaco() {
		ApplicationString application = new ApplicationString();
		Integer expected = 10;
		Integer response = application.totalLetrasEspaco(" DB1START ");
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveRetornarPalavraSemEspaco() {
		ApplicationString application = new ApplicationString();
		String expected = "DB1START";
		String response = application.palavraSemEspaco(" DB1START ");
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveRetornarNome4Letras() {
		ApplicationString application = new ApplicationString();
		String expected = "Luca";
		String response = application.nome4PrimeirasLetras("Lucas Dourado");
		Assert.assertEquals(expected, response);
	}

	@Test
	public void deveRetornarNomePartir6Letra() {
		ApplicationString application = new ApplicationString();
		String expected = "cas Dourado";
		String response = application.nomePartir3Letra("Lucas Dourado");
		Assert.assertEquals(expected, response);
	}

//	@Test
//	public void vogais() {
//		ApplicationString application = new ApplicationString();
//		Integer expected = 3;
//		Integer response = application.vogais("Lucas");
//		Assert.assertEquals(expected, response);
//	}
//	
//	@Test
//	public void SepararPalavras() {
//		ApplicationString application = new ApplicationString();
//		String expected = "banana \n maça \n melancia";
//		String[] response = application.SepararPalavras("banana, maçã, melancia");
//		Assert.assertEquals(expected, response);
//	}

	@Test
	public void aluno() {
		ApplicationString application = new ApplicationString();
		String expected = "Aluno Dourado";
		String response = application.aluno("Lucas Dourado");
		Assert.assertEquals(expected, response);
	}

	// ------------------------------------------------------------------------------------------------//
	// EXERCICIOS DOUBLE
	@Test
	public void menorEntre2() {
		ApplicationDouble application = new ApplicationDouble();
		double expected = 3.0;
		double response = application.menor2(5.0, 3.0);
		Assert.assertEquals(expected, response);
	}

	@Test
	public void menorEntre3() {
		ApplicationDouble application = new ApplicationDouble();
		double expected = 2.0;
		double response = application.menor3(5.0, 9.0, 2.0);
		Assert.assertEquals(expected, response);
	}

	@Test
	public void media() {
		ApplicationDouble application = new ApplicationDouble();
		double expected = 3.0;
		double response = application.media(5.0, 3.0, 1.0);
		Assert.assertEquals(expected, response);
	}

	@Test
	public void triangulo() {
		ApplicationDouble application = new ApplicationDouble();
		double expected = 7.5;
		double response = application.triangulo(3.0, 5.0);
		Assert.assertEquals(expected, response);
	}

}
