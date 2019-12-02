package com.db1start.cidadesapi.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db1start.cidadesapi.domain.entity.Cliente;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteServiceTest {

	@Autowired
	private ClienteService clienteService;

//	@After
	public void limpar() {
		clienteService.limparCliente();
	}

	@Test
	public void deveCriarNovoCliente() {
		Cliente cliente = clienteService.criarCliente("Lucas", "123.456.789-10", "98765-4321");
		assertNotNull(cliente);
		System.out.println(cliente.getNome());
		limpar();
	}

	@Test
	public void deveBuscarClientePorNome() {
		clienteService.criarCliente("Lucas", "123.456.789-10", "98765-4321");
		Cliente cliente = clienteService.buscarClientePorNome("Lucas");
		System.out.println("cliente '" + cliente.getNome() + "' encontrado");
		assertNotNull(cliente);
		limpar();
	}

	@Test
	public void deveBuscarClientePeloId() {
		Cliente cliente = clienteService.criarCliente("Lucas", "123.456.789-10", "98765-4321");
		Cliente teste = clienteService.buscarClientePorId(cliente.getId());
		System.out.println("id: " + teste.getId());
	}

}
