package testes_Exercicios;

import java.util.Scanner;

public class mediaAlunos {

	public static void main(String[] args) {
		double n1, n2, n3, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Digite a segunda  nota: ");
		n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = sc.nextDouble();
		
		soma = (n1 + n2 + n3 ) / 3;
		
		System.out.println("Média final " + soma);
		
		if(soma >= 7) {
			System.out.println("Aprovado ...! \0/");
		}else if (soma >= 5) {
			System.out.println("Recuperação ^<>^ ");
		}else {
			System.out.println("Reprovou 0__0/");
		}
		
		
		
		sc.close();

	}

}
