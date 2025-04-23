package aula_12;

import java.util.Scanner;

public class CalculaMaximo {

	public static void main(String[] args) {


		try {
			Scanner scan = new Scanner (System.in);
			System.out.print("Digite o primeiro numero: ");
			int num1 = scan.nextInt();
			System.out.print("Digite o segundo numero: ");
			int num2 = scan.nextInt();
			System.out.print("Digite o terceiro numero: ");
			int num3 = scan.nextInt();

			System.out.println("O maior numero é: " + maior(num1, num2, num3));
			scan.close();			
		}
		catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		finally {
			System.out.println("Até breve!");
		}	

	}
	public static int maior(int n1, int n2, int n3) {
		if (n1 > n2 &&  n1 > n3) {
			return n1;
		}
		else if (n2 > n1 && n2 > n3) {
			return n2;
		}
		else{
			return n3;
		}
	}
}
