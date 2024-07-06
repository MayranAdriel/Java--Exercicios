package dio.mayran.segundaSemana.ArrayList.Ordenação.exercicio3;

import java.util.Comparator;

public class ComparatorAscendente implements Comparator<Integer> {
    @Override
    public int compare(Integer numero1, Integer numero2) {
        return Integer.compare(numero1, numero2);
    }
}
