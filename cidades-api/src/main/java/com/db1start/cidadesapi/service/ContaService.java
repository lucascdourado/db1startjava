package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Agencia;
import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.domain.entity.Conta;
import com.db1start.cidadesapi.repository.ContaRepository;

@Service
public class ContaService {

	@Autowired
	private ContaRepository contaRepository;

	public Conta criarConta(Agencia agencia, Cliente cliente) {
		Conta conta = new Conta(agencia, cliente);
		return contaRepository.save(conta);
	}

	public Conta buscarContaPorId(Long id) {
		return contaRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("conta com id " + id + " não encontrada"));
	}

	public void excluirContaPorId(Long id) {
		contaRepository.deleteById(id);
	}

	public void limparConta() {
		contaRepository.deleteAll();
	}

}
