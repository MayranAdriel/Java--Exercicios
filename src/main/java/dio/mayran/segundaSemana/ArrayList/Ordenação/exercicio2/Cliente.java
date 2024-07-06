package dio.mayran.segundaSemana.ArrayList.Ordenação.exercicio2;

public class Cliente {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(54);
        somaNumeros.adicionarNumero(5);

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}
