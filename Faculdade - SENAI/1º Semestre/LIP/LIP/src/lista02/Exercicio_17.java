package lista02;

import java.util.Scanner;

/*17.Faça um programa que receba dois números inteiros e imprima os
números inteiros que estão no intervalo compreendido por eles.*/

public class Exercicio_17 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 //utiliza o scanner para receber o 2 valores
	     System.out.print("Digite o primeiro número inteiro:");
	     int numero1 = scan.nextInt();

	     System.out.print("Digite o segundo número inteiro:");
	     int numero2 = scan.nextInt();
	     
	     
	     System.out.println();
	      System.out.println("Números inteiros no intervalo de " + numero1 + " e " + numero2 + ":");
	      
	      // defino um maior e menor
	      int menor, maior;
	      
	      if(numero1 < numero2) {
	    	  menor = numero1;
	    	  maior = numero2;
	      }else {
	    	  menor = numero2;
	    	  maior = numero1;
	      }
	      
	      // com o maior e menor definido, substituo-os no for e exibo os valores do intervalo
	      for (int i = menor; i < maior; i++) {
	    	  System.out.print(i + " ");
	      }
	      
	      
	      scan.close();
			}
	}

