package dio.mayran.terceiraSemana.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
//        Desafio 6 - Verificar se a lista contém algum número maior que 10:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().anyMatch(x -> x > 10));
    }
}
