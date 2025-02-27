package aula_04;

public class IntVersusDouble {
	/*
		Esse programa ilustra a diferença
		entre int e double
	 */

	
	public static void main(String[] args) {
		int var; 	// Essa instrução declará uma variável int
		double x;	// Essa instrução declará uma variável de ponto flutuante
		
		var = 10;
		x = 10.0;
		
		System.out.println("Valor original de var: " + var);
		System.out.println("Valor original de x: " + x);
		// Agora divide as duas por 4
		var = var / 4;
		x = x / 4;
		// Valores após a divisão
		System.out.println("var após a divisão: " + var);
		System.out.println("x após a divisão: " + x);
	}

}
