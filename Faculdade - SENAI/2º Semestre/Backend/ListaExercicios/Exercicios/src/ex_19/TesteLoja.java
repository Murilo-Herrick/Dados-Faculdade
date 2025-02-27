package ex_19;

/*
 * 19. Crie uma classe Loja com um método calcularPreco() sobrecarregado para calcular o
preço de produtos. Um método deve aceitar o preço base e a quantidade, enquanto outro
deve calcular o preço considerando também um desconto percentual.
 * */

public class TesteLoja {

	public static void main(String[] args) {
		
		Loja loja = new Loja();
		
		System.out.println(loja.calcularPreco(5, 10));
		System.out.println(loja.calcularPreco(5, 10, 20));

	}

}
