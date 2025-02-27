package lista02;

/*Com base no exercício anterior, faça um código que calcule o somatório
de todos os pesos das posições de 0 a 15. Utilize o comando for.*/

public class Exercicio_09 {
	
	public static void main(String[] args) {
		   
	        int posicao = 16;
	        int peso = 1;
	        int soma = 0;

	        for (int i = 0; i < posicao; i++) {
	            System.out.println("2 ^ " + i + " = " + peso);
	            soma += peso;
	            peso *= 2;

	            if ((i + 1) % 4 == 0) {
	                System.out.println();
	            }
	        }
	        System.out.print("Soma dos pesos: " + soma);
	    }
	}

