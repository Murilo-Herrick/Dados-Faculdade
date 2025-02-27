package ex_11;

/*
 * 11. Crie uma classe Livro com os atributos titulo, autor e numeroPaginas. Adicione um
método para exibir os detalhes do livro. Crie uma classe TesteLivro para instanciar objetos e
exibir suas informações.
 * 
 * */

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Harry Potter", "J.K", "500");
		l1.detalhesLivro();
	}

}
