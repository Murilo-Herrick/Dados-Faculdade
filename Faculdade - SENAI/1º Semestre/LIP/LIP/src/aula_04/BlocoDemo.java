package aula_04;

/*
 * Demonstra um bloco de código
 */

public class BlocoDemo {

	public static void main(String[] args) {
		double i, j, d;
		
		i = 5;
		j = 10;
		
		// O alvo desta instrução if é de bloco de código
		if(i != 0) {
			System.out.println("i não é igual a zero");
			d = j / i;
			System.out.println("j / i é " + d);
		}

	}

}
