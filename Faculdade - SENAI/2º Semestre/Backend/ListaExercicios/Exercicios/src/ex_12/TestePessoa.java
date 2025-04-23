package ex_12;

/*
 * 12. Implemente uma classe Pessoa com atributos nome e idade. Crie um construtor que
receba esses atributos como parâmetros e inicialize-os. Crie uma classe TestePessoa para
instanciar objetos e exibir suas informações.
 * 
 * */


public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Murilo: ", 18);
		p1.Dados();
	}
}