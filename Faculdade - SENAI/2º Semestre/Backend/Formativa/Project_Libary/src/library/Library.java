package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	private ArrayList<Book> bookList;
	private ArrayList<User> registeredUsers;

	public Library() {
		bookList = new ArrayList<Book>();
		registeredUsers = new ArrayList<User>();
	}

	Scanner scan = new Scanner(System.in);

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

	// Metodo que que já pede as informações do livro para registro e adiciona ao final elas em uma lista
	public void registerBook() {
		System.out.println();
		System.out.print("Enter book title: ");
		String title = scan.nextLine();
		System.out.print("\nEnter autor name: ");
		String autor = scan.next();
		System.out.print("\nEnter book ISBN: ");
		String isbn = scan.next();
		
		title.toUpperCase();
		autor.toUpperCase();
		isbn.toUpperCase();

		// Cria um objeto para passar ao construtor as variaveis as quais foram armazenadas com as informações
		// Digitadas pelo usuário
		Book books = new Book(title, autor, isbn, true);
		this.bookList.add(books);

		System.out.println("\nBook added successfully!");
	}

	// Metodo que que já pede as informações do usuário para registro e adiciona ao final elas em uma lista
	public void registerUser() {
		System.out.println();
		System.out.print("Enter user name: ");
		String userName = scan.next();
		System.out.print("\nEnter user registration number: ");
		String userregistrationNumber = scan.next();
		
		userName.toUpperCase();
		userregistrationNumber.toUpperCase();

		// Cria um objeto para passar ao construtor as variaveis as quais foram armazenadas com as informações
		// Digitadas pelo usuário
		User user = new User(userName, userregistrationNumber);
		this.registeredUsers.add(user);

		System.out.println("\nUser added successfully!");
	}

	// Metodo utilizado para emprestar um livro
	public void borrowBook() {
		System.out.println("Enter user name: ");
		String userName = scan.next();
		System.out.println("\nEnter book title: ");
		String bookTitle = scan.next();
		bookTitle.toUpperCase();
		userName.toUpperCase();
		
		// variaveis do tipo Book (classe com atributos de livro) e User(classe com atributos de usuario)
		User user = null;
		Book book = null;
		
		// Roda a lista de usuários procurando o nome do usuario digitado
		for(User u : registeredUsers) {
			if(u.getName().equals(userName)) {
				user = u;
			}
		}
		
		// Roda a lista de livros procurando o nome do livro digitado
		for(Book b : bookList) {
			if(b.getTitle().equals(bookTitle)) {
				book = b;
			}
		}
		
		// Aqui é feita uma condição para que o livro possa ser emprestado, onde o usuario deve existir na lista.
		// Assim como o livro também deve existir em sua lista e o status dele deve ser true, indicando que
		// ele está disponivel para emprestimo
		if(user != null && book != null && book.getAvailable()) {
			user.setBorrowedBooks(book);
			book.setAvailable(false);
			System.out.println("Book borrowed successfully!");
		} 
		else {
			System.out.println("Unable to borrow the book :(");
		}
	}
	
	// Aqui o metodo faz a devolução do livro que estiver emprestado
	public void returnBook() {
		System.out.println("Enter user name: ");
		String userName = scan.next();
		System.out.println("\nEnter book title: ");
		String bookTitle = scan.next();
		bookTitle.toUpperCase();
		userName.toUpperCase();
		
		User user = null;
		Book book = null;
		
		for(User u : registeredUsers) {
			if(u.getName().equals(userName)) {
				user = u;
			}
		}
		
		for(Book b : bookList) {
			if(b.getTitle().equals(bookTitle)) {
				book = b;
			}
		}
		
		if(user != null && book != null && book.getAvailable() == false) {
			user.removeBorrowedBooks(book);
			book.setAvailable(true);
			System.out.println("Book return successfully!");
		} 
		else {
			System.out.println("Unable to return the book :(");
		}
		
	}
	
	// Este metodo retorna todos os livros e indica o status de todos, se estão emprestados ou não
	public void allBooks() {
		for(Book book : bookList) {
			System.out.println(book.toString());
		}
	}

	
	/*
	 * public void userList() { for(User users : registeredUsers) {
	 * System.out.println(users.toString()); } }
	 */

}
