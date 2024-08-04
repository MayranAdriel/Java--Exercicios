package dio.mayran.quartaSemana.POO.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Membro {
    private String nome;
    private long ID;
    private String endereco;
    private String telefone;
    private List<Livro> livrosEmprestados;

    public Membro(String nome, long ID, String endereco, String telefone) {
        this.nome = nome;
        this.ID = ID;
        this.endereco = endereco;
        this.telefone = telefone;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void adicionarLivroEmprestado(Livro livro){
        livro.setDisponivel(false);
        this.livrosEmprestados.add(livro);
    }

    public void devolverLivro(Livro livro){
        livro.setDisponivel(true);
        this.livrosEmprestados.remove(livro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    @Override
    public String toString() {
        return "Membro{" +
                "nome='" + nome + '\'' +
                ", ID=" + ID +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", livrosEmprestados=" + livrosEmprestados +
                '}';
    }
}
