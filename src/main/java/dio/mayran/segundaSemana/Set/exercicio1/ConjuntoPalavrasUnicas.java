package dio.mayran.segundaSemana.Set.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavraRemover) {
        for (String palavraAtual : palavrasUnicas) {
            if (palavraAtual.equalsIgnoreCase(palavraRemover)) {
                palavrasUnicas.remove(palavraAtual);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
        for (String palavraAtual : palavrasUnicas) {
            if (palavraAtual.equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }
}
