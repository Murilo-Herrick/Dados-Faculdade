package aula_08;

public class ExemploForEach {

	public static void main(String[] args) {
		int[] meuArrayInt = new int[5];
		boolean[] meuArrayBool = new boolean[5];
		String[] meuArrayStr = new String[5];
		
//		int[] meuArrayInt = {10, 20, 30, 40};
//		boolean[] meuArrayBool = {true, false, true, false, true};
//		String[] meuArrayStr = {"Vinicius", "Isabella", "Grazi", "Ryan", "Guilherme"};
		
		for(int i : meuArrayInt) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		for(boolean b : meuArrayBool) {
			System.out.print(b + "\t");
		}
		
		System.out.println();
		
		for(String s : meuArrayStr) {
			System.out.print(s + "\t");
		}
	}

}
