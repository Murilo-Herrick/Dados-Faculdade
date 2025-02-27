package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite um numero: ");
		double valor = scan.nextDouble();
		valor = Math.sqrt(valor);
		System.out.printf("\n" + "A raiz quadarada do numero é: " + valor);

		scan.close();
	}

}
