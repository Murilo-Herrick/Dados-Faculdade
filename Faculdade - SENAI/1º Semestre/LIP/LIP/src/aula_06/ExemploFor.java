package aula_06;

public class ExemploFor {

	public static void main(String[] args) {
		int linha = 1;
		for(int i = 1; i <= 100; i++) {
			double mm = 1 * 25.4;
			System.out.printf("%d pol � igual a %.2f mm \n", i, mm);
			// soma na v�riavel de controle de linha
			linha++;
			if(linha >10) {
				System.out.println();
				linha = 1;
			}
		}

	}

}
