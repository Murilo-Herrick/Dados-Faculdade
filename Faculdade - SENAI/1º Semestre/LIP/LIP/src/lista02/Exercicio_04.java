package lista02;

//Imprima todos os múltiplos de 7 entre 1 e 1000.

public class Exercicio_04 {

	public static void main(String[] args) {
		//cria um for para imprimir do 1 ao 1000 e ir aumentando de 1 em 1
		for(int i = 1; i <= 1000; i++) {
			//cria um if que como condição, caso o resto da div for 7 ele exibe o resultado
			if(i % 7 == 0) {
				System.out.println("Multiplos de 7: "+ i);
			}
		}

	}

}
