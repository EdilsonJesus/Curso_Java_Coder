package Classes;



public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Headseat";
		p1.preco = 159.90;
		p1.desconto = 0.10;
		
		var p2 = new Produto();
		p2.nome = "DDR4";
		p2.preco = 395.90;
		p2.desconto = 0.10;
		
		double semdesconto = p1.preco + p2.preco;
		double precoFinal = p1.preco + p2.preco * (1 - 0.20);
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		 
		System.out.println("Desconto total R$" + precoFinal);
		System.out.println("Sem desconto pagaria R$" + semdesconto);

	}

}
