package exercicios;

import java.util.Random;

public class Exercicio04 {

	public static void main(String[] args) {
		Random r = new Random();
		
		for (int i = 0; i <= 100; i++) {
			int n = r.nextInt(1, 7);
			System.out.print(n + " ");
			
		}
	}
}
