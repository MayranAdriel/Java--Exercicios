package dio.mayran.segundaSemana.Set.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> listaDeTarefa;

    public ListaTarefa() {
        this.listaDeTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricaoTarefa, boolean concluida) {
        listaDeTarefa.add(new Tarefa(descricaoTarefa, concluida));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefaAtual : listaDeTarefa) {
            if (tarefaAtual.getDescricao().equalsIgnoreCase(descricao)) {
                listaDeTarefa.remove(tarefaAtual);
                break;
            }
        }
    }

    public void exibirTamanhoTarefas() {
        System.out.println(listaDeTarefa.size());
    }

    public void exibirTarefas() {
        System.out.println(listaDeTarefa);
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa tarefaAtual : listaDeTarefa) {
            if (tarefaAtual.isFoiConcluida()) {
                tarefasConcluidas.add(tarefaAtual);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa tarefaAtual : listaDeTarefa) {
            if (!tarefaAtual.isFoiConcluida()) {
                tarefasPendentes.add(tarefaAtual);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefaAtual : listaDeTarefa) {
            if (tarefaAtual.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaAtual.setFoiConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefaAtual : listaDeTarefa) {
            if (tarefaAtual.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaAtual.setFoiConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        listaDeTarefa.clear();
    }


}
