package lista_03;

public class Exercicio_18 {

	public static void main(String[] args) {
		
		int[] A = new int[10];
		
		
		for (int i = 0; i < 10; i++) {
			A[i] = (int)(Math.random() * 100);
		}
		
		for (int i : A) {
			System.out.print(i + " ");
		}
		
		int menor = A[0];
		int maior = A[0];
		
		for (int i = 0; i < 10; i++) {
			if(A[i] < menor) {
				menor = A[i];
			}
			if(A[i] > maior) {
				maior = A[i];
			}
		}
		System.out.println();
		System.out.println("O maior elemento é: " + maior);
		System.out.print("O menor elemento é: " + menor);
		
	}

}
