package lista02;

/*Utilize o comando for para imprimir os 30 primeiros n�meros da s�rie de
Fibonacci. A s�rie de Fibonacci � a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc.
Para calcul�-la, o primeiro elemento vale 0, o segundo vale 1, e da� por

diante. O n-�simo elemento vale o (n-1)-�simo elemento somado ao (n-
2)-�simo elemento (ex: 8 = 3 + 5).*/

public class Exercicio_07 {

	public static void main(String[] args) {
		
	    int n = 10; 

        int a = 0;
        int b = 1;

        System.out.println("Os " + n + " primeiros números da série de Fibonacci são:");

        // Loop for para calcular e imprimir os próximos números da série Fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            
            // cria uma variavel temporaria que armazena os valores de cada soma
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}


