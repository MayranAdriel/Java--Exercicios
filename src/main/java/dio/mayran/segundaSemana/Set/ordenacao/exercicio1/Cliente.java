package dio.mayran.segundaSemana.Set.ordenacao.exercicio1;

public class Cliente {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("e", 123, 35.0, 1);
        cadastroProdutos.adicionarProduto("c", 124, 54.0, 1);
        cadastroProdutos.adicionarProduto("b", 125, 32.0, 1);

        cadastroProdutos.imprimirProdutos();

        System.out.println(cadastroProdutos.ordenarSetPorNome());

        System.out.println(cadastroProdutos.ordenarSetPorPreco());
    }
}
