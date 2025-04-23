package entidades;

public class ContaPoupanca extends Conta {
	
	private double taxaDeJuros;
	
	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(Integer numero, String titular, double saldo, double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuros;
	}
	
	@Override
	public void sacar(double valor) {
		System.out.println("==========");
		System.out.println("Saldo antes do saque: " + saldo);
		saldo -= valor;
		System.out.println("Saldo depois do saque: " + saldo);
		System.out.println("==========");
	}
}
