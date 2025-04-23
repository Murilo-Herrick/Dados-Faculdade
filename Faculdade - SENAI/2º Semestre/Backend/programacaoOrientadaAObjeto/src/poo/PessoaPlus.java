package poo;

public class PessoaPlus {
	
	private int idade;
	private String nome;
	private double altura;
	private double massa;
	private boolean casado;
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getMassa() {
		return massa;
	}
	public void setMassa(double massa) {
		this.massa = massa;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public PessoaPlus(int idade, String nome, double altura, double massa, boolean casado) {
		this.idade = idade;
		this.nome = nome;
		this.altura = altura;
		this.massa = massa;
		this.casado = casado;
	}
}
