package lista_03;

public class Exercicio_21 {

	public static void main(String[] args) {
		   
        int[] vetorA = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1}; 
        
      
        boolean palindromo = true;
        for (int i = 0; i < vetorA.length / 2; i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }
        

        if (palindromo) {
            System.out.println("O vetor A �� um pal��ndromo.");
        } else {
            System.out.println("O vetor A n��o �� um pal��ndromo.");
        }
    }



}