package ex_18;

/*
 * 18. Crie uma enumeração NivelPrioridade com os valores BAIXO, MEDIO, ALTO e URGENTE.
Cada nível de prioridade deve ter um código associado. Crie um método para exibir o nome
e o código de cada nível de prioridade.
 * */

public class TesteNivelPrioridade {

	public static void main(String[] args) {
		
		NivelPrioridade p1 = NivelPrioridade.BAIXO;
		
		NivelPrioridade.exibirTudo();
		
		System.out.println("\nPegando um codigo de um valor especifico (BAIXO): " + p1.getCodigo());
		
	}
}
