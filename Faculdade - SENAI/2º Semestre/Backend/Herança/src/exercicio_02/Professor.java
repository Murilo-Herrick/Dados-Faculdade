package exercicio_02;

public class Professor extends Pessoa{
	
	private int numeroDeAulas;
	private int quantidadeDeTurmas;
	private String periodo;
	
	
	public int getNumeroDeAulas() {
		return numeroDeAulas;
	}
	public void setNumeroDeAulas(int numeroDeAulas) {
		this.numeroDeAulas = numeroDeAulas;
	}
	public int getQuantidadeDeTurmas() {
		return quantidadeDeTurmas;
	}
	public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
		this.quantidadeDeTurmas = quantidadeDeTurmas;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
}
