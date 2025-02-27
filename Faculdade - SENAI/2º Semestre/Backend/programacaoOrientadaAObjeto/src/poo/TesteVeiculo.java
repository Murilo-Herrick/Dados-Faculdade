package poo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculo minivan = new Veiculo();
		Veiculo carroEsportivo = new Veiculo();
		
		minivan.passageiros = 7;
		minivan.capCombustivel = 40;
		minivan.kpl = 15;
		
		carroEsportivo.passageiros = 2;
		carroEsportivo.capCombustivel = 30;
		carroEsportivo.kpl = 10;
		
		double litros;
		int distancia = 300;
				
		System.out.println("Uma minivan pode carregar " + minivan.passageiros + " passageiros");
		System.out.println("A autonomia de uma minivan é " + minivan.autonomia() + " KM");
		
		System.out.println("\nUm carro esportivo pode carregar " + carroEsportivo.passageiros + " passageiros");
		System.out.println("A autonomia do carro esportivo é " + carroEsportivo.autonomia() + " KM\n");
		
		litros = minivan.combNescessario(distancia);
		System.out.println("Para percorrer " + distancia + " Km uma minivan prescisa de " + litros + " litros");
		
		litros = carroEsportivo.combNescessario(distancia);
		System.out.println("Para percorrer " + distancia + " Km um carro esportivo prescisa de " + litros + " litros");
	}
}
