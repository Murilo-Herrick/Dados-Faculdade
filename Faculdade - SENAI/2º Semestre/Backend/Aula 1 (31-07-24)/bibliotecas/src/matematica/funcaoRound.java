package matematica;

import java.util.Scanner;

public class funcaoRound {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor que n�o seja inteiro: ");
		double valor = scan.nextDouble();
		System.out.print("O valor arreondado � : "+ Math.round(valor));
		
		scan.close();
	}
}
