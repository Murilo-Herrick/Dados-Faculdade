package aula_04;

import java.util.Scanner;

public class ExemploIfElseifElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu tipo sanguineo (A, B, AB ou O)");
		String tipo = scanner.next();
		System.out.println("Digite seu RH (+ ou -): ");
		String rh = scanner.next();
		
		if(tipo.equals("A")) {
			if(rh.equals("+")) {
				System.out.println("Pode doar para AB+ e A+.");
				System.out.println("Recebe de A+, A-, O+ e O-.");
			}
		}

	}

}
