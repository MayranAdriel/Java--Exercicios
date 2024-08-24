package dio.mayran.quartaSemana.POO.desafio3;

import java.time.LocalDate;
import java.util.Date;

public class Item {
	private String autor;
	private String titulo;
	private LocalDate dataPublicacao;
	
	public Item(String autor, String titulo, LocalDate dataPublicacao) {
		this.autor = autor;
		this.titulo = titulo;
		this.dataPublicacao = dataPublicacao;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	
	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	
	
	
}
