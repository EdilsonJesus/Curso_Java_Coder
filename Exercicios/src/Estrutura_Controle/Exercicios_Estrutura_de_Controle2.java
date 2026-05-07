package Estrutura_Controle;

import java.util.Scanner;

public class Exercicios_Estrutura_de_Controle2 {

	public static void main(String[] args) {
	
		int ano = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um ano : ");
		ano = teclado.nextInt();
		
		if(ano % 4 == 0 ) {
			System.out.println("Ano Bissexto !");
			System.out.println("A divisão 4 pelo ano digitado é = a " + ano);
		}else {
			System.out.println("Ano com 365 dias !!!");
		}
		
		teclado.close();

	}

}
