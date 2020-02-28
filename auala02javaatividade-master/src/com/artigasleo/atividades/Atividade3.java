package com.artigasleo.atividades;

import java.util.Scanner;

public class Atividade3 {

	public void desafio3(){
		int n;
		int fat = 1;
		System.out.println("Digite um numero: ");
		Scanner scann = new Scanner(System.in);
		n = scann.nextInt();
		
		for( int i = 2; i <= n; i++ )
		{
		fat *= i;
		}
		
		System.out.println( "O fatorial de " + n + " é igual a " + fat );
	}
}

