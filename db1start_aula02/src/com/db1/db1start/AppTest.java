package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
	
	//EXERCICIO INTEGER
	@Test
	public void deveSomar(){
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 8;
		Integer response = application.soma(5, 3);
		Assert.assertEquals(expected, response);
	}
	
	@Test
	public void deveSubtrair(){
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 2;
		Integer response = application.sub(5, 3);
		Assert.assertEquals(expected, response);
	}
	
	@Test
	public void deveMultiplicar(){
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 9;
		Integer response = application.multi(3, 3);
		Assert.assertEquals(expected, response);
	}
	
	@Test
	public void deveDividir(){
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 5;
		Integer response = application.div(10, 2);
		Assert.assertEquals(expected, response);
	}
	
	public void deveVerPar(){
		ApplicationInteger application = new ApplicationInteger();
		Boolean expected = true;
		Boolean response = application.par(8);
		Assert.assertEquals(expected, response);
	}
	
	@Test
	public void deveVerMaior(){
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 9;
		Integer response = application.maior(9, 5);
		Assert.assertEquals(expected, response);	
	}
	
	@Test
	public void deveVerQntdImpares(){
		ApplicationInteger application = new ApplicationInteger();
		Integer expected = 500000;
		Integer response = application.qntdimpar(1000000);
		Assert.assertEquals(expected, response);	
	}
	
	//EXERCICIOS STRING
	@Test
	public void deveRetornarMaiusculo(){
		ApplicationString application = new ApplicationString();
		String expected = "TESTE";
		String response = application.Upper("teste");
		Assert.assertEquals(expected, response);	
	}
	
	@Test
	public void deveRetornarMinusculo(){
		ApplicationString application = new ApplicationString();
		String expected = "teste";
		String response = application.Lower("TESTE");
		Assert.assertEquals(expected, response);	
	}
	
	@Test
	public void deveRetornarTotalDeLetras(){
		ApplicationString application = new ApplicationString();
		Integer expected = 8;
		Integer response = application.TotalLetras("DB1START");
		Assert.assertEquals(expected, response);	
	}
	
	@Test
	public void deveRetornarTotalDeLetrasEspaco(){
		ApplicationString application = new ApplicationString();
		Integer expected = 10;
		Integer response = application.TotalLetrasEspaco(" DB1START ");
		Assert.assertEquals(expected, response);	
	}
	
	@Test
	public void deveRetornarPalavraSemEspaco(){
		ApplicationString application = new ApplicationString();
		String expected = "DB1START";
		String response = application.PalavraSemEspaco(" DB1START ");
		Assert.assertEquals(expected, response);	
	}
	



}
