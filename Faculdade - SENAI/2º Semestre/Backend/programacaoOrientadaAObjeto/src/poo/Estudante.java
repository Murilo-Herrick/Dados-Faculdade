package poo;

import java.util.ArrayList;

public class Estudante {
	
	public Estudante (String nome) {
		this.nome = nome;
		this.notas = new ArrayList<>();
	}
	private String nome;
	private ArrayList<Integer> notas;
	
	
	public String getNome() {
		return this.nome;
	}
	public ArrayList<Integer> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}
	public void setNota(int nota) {
		this.notas.add(nota);
	}
	public double calcularMedia() {
		if(notas == null) return 0.0;
		double soma= 0;
		for (int n : notas) {
			soma += n;
		}
		return soma / notas.size();
	}
	
}
