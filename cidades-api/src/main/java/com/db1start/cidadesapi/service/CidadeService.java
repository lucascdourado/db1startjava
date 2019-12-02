package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.repository.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;

	public Cidade criarCidade(String nome, Estado uf) {
		Cidade cidade = new Cidade(nome, uf);
		return cidadeRepository.save(cidade);
	}

	public Cidade buscarCidadePorNome(String nome) {
		return cidadeRepository.findByNome(nome)
				.orElseThrow(() -> new RuntimeException("cidade de " + nome + " não encontrada"));
	}

	public Cidade bucarCidadePorId(Long id) {
		return cidadeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("cidade com id " + id + " não encontrada"));
	}

	public void excluirCidadePorId(Long id) {
		cidadeRepository.deleteById(id);
	}

	public void limparCidade() {
		cidadeRepository.deleteAll();
	}
}
