package dio.mayran.segundaSemana.ArrayList.Ordenação.exercicio3;

import java.util.Comparator;

public class ComparatorDescendente implements Comparator<Integer> {
    @Override
    public int compare(Integer numero1, Integer numero2) {
        return Integer.compare(numero2, numero1);
    }
}
