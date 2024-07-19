package dio.mayran.segundaSemana.ArrayList.Ordenação.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaDeNumerosInteiros;

    public SomaNumeros() {
        this.listaDeNumerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaDeNumerosInteiros.add(numero);
    }

    public int calcularSomaDosNumerosDaLista() {
        int valorTotalSomado = 0;
        for (Integer valorAtual : listaDeNumerosInteiros) {
            valorTotalSomado += valorAtual;
        }
        return valorTotalSomado;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = listaDeNumerosInteiros.getFirst();
        if (!listaDeNumerosInteiros.isEmpty()) {
            for (Integer valorAtual : listaDeNumerosInteiros) {
                if (valorAtual > maiorNumero) {
                    maiorNumero = valorAtual;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = listaDeNumerosInteiros.getFirst();
        if (!listaDeNumerosInteiros.isEmpty()) {
            for (Integer valorAtual : listaDeNumerosInteiros) {
                if (valorAtual < menorNumero) {
                    menorNumero = valorAtual;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(listaDeNumerosInteiros);
    }
}
