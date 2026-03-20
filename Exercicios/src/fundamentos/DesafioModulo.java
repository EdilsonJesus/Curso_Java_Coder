package fundamentos;

import java.util.Scanner;

public class DesafioModulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número"); 
		double num1  = entrada.nextDouble();
		
		System.out.println("Agora informe outro número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Infome a operação: ");
		String op = entrada.next();
		
		// Lógica utilizando operaderes ternários			
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
	    // Saida 
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		
		entrada.close();
	}

}
