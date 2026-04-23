package Estrutura_Controle;

import java.util.Scanner;

public class Whileindeterminado {

	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner (System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
			
		}
		
		entrada.close();
	}

}
