package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.6; 
		String resultadoParcial = media >= 7.0 ? "em recuperação" : "reprovado"; 
		String resultadoFinal = media >= 8.0 ? "em recuperação" : "reprovado"; 
		
		System.out.println("O aluno está " + resultadoParcial);
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9; 
		boolean bomComportamento = true; 
		boolean passouPorMedia = nota >= 7; 
		boolean temDesconto =bomComportamento && passouPorMedia; 
		String resultado = temDesconto ? "Sim" : "Não."; 
		
		System.out.println("Tem desconto? " + resultado); 
	}
}
