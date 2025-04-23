package poo;

import java.util.ArrayList;

public class Lista {
	
		private ArrayList<String> ListaDeCompras = new ArrayList<String>();

		public void getListaDeCompras() {
			for (String item : ListaDeCompras) {
				System.out.println(item);
			}
		}

		public void inserirItem(String item) {
			this.ListaDeCompras.add(item);
		}
		
		public boolean removeItem(String item) {
			return this.ListaDeCompras.remove(item);
		}
}
