package com.db1start.cidadesapi.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "estado")
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@OneToMany(mappedBy = "uf", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Cidade> cidades;

	public Estado(String nome) {
		this.nome = nome;
		this.cidades = new ArrayList<>();
	}

	public Estado() {
		this.cidades = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

}
