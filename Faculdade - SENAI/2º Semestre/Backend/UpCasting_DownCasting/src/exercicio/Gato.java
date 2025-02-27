package exercicio;

public class Gato extends Mamifero{
	
	private boolean unhaAfiada;

	public Gato(String nome, String familia, boolean unhaAfiada) {
		super(nome, familia);
		this.unhaAfiada = unhaAfiada;
	}

	public boolean isUnhaAfiada() {
		return unhaAfiada;
	}

	public void setUnhaAfiada(boolean unhaAfiada) {
		this.unhaAfiada = unhaAfiada;
	}
	
	public void miar() {
		System.out.println("meow meow meow");
	}
		
}
