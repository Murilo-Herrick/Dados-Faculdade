package aula_04;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro entre 1 e 7: ");
		int DiaDaSemana = scanner.nextInt();

		if (DiaDaSemana == 1) {

			System.out.println("O dia escolhido � o Domingo!");

		} else if (DiaDaSemana == 2) {

			System.out.println("O dia escolhido � Segunda-Feira!");

		} else if (DiaDaSemana == 3) {

			System.out.println("O dia escolhido � Ter�a-Feira!");

		} else if (DiaDaSemana == 4) {

			System.out.println("O dia escolhido � Quarta-Feira!");

		} else if (DiaDaSemana == 5) {

			System.out.println("O dia escolhido � Quinta-Feira!");

		} else if (DiaDaSemana == 6) {
			
			System.out.println("O dia escolhido � Sexta-Feira!");
		
		} else if (DiaDaSemana == 7) {
			
			System.out.println("O dia escolhido � S�bado!");
		
		} else {
			
			System.out.println("Voc� digitou um valor inv�lido!");
		}

	}

}
