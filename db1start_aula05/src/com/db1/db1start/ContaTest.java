package com.db1.db1start;

import org.junit.Test;

import junit.framework.Assert;

public class ContaTest {

	@Test
	public void deveMostrarSaldo() {
		Conta contaTest = new Conta(150.0);
		Assert.assertEquals(150.0, contaTest.verificarSaldo());
	}

	@Test
	public void deveEfetuarDeposito() {
		Conta conta = new Conta(50.0);
		conta.novoDeposito(100.0);
		Assert.assertEquals(150.0, conta.verificarSaldo());
	}

	@Test
	public void deveEfetuarSaque() {
		Conta conta = new Conta(150.0);
		conta.novoSaque(50.0);
		Assert.assertEquals(100.0, conta.verificarSaldo());
	}

	@Test
	public void deveEfetuarTransferencia() {
		Conta conta = new Conta(100.0);
		Conta conta1 = new Conta(0.0);
		conta.tranferir(50.0, conta1);
		Assert.assertEquals(50.0, conta.verificarSaldo());
	}
}
