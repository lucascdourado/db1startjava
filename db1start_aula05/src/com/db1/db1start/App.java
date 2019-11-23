package com.db1.db1start;

public class App {

	public static void main(String[] args) {
		Conta conta = new Conta(0.0);

		Conta contaTest = new Conta(0.0);

		conta.verificarConta();

		conta.verificarSaldo();

		conta.novoDeposito(100.0);

		conta.novoSaque(50.0);

		conta.tranferir(500.0, contaTest);

		conta.novoSaque(500.0);

		conta.verificarSaldo();

		conta.tranferir(10.0, contaTest);

		conta.novoDeposito(1500.0);

		conta.extratoCompleto();

		contaTest.verificarConta();

		contaTest.verificarSaldo();

		contaTest.novoDeposito(150.0);

		contaTest.extratoCompleto();

	}
}
