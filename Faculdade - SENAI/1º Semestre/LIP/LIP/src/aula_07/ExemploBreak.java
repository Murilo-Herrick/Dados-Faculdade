package aula_07;

public class ExemploBreak {

	public static void main(String[] args) {
		int num = 100;
		
		for (int i = 0; i < num; i++) {
			System.out.println("Contei: " + i);
			if(i * i >= num) {
				break;
			}
		}
	}

}
