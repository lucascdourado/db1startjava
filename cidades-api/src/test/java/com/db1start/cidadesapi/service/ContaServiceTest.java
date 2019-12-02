package com.db1start.cidadesapi.service;

import static org.junit.Assert.assertNotNull;

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

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContaServiceTest {

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
		contaService.limparConta();
	}

	@Test
	public void deveCriarNovaConta() {
		Cliente cliente = clienteService.criarCliente("Lucas", "123.456.789-10", "98765-4321");
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringa", estado);
		Agencia agencia = agenciaService.criarAg("1234", "NuBank", cidade);
		Conta conta = contaService.criarConta(agencia, cliente);
		assertNotNull(conta);
		System.out.println("conta: " + conta.getId() + ", saldo: " + conta.getSaldo());
		limpar();
	}

	@Test
	public void deveBuscarContaPorId() {
		Cliente cliente = clienteService.criarCliente("Lucas", "123.456.789-10", "98765-4321");
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringa", estado);
		Agencia agencia = agenciaService.criarAg("1234", "NuBank", cidade);
		Conta conta = contaService.criarConta(agencia, cliente);
		Conta teste = contaService.buscarContaPorId(conta.getId());
		assertNotNull(teste);
		limpar();
	}

	@Test
	public void deveExcluirContaPorId() {
		Cliente cliente = clienteService.criarCliente("Lucas", "123.456.789-10", "98765-4321");
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringa", estado);
		Agencia agencia = agenciaService.criarAg("1234", "NuBank", cidade);
		Conta conta = contaService.criarConta(agencia, cliente);
		contaService.excluirContaPorId(conta.getId());
		assertNotNull(conta);
		limpar();
	}

	@Test
	public void deveLancarExcecao() {
		try {
			contaService.buscarContaPorId(1l);
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
