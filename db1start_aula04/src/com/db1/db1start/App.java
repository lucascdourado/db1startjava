package com.db1.db1start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class App {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Maiko Cunha", "maiko.cunha@db1.com.br", null);
		Aluno aluno2 = new Aluno("João Silva", "joao.silva@db1.com.br", null);

		Professor professor = new Professor("Igor Silva", "igor.silva@db1.com.br", null);

		Materia materia = new Materia("POO", "Abstração, Encapsulamento, Polimorfismo e Herança", 10.5, 3, professor);

		Aula aula = new Aula(new Date(), materia, new ArrayList<Aluno>(Arrays.asList(aluno1, aluno2)));

		System.out.println(aula);

	}

}
