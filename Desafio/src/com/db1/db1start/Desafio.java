package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class Desafio {
	@Test
	public void desafioImpar() {
		ApplicationDesafio application = new ApplicationDesafio();
		Integer expected = 13;
		Integer response = application.impar(26);
		Assert.assertEquals(expected, response);
	}
}
