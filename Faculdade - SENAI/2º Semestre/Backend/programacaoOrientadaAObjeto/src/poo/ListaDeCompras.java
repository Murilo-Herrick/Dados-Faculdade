package poo;

import java.util.Scanner;

public class ListaDeCompras {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Lista lista = new Lista();
		boolean menu = true;
		int nav = 0;
		
		while(menu) {
		System.out.println("====================");
		System.out.println("0.Sair");
		System.out.println("1.Inserir item");
		System.out.println("2.Remover item");
		System.out.println("3.Lista item(ns)");
		System.out.println("====================");
		System.out.print("Selecione um opção:");
		nav = scan.nextInt();
		
		switch (nav) {
		case 0:
			System.out.println("Voce escolheu sair, adeus!");
			menu = false;
			break;
		
		case 1:
			System.out.print("Quanto itens deseja adicionar: ");
			int numeroItens = scan.nextInt();
			
			for (int i = 0; i < numeroItens; i++) {
				System.out.print("\nescreva o item que deseja adicionar: ");
				String item = scan.next();
				lista.inserirItem(item);
			}
			break;
		
		case 2: 
			System.out.println("Escreva o item que deseja remover: ");
			String itemRemove = scan.next();
			lista.removeItem(itemRemove);
			if(lista.removeItem(itemRemove))System.out.println("Item removido com sucesso!");
			if(!lista.removeItem(itemRemove))System.out.println("Falha ao remover o item");
			break;
		
		case 3:
			System.out.println("----------------------");
			System.out.println("Lista Completa:");
			lista.getListaDeCompras();
			System.out.println("----------------------");
			break;
		}
		}
		scan.close();
	}

}
