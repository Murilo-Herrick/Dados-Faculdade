package ex_13;

public class Cachorro extends Animal{

	public Cachorro(String nome) {
		super(nome);
	}
	
	@Override
	public void fazerSom() {
		System.out.println("AUAU");
	}
}
