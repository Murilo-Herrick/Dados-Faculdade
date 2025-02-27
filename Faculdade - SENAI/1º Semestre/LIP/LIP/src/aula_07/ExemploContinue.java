package aula_07;

public class ExemploContinue {

	public static void main(String[] args) {

		for (int i = 1; i <= 40; i++) {
			if (i % 4 == 0) {
				System.out.println("PIN");
				continue;
			} 
				System.out.println("Contei: " + i);
		}

	}

}
