package lista02;

/*Faça um código que exiba os pesos das 16 primeiras posições dos dígitos
binários. O peso é calculado por 2^posição, onde a posição será contada de
0 a 15. Cada valor deverá ser apresentado em uma linha no seguinte
formato 2 ^ 0 = 1. A cada quatro linhas deverá ser inserida uma linha em
branco. Utilize o comando for.*/

public class Exercicio_08 {

	public static void main(String[] args) {
		  int posicao = 16;
	      int peso = 1;

	      for (int i = 0; i < posicao; i++) {
	          System.out.println("2 ^ " + i + " = " + peso);
	          peso *= 2;

	          if ((i + 1) % 4 == 0) {
	               System.out.println();
	           }
	      }
	  }
}