package com.db1start.cidadesapi.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", length = 60)
	private String nome;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "telefone")
	private String telefone;

	public Cliente(String nome, String cpf, String telefone) {
		if (nome == null) {
			throw new RuntimeException("Nome não pode ser nulo");
		}
		this.nome = nome;

		if (cpf == null) {
			throw new RuntimeException("CPF não pode ser nulo");
		}
		this.cpf = cpf;

		if (telefone == null) {
			throw new RuntimeException("Telefone não pode ser nulo");
		}
		this.telefone = telefone;
	}

	public Cliente() {
		
	}
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

}
