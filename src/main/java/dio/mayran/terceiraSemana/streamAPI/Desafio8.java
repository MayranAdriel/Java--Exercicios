package dio.mayran.terceiraSemana.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
//        Somar os dígitos de todos os números da lista:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().reduce(Integer::sum));
    }
}
