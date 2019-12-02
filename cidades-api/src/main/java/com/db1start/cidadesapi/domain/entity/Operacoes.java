package com.db1start.cidadesapi.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "operacoes")
public class Operacoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "tipo", length = 60)
	private String nomeOp;
	
	@Column(name ="valor")
	private Double valor;
	
	@ManyToOne
	@JoinColumn
	private Conta conta;
		
	public Operacoes(String nomeOp, Double valor, Conta conta) {
		this.conta = conta;
		this.nomeOp = nomeOp;
		this.valor = valor;
	}
	
	public Operacoes() {
		
	}

	public Long getId() {
		return id;
	}
	
	public Conta getConta() {
		return conta;
	}

	public String getNomeOp() {
		return nomeOp;
	}

	public Double getValor() {
		return valor;
	}
}
