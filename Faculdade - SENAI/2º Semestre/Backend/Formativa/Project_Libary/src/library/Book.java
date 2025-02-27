package library;

public class Book {

	private String title;
	private String autor;
	private String isbn;
	private boolean available;

	public Book() {

	}

	public Book(String title, String autor, String isbn, boolean avaliable) {
		this.title = title;
		this.autor = autor;
		this.isbn = isbn;
		this.available = avaliable;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	public boolean getAvailable() {
		return available;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}

	// Formatação de exibição de texto para todos os atributos de livro
	@Override
	public String toString() {
		return "Title = " + title + ", Autor = " + autor + ", ISBN = " + isbn + ", Available = " + available;
	}
	
}
