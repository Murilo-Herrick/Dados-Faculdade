package entidades;

public class Conta {
	
	private Integer numero;
	private String titular;
	protected double saldo;
	
	public Conta() {
		
	}
	public Conta(Integer numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
		
	public void sacar(double valor) {
		System.out.println("==========");
		System.out.println("Saldo antes do saque: " + saldo);
		saldo -= valor + 5;
		System.out.println("Saldo depois do saque: " + saldo);
		System.out.println("==========");
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
}
