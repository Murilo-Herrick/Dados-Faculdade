package library;

import java.util.ArrayList;

public class User {

	private String name;
	private String registrationNumber;
	private ArrayList<Book> borrowedBooks;

	
	public User(String name, String registrationNumber) {
		this.name = name;
		this.registrationNumber = registrationNumber;
		borrowedBooks = new ArrayList<Book>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRegistrationNumber() {
		return registrationNumber;
	}


	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}


	public void setBorrowedBooks(Book borrowedBooks) {
		this.borrowedBooks.add(borrowedBooks);
	}
	
	public void removeBorrowedBooks(Book borrowedBooks) {
		this.borrowedBooks.remove(borrowedBooks);
	}
	
	// Essa é a lista de todos os livros empretados que o aluno possui
	public void BorrowedBooks() {
		for(Book book : borrowedBooks) {
			System.out.println(book);
		}
	}

	// É uma formatação para aparecer as informações referentes ao usuário
	@Override
	public String toString() {
		return "Name = " + name + ", RegistrationNumber = " + registrationNumber + ", BorrowedBooks = " + borrowedBooks;
	}
	
}
