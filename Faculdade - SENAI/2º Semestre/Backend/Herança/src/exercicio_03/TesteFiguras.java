package exercicio_03;

public class TesteFiguras {

	public static void main(String[] args) {
		
		Figura2D f1 = new Figura2D(5, 3);
		
		f1.setAltura(5);
		f1.setBase(3);
		
		Triangulo t1 = new Triangulo("isoceles", f1.getBase(), f1.getAltura());
		
		System.out.println(t1.calcularArea());
	}

}
