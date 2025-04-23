package ex_19;

public class Loja {
	
	public Loja() {
		
	}
	
	public double calcularPreco(double precoBase, int quantidade) {
		return precoBase * quantidade;
	}
	
	public double calcularPreco(double precoBase, int quantidade, double desconto) {
		desconto = desconto / 100;
		return (precoBase * quantidade) * (1-desconto);
	}
}
