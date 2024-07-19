package dio.mayran.terceiraSemana.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.function.ToIntFunction;

public class Desafio5 {
    public static void main(String[] args) {
//        Calcule a média dos números maiores que 5:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream().filter(x -> x > 5).mapToInt(Integer::intValue).average();

        System.out.println(media);




    }
}
