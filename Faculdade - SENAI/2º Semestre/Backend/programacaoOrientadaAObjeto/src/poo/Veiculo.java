package poo;

public class Veiculo {
	int passageiros;
	int capCombustivel;
	int kpl;
	
	// metodo que calcula a autonomia do veiculo
	int autonomia() {
		return capCombustivel * kpl;
	}
	
	// metodo que calcula o combustivel nescessario para para cobrir uma distancia
	double combNescessario(int kilometros) {
		return kilometros / kpl;
	}
}