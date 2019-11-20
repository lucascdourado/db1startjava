package com.db1.db1start;

public class Materia {

	private String nome;
	private String descricao;
	private Double cargaHoraria;
	private Integer quantidadeAula;
	private Professor professor;

	public Materia() {

	}

	public Materia(String nome, String descricao, Double cargaHoraria, Integer quantidadeAula, Professor professor) {
		this.nome = nome;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.quantidadeAula = quantidadeAula;
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getCargaHoraria() {
		return cargaHoraria;
	}

	public Integer getQuantidadeAula() {
		return quantidadeAula;
	}

	public Professor getProfessor() {
		return professor;
	}

	@Override
	public String toString() {
		return "Materia [nome=" + nome + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria
				+ ", quantidadeAula=" + quantidadeAula + ", professor=" + professor + "]";
	}

}
