package dio.mayran.quartaSemana.POO.desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Biblioteca implements Gerenciavel {
	
	private List<Item> listaLivros;
	
	

	public Biblioteca() {
		this.listaLivros = new ArrayList<>();
	}

	@Override
	public void adicionar(Item item) {
		listaLivros.add(item);
	}

	@Override
	public void remover(Item item) {
		listaLivros.remove(item);
		
	}

	@Override
	public List<Item> listar() {
		
		return listaLivros;
	}

	@Override
	public Item buscar(String titulo) {
		Item itemComTitulo = listaLivros.stream().filter(x -> x.getTitulo().contains(titulo)).findFirst().orElseThrow(() -> new RuntimeException("Item não encontrado!"));
		return itemComTitulo;
	}

}
