package lista_03;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		int[] A = new int [5];
		int[] B = new int[5];
		
		for (int i = 0; i < 5; i++) {
			A[i] = (int)(Math.random() *  10);
		}	
		
		
		for (int i = 0; i < 5; i++) {
			B[i] = A[i];
			System.out.print(B[i] + " ");
		}
	}

}
