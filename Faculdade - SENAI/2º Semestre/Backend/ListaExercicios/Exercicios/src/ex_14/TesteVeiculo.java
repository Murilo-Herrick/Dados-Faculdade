package ex_14;

/*
 * 14. Crie uma interface Veiculo com um método mover(). Implemente as classes Carro e
Bicicleta, ambas implementando o método mover(), com comportamentos diferentes.
Instancie os objetos e chame o método para verificar o comportamento polimórfico.
 * 
 * */

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Bicicleta bicicleta = new Bicicleta();
		
		carro.mover();
		bicicleta.mover();
	}

}
