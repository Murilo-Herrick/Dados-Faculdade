package aula_12;

import java.util.Scanner;

public class MetodoComRetorno {

	public static void main(String[] args) {
		
		double massa, altura, imc;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite sua massa em quilograma: ");
		massa = scan.nextDouble();
		System.out.print("Digite sua altura em metros: ");
		altura = scan.nextDouble();
		imc = calculaImc(massa, altura);
		System.out.printf("Seu IMC é: %.2f", imc);
		
		scan.close();
	}
	
	// método para calcular o IMC
	public static double calculaImc (double m, double a) {
		double aux;
		aux = m / Math.pow(a, 2);
		return aux;
	}

}
