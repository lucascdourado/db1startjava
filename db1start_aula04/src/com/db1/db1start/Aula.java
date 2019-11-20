package com.db1.db1start;

import java.util.Date;
import java.util.List;

public class Aula {

	private Date dataId;
	private Materia materia;
	private List<Aluno> aluno;

	public Aula() {

	}

	public Aula(Date dataId, Materia materia, List<Aluno> aluno) {
		this.dataId = dataId;
		this.materia = materia;
		this.aluno = aluno;
	}

	public Date getDataId() {
		return dataId;
	}

	public Materia getMateria() {
		return materia;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	@Override
	public String toString() {
		return "Aula [dataId=" + dataId + ", materia=" + materia + ", aluno=" + aluno + "]";
	}

}
