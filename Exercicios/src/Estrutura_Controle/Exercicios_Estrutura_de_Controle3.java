package Estrutura_Controle;

import java.util.Scanner;

public class Exercicios_Estrutura_de_Controle3 {

	public static void main(String[] args) {
		float nota1 = 0;
		float nota2 = 0;
		
		float soma = 0; 
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua primeira nota : ");
		nota1 = teclado.nextFloat();
		System.out.println("Informe sua primeira nota : ");
		nota2 = teclado.nextFloat();
		
		
		soma = nota1 + nota2 / 2;
		
		if(soma >=7.0) {
			System.out.println("Aprovado @-@/ ");
		}else if(soma < 7.0 && soma > 4.0) {
			System.out.println("Recupeção !!");
		}else {
			System.out.println("Reprovado ... .");
		}
		
		teclado.close();
		

	}

}
