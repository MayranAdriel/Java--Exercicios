package dio.mayran.segundaSemana.Map.exercicio1;

public class Cliente {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("palavra 1", "descricao 1");
        dicionario.adicionarPalavra("palavra 2", "descricao 1");
        dicionario.adicionarPalavra("palavra 3", "descricao 1");
        dicionario.adicionarPalavra("palavra 4", "descricao 4");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("palavra 2");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("palavra 4"));

    }
}
