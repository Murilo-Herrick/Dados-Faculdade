package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite um valor para ser usado como base: ");
		double base = scan.nextDouble();
		System.out.print("\n Digite um valor para ser usado como expoente: ");
		double expoente = scan.nextDouble();
		System.out.print("\n O resultado é: " + Math.pow(base, expoente));
		
		scan.close();
	}

}
