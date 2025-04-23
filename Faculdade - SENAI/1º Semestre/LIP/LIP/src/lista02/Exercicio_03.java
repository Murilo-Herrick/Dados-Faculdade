package lista02;

/*Imprima todos os multiplos de 3 entre 1 e 100.*/

public class Exercicio_03 {

	public static void main(String[] args) {
		//Usa o for para criar uma sequencia de 1 a 100
		for(int i = 1; i <= 100; i++) {
			/*Usa condição if para caso o resto da divisão
			 *por 3 for zero imprime a mensagem a baixo*/
			if(i % 3 == 0)
				System.out.println("Multiplos de 3: " + i);
		}
	}

}
