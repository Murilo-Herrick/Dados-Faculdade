package poo;

public class Conta {
	int numero;
	double saldo;
	double limite;
	boolean cheque;
	
	public Conta(int numero, double saldo, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	double depositar(double valorDeposito) {
		this.saldo = valorDeposito + this.saldo;
		return this.saldo;
	}
	void consulta() {
		System.out.println("O saldo é de " + this.saldo);
	}
	void sacar (double valor) {		
		if (valor > this.saldo + (-this.limite)) {
			System.out.println("Não é possivel sacar, valor de saque maior que o disponivel");
		}
		else {
			this.saldo = this.saldo - valor;
			System.out.println("O valor sacado foi de " + valor);
		}
	}
	void cheque () {
		if(this.saldo < 0) {
			this.cheque = true;
			System.out.println("Cheque esta sendo usado: " + this.cheque);
		}else {
			this.cheque = false;
			System.out.println("Cheque esta sendo usado: " + this.cheque);
		}
		
	}
}
