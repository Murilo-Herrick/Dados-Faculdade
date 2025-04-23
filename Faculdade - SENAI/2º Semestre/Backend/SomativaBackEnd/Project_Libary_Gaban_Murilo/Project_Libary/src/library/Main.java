package library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Library library = new Library();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
		
		// Faz um update dos arquivos CSV ao inicializar o programa
		library.updateCsv();
		
		// Aqui tem um estrutura de repetição while que simula um menu de opções
		while(menu < 0) {
			System.out.println("===== Library =====\n");
			System.out.println("1- Register book\n");
			System.out.println("2- Register User\n");
			System.out.println("3- Borrow book\n");
			System.out.println("4- Return book\n");
			System.out.println("5- Available books\n");
			System.out.println("0- Exit\n");
			System.out.print("Enter an option: ");
			int opcao = scan.nextInt();
			System.out.println();
			
			// Com base na opção escolhida, o número é armazenado dentro de uma variavel e passada para um switch
			switch(opcao) {
			
				case 1:
					// Faz o cadastro do livro na lista
					library.registerBook();
				break;
				
				case 2:
					// Faz o cadastro do usuario na lista
					library.registerUser();
				break;
				
				case 3:
					// Faz o emprestimo do livro
					library.borrowBook();
				break;
				
				case 4:
					// Faz o devolve o livro
					library.returnBook();
				break;
					
				case 5:
					// retorna todos os livros com seus status
					library.allBooks();
				break;
					
				case 0:
					menu = 5;
					System.out.println("Exit the system...");
				break;
				
				default:
					System.out.println("Option invalid!!!");
			}
		}
		
		scan.close();
		
	}

}
