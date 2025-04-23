package library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	private String pathBook = "C:\\Users\\Aluno\\Desktop\\Library\\Book.csv";
	private String pathUser = "C:\\Users\\Aluno\\Desktop\\Library\\User.csv";
	private String pathBorrowedBooks = "C:\\Users\\Aluno\\Desktop\\Library\\BorrowedBooks.csv";

	private ArrayList<Book> bookList;
	private ArrayList<User> registeredUsers;
	private ArrayList<Book> borrowedBooks;
	private ArrayList<String> bookListCsv;
	private ArrayList<String> userListCsv;
	private ArrayList<String> borrowedBooksCsv;

	private String userDataCsv;
	private String bookDataCsv;
	private boolean bookDataAvailable;
	private String bookAvailable;

	public Library() {
		bookList = new ArrayList<Book>();
		registeredUsers = new ArrayList<User>();
		bookListCsv = new ArrayList<String>();
		userListCsv = new ArrayList<String>();
		borrowedBooksCsv = new ArrayList<String>();
		borrowedBooks = new ArrayList<Book>();
	}

	Scanner scan = new Scanner(System.in);

	public Library(ArrayList<Book> bookList, ArrayList<User> registeredUsers) {
		this.bookList = bookList;
		this.registeredUsers = registeredUsers;
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	// Adiciona um livro a lista de livros
	public void setBookList(Book bookList) {
		this.bookList.add(bookList);
	}

	public ArrayList<User> getRegisteredUsers() {
		return registeredUsers;
	}

	// Adiciona uma usuário a lista de usuários
	public void setRegisteredUsers(User registeredUsers) {
		this.registeredUsers.add(registeredUsers);
	}

	// Exibe uma lista de livros
	public void bookList() {
		for (Book books : bookList) {
			System.out.println(books.toString());
		}
	}

	// Metodo que que já pede as informações do livro para registro e adiciona ao
	// final elas em uma lista
	public void registerBook() {

		System.out.println();
		scan.nextLine();
		System.out.print("Enter book title: ");
		String title = scan.nextLine();
		// scan.nextLine();
		System.out.print("\nEnter autor name: ");
		String autor = scan.nextLine();
		// scan.nextLine();
		System.out.print("\nEnter book ISBN: ");
		String isbn = scan.nextLine();
		scan.nextLine();

		// Passa as váriaveis para caixa alta, mantendo um padrão
		String titleBook = title.toUpperCase();
		String autorBook = autor.toUpperCase();
		String isbnBook = isbn.toUpperCase();

		// Cria um objeto para passar ao construtor as variaveis as quais foram
		// armazenadas com as informações
		// Digitadas pelo usuário
		Book books = new Book(titleBook, autorBook, isbnBook, true);
		this.bookList.add(books);
		this.bookListCsv.add(titleBook + "," + autorBook + "," + isbnBook + "," + true);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathBook))) {
			for (String linha : bookListCsv) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println("\nBook added successfully!");
	}

	// Metodo que que já pede as informações do usuário para registro e adiciona ao
	// final elas em uma lista
	public void registerUser() {

		System.out.println();
		System.out.print("Enter user name: ");
		String userName = scan.next();
		scan.nextLine();
		System.out.print("\nEnter user registration number: ");
		String userregistrationNumber = scan.next();

		String nameUser = userName.toUpperCase();
		String userRegister = userregistrationNumber.toUpperCase();

		// Cria um objeto para passar ao construtor as variaveis as quais foram
		// armazenadas com as informações
		// Digitadas pelo usuário
		User user = new User(nameUser, userRegister);
		this.registeredUsers.add(user);
		this.userListCsv.add(nameUser + "," + userRegister);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathUser))) {
			for (String linha : userListCsv) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println("\nUser added successfully!");
	}

	// Metodo utilizado para emprestar um livro
	public void borrowBook() {

		Book book = null;
		String BookLine = null;

		System.out.println("Enter user name: ");
		String userName = scan.next();
		scan.nextLine();
		System.out.println("\nEnter book ISBN: ");
		String isbnBook = scan.next();

		String bookISBN = isbnBook.toUpperCase();
		String userNameRegistred = userName.toUpperCase();

		// Roda a lista de usuários procurando o nome do usuario digitado

		try (BufferedReader br = new BufferedReader(new FileReader(pathUser))) {

			for (String u : userListCsv) {

				u = br.readLine();

				if (u.split(",")[0].equals(userNameRegistred)) {
					userDataCsv = userNameRegistred;
				}

			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		// Roda a lista de livros procurando o ISBN digitado
		try (BufferedReader br = new BufferedReader(new FileReader(pathBook))) {

			for (String b : bookListCsv) {

				if (b.split(",")[2].equals(bookISBN)) {
					BookLine = b;
					bookDataCsv = bookISBN;
					if (b.split(",")[3].equals("true")) {
						bookDataAvailable = true;
					}
					if (b.split(",")[3].equals("false")) {
						bookDataAvailable = false;
					}
				}

			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		/* 	Aqui é feita uma condição para que o livro possa ser emprestado, onde o
			usuario deve existir na lista.
			Assim como o livro também deve existir em sua lista e o status dele deve ser
			true, indicando que
		 	ele está disponivel para emprestimo		*/ 
		if (userDataCsv != null && bookDataCsv != null && bookDataAvailable) {
			
			String linhaAvailiable = BookLine.replace("true", "false");
			
			bookListCsv.remove(BookLine);
			bookListCsv.add(linhaAvailiable);
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathBorrowedBooks))) {

				this.borrowedBooksCsv.add(userDataCsv + "," + bookDataCsv);

				for (String linha : borrowedBooksCsv) {
					bw.write(linha);
					bw.newLine();
				}
				
			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathBook))) {

				for (String linha : bookListCsv) {
					bw.write(linha);
					bw.newLine();
				}
				
			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}

			System.out.println("Book borrowed successfully!");

		} else {

			System.out.println("Unable to borrow the book :(");
		}

	}

	// Aqui o metodo faz a devolução do livro que estiver emprestado
	public void returnBook() {

		Book book = null;
		String BookLine = null;

		System.out.println("Enter user name: ");
		String userName = scan.next();
		scan.nextLine();
		System.out.println("\nEnter book ISBN: ");
		String isbnBook = scan.next();

		String bookISBN = isbnBook.toUpperCase();
		String userNameRegistred = userName.toUpperCase();

		// Roda a lista de usuários procurando o nome do usuario digitado

		try (BufferedReader br = new BufferedReader(new FileReader(pathUser))) {

			for (String u : userListCsv) {

				u = br.readLine();

				if (u.split(",")[0].equals(userNameRegistred)) {
					userDataCsv = userNameRegistred;
					System.out.println(userDataCsv);
				}

			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		// Roda a lista de livros procurando o ISBN digitado
		try (BufferedReader br = new BufferedReader(new FileReader(pathBook))) {

			for (String b : bookListCsv) {

				if (b.split(",")[2].equals(bookISBN)) {
					BookLine = b;
					bookDataCsv = bookISBN;
					System.out.println(bookDataCsv);
					if (b.split(",")[3].equals("false")) {
						bookDataAvailable = false;
					}
				}

			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		if (userDataCsv != null && bookDataCsv != null && !bookDataAvailable) {
			
			String linhaAvailiable = BookLine.replace("false", "true");
			
			bookListCsv.remove(BookLine);
			bookListCsv.add(linhaAvailiable);
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathBorrowedBooks))) {

				this.borrowedBooksCsv.remove(userDataCsv + "," + bookDataCsv);

				for (String linha : borrowedBooksCsv) {
					bw.write(linha);
					bw.newLine();
				}
				
			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathBook))) {

				for (String linha : bookListCsv) {
					bw.write(linha);
					bw.newLine();
				}
				
			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}

			System.out.println("Book returned successfully!");

		} else {

			System.out.println("Unable to return the book :(");
		}

	}

	// Este metodo retorna todos os livros e indica o status de todos, se estão
	// emprestados ou não
	public void allBooks() {
		try (BufferedReader br = new BufferedReader(new FileReader(pathBook))) {

			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	// Método que atualiza o CSV antes de executar a ação
	public void updateCsv() {

		// Atualiza o CSV com os dados dos livros já cadastrados
		try (BufferedReader br = new BufferedReader(new FileReader(pathBook))) {

			String linha = br.readLine();

			while (linha != null) {
				bookListCsv.add(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		// Atualiza o CSV com os dados dos usuários já cadastrados
		try (BufferedReader br = new BufferedReader(new FileReader(pathUser))) {

			String linha = br.readLine();

			while (linha != null) {
				userListCsv.add(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		// Atualiza o CSV com os dados dos livros emprestados
		try (BufferedReader br = new BufferedReader(new FileReader(pathBorrowedBooks))) {

			String linha = br.readLine();

			while (linha != null) {
				borrowedBooksCsv.add(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	// Essa é a lista de todos os livros empretados que o aluno possui
	public void BorrowedBooks() {
		for (Book book : borrowedBooks) {
			System.out.println(book);
		}
	}

	public void removeBorrowedBooks(Book borrowedBooks) {
		this.borrowedBooks.remove(borrowedBooks);
	}

	// Retorna a lista de usuários registrados
	/*
	 * public void userList() { for(User users : registeredUsers) {
	 * System.out.println(users.toString()); } }
	 */
}
