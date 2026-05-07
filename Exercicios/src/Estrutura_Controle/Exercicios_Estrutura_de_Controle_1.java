package Estrutura_Controle;

import java.util.Scanner;

public class Exercicios_Estrutura_de_Controle_1 {

	public static void main(String[] args) {
		Scanner teclado = new  Scanner (System.in);
		
		int numero = 0;
		
		System.out.println("Digite um número"); 
		numero = teclado.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("Seu número digitado  " + numero + " É par " );
			} else if(numero % 2 == 1) {
				System.out.println("Número digitdo " + numero + "  è impar");
			}
		} else if (numero < 0 || numero >=11){
			System.out.println("Número invalido " );
		}
		
		teclado.close();

	}

}
