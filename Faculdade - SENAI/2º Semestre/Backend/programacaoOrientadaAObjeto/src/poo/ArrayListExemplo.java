package poo;

import java.util.ArrayList;

public class ArrayListExemplo {

	public static void main(String[] args) {
		ArrayList<String> listaDeNomes = new ArrayList<String>();
		
		listaDeNomes.add("Ándre");
		listaDeNomes.add("Roberto");
		listaDeNomes.add("Silva");
		listaDeNomes.add("João");
		listaDeNomes.add("Pedro");
		listaDeNomes.add("Lucas");
		listaDeNomes.add("Thiago");
		
		for (String n : listaDeNomes) {
			System.out.println(n);
		}
		
		System.out.println("-----------------------------");
		
		String nome = listaDeNomes.get(3);
		
		System.out.println(nome);
		
		listaDeNomes.remove(0);
		listaDeNomes.remove("Pedro");
		
		System.out.println("-----------------------------");
		
		for (String n : listaDeNomes) {
			System.out.println(n);
		}
	}

}
