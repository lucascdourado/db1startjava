package com.db1start.cidadesapi.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db1start.cidadesapi.domain.entity.Agencia;
import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Estado;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AgenciaServiceTest {

	@Autowired
	private AgenciaService agenciaService;

	@Autowired
	private CidadeService cidadeService;

	@Autowired
	private EstadoService estadoService;

//	@After
	public void limpar() {
		agenciaService.limparAg();
	}

	@Test
	public void deveCriarNovaAg() {
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringá", estado);
		Agencia agencia = agenciaService.criarAg("1234", "NuBank", cidade);
		assertNotNull(agencia);
		System.out.println(agencia);
		limpar();
	}

	@Test
	public void deveBuscarAgPorNumero() {
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringá", estado);
		agenciaService.criarAg("1234", "NuBank", cidade);
		Agencia agencia = agenciaService.bucarAgPorNumero("1234");
		assertNotNull(agencia);
	}

	@Test
	public void deveBuscarAgPorId() {
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringá", estado);
		Agencia agencia = agenciaService.criarAg("1234", "NuBank", cidade);
		Agencia teste = agenciaService.bucarAgPorId(agencia.getId());
		assertNotNull(teste);
		limpar();
	}

	@Test
	public void deveExcluirAgPeloId() {
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringá", estado);
		Agencia agencia = agenciaService.criarAg("1234", "NuBank", cidade);
		agenciaService.excluirAgPorId(agencia.getId());
		assertNotNull(agencia);
		limpar();
	}

	@Test
	public void deveLancarExcecao() {
		try {
			agenciaService.bucarAgPorNumero("1234");
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
