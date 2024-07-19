package dio.mayran.segundaSemana.Set.ordenacao.exercicio2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setDeAlunos;

    public GerenciadorAlunos() {
        this.setDeAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        setDeAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        boolean encontrado = false;
        for (Aluno alunoAtual : setDeAlunos ){
            if(alunoAtual.getMatricula() == matricula){
                setDeAlunos.remove(alunoAtual);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Aluno não encontrado!");
        }
    }

    public TreeSet<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(setDeAlunos);
    }

    public TreeSet<Aluno> exibirAlunosPorNota(){
        TreeSet<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(setDeAlunos);

        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        return setDeAlunos;
    }
}
