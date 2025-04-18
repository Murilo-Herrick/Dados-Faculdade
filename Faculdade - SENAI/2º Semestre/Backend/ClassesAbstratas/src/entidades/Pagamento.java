package entidades;

public abstract class Pagamento {

	private double valor;

	public Pagamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
		
	public abstract void processarPagamento();
	
	public void imprimirRecibo() {
		System.out.println("Recibo gerado. Valor: R$" + valor);
	}
}
