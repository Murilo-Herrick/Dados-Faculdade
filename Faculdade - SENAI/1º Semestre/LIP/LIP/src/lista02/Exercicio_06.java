package lista02;

/*No código do exercício anterior, aumente a quantidade de números que
terão os fatoriais impressos até 20, 30 e 40. Em um determinado
momento, além desse cálculo demorar, começará a mostrar respostas
completamente erradas. Por quê?
Mude de int para long a fim de ver alguma mudança.
As respostas que não são códigos deverão aparecer no formato de
comentário no cabeçalho do código fonte.*/

/*Resposta:
 * 
 * Ele começa a exibir os resultados errados devido a limitação
 * do int que permite que sejam exibidos ate certo numero de 
 * digitos*/

public class Exercicio_06 {

	public static void main(String[] args) {
		int fat = 1;
		for (int i = 1; i <= 50; i++) {
			fat = i * fat;
			System.out.println("O fatorial de "+ i + " é: "+ fat);
			/*Ele começa a exibir os resultados errados devido a limitação
			 * do int que permite que sejam exibidos ate certo numero de 
			 * digitos*/
		}
	}
}
