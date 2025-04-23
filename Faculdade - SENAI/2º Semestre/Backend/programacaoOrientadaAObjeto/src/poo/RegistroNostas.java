package poo;

import java.util.ArrayList;

public class RegistroNostas {

	public static void main(String[] args) {
		
		ArrayList<Estudante> estudantes = new ArrayList<>();
		Estudante e1 = new Estudante("Murilo");
		
		e1.setNota(10);
		e1.setNota(5);
		e1.setNota(3);
		e1.calcularMedia();
		
		System.out.println(e1.getNotas());
		System.out.println(e1.calcularMedia());
		
		estudantes.add(e1);
		for (Estudante estudante : estudantes) {
			System.out.println("Estudante: " + estudante.getNome() + ", Media: " + estudante.calcularMedia());
		}
	}

}
