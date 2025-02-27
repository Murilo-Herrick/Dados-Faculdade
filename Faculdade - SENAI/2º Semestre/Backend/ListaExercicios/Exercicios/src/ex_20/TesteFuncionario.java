package ex_20;

/*
 *20. Implemente uma classe Funcionario com um método calcularSalario(). Crie uma classe
derivada Gerente que sobrescreva esse método para incluir um bônus ao salário. Crie uma
classe de teste para verificar a sobrescrita de métodos. 
 * */

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Murilo" , 220 , 25);
		Gerente gerente = new Gerente("Herrick" , 220, 25);
		
		System.out.println(funcionario.calcularSalario());
		System.out.println( gerente.calcularSalario());
	}

}
