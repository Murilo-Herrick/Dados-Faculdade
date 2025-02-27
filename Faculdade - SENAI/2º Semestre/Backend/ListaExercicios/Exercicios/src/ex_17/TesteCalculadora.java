package ex_17;

/*
 * 17. Crie uma classe Calculadora com métodos para somar, subtrair, multiplicar e dividir
dois números. Use parâmetros para passar os valores e retorne os resultados de cada
operação. Crie uma classe de teste para validar os cálculos.
 * */

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.Soma(1, 1));
		System.out.println(calc.subtracao(10, 5));
		System.out.println(calc.multiplicacao(5, 5));
		System.out.println(calc.divisao(10, 2));
	}
}
