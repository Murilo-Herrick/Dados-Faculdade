package aula_04;

/*
 * Demonstra um bloco de c�digo
 */

public class BlocoDemo {

	public static void main(String[] args) {
		double i, j, d;
		
		i = 5;
		j = 10;
		
		// O alvo desta instru��o if � de bloco de c�digo
		if(i != 0) {
			System.out.println("i n�o � igual a zero");
			d = j / i;
			System.out.println("j / i � " + d);
		}

	}

}
