package com.db1.db1start;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {

	private Double saldo;
	private Double depositar;
	private Double sacar;
	private Integer contarDeposito = 0;
	private Integer contarSaque = 0;
	private Integer contarTransferencia = 0;
	private Date data = new Date();

	public Conta(Double saldo) {
		this.saldo = saldo;
	}

	public Double novoDeposito(Double depositar) {
		saldo = saldo + depositar;
		System.out.println("Depósito no valor de R$" + depositar + " realizado com sucesso.");
		System.out.println("Seu novo saldo é de R$" + saldo);
		separar();
		contarDeposito++;
		extrato.add("Depósito:      R$" + depositar + " - Data: " + data);
		return saldo;
	}

	public Double novoSaque(Double sacar) {
		if (sacar > saldo) {
			System.out.println("SALDO INSULFICIENTE PARA SAQUE");
			System.out.println("Seu saldo é de R$" + saldo);
			separar();
		} else {
			saldo = saldo - sacar;
			System.out.println("Saque no valor de R$" + sacar + " realizado com sucesso.");
			System.out.println("Seu novo saldo é de R$" + saldo);
			separar();
			contarSaque++;
			extrato.add("Saque:         R$" + sacar + " - Data: " + data);
		}
		return saldo;
	}

	public Double tranferir(Double valorTransferir, Conta conta) {
		if (valorTransferir > saldo) {
			System.out.println("SALDO INSULFICIENTE PARA TRANSFERÊNCIA");
			System.out.println("Seu saldo é de R$" + saldo);
			separar();
		} else {
			saldo = saldo - valorTransferir;
			System.out.println("Tranferência no valor de R$" + valorTransferir + " realizado com sucesso.");
			System.out.println("Seu novo saldo é de R$" + saldo);
			separar();
			verificarConta();
			conta.novoDeposito(valorTransferir);
			contarTransferencia++;
			extrato.add("Transferência: R$" + valorTransferir + " - Data: " + data);
			verificarConta();
		}
		return saldo;
	}

	List<String> extrato = new ArrayList<String>();

	public void extratoCompleto() {
		System.out.println("E X T R A T O");
		verificarSaldo();
		System.out.println("Foram efetuados " + contarDeposito + " depóstitos");
		System.out.println("Foram efetuados " + contarSaque + " saques");
		System.out.println("Foram efetuados " + contarTransferencia + " transferencias");
		extrato.forEach(System.out::println);
		separar();
	}

	public Double verificarSaldo() {
		System.out.println("Seu saldo atual é de R$" + saldo);
		separar();
		return saldo;
	}

	public void verificarConta() {
//		String verificarConta = Conta.this.toString();
		System.out.println("Alterando a conta...");
		separar();
	}

	public void separar() {
		System.out.println("==============================================================");
	}

	public Double getDepositar() {
		return depositar;
	}

	public Double getSacar() {
		return sacar;
	}

	public Date getData() {
		return data;
	}

	public Double getSaldo() {
		return saldo;
	}
}
