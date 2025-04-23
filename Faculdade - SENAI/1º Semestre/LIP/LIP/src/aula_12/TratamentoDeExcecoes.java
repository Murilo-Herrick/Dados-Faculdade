package aula_12;

import java.util.Scanner;

public class TratamentoDeExcecoes {

	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner (System.in);
			System.out.print("Digite um numerador: ");
			int numerador = scan.nextInt();
			System.out.print("Digite o denominador: ");
			int denominador = scan.nextInt();
			double resultado = numerador / denominador;
			System.out.printf("O resultado é: %.2f\n", resultado);
		}
		catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		finally {
			System.out.println("Até breve!");
		}

	}

}
