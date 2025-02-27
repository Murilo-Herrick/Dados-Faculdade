package exercicio;

public class Mamifero {
	
	private String nome;
	private String familia;
	
	
	public Mamifero(String nome, String familia) {
		this.nome = nome;
		this.familia = familia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	public void brincar() {
		System.out.println(":)");
	}
}
