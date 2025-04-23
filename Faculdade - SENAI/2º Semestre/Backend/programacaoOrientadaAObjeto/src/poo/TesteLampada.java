package poo;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada l1 = new Lampada(false);
		
		System.out.println("A lampada está: " + l1.verificarStatus());
		l1.ligar();
		System.out.println("A lampada está: " + l1.verificarStatus());
		l1.desligar();
		System.out.println("A lampada está: " + l1.verificarStatus());
	}

}
