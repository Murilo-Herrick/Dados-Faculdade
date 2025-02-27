package exercicio_03;

public class Triangulo extends Figura2D{
	
	private String tipo;
		
	public Triangulo(String tipo, int base, int altura) {
		super(base, altura);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double calcularArea() {
		double altura = super.getAltura();
		double base = super.getBase();
		
		double area = (altura * base) / 2;
		return area;
	}
}
