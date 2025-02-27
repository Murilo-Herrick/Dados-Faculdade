package aula_06;

import java.util.Scanner;

public class ExemploLocale {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double x = scanner.nextDouble();
		System.out.println("O valor digitado é: " + x);
		System.out.printf("O valor digitado é: %2.f\n", x);
		scanner.close();
	}

}
