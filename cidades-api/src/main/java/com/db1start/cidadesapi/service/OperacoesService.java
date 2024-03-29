package com.db1start.cidadesapi.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Conta;
import com.db1start.cidadesapi.domain.entity.Operacoes;
import com.db1start.cidadesapi.repository.OperacoesRepository;

@Service
public class OperacoesService {

	@Autowired
	private OperacoesRepository operacoesRepository;

	private Integer contarDeposito = 0;
	private Integer contarSaque = 0;
	private Integer contarTransferencia = 0;
	private Date data = new Date();

	public void novoDeposito(String deposito, Double valor, Conta conta) {
		Operacoes operacoes = new Operacoes(deposito, valor, conta);
		conta.setSaldo(conta.getSaldo() + operacoes.getValor());
		System.out.println("Depósito no valor de R$" + valor + " realizado com sucesso.");
		System.out.println("Seu novo saldo é de R$" + conta.getSaldo());
		separar();
		contarDeposito++;
		extrato.add("Depósito:      R$" + valor + " - Data: " + data);
	}

	public void novoSaque(String saque, Double valor, Conta conta) {
		Operacoes operacoes = new Operacoes(saque, valor, conta);
		if (operacoes.getValor() > conta.getSaldo()) {
			System.out.println("SALDO INSULFICIENTE PARA SAQUE");
			System.out.println("Seu saldo é de R$" + conta.getSaldo());
			separar();
		} else {
			conta.setSaldo(conta.getSaldo() - operacoes.getValor());
			System.out.println("Saque no valor de R$" + operacoes.getValor() + " realizado com sucesso.");
			System.out.println("Seu novo saldo é de R$" + conta.getSaldo());
			separar();
			contarSaque++;
			extrato.add("Saque:         R$" + valor + " - Data: " + data);
		}
	}

	public void novaTransferencia(String transferir, Double valor, Conta conta, Conta conta2) {
		Operacoes operacoes = new Operacoes(transferir, valor, conta);
		if (operacoes.getValor() > conta.getSaldo()) {
			System.out.println("SALDO INSULFICIENTE PARA TRANSFERÊNCIA");
			System.out.println("Seu saldo é de R$" + conta.getSaldo());
			separar();
		} else {
			conta.setSaldo(conta.getSaldo() - operacoes.getValor());
			System.out.println("Tranferência no valor de R$" + valor + " realizado com sucesso.");
			System.out.println("Seu novo saldo é de R$" + conta.getSaldo());
			separar();
			conta2.setSaldo(conta2.getSaldo() + operacoes.getValor());
			contarTransferencia++;
			extrato.add("Transferência: R$" + operacoes.getValor() + " - Data: " + data);
		}
	}

	List<String> extrato = new ArrayList<String>();

	public void extratoCompleto(Conta conta) {
		System.out.println("E X T R A T O");
		System.out.println("Seu saldo atual é de R$" + conta.getSaldo());
		System.out.println("Foram efetuados " + contarDeposito + " depóstitos");
		System.out.println("Foram efetuados " + contarSaque + " saques");
		System.out.println("Foram efetuados " + contarTransferencia + " transferencias");
		extrato.forEach(System.out::println);
		separar();
	}

	public void separar() {
		System.out.println("==============================================================");
	}

	public void limparOperacoes() {
		operacoesRepository.deleteAll();
	}

}
