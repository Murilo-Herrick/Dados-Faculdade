package ex_20;

public class Funcionario {
	
	private String nome;
	private int horasTrab;
	private double valorHora;
	
	public Funcionario(String nome, int horasTrab, double valorHora) {
		this.nome = nome;
		this.horasTrab = horasTrab;
		this.valorHora = valorHora;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasTrab() {
		return horasTrab;
	}
	public void setHorasTrab(int horasTrab) {
		this.horasTrab = horasTrab;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double calcularSalario() {
		return getHorasTrab() * getValorHora();
	}
}
