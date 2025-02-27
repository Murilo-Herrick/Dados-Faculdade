package aula_05;

import java.util.Scanner;

public class ExemploIfElseifElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu tipo sanguíneo (A, B, AB, O): ");
		// Lê o tipo sanguíneo
		String tipo = scanner.next();
		// Limpa o buffer de leitura
		scanner.nextLine();
		System.out.print("Digite seu RH (+ ou -): ");
		// Lê o RH
		String rh = scanner.next();
		// Limpa o buffer de leitura
		scanner.nextLine();

		if (tipo.equals("A")) {
			
			if (rh.equals("+")) {
				System.out.println("Pode doar para A+ e AB+");
				System.out.println("Pode receber de A+, A-, O+ e O-");
			} else if (rh.equals("-")) {
				System.out.println("Pode doar para A+, A-, AB+, AB-");
				System.out.println("Pode receber de A- e O-");
			} else {
				System.out.println("RH inválido!");
			}
			
		} else if (tipo.equals("B")) {
			
			if (rh.equals("+")) {
				System.out.println("Pode doar para B+ e AB+");
				System.out.println("Pode receber de B+, B-, O+ e O-");
			} else if (rh.equals("-")) {
				System.out.println("Pode doar para B+, B-, AB+, AB-");
				System.out.println("Pode receber de B- e O-");
			} else {
				System.out.println("RH inválido!");
			}
			
		} else if (tipo.equals("AB")) {
			
			if (rh.equals("+")) {
				System.out.println("Pode doar para AB+");
				System.out.println("Pode receber de todos os tipos");
			} else if (rh.equals("-")) {
				System.out.println("Pode doar para AB+, AB-");
				System.out.println("Pode receber de A-, B-, AB- e O-");
			} else {
				System.out.println("RH inválido!");
			}
			
		} else if (tipo.equals("O")) {
			
			if (rh.equals("+")) {
				System.out.println("Pode doar para A+, B+, AB+, O+");
				System.out.println("Pode receber de O+ e O-");
			} else if (rh.equals("-")) {
				System.out.println("Pode doar para todos os tipos");
				System.out.println("Pode receber de O-");
			} else {
				System.out.println("RH inválido!");
			}
			
		} else {
			System.out.println("Tipo sanguíneo inválido");
		}

	}
}
