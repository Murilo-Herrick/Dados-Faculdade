package aula_04;

import java.util.Scanner;

public class ExemploLerDadosVariados {

	public static void main(String[] args) {
		// Cria um objeto de leitura de dados
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scanner.next();
		// Limpa o buffer de leitura
		scanner.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.print("Digite sua altura em metros: ");
		double altura = scanner.nextDouble();
		System.out.println();
		System.out.println("Olá " + primeiroNome + " você tem " 
							+ idade + " anos e tem " + 
								altura + " metros de altura.");
	}

}
