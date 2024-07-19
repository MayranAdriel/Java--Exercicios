package dio.mayran.segundaSemana.Set.exercicio1;

public class Cliente {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("palavra 4");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("palavra 2");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("palavra 7"));
    }
}
