package lista02;

import java.util.Scanner;

/*19.Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número.*/

public class Exercicio_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int base = 0;
		int expo = 0;
		
		System.out.print("Digite a base: ");
		base = scan.nextInt();
		
		System.out.print("Digite o expoente: ");
		expo = scan.nextInt();
		
		/* Cria uma variavel com o numero 1 e a multiplica pela base, n vezes determinado por expo*/
		int elev = 1;
		for (int i = 0; i < expo; i++) {
			
			elev *= base;
		}
		// exibe o resultado
		System.out.println();
		System.out.print("O resultado é: "+ elev);
		
		scan.close();
	}

}
