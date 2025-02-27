package poo;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1, 2000, -1000);
		
		conta.consulta();
		conta.sacar(500);
		conta.consulta();
		conta.sacar(3500);
		conta.consulta();
		conta.depositar(1000);
		conta.cheque();
	}

}
