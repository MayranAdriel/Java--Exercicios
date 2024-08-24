package dio.mayran.quartaSemana.POO.desafio3;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		Livro livro1 = new Livro("autor 1", "titulo 1", LocalDate.now(), 12345677);
		Livro livro2 = new Livro("autor 2", "titulo 2", LocalDate.now(), 12345678);
		Livro livro3 = new Livro("autor 3", "titulo 3", LocalDate.now(), 12345679);

		
		biblioteca.adicionar(livro1);
		biblioteca.adicionar(livro2);
		biblioteca.adicionar(livro3);
		
		System.out.println(biblioteca.listar());
		
		System.out.println(biblioteca.buscar("titulo 2"));
		System.err.println(biblioteca.buscar("titulo 1"));

	}

}
