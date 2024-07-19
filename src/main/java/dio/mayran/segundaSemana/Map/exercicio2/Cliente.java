package dio.mayran.segundaSemana.Map.exercicio2;

public class Cliente {
    public static void main(String[] args) {
        ContagemPalavra contagemPalavra = new ContagemPalavra();

        contagemPalavra.encontrarPalavraMaisFrequente("As flores desabrocham na primavera, trazendo cores e alegria ao jardim, enchendo o ambiente de vida.");
        contagemPalavra.encontrarPalavraMaisFrequente("A música suave preenche o ar, acalmando as mentes agitadas e trazendo paz aos corações cansados.");
        contagemPalavra.encontrarPalavraMaisFrequente("O gato preto pulou no telhado, observando silenciosamente a lua cheia brilhando no céu estrelado.");
        contagemPalavra.encontrarPalavraMaisFrequente("Livros são portais para mundos desconhecidos, abrindo nossas mentes para novas ideias e possibilidades infinitas.");

        System.out.println(contagemPalavra.exibirContagemPalavras());
    }
}
