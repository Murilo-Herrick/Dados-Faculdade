package aula_04;

import java.util.Scanner;

public class ExemploLerDadosTeclado {

	public static void main(String[] args) {
		// Cria um objeto para leitura de dados
		Scanner scanner = new Scanner(System.in);
		// Escreve uma mensagem para o usu�rio
		System.out.println("Digite seu nome: ");
		// L� o que foi digitado pelo usu�rio
		String nome = scanner.nextLine();
		// Escreve outra mensagem para o usu�rio
		System.out.println("Digite seu sobrenome: ");
		// L� o que foi digitado
		String sobrenome = scanner.nextLine();
		//Exibe uma mensagem para o usu�rio
		System.out.println("Ol�, " + nome + " " + sobrenome + " seja bem-vindo(a)!");
		// Finaliza o objeto de leitura
		scanner.close();
	}
}
