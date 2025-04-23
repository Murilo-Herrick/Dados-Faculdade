package aula_04;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro entre 1 e 7: ");
		int DiaDaSemana = scanner.nextInt();

		if (DiaDaSemana == 1) {

			System.out.println("O dia escolhido é o Domingo!");

		} else if (DiaDaSemana == 2) {

			System.out.println("O dia escolhido é Segunda-Feira!");

		} else if (DiaDaSemana == 3) {

			System.out.println("O dia escolhido é Terça-Feira!");

		} else if (DiaDaSemana == 4) {

			System.out.println("O dia escolhido é Quarta-Feira!");

		} else if (DiaDaSemana == 5) {

			System.out.println("O dia escolhido é Quinta-Feira!");

		} else if (DiaDaSemana == 6) {
			
			System.out.println("O dia escolhido é Sexta-Feira!");
		
		} else if (DiaDaSemana == 7) {
			
			System.out.println("O dia escolhido é Sábado!");
		
		} else {
			
			System.out.println("Você digitou um valor inválido!");
		}

	}

}
