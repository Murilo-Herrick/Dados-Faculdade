package exercicio;

public class Cachorro extends Mamifero{
	
	private String raca;

	public Cachorro(String nome, String familia, String raca) {
		super(nome, familia);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void latir() {
		System.out.println("AU AU AU");
	}
	
	@Override
	public void brincar() {
		System.out.println(":) :) :) :)");
	}
	
}
