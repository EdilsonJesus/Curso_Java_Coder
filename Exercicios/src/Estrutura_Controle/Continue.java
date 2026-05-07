package Estrutura_Controle;

public class Continue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				System.out.println("Isso é uma expressão IMPAR");
				continue;
			}
			
			System.out.println(i);
		}

	}

}
