package randomica;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Random random = new Random();
		
		System.out.println("Número inteiro aleatorio: " + random.nextInt());
		System.out.println("Número float aleatorio: " + random.nextDouble());
		System.out.println("Valor Booleano aleatorio: " + random.nextBoolean());
		
		byte[] meuArray = {0, 0, 0, 0, 0};
		random.nextBytes(meuArray);
		System.out.print("Bytes aleatorios: ");
		for (byte i : meuArray) {
			System.out.printf(i +"\t");
		}
		
		System.out.printf("\nDigite o limite superior: ");
		int limite = scan.nextInt();
		System.out.println("Numero inteiro aleatorio com limite: " + random.nextInt(0, limite));
		
		
		System.out.print("Digite um valor para semente: ");
		int semente = scan.nextInt();		
		System.out.printf("Numeros aleatorios com mesma semente: ");
		for (int i = 0; i <= 10; i++) {
			Random randomSeed = new Random(semente);
			System.out.printf(randomSeed.nextInt(30) + " | ");
		}
		
		scan.close();
	}
}
