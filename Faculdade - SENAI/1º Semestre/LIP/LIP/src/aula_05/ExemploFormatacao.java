package aula_05;

import java.util.Scanner;
public class ExemploFormatacao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o raio: ");
		double raio = scanner.nextDouble();
		double pi = Math.PI;
		System.out.printf("O valor de PI é: %.5f \n", pi);
		double area = pi * raio * raio;
		System.out.printf("A área é: %.2f \n", area);
	}
}
