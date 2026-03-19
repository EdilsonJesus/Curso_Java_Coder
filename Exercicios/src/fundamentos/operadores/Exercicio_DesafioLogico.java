package fundamentos.operadores;

public class Exercicio_DesafioLogico {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = false;

		if (trabalho1 && trabalho2) {
			System.out.println("Comprar TV de 50");
			System.out.println("Bora tomar sorvete");
		} else if (trabalho1 || trabalho2) {
			System.out.println("Comprar TV 32");
			System.out.println("Ficamos saudável");
		}
	}
}
