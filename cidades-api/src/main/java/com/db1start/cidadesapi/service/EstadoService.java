package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	public Estado criarEstado(String nome) {
		Estado estado = new Estado(nome);
		return estadoRepository.save(estado);
	}

	public Estado buscarPorNome(String nome) {
		return estadoRepository.findByNome(nome)
				.orElseThrow(() -> new RuntimeException("estado " + nome + " não encontrado"));
	}

	public Estado buscarPorId(Long id) {
		return estadoRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("estado com id " + id + " nao encontrado no banco de dados."));
	}

	public void excluirEstadoId(Long id) {
		estadoRepository.deleteById(id);
	}

	public void limparEstado() {
		estadoRepository.deleteAll();
	}
}
