package Estrutura_Controle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("INforme sua primeira nota");
		double nota1 = entrada.nextDouble();

		System.out.println("INforme sua primeira nota");
		double nota2 = entrada.nextDouble();
		
		double media = nota1 + nota2 / 2;
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabéns");			
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		if(media < 4.5 && media >= 0) {
			System.out.println("Reporvado");
		}
		
		entrada.close();
	}

}
