package dio.mayran.terceiraSemana.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        //Desafio 2 - Imprima a soma dos números pares da lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somaNumerosPares = numeros.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum);

        System.out.println(somaNumerosPares);
    }
}
