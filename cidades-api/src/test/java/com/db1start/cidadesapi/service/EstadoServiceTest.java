package com.db1start.cidadesapi.service;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.service.EstadoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EstadoServiceTest {

	@Autowired
	private EstadoService estadoService;

//	@After
	public void limpar() {
		estadoService.limparEstado();
	}

	@Test
	public void deveCriarNovoEstado() {
		Estado estado = estadoService.criarEstado("Paraná");
		assertNotNull(estado);
		System.out.println(estado.getId());
		limpar();
	}

	@Test
	public void deveBuscarEstadoPorNome() {
		estadoService.criarEstado("Paraná");
		Estado estado = estadoService.buscarPorNome("Paraná");
		System.out.println("estado '" + estado.getNome() + "' encontrado");
		assertNotNull(estado);
		limpar();
	}

	@Test
	public void deveBuscarEstadoPeloId() {
		Estado estado = estadoService.criarEstado("Paraná");
		Estado teste = estadoService.buscarPorId(estado.getId());
		System.out.println("id: " + teste.getId());
		assertNotNull(teste);
		limpar();
	}

	@Test
	public void deveExcluirEstadoPeloId() {
		Estado estado = estadoService.criarEstado("Paraná");
		System.out.println("id: " + estado.getId());
		estadoService.excluirEstadoId(estado.getId());
		assertNotNull(estado);
		limpar();
	}

	@Test
	public void deveLancarExcecao() {
		try {
			estadoService.buscarPorNome("São Paulo");
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
