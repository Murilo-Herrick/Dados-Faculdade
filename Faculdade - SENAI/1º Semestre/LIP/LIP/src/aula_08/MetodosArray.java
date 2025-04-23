package aula_08;

public class MetodosArray {

	public static void main(String[] args) {
		int[] A = {2, 7, 9, 5, 1, 6, 3};
		int[] B = new int [7];
		
		System.out.println(A.length);
		
		B = A.clone();
		
		for(int i : A) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		for(int i : B) {
			System.out.print(i + "\t");
		}
		
		System.out.println();

	}

}
