package dio.mayran.segundaSemana.ArrayList.exercicio1;

public class Cliente {

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        System.out.println(listaDeTarefas.retornaTamanhoDaLista());

        listaDeTarefas.adicionarNovaTarefa("tarefa 1");
        listaDeTarefas.adicionarNovaTarefa("tarefa 1");
        listaDeTarefas.adicionarNovaTarefa("tarefa 1");
        listaDeTarefas.adicionarNovaTarefa("tarefa 2");
        listaDeTarefas.adicionarNovaTarefa("tarefa 1");
        listaDeTarefas.adicionarNovaTarefa("tarefa 1");

        System.out.println(listaDeTarefas.retornaTamanhoDaLista());

        listaDeTarefas.removerTarefa("tarefa 1");

        System.out.println(listaDeTarefas.retornaTamanhoDaLista());
    }
}
