package aplicacao;

import entidades.Pagamento;
import entidades.PagamentoPix;
import entidades.PagamentoCartao;

public class MainPagamento {

	public static void main(String[] args) {
		
		// Pagamento com cartão
		Pagamento pagamentoCartao = new PagamentoCartao(250.75, "1234-5678-9012-3456");
		pagamentoCartao.processarPagamento();
		
		System.out.println();
		
		// Pagamento por transferencia
		Pagamento pagamentoPix = new PagamentoPix(500.00, "123456-7");
		pagamentoPix.processarPagamento();
	}

}
