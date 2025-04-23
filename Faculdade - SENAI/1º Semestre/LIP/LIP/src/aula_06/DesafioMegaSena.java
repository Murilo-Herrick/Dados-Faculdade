package aula_06;

import java.util.Scanner;

public class DesafioMegaSena {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de jogos: ");
		int jogos = scanner.nextInt();
		for (int i = 1; i <= jogos; i++) {
			System.out.print("Jogo " + i + ":");
			for(int j = 1; j <= 6; j++) {
				System.out.print(" " + (int)(Math.random() * 60));
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
