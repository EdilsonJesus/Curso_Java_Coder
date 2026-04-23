package Estrutura_Controle;

public class DesafioFor {
//DESAFIO CONSISTE EM CRIAR UM LAÇO DE REPTIÇÃO SEM NÚMEROS
	public static void main(String[] args) {
		//COM NÚMERO SERIA
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Versão desafio 
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}

}
