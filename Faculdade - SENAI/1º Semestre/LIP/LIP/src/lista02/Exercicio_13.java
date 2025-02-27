package lista02;

public class Exercicio_13 {

	public static void main(String[] args) {
	     for (int i = 1; i <= 100; i++) {
	    	 	
	    	 	// inves de color tudo em if, utilizo uma variavel booleana, que facilita no uso do if
	            boolean par = i % 2 == 0;
	            boolean impar = i % 2 != 0;
	            boolean multiploDe3 = i % 3 == 0;
	            boolean multiploDe7 = i % 7 == 0;

	            System.out.print(i + " - ");

	            if (par) {
	                System.out.print("Par ");
	            }

	            if (impar) {
	                System.out.print("Ímpar ");
	            }

	            if (multiploDe3) {
	                System.out.print("Múltiplo de 3 ");
	            }

	            if (multiploDe7) {
	                System.out.print("Múltiplo de 7 ");
	            }

	            System.out.println();
	            
	            // linha em branco a cada 10 números
	            if (i % 10 == 0) {
	                System.out.println(); 
	            }
	        }
	    }
	}
