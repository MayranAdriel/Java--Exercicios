package dio.mayran.terceiraSemana.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        //Verifique se todos os números da lista são positivos:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean verificar = numeros.stream().allMatch(x -> x > 0);

        System.out.println(verificar);
    }
}
