package exercicio;

public class TesteMamifero {

	public static void main(String[] args) {
		
		Mamifero cachorro = new Cachorro("Cachorro", "familiaAUAUA", "vira-lata");
		Mamifero gato = new Gato ("Gato", "familiaMEWMOEW", true);
		
		gato.brincar();
		cachorro.brincar();
	}

}
