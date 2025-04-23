package ex_16;

public class Memoria {
	
	private String modelo;
	private int capadidade;
	private double preco;
	
	
	public Memoria(String modelo, int capadidade, double preco) {
		this.modelo = modelo;
		this.capadidade = capadidade;
		this.preco = preco;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCapadidade() {
		return capadidade;
	}
	public void setCapadidade(int capadidade) {
		this.capadidade = capadidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void exibirDetalhes() {
		System.out.println("\nModelo da memoria: " + getModelo());
		System.out.println("Capacidade da memoria: " + getCapadidade() + " GB");
		System.out.println("Preço da memoria: " + getPreco());
	}
}

