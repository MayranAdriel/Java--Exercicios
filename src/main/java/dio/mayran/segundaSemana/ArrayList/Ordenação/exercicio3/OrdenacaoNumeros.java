package dio.mayran.segundaSemana.ArrayList.Ordenação.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaDeNumerosInteiros;

    public OrdenacaoNumeros() {
        this.listaDeNumerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaDeNumerosInteiros.add(numero);
    }

    public void ordenarAscendente(){
        listaDeNumerosInteiros.sort(new ComparatorAscendente());
    }

    public void ordenarDescendente(){

    }
}
