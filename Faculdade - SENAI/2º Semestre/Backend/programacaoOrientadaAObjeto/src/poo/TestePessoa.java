package poo;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa eu = new Pessoa(18, "Murilo", false);
		
		System.out.println("Nome: " + eu.nome);
		System.out.println("Idade: " + eu.idade);
		System.out.println("Casado: " + eu.casado);

	}

}
