package aula_08;

public class DesafioBubbleSort {

	public static void main(String[] args) {
		// cria um vetor com 5 posições
		int[] numeros = new int[5];
		// Preenche o vetor em ordem decrescente
		numeros[0] = 5;
		numeros[1] = 4;
		numeros[2] = 3;
		numeros[3] = 2;
		numeros[4] = 1;
		// Exibe o vetor antes da ordenação
		for (int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + " ");
		}
		// Algoritimo de ordenação BublleSort
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				// Inverte a posição dos elementos
				if (numeros[j] > numeros[j + 1]) {
					int aux;
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}
		System.out.println();
		// exibe o vetor após ordenação
		for (int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
