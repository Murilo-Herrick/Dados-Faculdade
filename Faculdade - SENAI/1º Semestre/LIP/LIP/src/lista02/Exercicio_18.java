package lista02;

import java.util.Scanner;

/*18.Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 0 e 10. O usuário deve informar de qual
número ele deseja ver a tabuada.*/

public class Exercicio_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// pede para o usuario digitar a tabuada desejada
		System.out.println("Este é o gerador de tabuada!");
		System.out.println();
		System.out.print("Insira a tabuada que deseja: ");
		int tabuada = scan.nextInt();
		
		// utiliza for para exibir a tabuada do valor digitado
		int numeros = 0;
		for (int i = 1; i <=10; i++) {
			
			numeros = tabuada * i;
			System.out.print(numeros + " ");
		}
		scan.close();
	}

}
