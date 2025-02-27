package aula_04;

public class IfDemo {
	
	/*
	 * Demonstra a instrução if
	 */

	public static void main(String[] args) {
		int a, b, c;
		
		a = 2;
		b = 3;
		
		if (a < b) System.out.println("a é menor que b");
		
		if (a == b) System.out.println("Você não verá isso");
		
		System.out.println();

		c = b - a;
		
		System.out.println("c contém 1");
		
		if (c >= 0) System.out.println("c é positivo");
		if (c < 0) System.out.println("c é negativo");
	}

}
