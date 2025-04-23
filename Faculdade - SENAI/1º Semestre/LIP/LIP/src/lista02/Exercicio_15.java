package lista02;

/*
 * 15.Faça um programa que leia 5 números e informe o maior número, a soma
e a média dos números.
 * */

public class Exercicio_15 {

	public static void main(String[] args) {
		int[] n = new int [5];
		
		// gera 5 numeros aleatorio de 0 a 10
		for(int i = 0; i < 5; i++) {
			n [i] = (int)(Math.random()* 10);
		}
		// imprime os numeros na tela
		for(int i = 0; i < 5; i++) {
			System.out.print(n[i] +" ");
		}
		//if dentro do for para que a variavel maior so receba o valor caso o valor seja maior
		int maior = 0;
		for(int i = 0; i < 5; i++) {
			if(n[i] > maior) {
				maior = n[i];
			}
		}
		System.out.println();
		System.out.print("O maior numero é: "+ maior);
		
		
		System.out.println();
		
		// soma dos valores do array, para isso foi usado um for
		int soma = 0;
		for(int i = 0; i < 5; i++) {
			soma += n[i];
		}
		
		System.out.println("A soma de todos é igual a: "+ soma);
		
		int media = soma / 5;
		System.out.println("A media dos numeros é igual a: "+ media);
	}

}
