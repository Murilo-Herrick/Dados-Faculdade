package lista02;

/*No c�digo do exerc�cio anterior, aumente a quantidade de n�meros que
ter�o os fatoriais impressos at� 20, 30 e 40. Em um determinado
momento, al�m desse c�lculo demorar, come�ar� a mostrar respostas
completamente erradas. Por qu�?
Mude de int para long a fim de ver alguma mudan�a.
As respostas que n�o s�o c�digos dever�o aparecer no formato de
coment�rio no cabe�alho do c�digo fonte.*/

/*Resposta:
 * 
 * Ele come�a a exibir os resultados errados devido a limita��o
 * do int que permite que sejam exibidos ate certo numero de 
 * digitos*/

public class Exercicio_06 {

	public static void main(String[] args) {
		int fat = 1;
		for (int i = 1; i <= 50; i++) {
			fat = i * fat;
			System.out.println("O fatorial de "+ i + " �: "+ fat);
			/*Ele come�a a exibir os resultados errados devido a limita��o
			 * do int que permite que sejam exibidos ate certo numero de 
			 * digitos*/
		}
	}
}
