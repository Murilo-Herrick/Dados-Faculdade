package Aplicacao;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Aplicacao {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1010, "Murilo Herrick", 0.0);
		ContaEmpresa contaEmpresa = new ContaEmpresa(1010, "MH", 0.0, 500.0);
		
		// UPCASTING
		Conta c1 = contaEmpresa; // acesso aos membros da superclasse (Conta)
		Conta c2 = new ContaEmpresa(1012, "HM", 0.0, 300.0);
		Conta c3 = new ContaPoupanca(1013, "Herrick", 0.0, 0.01);
		
		// DOWNCASTING
		//ContaEmpresa ce1 = conta; // erro compilação
		//ContaEmpresa ce2 = (ContaEmpresa)conta; // erro execução
		//ContaEmpresa ce3 = (ContaEmpresa)c3; // erro execução
		
		ContaEmpresa ce4 = (ContaEmpresa)c2;
		System.out.println(ce4.getLimiteDeEmprestimo());
		
		if (c2 instanceof ContaEmpresa) {
			ContaEmpresa c4 = (ContaEmpresa)c2;
			System.out.println("Sou uma conta empresa!");
		}
		
		if (c2 instanceof ContaPoupanca) {
			ContaPoupanca c4 = (ContaPoupanca)c3;
			System.out.println("Sou uma conta poupança!");
		}
	}

}
