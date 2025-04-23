package aula_06;

import java.util.Scanner;

public class ExemploMath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite  um número: ");
		double x = scanner.nextDouble();
		
		if (x < 0) {
			System.out.println("O número é negativo, vamos trabalhar com o módulo");
			x = Math.abs(x);
		}
		
		System.out.printf("O número é foi: %.2f\n", x);
		
		double raiz = Math.sqrt(x);
		System.out.printf("A raiz é: %.2f\n", raiz);
		
		double cubo = Math.pow(x, 3);
		System.out.printf("O cubo é: %.2f\n", cubo);
		
		int sorte = (int)(Math.random() * 100);
		System.out.println("Número da sorte é: " + sorte);
		
		scanner.close();
	}

}
