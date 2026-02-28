package fundamentos;

public class PrimitivosVsObjeto {
   
	public static void main(String[] args) {
		String s = new String ("texto");
		s = s.toUpperCase();
		
		
		System.out.println(s);
		
		//  Wrappers são a versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a); 
	}
}
/*
 * Tipos pŕimitivo em Java
 * 
 * Todos os tipos númericos quer de qualquer tipo
 * 
 * Já as strings podem ser manipuladas como OBJETO. 
 * 
 * */
 