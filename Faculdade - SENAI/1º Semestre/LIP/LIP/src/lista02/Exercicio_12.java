package lista02;

import java.util.Scanner;

/*12.Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem de
erro e voltando a pedir as informações.*/

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String nome = " ";
		String senha = " ";
		
		System.out.print("Digite o nome de usuario: ");
		nome = scan.nextLine();
		
		System.out.print("Digite um senha: ");
		senha = scan.nextLine();
		
		System.out.println();
		
		// usa o laço while para que enquanto as duas strings forem iguais, ele se repete
		while (nome.equals(senha)) {
		System.out.println("Usuario e senha Invalidos!");
		System.out.println();
		
		System.out.print("Digite o nome de usuario: ");
		nome = scan.nextLine();
		
		System.out.print("Digite um senha: ");
		senha = scan.nextLine();
		
		}
		
		// se nome diferente de senha ele e aceita e encerra o programa
		if (nome != senha) {
			System.out.println("Usuario e senha Validos!");
		}
		
		scan.close();
	}

}
