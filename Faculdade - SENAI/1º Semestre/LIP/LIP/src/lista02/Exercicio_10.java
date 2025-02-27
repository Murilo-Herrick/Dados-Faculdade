package lista02;

/*10.Exiba os números de 1 a 100 classificando como: Par, Ímpar, Múltiplo
de 3 e Múltiplo de 7. Os números deverão ser impressos 1 em cada linha
com sua classificação, insira uma linha em branco a cada 10 números. Os
números poderão ter mais de uma classificação como por exemplo:
21 – Ímpar Múltiplo de 3 Múltiplo de 7.*/

public class Exercicio_10 {

	public static void main(String[] args) {
		
		 int populacaoA = 80000;
	        double taxaCrescimentoA = 0.03; 
	        
	        int populacaoB = 200000;
	        double taxaCrescimentoB = 0.015;

	        int anos = 0;

	        // Loop para calcular o número de anos necessários
	        while (populacaoA < populacaoB) {
	            populacaoA += (int) (populacaoA * taxaCrescimentoA);
	            populacaoB += (int) (populacaoB * taxaCrescimentoB); 
	            anos++; 
	        }

	        System.out.println("Número de anos necessários: " + anos);
	    }

	}

