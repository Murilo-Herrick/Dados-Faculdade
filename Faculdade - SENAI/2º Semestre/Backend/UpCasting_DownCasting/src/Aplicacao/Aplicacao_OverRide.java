package Aplicacao;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Aplicacao_OverRide {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1010, "Murilo Herrick", 0.0);
		Conta ce = new ContaEmpresa(1011, "MH", 50.0, 500.0);
		Conta cp = new ContaPoupanca(1012, "Herrick", 50.0, 0.001);
		
		ce.sacar(10);
		cp.sacar(10);
	}

}