package dio.mayran.segundaSemana.Map.exercicio3;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrosMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()){
            if (entry.getValue().getAutor().equalsIgnoreCase(titulo)){
                livrosMap.remove(entry.getKey());
            }
        }
    }

    public Set<Livro> exibirLivrosOrdenadosPorPreco(){
        return new TreeSet<>(livrosMap.values());
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor){
        ArrayList<Livro> listaDeLivrosDoAutor = new ArrayList<>();

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()){
            if (entry.getValue().getAutor().contains(autor)){
                listaDeLivrosDoAutor.add(entry.getValue());
            }
        }
        return listaDeLivrosDoAutor;
    }

    public Livro obterLivroMaisCaro(){
        double maiorPreco = 0.0;
        Livro livroComMaiorPreco = null;
        for(Map.Entry<String, Livro> livroAtual : livrosMap.entrySet()){
            if(livroAtual.getValue().getPreco() > maiorPreco){
                maiorPreco = livroAtual.getValue().getPreco();
                livroComMaiorPreco = livroAtual.getValue();
            }
        }
        return livroComMaiorPreco;
    }

    public Livro obterLivroMaisBarato(){
        double menorPreco = livrosMap.values().iterator().next().getPreco();
        Livro livroComMenorPreco = null;
        for(Map.Entry<String, Livro> livroAtual : livrosMap.entrySet()){
            if(livroAtual.getValue().getPreco() < menorPreco){
                menorPreco = livroAtual.getValue().getPreco();
                livroComMenorPreco = livroAtual.getValue();
            }
        }
        return livroComMenorPreco;
    }
}
