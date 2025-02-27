package entidades;

public class PagamentoCartao extends Pagamento {

	private String numeroCartao;

	public PagamentoCartao(double valor, String numeroCartao) {
		super(valor);
		this.numeroCartao = numeroCartao;
	}

	@Override
	public void processarPagamento() {
		System.out.println("Processando pagamento via Cartão de Crédito...");
		System.out.println("Número do cartão: " + numeroCartao);
		
		imprimirRecibo();
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

}
