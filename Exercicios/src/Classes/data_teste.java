package Classes;

public class data_teste {
	public static void main(String[] args) {

		Data d1 = new Data();
		d1.dia = 21;
		d1.mes = 9;
		d1.ano = 2012;
		
		var d2 = new Data();
		d2.dia = 14;
		d2.mes = 3;
		d2.ano = 2014; 
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);
	}
}
