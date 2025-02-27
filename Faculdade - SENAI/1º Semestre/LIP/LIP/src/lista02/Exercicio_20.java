package lista02;

import java.util.Scanner;

/*20.Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n, faça um programa que calcule o
valor de H com n termos.*/

public class Exercicio_20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o numero de termos: ");
		int n = scan.nextInt();
		
		double h = 1.0;
		
		// for para repetir o numero de termos, e começa em i=2 pois a primeira fração é 1/2
		for (int i = 2; i <= n; i++) {
			
			h += 1.0/i;
		}
		System.out.println();
		System.out.print(h);
		
		scan.close();
	}

}
