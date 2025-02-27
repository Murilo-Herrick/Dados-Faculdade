package lista02;

/*14.Faça um programa que imprima na tela os números de 1 a 20, um abaixo
do outro e logo em seguida mostre os números um ao lado do outro.*/

public class Exercicio_14 {

	public static void main(String[] args) {
		for (int i = 1; i <=20; i++) {
			System.out.println(i);
		}
		
		for (int i = 1; i <=20; i++) {
			System.out.print(i +" ");
		}

	}

}
