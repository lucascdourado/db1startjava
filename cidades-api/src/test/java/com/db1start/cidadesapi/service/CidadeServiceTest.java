package com.db1start.cidadesapi.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.service.CidadeService;
import com.db1start.cidadesapi.service.EstadoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CidadeServiceTest {

	@Autowired
	private CidadeService cidadeService;

	@Autowired
	private EstadoService estadoService;

//	@After
	public void limpar() {
		cidadeService.limparCidade();
		estadoService.limparEstado();
	}

	@Test
	public void deveCriarNovaCidade() {
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringá", estado);
		assertNotNull(cidade);
		System.out.println("cidade: " + cidade.getNome() + " // estado: " + cidade.getUf().getNome());
		limpar();
	}

	@Test
	public void deveBuscarCidadePorNome() {
		Estado estado = estadoService.criarEstado("Paraná");
		cidadeService.criarCidade("Maringá", estado);
		Cidade cidade = cidadeService.buscarCidadePorNome("Maringá");
		System.out.println("cidade '" + cidade.getNome() + "' encontrada");
		assertNotNull(cidade);
		limpar();
	}

	@Test
	public void deveBuscarCidadePeloId() {
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringá", estado);
		Cidade teste = cidadeService.bucarCidadePorId(cidade.getId());
		System.out.println("id: " + teste.getId());
		assertNotNull(teste);
		limpar();
	}

	@Test
	public void deveExcluirCidadePeloId() {
		Estado estado = estadoService.criarEstado("Paraná");
		Cidade cidade = cidadeService.criarCidade("Maringá", estado);
		cidadeService.excluirCidadePorId(cidade.getId());
		assertNotNull(cidade);
		limpar();
	}

}
