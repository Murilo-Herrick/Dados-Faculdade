package aula_08;

public class ExemploArray {

	public static void main(String[] args) {
		int i;
		// declara um vetor de 11 posi��es
		int [] resultados = new int[11];
		
		//Preenche o vetor com os m�ltiplos de 7
		for (i = 0; i <= 10; i++) {
			resultados[i] = i * 7;
		}
		
		// Exibe os valores do vetor
		for (i = 0; i <= 10; i++) {
			System.out.println("7 x " + i + " �: " + resultados[i]);
		}
	}

}
