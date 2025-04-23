package matematica;

import java.util.Scanner;

public class FuncoesTrigonometricas {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite um valor de angulo em graus: ");
		double angulo = scan.nextDouble();
		angulo = Math.toRadians(angulo);
		System.out.printf("O valor do seno �: %.2f\n", Math.sin(angulo));
		System.out.printf("O valor do cosseno �: %.2f\n", Math.cos(angulo));
		System.out.printf("O valor da tangente �: %.2f\n", Math.tan(angulo));
		System.out.print("Digite a tangente: ");
		double tangente = scan.nextDouble();
		double arcoTangente = Math.atan(tangente);
		System.out.printf("O �ngulo para tangente �: %.2f \n", Math.toDegrees(arcoTangente));
		
		scan.close();
	}
}
