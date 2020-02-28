package com.artigasleo.atividades;

import java.util.Scanner;

public class Atividade2 {

	public void desafio2() {
		int num;
		System.out.println("Digite um numero: ");
		Scanner scannum = new Scanner(System.in);
		num = scannum.nextInt();
		
		if(num % 2 != 0){
			System.out.println("Estranho");
		} else if((num % 2 == 0)&&(num < 10)) {
			
			System.out.println("Não é Estranho");
			
		} else if((num % 2 == 0)&&(num >= 10)&&(num <=20)){
			
			System.out.println("Estranho");
			
		} else if((num % 2 == 0)&&(num > 20)){
			
			System.out.println("Não é Estranho");
			
		}
		
	}		
}
