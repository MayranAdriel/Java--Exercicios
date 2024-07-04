package dio.mayran.segundaSemana.ArrayList.Exercicio3;

public class Cliente {
    public static void main(String[] args) {
        CatalogoDeLivros catalogoDeLivros = new CatalogoDeLivros();

        catalogoDeLivros.adicionarLivroAoCatalogo("livro 1", "autor 1", 2020);
        catalogoDeLivros.adicionarLivroAoCatalogo("livro 2", "autor 2", 2021);
        catalogoDeLivros.adicionarLivroAoCatalogo("livro 3", "autor 3", 2022);
        catalogoDeLivros.adicionarLivroAoCatalogo("livro 4", "autor 3", 2023);
        catalogoDeLivros.adicionarLivroAoCatalogo("livro 5", "autor 4", 2024);
        catalogoDeLivros.adicionarLivroAoCatalogo("livro 6", "autor 3", 2025);

        System.out.println(catalogoDeLivros.pesquisarPorTitulo("livro 1"));
    }
}
