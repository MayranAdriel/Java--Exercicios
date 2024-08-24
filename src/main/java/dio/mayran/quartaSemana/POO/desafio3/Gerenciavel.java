package dio.mayran.quartaSemana.POO.desafio3;

import java.util.List;

public interface Gerenciavel {
	void adicionar(Item item);
	void remover(Item item);
	List<Item> listar();
	Item buscar (String titulo);

}
