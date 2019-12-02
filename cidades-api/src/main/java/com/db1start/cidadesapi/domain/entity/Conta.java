package com.db1start.cidadesapi.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.domain.entity.StatusConta;

@Entity
@Table(name = "conta")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn
	private Agencia agencia;

	@Column
	private Double saldo;

	@OneToOne
	private Cliente cliente;

	@Column(name = "status")
	StatusConta status;

	public Conta() {

	}

	public Conta(Agencia agencia, Cliente cliente) {
		if (agencia == null) {
			throw new RuntimeException("Agência não pode ser nula");
		}
		this.agencia = agencia;

		this.saldo = 0.0;

		if (cliente == null) {
			throw new RuntimeException("Cliente não pode ser nulo");
		}
		this.cliente = cliente;

		this.status = StatusConta.ATIVA;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setStatus(StatusConta status) {
		this.status = status;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
