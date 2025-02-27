package lista02;

/*Imprima a soma de 1 até 1000.*/

public class Exercicio_02 {

	public static void main(String[] args) {
		/*Cria a variavel fora do for*/
		int soma = 0;
		/*Cria um for para imprimir os numero de 1 a 1000*/
		for (int i = 1; i <=1000; i++) {
			/*Soma o numero da variavel i dentro da variavel soma a cada repetição do for*/
			soma = soma + i;
		}
		/*Imprime o resultado, e deve estar fora do for para não se repetir e exibir*/
		System.out.println(soma);
	}

}
