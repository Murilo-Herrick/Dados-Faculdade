package matematica;

import java.util.Scanner;

public class FuncoesBasicas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		double x = scan.nextDouble();
		
		double modulo = Math.abs(x);
		System.out.println("O modulo desse numero é : " + modulo);
		
		scan.close();
	}

}
