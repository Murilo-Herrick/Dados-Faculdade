package poo;

public class Lampada {
	
	boolean status;
	
	public Lampada(boolean status) {
		this.status = status;
	}
	
	public void ligar() {
		this.status = true;
	}
	public void desligar() {
		this.status = false;
	}
	
	public String verificarStatus() {
		if(this.status) {
			return "acessa";
		}
		return "apagada";
	}
}
