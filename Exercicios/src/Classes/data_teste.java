package Classes;

public class data_teste {
	public static void main(String[] args) {

		Data d1 = new Data();
				
		var d2 = new Data(16, 06, 2026);
		
 
		
		//System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
