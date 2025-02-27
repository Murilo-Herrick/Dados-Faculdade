package aula_06;

import java.util.Scanner;

public class ExemploMath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite  um n�mero: ");
		double x = scanner.nextDouble();
		
		if (x < 0) {
			System.out.println("O n�mero � negativo, vamos trabalhar com o m�dulo");
			x = Math.abs(x);
		}
		
		System.out.printf("O n�mero � foi: %.2f\n", x);
		
		double raiz = Math.sqrt(x);
		System.out.printf("A raiz �: %.2f\n", raiz);
		
		double cubo = Math.pow(x, 3);
		System.out.printf("O cubo �: %.2f\n", cubo);
		
		int sorte = (int)(Math.random() * 100);
		System.out.println("N�mero da sorte �: " + sorte);
		
		scanner.close();
	}

}
