package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Agencia;
import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.repository.AgenciaRepository;

@Service
public class AgenciaService {

	@Autowired
	private AgenciaRepository agenciaRepository;

	public Agencia criarAg(String numeroAg, String banco, Cidade cidade) {
		Agencia agencia = new Agencia(numeroAg, banco, cidade, null);
		return agenciaRepository.save(agencia);
	}

	public Agencia bucarAgPorNumero(String numeroAg) {
		return agenciaRepository.findByNumeroAg(numeroAg)
				.orElseThrow(() -> new RuntimeException("Agência nº" + numeroAg + " não encontrada"));
	}

	public Agencia bucarAgPorId(Long id) {
		return agenciaRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Agência com ID: " + id + " não encontrada"));
	}

	public void excluirAgPorId(Long id) {
		agenciaRepository.deleteById(id);
	}

	public void limparAg() {
		agenciaRepository.deleteAll();
	}
}
