package dio.mayran.quartaSemana.POO.desafio3;

import java.time.LocalDate;
import java.util.Date;

public class Livro extends Item{
	private long ISBN;

	public Livro(String autor, String titulo, LocalDate dataPublicacao, long ISBN) {
		super(autor, titulo, dataPublicacao);
		this.ISBN = ISBN;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "Livro [ISBN=" + ISBN + ", getAutor()=" + getAutor() + ", getTitulo()=" + getTitulo()
				+ ", getDataPublicacao()=" + getDataPublicacao() + "]";
	}

	

	

	
	
	
	

}
