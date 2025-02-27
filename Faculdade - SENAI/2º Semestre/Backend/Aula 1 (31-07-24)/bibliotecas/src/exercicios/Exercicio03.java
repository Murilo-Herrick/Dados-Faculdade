package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o valor do primeiro cateto: ");
		double cat1 = scan.nextDouble();
		System.out.print("\n Digite o valor do segundo cateto: ");
		double cat2 = scan.nextDouble();
		System.out.print("\n O resultado da hipotenusa é: " + Math.hypot(cat1, cat2));
		
		scan.close();
	}

}
