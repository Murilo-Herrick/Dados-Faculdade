package aula_04;

public class IntVersusDouble {
	/*
		Esse programa ilustra a diferen�a
		entre int e double
	 */

	
	public static void main(String[] args) {
		int var; 	// Essa instru��o declar� uma vari�vel int
		double x;	// Essa instru��o declar� uma vari�vel de ponto flutuante
		
		var = 10;
		x = 10.0;
		
		System.out.println("Valor original de var: " + var);
		System.out.println("Valor original de x: " + x);
		// Agora divide as duas por 4
		var = var / 4;
		x = x / 4;
		// Valores ap�s a divis�o
		System.out.println("var ap�s a divis�o: " + var);
		System.out.println("x ap�s a divis�o: " + x);
	}

}
