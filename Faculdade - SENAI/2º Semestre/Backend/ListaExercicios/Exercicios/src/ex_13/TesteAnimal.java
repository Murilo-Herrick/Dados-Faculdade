package ex_13;

/*
 * 13. Crie uma classe base Animal com um método fazerSom(). Crie duas classes derivadas
Cachorro e Gato que herdam de Animal e sobrescrevem o método fazerSom() para exibir
sons específicos de cada animal. Teste o comportamento instanciando objetos de ambas as
classes.
 * 
 * */

public class TesteAnimal {

	public static void main(String[] args) {
		
		Gato g1 = new Gato("Nina");
		Cachorro c1 = new Cachorro ("Caramelo");
		
		g1.fazerSom();
		c1.fazerSom();
	}

}
