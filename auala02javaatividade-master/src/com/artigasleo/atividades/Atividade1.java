package com.artigasleo.atividades;

import java.util.Scanner;

public class Atividade1 {

	public void desafio1() {
		int valor;
		System.out.println("Digite um numero: ");
		Scanner scanvalor = new Scanner(System.in);
		valor = scanvalor.nextInt();
		
		if (valor % 2 == 0){
			System.out.println("O numero � par");
		} else {
			System.out.println("O numero � impar");
		}
	}

}
