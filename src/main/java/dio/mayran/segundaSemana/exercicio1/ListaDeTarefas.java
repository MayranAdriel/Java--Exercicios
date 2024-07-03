package dio.mayran.segundaSemana.exercicio1;

import java.util.*;

public class ListaDeTarefas {

    public List<Tarefa> listaDeTarefas;

    public ListaDeTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarNovaTarefa(String tarefa){
        listaDeTarefas.add(new Tarefa(tarefa));
    }

    public void removerTarefa(String tarefa){
        for(int i = listaDeTarefas.size(); i > 0; i--){
            if(listaDeTarefas.get(i-1).getDescricao() == tarefa)
                listaDeTarefas.remove(i-1);
        }
    }

    public int retornaTamanhoDaLista(){
        return listaDeTarefas.size();
    }

    public void imprimeTarefas(){
        System.out.println(listaDeTarefas);
    }
}
