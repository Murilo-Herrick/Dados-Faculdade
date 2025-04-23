package ex_16;

public class Processador {
	
	private String modelo;
	private double preço;
	
	
	public Processador(String modelo, double preço) {
		this.modelo = modelo;
		this.preço = preço;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public void exibirDetalhes() {
		System.out.println("\nModelo do processador: " + getModelo());
		System.out.println("Preço do processador: " + getPreço());
	}
}
