package matematica;

import java.util.Scanner;

public class funcoesCeilEFloor {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite qualquer valor: ");
		double valor = scan.nextDouble();
		
		double floor = Math.floor(valor);
		System.out.printf("O valor floor do valor é: "+ floor);

	}
}
