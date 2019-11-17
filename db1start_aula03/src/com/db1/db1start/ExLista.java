package com.db1.db1start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.HashMap;
import java.util.*;
import java.util.stream.Collectors;

public class ExLista {

	public static void main(String[] args) {

		// Método que retorne os nomes das cores que você mais gosta
		List<String> cor = new ArrayList<>();
		cor.addAll(Arrays.asList("Azul", "Preto", "Branco", "Cinza", "Vermelho"));

		retornar("Cores:", cor);

		// Método que dado uma lista retorne a quantidade de itens
		tamanho(cor);

		// Método que receba 3 String, adicione todos em uma lista e remova a segunda
		// posição
		List<String> txt = new ArrayList<>();
		txt.addAll(Arrays.asList("Test1", "Test2", "Test3"));
		System.out.println("Todas as palavras: " + txt);
		txt.remove(1);
		System.out.println("Sem segunda palavra: " + txt);
		separar();

		// Método que imprima a lista de cores do primeiro método
		System.out.println("Cores do 1º método:");
		cor.forEach(System.out::println);
		separar();

		// Método que imprima as cores do primeiro método em ordem alfabética
		Collections.sort(cor);
		System.out.println("Cores em ordem crescente:");
		cor.forEach(System.out::println);
		separar();

		// Método que receba uma lista das cores que você mais gosta e o nome de uma cor
		// a ser removida
		cor.remove("Cinza");
		retornar("Removerndo uma cor", cor);

		// Método que receba a lista de cores que você gosta e imprima em ordem
		// decrescente (alfabética)
		Collections.reverse(cor);
		System.out.println("Cores em ordem decrescente:");
		cor.forEach(System.out::println);
		separar();

		// Método que receba uma lista de números e retorne um mapa com listas de
		// números pares e impares
		class numero {

			private String id;
			private String name;

			// Criar referencia
			public numero(String id, String name) {

				// Associar id e nome
				this.id = id;
				this.name = name;
			}

			public String getId() {
				return id;
			}

			public String getName() {
				return name;
			}
		}

		// Mapa
		Map<String, List<String>> String[];
		{

			// Criar lista
			List<numero> lt = new ArrayList<numero>();

			for (Integer i = 1; i < 11; i++) {
				if (i % 2 == 0) {
					lt.add(new numero("Par", i.toString()));
				} else {
					lt.add(new numero("Impar", i.toString()));
				}
			}

			// Criando Multimapa
			Map<String, List<String>> multimap = lt.stream().collect(
					Collectors.groupingBy(numero::getId, Collectors.mapping(numero::getName, Collectors.toList())));

			System.out.println("Separando Numeros = " + multimap);
			separar();
		}

	}

	private static void retornar(String titulo, List<String> cor) {
		System.out.println(titulo);
		System.out.println(cor);
		separar();
	}

	// Método que dado uma lista retorne a quantidade de itens
	private static void tamanho(List<String> cor) {
		System.out.println("Quantidade de itens: " + cor.size());
		separar();
	}

	private static void separar() {
		System.out.println("--------------------------------");

	}

}
