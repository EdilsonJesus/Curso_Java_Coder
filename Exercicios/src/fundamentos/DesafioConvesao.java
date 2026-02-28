package fundamentos;

import java.util.Scanner;

public class DesafioConvesao {
	
	public static void main (String [] args) {
	
		//Criar a padronização de entrada
		Scanner entrada = new Scanner (System.in);
		
		//Entrada de Dados
		System.out.println("Digite o primeiro salário: ");
		// Leitura de dados formatando as casas decimais 
		String valor1 = entrada.next().replace(",", ".");

		System.out.println("Digite o segundo salário: ");
		// Leitura de dados formatando as casas decimais 
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o terceiro salário: ");
		// Leitura de dados formatando as casas decimais 
		String valor3 = entrada.next().replace(",", ".");
		
		// Convertendo uma string para Double
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		//Fazer o calculo para a média
		double media = (salario1 + salario2 + salario3) / 3;

		// Imprimir a saída 
		System.out.println("A media dos salários é " + media);
		
		
		
		entrada.close();
	}
}