package ex_15;

/*
 * 15. Crie uma classe ContaBancaria com atributos saldo e numero. Use o conceito de
encapsulamento para garantir que o saldo só possa ser acessado através de métodos
getSaldo() e depositar(). Crie uma classe de teste para validar o funcionamento.
 * */

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(1, 200);
		
		System.out.println("Numero da conta: " + conta1.getNumero());
		System.out.println("Saldo: " + conta1.getSaldo());
		conta1.depositar(300);
		// Valor apos o deposito
		System.out.println("Saldo apos o deposito: " + conta1.getSaldo());
	}

}
