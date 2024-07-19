package dio.mayran.terceiraSemana.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio9 {
    public static void main(String[] args) {
//        Verificar se todos os números da lista são distintos (não se repetem):
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        System.out.println(numeros.stream().distinct().count() == numeros.size());
    }
}
