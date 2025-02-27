package exercicio_02;

public class Aluno extends Pessoa {

	private String identificacao;
	private int anoLetivo;
	private int numeroDeDisciplinas;
		
	
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public int getAnoLetivo() {
		return anoLetivo;
	}
	public void setAnoLetivo(int anoLetivo) {
		this.anoLetivo = anoLetivo;
	}
	public int getNumeroDeDisciplinas() {
		return numeroDeDisciplinas;
	}
	public void setNumeroDeDisciplinas(int numeroDeDisciplinas) {
		this.numeroDeDisciplinas = numeroDeDisciplinas;
	}
}
