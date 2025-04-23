package entidades;

public class ContaEmpresa extends Conta {
	
	private double limiteDeEmprestimo;
	
	public ContaEmpresa() {
		
	}

	public ContaEmpresa(Integer numero, String titular, double saldo, double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}
	
	public void setLimiteDeEmprestimo(double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public void emprestimo (double valor) {
		saldo += valor;
	}

}
