package ex_20;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, int horasTrab, double valorHora) {
		super(nome, horasTrab, valorHora);
	}
	
	@Override
	public double calcularSalario() {
		return getHorasTrab() * getValorHora() * 1.40;
	}
}
