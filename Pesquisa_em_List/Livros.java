package Pesquisa_em_List;

public class Livros {
	
	String titulo;
	String autor;
	int anoDePublicacao;
	
	public Livros(String titulo, String autor, int anoDePublicacao) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	@Override
	public String toString() {
		return "Livro = " + titulo + "\nautor = " + autor + "\nanoDePublicacao = " + anoDePublicacao + "\n \n";
	}
	

}
