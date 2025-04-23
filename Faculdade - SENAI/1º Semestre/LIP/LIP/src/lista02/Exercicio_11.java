package lista02;

/*11.Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o usuário
informe um valor válido.*/

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma nota: ");
		int nota = scan.nextInt();
		
		// usa o comando while que se repete ate que seja digitado um valor de 0 a 10
		while (nota > 10) {
			System.out.println("Valor inválido!");
			System.out.print("Digite uma nota: ");
			nota = scan.nextInt();
			System.out.println();
			
		} if (nota < 10){
			System.out.print("Valor valido!");
			}
		
		
		
		scan.close();
		}
	}

