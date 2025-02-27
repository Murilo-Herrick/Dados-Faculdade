package lista_03;

public class Exercicio_22 {

	public static void main(String[] args) {
		int[] A = new int [10];
		int[] B = new int [10];
		
		for (int i = 0; i < 10; i++) {
			A[i] = (int)(Math.random() * 10);
		}
		for (int i = 0; i < 10; i++) {
			B[i] = A[9 - i];
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(B[i] + " ");
		}

	}

}
