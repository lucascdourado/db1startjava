package com.db1start.cidadesapi.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db1start.cidadesapi.domain.entity.Agencia;
import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.domain.entity.Conta;
import com.db1start.cidadesapi.domain.entity.Estado;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperacoesServiceTest {

	@Autowired
	private OperacoesService operacoesService;

	@Autowired
	private ContaService contaService;

	@Autowired
	private AgenciaService agenciaService;

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private EstadoService estadoService;

	@Autowired
	private CidadeService cidadeService;

//	@After
	public void limpar() {
		agenciaService.limparAg();
		cidadeService.limparCidade();
		clienteService.limparCliente();
		contaService.limparConta();
		estadoService.limparEstado();
		operacoesService.limparOperacoes();

	}

	@Test
	public void deveDepositar() {
		Cliente cliente = clienteService.criarCliente("Lucas", "123.456.789-10", "98765-4321");
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringa", estado);
		Agencia agencia = agenciaService.criarAg("1234", "NuBank", cidade);
		Conta conta = contaService.criarConta(agencia, cliente);
		Double saldoAntigo = conta.getSaldo();
		Double valorDeposito = 1500.0;
		operacoesService.novoDeposito("depósito", valorDeposito, conta);
		Assert.assertEquals(conta.getSaldo(), saldoAntigo + valorDeposito);
		limpar();
	}

	@Test
	public void deveSacar() {
		Cliente cliente = clienteService.criarCliente("Lucas", "123.456.789-10", "98765-4321");
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringa", estado);
		Agencia agencia = agenciaService.criarAg("1234", "NuBank", cidade);
		Conta conta = contaService.criarConta(agencia, cliente);
		conta.setSaldo(5000.0);
		Double valorSaque = 1500.0;
		operacoesService.novoSaque("Saque", valorSaque, conta);
		limpar();
	}

	@Test
	public void deveTranfeir() {
		Cliente cliente = clienteService.criarCliente("Lucas", "123.456.789-10", "98765-4321");
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringa", estado);
		Agencia agencia = agenciaService.criarAg("1234", "NuBank", cidade);
		Conta conta = contaService.criarConta(agencia, cliente);

		Cliente cliente2 = clienteService.criarCliente("Vinicius", "098.765.432-10", "99999-4444");
		Estado estado2 = estadoService.criarEstado("Paraná");
		Cidade cidade2 = cidadeService.criarCidade("Maringa", estado2);
		Agencia agencia2 = agenciaService.criarAg("1234", "NuBank", cidade2);
		Conta conta2 = contaService.criarConta(agencia2, cliente2);

		conta.setSaldo(5000.0);
		conta2.setSaldo(0.0);
		Double saldoAntigo = conta.getSaldo();
		Double saldoAntigo2 = conta2.getSaldo();
		Double valorTranferir = 1500.0;
		operacoesService.novaTransferencia("Tranferência", valorTranferir, conta, conta2);
		Assert.assertEquals(conta.getSaldo(), saldoAntigo - valorTranferir);
		Assert.assertEquals(conta2.getSaldo(), saldoAntigo2 + valorTranferir);
		limpar();
	}
}
