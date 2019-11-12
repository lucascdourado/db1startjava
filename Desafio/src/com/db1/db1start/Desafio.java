package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class Desafio {
	@Test
	public void desafioImpar() {
		ApplicationDesafio application = new ApplicationDesafio();
		Integer expected = 14;
		Integer response = application.impar(27);
		Assert.assertEquals(expected, response);
	}
}
