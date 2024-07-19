package dio.mayran.segundaSemana.Map.exercicio2;

import java.util.*;

public class ContagemPalavra {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavra() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavrasMap.remove(palavra);
    }

    public Map<String, Integer> exibirContagemPalavras(){
        return palavrasMap;
    }

    public void encontrarPalavraMaisFrequente(String texto){
        String[] textoSeparadoPorPalavras = texto.split("\\s+");
        String palavraQueMaisSeRepete = "";
        int contagem = 0;


        for (String palavraAtual : textoSeparadoPorPalavras){
            if(contaOcorrenciasPalavra(palavraAtual, textoSeparadoPorPalavras) > contagem){
                contagem = contaOcorrenciasPalavra(palavraAtual, textoSeparadoPorPalavras);
                palavraQueMaisSeRepete = palavraAtual;
            }
        }
        palavrasMap.put(palavraQueMaisSeRepete, contagem);
    }

    private int contaOcorrenciasPalavra(String palavra, String[] array){
        int contador = 0;
        for(String palavraAVerificar : array){
            if (palavraAVerificar.equalsIgnoreCase(palavra))
                contador++;
        }
        return contador;
    }
}
