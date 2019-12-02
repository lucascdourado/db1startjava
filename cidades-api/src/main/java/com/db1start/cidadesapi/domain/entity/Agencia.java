package com.db1start.cidadesapi.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")
public class Agencia {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;

	@Column(name = "numeroAg")
	private String numeroAg;

	@Column(name = "banco")
	private String banco;

	@ManyToOne
	@JoinColumn
	private Cidade cidade;

	@OneToMany(mappedBy = "agencia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Conta> conta;

	public Agencia() {

	}

	public Agencia(String numeroAg, String banco, Cidade cidade, List<Conta> conta) {
		if (numeroAg == null) {
			throw new RuntimeException("Número da agência não pode ser nulo");
		}
		this.numeroAg = numeroAg;

		if (banco == null) {
			throw new RuntimeException("Banco não pode ser nulo");
		}
		this.banco = banco;

		if (cidade == null) {
			throw new RuntimeException("Cidade não pode ser nula");
		}
		this.cidade = cidade;

		this.conta = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public String getNumeroAg() {
		return numeroAg;
	}

	public String getBanco() {
		return banco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public List<Conta> getConta() {
		return conta;
	}

}
