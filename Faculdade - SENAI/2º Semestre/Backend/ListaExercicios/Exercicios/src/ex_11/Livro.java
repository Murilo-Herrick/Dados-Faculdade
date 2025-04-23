package ex_11;

public class Livro {
	
	private String titulo;
	private String autor;
	private String numeroPaginas;
	
	public Livro(String titulo, String autor, String numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public void detalhesLivro() {
		System.out.println("Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nNumero de Paginas: " + getNumeroPaginas());
	}
	
}
