package dio.mayran.segundaSemana.Set.ordenacao.exercicio2;

import java.util.Comparator;

public class ComparatorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno2.getNota(), aluno1.getNota());
    }
}
