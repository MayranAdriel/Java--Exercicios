package dio.mayran.segundaSemana.Set.ordenacao.exercicio2;

public class Cliente {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("mayran", 1234567, 10.0);
        gerenciadorAlunos.adicionarAluno("ana", 1234568, 9.0);
        gerenciadorAlunos.adicionarAluno("maynara", 1234569, 7.0);
        gerenciadorAlunos.adicionarAluno("capitao patria", 1234561, 5.0);





        System.out.println(gerenciadorAlunos.exibirAlunos());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
