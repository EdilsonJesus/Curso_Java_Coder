package Estrutura_Controle;

public class BreakRotulado {

	public static void main(String[] args) {
//		//Exemplo claro do que não fazer 
//		externo: for (int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				if(i == 1) {
//					break externo;
//				}
//				System.out.printf("[%d %d]", i, j);
//			}
//			System.out.println();
//		}
//		System.out.println("Fim!");
		
		/* 
		 * OUTRO EXEMPLO 
		 *                        */ 
		externo:
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1) {
					continue externo;
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("FIM @_@");
	}

}
