package poo;

import java.util.Scanner;

public class TesteMassaCorporal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MassaCorporal usuario = new MassaCorporal();
		
		System.out.println("================================================");
		System.out.println("Bem vindo ao exame medico de aptidão fisica\nPor favor insira seus dados abaixo.");
		System.out.println("------------------------------------");
		System.out.print("Seu peso em kg: ");
		usuario.setPeso(scan.nextDouble());
		System.out.print("Sua altura: ");
		usuario.setAltura(scan.nextDouble());
		System.out.print("Sua idade: ");
		usuario.setIdade(scan.nextInt());
		
		
		scan.close();
	}

}
