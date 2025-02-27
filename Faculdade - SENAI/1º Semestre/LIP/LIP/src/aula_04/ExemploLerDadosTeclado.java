package aula_04;

import java.util.Scanner;

public class ExemploLerDadosTeclado {

	public static void main(String[] args) {
		// Cria um objeto para leitura de dados
		Scanner scanner = new Scanner(System.in);
		// Escreve uma mensagem para o usuário
		System.out.println("Digite seu nome: ");
		// Lê o que foi digitado pelo usuário
		String nome = scanner.nextLine();
		// Escreve outra mensagem para o usuário
		System.out.println("Digite seu sobrenome: ");
		// Lê o que foi digitado
		String sobrenome = scanner.nextLine();
		//Exibe uma mensagem para o usuário
		System.out.println("Olá, " + nome + " " + sobrenome + " seja bem-vindo(a)!");
		// Finaliza o objeto de leitura
		scanner.close();
	}
}
