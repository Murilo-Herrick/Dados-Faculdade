package ex_16;

/*
 * 16. Crie uma classe Computador que tenha os atributos Processador e Memoria (como
classes separadas). Cada classe deve conter informações detalhadas, e o computador deve
ser capaz de exibir suas características completas.
 * */

public class TesteComputador {

	public static void main(String[] args) {
		
		Memoria m = new Memoria("kingston", 500, 1000);
		Processador p = new Processador("I7", 2000);
		Computador pc = new Computador(p, m);
		
		pc.exibirDetalhes();
	}

}
