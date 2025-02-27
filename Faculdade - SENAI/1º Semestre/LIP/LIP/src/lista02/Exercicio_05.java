package lista02;

//Imprima os fatoriais de 1 a 10.

public class Exercicio_05 {

	public static void main(String[] args) {
		int fat = 1;
		for (int i = 1; i <= 10; i++) {
			/*faz com que a variavel fat mude de acordo com a progressão do for
			 * e a multiplica por i e e printa o resultado*/
			fat = i * fat;
			System.out.println("O fatorial de "+ i + " é: "+ fat);
		}
	}

}
