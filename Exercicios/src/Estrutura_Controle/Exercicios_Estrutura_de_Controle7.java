package Estrutura_Controle;

import java.util.Scanner;

public class Exercicios_Estrutura_de_Controle7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Digite um número");
		numero = teclado.nextInt();
		
		while(numero >= 0) {
			System.out.println(numero);
		}
		
		teclado.close();

	}

}
