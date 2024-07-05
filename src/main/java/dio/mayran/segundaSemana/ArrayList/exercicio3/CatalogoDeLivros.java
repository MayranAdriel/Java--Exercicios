package dio.mayran.segundaSemana.ArrayList.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
    private List<Livro> listaDeLivros;

    public CatalogoDeLivros() {
        this.listaDeLivros = new ArrayList<>();
    }

    public void adicionarLivroAoCatalogo(String nomeLivro, String autor, int anoPublicacao){
            listaDeLivros.add(new Livro(nomeLivro, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosCorrespondentes = new ArrayList<>();

        for (Livro livroAtual : listaDeLivros){
            if(livroAtual.getAutor().equalsIgnoreCase(autor)){
                livrosCorrespondentes.add(livroAtual);
            }
        }
        return livrosCorrespondentes;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosCorrespondentes = new ArrayList<>();
        for (Livro livroAtual : listaDeLivros){
            if(livroAtual.getAno() >= anoInicial && livroAtual.getAno() <= anoFinal  ){
                livrosCorrespondentes.add(livroAtual);
            }
        }
        return livrosCorrespondentes;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for (Livro livroAtual : listaDeLivros){
            if (livroAtual.getTitulo().equalsIgnoreCase(titulo)){
                return livroAtual;
            }
        }
        return null;
    }
}
