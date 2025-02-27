package polimorfismo;

public class Calcular {
	
	private double linear;
	private double area;
	private double volume;
	
	
	public Calcular() {
		
	}
	
	public Calcular(double linear) {
		this.linear = linear;
	}
	
	public Calcular(double linear, double area) {
		this.linear = linear;
		this.area = area;
	}
	
	public Calcular(double linear, double area, double volume) {
		this.linear = linear;
		this.area = area;
		this.volume = volume;
	}
	public double getLinear() {
		return linear;
	}
	public void setLinear(double linear) {
		this.linear = linear;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public void calcular(double comprimento) {
		System.out.println("Comprimento: " + comprimento);
		setLinear(comprimento);
	}
	
	public void calcular(double comprimento, double largura) {
		System.out.println("Comprimento: " + comprimento);
		System.out.println("Área: " + comprimento * largura);
		setLinear(comprimento);
		setArea(comprimento * largura);
	}
	
	public void calcular(double comprimento, double largura, double altura) {
		System.out.println("Comprimento: " + comprimento);
		System.out.println("Área: " + comprimento * largura);
		System.out.println("Volume: " + comprimento * largura * altura);
		setLinear(comprimento);
		setArea(comprimento * largura);
		setVolume(comprimento * largura * altura); 
	}
}
