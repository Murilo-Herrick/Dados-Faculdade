package polimorfismo;

public class TesteCalcular {

	public static void main(String[] args) {
		
		Calcular calc = new Calcular();
		
		System.out.println("=======================");
		calc.calcular(3.0);
		System.out.println("=======================");
		calc.calcular(3.0, 5.0);
		System.out.println("=======================");
		calc.calcular(3.0, 5.0, 7.0);

	}

}
