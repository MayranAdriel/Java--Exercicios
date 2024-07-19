package dio.mayran.segundaSemana.Set.ordenacao.exercicio1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> listaDeProdutos;

    public CadastroProdutos() {
        this.listaDeProdutos = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, double preco, int quantidade) {
        listaDeProdutos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> ordenarSetPorNome() {
        return new TreeSet<>(listaDeProdutos);
    }

    public Set<Produto> ordenarSetPorPreco() {
        TreeSet<Produto> treeSetOrdenadoPorPreco = new TreeSet<>(new ComparatorPreco());

        treeSetOrdenadoPorPreco.addAll(listaDeProdutos);

        return treeSetOrdenadoPorPreco;
    }

    public void imprimirProdutos() {
        System.out.println(listaDeProdutos);
    }
}
