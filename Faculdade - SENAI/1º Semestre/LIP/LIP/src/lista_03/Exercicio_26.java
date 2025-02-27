package lista_03;

public class Exercicio_26 {

	public static void main(String[] args) {
		int[] vetorA = { 3, 7, 5, 8, 2, 6, 9, 4, 1, 10 };

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Elemento " + (i + 1) + ": " + vetorA[i]);

			System.out.print("Pares at�� este elemento: ");
			for (int j = 0; j <= vetorA[i]; j++) {
				if (j % 2 == 0) { // Verifica se j �� par
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
