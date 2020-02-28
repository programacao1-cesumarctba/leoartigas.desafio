package Atividade;

import java.util.Scanner;

public class Atividade4 {
	public void desafio4() {
		
		int Valor, j = 0;
		System.out.println("Digite um numero: ");
		Scanner scanValor = new Scanner(System.in);
		Valor = scanValor.nextInt();
		
		for (int i=0; i<=10;i++){
			
			j = Valor * i;
			
			System.out.println(Valor + " x " + i + " = " + j);
		}
		
	}

}
