package aplicacao;

import entidades.Computador;

public class MainComposicao {

	public static void main(String[] args) {
		
		Computador pc = new Computador("Intel Core i7", 16);
		pc.mostrarConfiguracao();
	}
}
