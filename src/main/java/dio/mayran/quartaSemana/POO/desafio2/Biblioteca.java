package dio.mayran.quartaSemana.POO.desafio2;

import java.util.*;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Livro> listaDeLivros;
    private List<Membro> listaDeMembros;
    private List<Emprestimo> listaDeEmprestimos;

    public Biblioteca() {
        this.listaDeLivros = new ArrayList<>();
        this.listaDeMembros = new ArrayList<>();
        this.listaDeEmprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        this.listaDeLivros.add(livro);
    }

    public void removerLivro(Livro livro){
        this.listaDeLivros.remove(livro);
    }

    public void cadastrarMembro(Membro membro){
        this.listaDeMembros.add(membro);
    }

    public void removerMembro(Membro membro){
        this.listaDeMembros.remove(membro);
    }

    public void emprestarLivro(Livro livro, Membro membro){
        livro.setDisponivel(false);
        membro.adicionarLivroEmprestado(livro);
        Calendar calendar = Calendar.getInstance();
        Date dataAtual = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date dataVencimento = calendar.getTime();
        listaDeEmprestimos.add(new Emprestimo(livro, membro, dataAtual, dataVencimento));
    }

    public void devolverLivro(Livro livro, Membro membro){
        livro.setDisponivel(true);
        membro.devolverLivro(livro);
        List<Emprestimo> emprestimoRemover = listaDeEmprestimos.stream().filter(x -> x.getLivro() == livro).toList();
        listaDeEmprestimos.removeAll(emprestimoRemover);
    }

    public void imprimirLivros(){
        System.out.println(listaDeLivros);
    }

    public void imprimirMembros(){
        System.out.println(listaDeMembros);
    }

    public void imprimirEmprestimos(){
        System.out.println(listaDeEmprestimos);
    }
}
