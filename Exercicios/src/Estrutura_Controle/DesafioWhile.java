package Estrutura_Controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0; 
		double nota = 0;
		double total = 0;
		
		//ponto de parada do while será a -1 
		while(nota != -1) {
			System.out.println("Digite uma nota valida (ou -1 para sair): ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				quantidadeDeNotas++; 
			}else if(nota != -1){
				System.out.println("Nota inválida !!!! ;D");
			}
			
		}
		
		//Calcular a media 		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
		entrada.close();
		// O desafio seria calcular a média de uma turma 
		//Receber uma nota valida 0 ao 10 
		//verificar se é valida 
		//atribuir em variável auxiliar a nota valida 
		
	}

}
