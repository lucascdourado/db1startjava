package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente criarCliente(String nome, String cpf, String telefone) {
		Cliente cliente = new Cliente(nome, cpf, telefone);
		return clienteRepository.save(cliente);
	}

	public Cliente buscarClientePorNome(String nome) {
		return clienteRepository.findByNome(nome)
				.orElseThrow(() -> new RuntimeException("cliente " + nome + " não encontrado"));
	}

	public Cliente buscarClientePorId(Long id) {
		return clienteRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("cliente com id " + id + " não encontrado"));
	}

	public void apagarClientePorId(Long id) {
		clienteRepository.deleteById(id);
	}

	public void limparCliente() {
		clienteRepository.deleteAll();
	}
}
