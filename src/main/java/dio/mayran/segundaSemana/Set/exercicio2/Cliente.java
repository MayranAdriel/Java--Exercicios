package dio.mayran.segundaSemana.Set.exercicio2;

public class Cliente {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("tarefa 1", true);
        listaTarefa.adicionarTarefa("tarefa 2", true);
        listaTarefa.adicionarTarefa("tarefa 3", false);
        listaTarefa.adicionarTarefa("tarefa 4", true);
        listaTarefa.adicionarTarefa("tarefa 5", false);
        listaTarefa.adicionarTarefa("tarefa 6", true);

        listaTarefa.exibirTarefas();

        System.out.println(listaTarefa.obterTarefasConcluidas());
        System.out.println(listaTarefa.obterTarefasPendentes());

    }
}
