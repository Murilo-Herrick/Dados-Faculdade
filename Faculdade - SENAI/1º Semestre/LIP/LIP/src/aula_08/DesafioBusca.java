package aula_08;

import java.util.Scanner;

public class DesafioBusca {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Cria um vetor de inteiro com 10 posi��es
		int[] numeros = new int[10];
		int i;
		// Gera 10 n�meros aleat�rios e armazena no vetor
		for (i = 0; i < 10; i++) {
			numeros[i] = (int) (Math.random() * 99);
		}
		// Exibe o vetor
		for (i = 0; i < 10; i++) {
			System.out.print(numeros[i] + " ");
		}

		System.out.println();

		System.out.println("Digite um n�mero inteiro: ");
		int valor = scan.nextInt();
		scan.close();
		
		boolean encontrou = false;

		for (i = 0; i < 10; i++) {
			if (numeros[i] == valor) {
				encontrou = true;
				break;
			} 
		// Verifica se encontrou um n�mero	
		if(encontrou) {
			System.out.println("ENCONTROU!");
		} else {
			System.out.println("N�O ENCONTROU!");
		}
		
		}
		scan.close();
	}

}
