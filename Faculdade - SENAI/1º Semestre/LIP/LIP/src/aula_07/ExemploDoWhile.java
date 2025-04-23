package aula_07;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		char repetir = 'S';
		
		
		do {
			System.out.println("Java é divertido!");
			System.out.println("Digite S ou s para repetir: ");
			repetir = scanner.next().charAt(0);
		}while(repetir == 'S' || repetir == 's');
		
		System.out.print("O laço while foi finalizado!");
		scanner.close();
	}

}
